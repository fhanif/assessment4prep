package com.gc.controller;

/**
 * Created by fhani on 7/21/2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Random;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld(Model model)
    {


        int randNum;
        randNum = (int)(Math.random()*10 + 1);

        int randNum2;
        Random rand = new Random();
        randNum2 = rand.nextInt(10)+1;

        model.addAttribute("randNum2", randNum2);

        return new
                ModelAndView("welcome","message",randNum);

    }

    @RequestMapping("/success")

    public String displayName (@RequestParam("username") String username, Model model){

        model.addAttribute("name",username);
        return "summary";
    }

}
