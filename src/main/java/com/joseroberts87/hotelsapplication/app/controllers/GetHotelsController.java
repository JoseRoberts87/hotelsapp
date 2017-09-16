package com.joseroberts87.hotelsapplication.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rober on 9/15/2017.
 */
@Controller
@RequestMapping("/hotel")
public class GetHotelsController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllHotels(){
        return "hotels/index";
    }
}
