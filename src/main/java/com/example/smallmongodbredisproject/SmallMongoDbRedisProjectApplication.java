package com.example.smallmongodbredisproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Test if Redis works:
 *
 * 1. Save an instance to DB
 * 2. Call it localhost:8080/example/{your_id}
 * 3. Modify the a value of any attribute in the db (with mongo express)
 * 4. If the instance has the old value (before change) then redis works
 */

@SpringBootApplication
public class SmallMongoDbRedisProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallMongoDbRedisProjectApplication.class, args);
    }

}
