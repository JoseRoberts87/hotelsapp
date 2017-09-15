package com.joseroberts87.hotelsapplication.models.data;

import com.joseroberts87.hotelsapplication.models.Hotels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rober on 9/15/2017.
 */
@Repository("hotels")
public interface HotelsRepository extends MongoRepository<Hotels, String> {
    Hotels findByName(String name);
//    Hotels findById(int id);
}
