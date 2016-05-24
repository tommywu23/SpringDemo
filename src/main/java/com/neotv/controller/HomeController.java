package com.neotv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by neotv on 2016-5-23.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "I'm tommy";
    }
}
