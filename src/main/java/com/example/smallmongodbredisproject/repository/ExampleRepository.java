package com.example.smallmongodbredisproject.repository;


import com.example.smallmongodbredisproject.data.ExampleModel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ExampleRepository extends MongoRepository<ExampleModel, String> {

    /*value is the name of the cache, the key is used for the parameter name -

    Redis is a key-value db that is used for caching
    we have to choose values for the key, we say here use the parameter
     */
    @Cacheable(value = "cacheExampleName", key="#id")
    Optional<ExampleModel> findById(String id);

}
