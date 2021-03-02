package com.kevin.noon.jokes2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public interface JokesService {
     String getJoke();
}
