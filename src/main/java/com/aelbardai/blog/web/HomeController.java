package com.aelbardai.blog.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home controller
 */
@Controller
@Slf4j
public class HomeController {

    @GetMapping({"/" , "/home"})
    public ModelAndView homePage(){
        return new ModelAndView("index");
    }

}
