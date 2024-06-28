package com.himanshu.isslocationservice.repository;

import com.himanshu.isslocationservice.entity.ISSLocation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISSLocationRepository extends MongoRepository<ISSLocation, Integer> {
}
