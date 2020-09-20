package lv.ozo.jokesapp.myjokes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MyJokesQuotes {

    private List<String> myQuotes = new ArrayList(123);

    public MyJokesQuotes(){
        this.myQuotes.add("strawberries");
        this.myQuotes.add("ice cream");
        this.myQuotes.add("chocolate");
    }

    public String getMyRandomQuote(){
        return (String) this.myQuotes.get(ThreadLocalRandom.current().nextInt(1, this.myQuotes.size()));
    }
}
