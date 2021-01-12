package com.majd.jokesgenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService {

    public String getJoke(){
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
