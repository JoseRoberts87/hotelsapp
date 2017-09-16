package com.joseroberts87.hotelsapplication.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rober on 9/15/2017.
 */
@Controller
@RequestMapping("")
public class LoginController {

    @RequestMapping("")
    public String index(Model model){
        model.addAttribute("title", "Kenzan Simple Demo");
        model.addAttribute("login", "login");
        return "login/index";
    }
}
