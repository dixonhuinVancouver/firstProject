package com.homework.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.homework.demo.entity.Pig;
import com.homework.demo.repository.PigRepository;

@Controller
public class IndexController {
	
	@Autowired
	private PigRepository pigRepository;
    
	@GetMapping("/")
	public String homePage() {
		return "index";
	}
	
	@PostMapping("/search") 
	public String search(@RequestParam("sex") int sex, @RequestParam("immunized") boolean immunized, Model model) {
		List<Pig> pigs = pigRepository.findBySexAndIsImmunized(sex, immunized);
		model.addAttribute("pigs", pigs);
		return "search-result";
	}
	
}
