package com.joseroberts87.hotelsapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rober on 9/14/2017.
 */
@Controller
@RequestMapping("")
public class LoginController {

    @RequestMapping(value = "")
    @ResponseBody
    public String isLogedIn(){
        //test user login and redirect as necessary
        //if logged in return /hotels
        // else
        //return login
        return "user login";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    @ResponseBody
    public String login(){
        return "user sign in form";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String logedIn(){
        return "logged in";
    }
}
