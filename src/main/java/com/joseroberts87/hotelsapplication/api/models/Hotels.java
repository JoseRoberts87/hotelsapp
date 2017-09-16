package com.joseroberts87.hotelsapplication.api.models;

import org.springframework.data.annotation.Id;

/**
 * Created by rober on 9/14/2017.
 */
//@Document(collection = "hotels")
public class Hotels {

    @Id
    private String id;

    private String name;

    private String rating;

    public Hotels(){
        this.name = name;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
//
//    @Override
//    public String toString(){
//        return "Hotels{" +
//                ", name ='" + name + '\'' +
//                ", rating ='" + rating +
//                '}';
//    }
}
