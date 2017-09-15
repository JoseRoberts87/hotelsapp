package com.joseroberts87.hotelsapplication.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

import static javax.swing.text.StyleConstants.Size;

/**
 * Created by rober on 9/14/2017.
 */
@Document(collection = "hotels")
public class Hotels {

    @Id
    private int id;

    private String name;

    private int rating;

    private Date createdOn;

    public Hotels(){
        this.
    }




}
