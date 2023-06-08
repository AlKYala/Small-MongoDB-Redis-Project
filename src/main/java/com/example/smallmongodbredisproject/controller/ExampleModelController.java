package com.example.smallmongodbredisproject.controller;

import com.example.smallmongodbredisproject.data.ExampleModel;
import com.example.smallmongodbredisproject.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/example")
@Slf4j
public class ExampleModelController {

    @Autowired
    private ExampleService exampleService;

    @PostMapping("/create")
    private ExampleModel create(@RequestBody ExampleModel model) {
        log.info("RECEIVE CREATE CALL");
        return this.exampleService.create(model);
    }

    @GetMapping("/{id}")
    private ExampleModel findById(@PathVariable String id) {
        log.info("RECEIVE FIND BY ID CALL");
        return this.exampleService.findById(id);
    }

    @GetMapping
    private List<ExampleModel> findAll() {
        log.info("RECEIVE FIND ALL CALL");
        return this.exampleService.findAll();
    }
}
