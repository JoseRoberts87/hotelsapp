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

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String allHotels() {
        return "helldos";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String createHotels(){
        return "created hotel";
    }

    @RequestMapping(value = "id", method = RequestMethod.GET)
    @ResponseBody
    public String hotelById(){
        return "hotels by id";
    }

    

}
