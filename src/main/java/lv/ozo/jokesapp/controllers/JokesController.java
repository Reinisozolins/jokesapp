package lv.ozo.jokesapp.controllers;

import lv.ozo.jokesapp.services.JokeService;
import lv.ozo.jokesapp.services.MyJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeService jokeService;
    private MyJokeService myJokeService;

    @Autowired
    public JokesController(JokeService jokeService, MyJokeService myJokeService) {
        this.jokeService = jokeService;
        this.myJokeService = myJokeService;
    }

    @RequestMapping({"/test"})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknoriss";
    }

    @RequestMapping({"/mytest"})
    public String showMyJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        model.addAttribute("myJoke", myJokeService.getMyJoke());
        return "myjokepage";
    }
}







