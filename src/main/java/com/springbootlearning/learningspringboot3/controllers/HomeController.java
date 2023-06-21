package com.springbootlearning.learningspringboot3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springbootlearning.learningspringboot3.sevices.exchanges.YouTube;

@Controller
public class HomeController {

	private final YouTube youTube;

	public HomeController(YouTube youTube) {
		this.youTube = youTube;
	}

	@GetMapping("/")
	String index(Model model) {
		model.addAttribute("channelVideos",
				youTube.channelVideos("UC7UaYR7JoDNGLk0AqRA9M0Q", 10, YouTube.Sort.VIEW_COUNT));
		return "index";
	}
}
