package com.homework.demo.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.homework.demo.entity.Pig;
import com.homework.demo.entity.Pork;
import com.homework.demo.repository.PorkRepository;

@Controller
public class PorkController {

	@Autowired
	private PorkRepository porkRepository;

	@GetMapping("/pork/search")
	public String homePage() {
		return "pork-search";
	}

	@PostMapping("/pork/search")
	public String search(@RequestParam("id") Long id, Model model) {

		List<Pork> porks = porkRepository.findByPigId(id);

		model.addAttribute("porks", porks);
		return "pork-search-result";
	}

	@GetMapping("/pork/create")
	public String create() {
		return "pork-create";
	}
	
	@PostMapping("/pork/create")
	public String createResuslt(@RequestParam("pigId") long pigId, @RequestParam("saleDate") String saleDate,
			@RequestParam("location") String location, @RequestParam("category") String category,
			@RequestParam("weight") double weight, Model model) {

		UUID uuid = UUID.randomUUID();
		Long id = new Long(Math.abs(uuid.hashCode()));

		Pork pork = new Pork(id);
		pork.setPigId(pigId);
		pork.setSaleDate(saleDate);
		pork.setLocation(location);
		pork.setCategory(category);
		pork.setWeight(weight);;

		Pork savedPork = porkRepository.save(pork);

		URI url = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedPork.getId())
				.toUri();

		ResponseEntity.created(url).build();

		//List<Pig> pigs = pigRepository.findAll();
		Optional<Pork> newPig= porkRepository.findById(id);
		
		List<Pork> porks = new ArrayList<Pork>();
		
		if(newPig.isPresent()) {
			porks.add(newPig.get());
		}
		
		model.addAttribute("porks", porks);

		return "pork-create-result";
	}

}
