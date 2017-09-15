package com.joseroberts87.hotelsapplication.models.data;

import com.joseroberts87.hotelsapplication.models.Hotels;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rober on 9/15/2017.
 */
public interface HotelsRepository extends MongoRepository<Hotels, Integer> {
    Hotels findByName(String name);
}
