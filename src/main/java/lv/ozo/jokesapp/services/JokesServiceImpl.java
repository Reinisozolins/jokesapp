package lv.ozo.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl  implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

//    public  JokesServiceImpl(){
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }
//

//    constructor based injection

    public JokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
