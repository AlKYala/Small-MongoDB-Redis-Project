package com.example.smallmongodbredisproject.controller;

import com.example.smallmongodbredisproject.data.ExampleModel;
import com.example.smallmongodbredisproject.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/example")
public class ExampleModelController {

    @Autowired
    private ExampleService exampleService;

    @PostMapping("/create")
    private ExampleModel create(ExampleModel model) {
        return this.exampleService.create(model);
    }

    @GetMapping("/{id}")
    private ExampleModel findById(@PathVariable String id) {
        return this.exampleService.findById(id);
    }

    @GetMapping
    private List<ExampleModel> findAll() {
        return this.exampleService.findAll();
    }
}
