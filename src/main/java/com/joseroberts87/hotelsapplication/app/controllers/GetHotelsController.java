package com.joseroberts87.hotelsapplication.app.controllers;

import com.joseroberts87.hotelsapplication.api.models.data.HotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rober on 9/15/2017.
 */
@Controller
@RequestMapping("/hotel")
public class GetHotelsController {

    @Autowired
    private HotelsRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllHotels(Model model){
        model.addAttribute("title", "Hotels Page");
        model.addAttribute("hotels", repository.findAll());
        return "hotels/index";
    }
}
