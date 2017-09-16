package com.joseroberts87.hotelsapplication.api.controllers;

import com.joseroberts87.hotelsapplication.api.models.Hotels;
import com.joseroberts87.hotelsapplication.api.models.data.HotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rober on 9/14/2017.
 */

@RestController
@RequestMapping("hotels")
public class HotelsControllers {

    @Autowired
    private HotelsRepository repository;

    public float lng;
    public float lat;

    @RequestMapping(value = "")
    public List<Hotels> getHotels() {
        System.out.println("this ran");
        return repository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String createHotels(){
        return "created hotel";
    }

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public Hotels hotelByName(@PathVariable("name")String name){
        return repository.findByName(name);
    }

//    @RequestMapping(value = "{id}", method = RequestMethod.GET)
//    public Hotels hotelById(@PathVariable("id")int id){
//        System.out.println("getting id " + id );
//        return repository.findById(id);
//    }



}
