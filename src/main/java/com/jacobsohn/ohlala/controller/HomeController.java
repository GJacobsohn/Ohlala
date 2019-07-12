package com.jacobsohn.ohlala.controller;

import com.jacobsohn.ohlala.repositiories.ArticleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    ArticleRepository articleRepository;

    public HomeController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @RequestMapping("/")
    public String index(Model model) {
        return "home";
    }
}
