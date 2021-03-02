package com.kevin.noon.jokes2.controllers;

import com.kevin.noon.jokes2.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class JokesController {
   private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    String getJoke(Model model){
        model.addAttribute("joke",jokesService.getJoke());
        return "index";
    }
}
