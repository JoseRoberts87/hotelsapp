package com.joseroberts87.hotelsapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rober on 9/14/2017.
 */

@Controller
public class HotelsControllers {

    @RequestMapping(value = "")
    @ResponseBody
    public String hello() {
        return "hellos";
    }

}
