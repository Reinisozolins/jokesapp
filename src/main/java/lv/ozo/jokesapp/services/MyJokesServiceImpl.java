package lv.ozo.jokesapp.services;

import lv.ozo.jokesapp.myjokes.MyJokesQuotes;
import org.springframework.stereotype.Service;

@Service
public class MyJokesServiceImpl implements MyJokeService {

    private final MyJokesQuotes myJokesQuotes;

    public MyJokesServiceImpl() {
        this.myJokesQuotes = new  MyJokesQuotes();
    }

    @Override
    public String getMyJoke() {
        return myJokesQuotes.getMyRandomQuote();

    }
}
