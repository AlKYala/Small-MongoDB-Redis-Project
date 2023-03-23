package com.example.smallmongodbredisproject.repository;


import com.example.smallmongodbredisproject.data.ExampleModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExampleRepository extends MongoRepository<ExampleModel, String> {
}
