package com.majd.jokesgenerator.controllers;

import com.majd.jokesgenerator.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokesController {
    final private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(){
        return jokesService.getJoke();
    }
}
