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

	@GetMapping("/pork/create")
	public String create() {
		return "pork-create";
	}

}
