package guru.springframework.joke.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	//It can't be changed
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
	
	
}
