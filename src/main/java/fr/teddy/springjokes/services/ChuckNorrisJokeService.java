package fr.teddy.springjokes.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service("jokeService")
@Profile({ "CN", "default" })
public class ChuckNorrisJokeService implements JokeService {

	private final ChuckNorrisQuotes quotes;

	public ChuckNorrisJokeService() {
		this.quotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getRandomJoke() {
		return quotes.getRandomQuote();
	}
}
