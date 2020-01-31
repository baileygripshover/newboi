package com.trak.activitytracker.cont;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class ArticleController {
    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public ModelAndView showArticle() {
        return new ModelAndView("article2");
    }
}
