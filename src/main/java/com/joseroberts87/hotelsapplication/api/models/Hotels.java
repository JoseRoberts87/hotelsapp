package com.joseroberts87.hotelsapplication.api.models;

import org.springframework.data.annotation.Id;

/**
 * Created by rober on 9/14/2017.
 */
public class Hotels {

    @Id
    private String id;

    private String name;

    private String stars;

    public Hotels(){
        this.name = name;
        this.stars = stars;
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
        return stars;
    }

    public void setRating(String stars) {
        this.stars = stars;
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
