package fr.teddy.springjokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeService {

	public String getRandomJoke() {
		ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
		return quotes.getRandomQuote();
	}
}
