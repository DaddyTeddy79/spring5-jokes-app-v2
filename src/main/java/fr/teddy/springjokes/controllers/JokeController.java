package fr.teddy.springjokes.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.teddy.springjokes.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	public JokeController(@Qualifier("jokeService") JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	@RequestMapping("/index")
	public String getRandomJoke(Model model) {
		String randomJoke = jokeService.getRandomJoke();
		System.out.println("joke : " + randomJoke);
		model.addAttribute("joke", randomJoke);
		return "/index";
	}
}
