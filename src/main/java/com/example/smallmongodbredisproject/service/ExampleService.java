package com.example.smallmongodbredisproject.service;

import com.example.smallmongodbredisproject.data.ExampleModel;

import java.util.List;

public interface ExampleService {

    public List<ExampleModel> findAll();

    public ExampleModel findById(String id);

    public ExampleModel create(ExampleModel model);

    public ExampleModel update(ExampleModel model);

    public void delete(String id);
}
