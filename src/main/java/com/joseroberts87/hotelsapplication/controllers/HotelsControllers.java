package com.joseroberts87.hotelsapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rober on 9/14/2017.
 */

@Controller
@RequestMapping("/hotels")
public class HotelsControllers {

    @RequestMapping(value = "")
    @ResponseBody
    public String hello() {
        return "helldos";
    }

    @RequestMapping(value = "id", method = RequestMethod.GET)
    @ResponseBody
    public String hotels(){
        return "hotels";
    }

}
