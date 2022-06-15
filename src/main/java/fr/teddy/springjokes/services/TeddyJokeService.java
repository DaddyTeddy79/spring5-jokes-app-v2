package fr.teddy.springjokes.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("jokeService")
@Profile("TC")
public class TeddyJokeService implements JokeService {

	@Override
	public String getRandomJoke() {
		return "Les blagues de papa sont les meilleures !";
	}

}
