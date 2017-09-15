package com.joseroberts87.hotelsapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rober on 9/14/2017.
 */

@RestController
@RequestMapping(value = "hotels/id/reviews")
public class ReviewsController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String reviews(){
        return "this is my review";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String add(){
        return "posted";
    }

}
