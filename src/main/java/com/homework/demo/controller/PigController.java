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
import com.homework.demo.repository.PigRepository;

@Controller
public class PigController {

	@Autowired
	private PigRepository pigRepository;

	@GetMapping("/")
	public String homePage() {
		return "index";
	}

	@GetMapping("/create")
	public String create() {
		return "create";
	}

	@PostMapping("/createpig")
	public String createResuslt(@RequestParam("sex") int sex, @RequestParam("birthDate") String birthDate,
			@RequestParam("location") String location, @RequestParam("category") String category,
			@RequestParam("isAbnormal") boolean isAbnormal, @RequestParam("weaned") int weaned,
			@RequestParam("weight") int weight, Model model) {

		UUID uuid = UUID.randomUUID();
		Long id = new Long(Math.abs(uuid.hashCode()));

		Pig pig = new Pig(id, new Integer(sex), new Boolean(isAbnormal));
		pig.setBirthDate(birthDate);
		pig.setLocation(location);
		pig.setCategory(category);
		pig.setWeight(weight);
		pig.setWeaned(weaned);

		Pig savedStudent = pigRepository.save(pig);

		URI url = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedStudent.getId())
				.toUri();

		ResponseEntity.created(url).build();

		//List<Pig> pigs = pigRepository.findAll();
		Optional<Pig> newPig= pigRepository.findById(id);
		
		List<Pig> pigs = new ArrayList<Pig>();
		
		if(newPig.isPresent()) {
			pigs.add(newPig.get());
		}
		
		model.addAttribute("pigs", pigs);

		return "create-result";
	}

	@GetMapping("/search")
	public String search() {
		return "search";
	}

	@PostMapping("/search")
	public String search(@RequestParam("id") Long id, Model model) {
		Optional<Pig> newPig= pigRepository.findById(id);
		
		List<Pig> pigs = new ArrayList<Pig>();
		
		if(newPig.isPresent()) {
			pigs.add(newPig.get());
		}
		
		model.addAttribute("pigs", pigs);
		return "search-result";
	}
	
	@GetMapping("/searchall")
	public String searchAll(Model model) {
		List<Pig> pigs = pigRepository.findAll();
		model.addAttribute("pigs", pigs);
		return "search-all-result";
	}
}
