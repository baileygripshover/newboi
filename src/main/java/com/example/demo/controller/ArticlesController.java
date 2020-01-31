package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArticlesController {

    @GetMapping("/article")
    public ModelAndView displayArticle() {


        return new ModelAndView("article");
    }

}

