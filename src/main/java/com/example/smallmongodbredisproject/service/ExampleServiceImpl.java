package com.example.smallmongodbredisproject.service;

import com.example.smallmongodbredisproject.data.ExampleModel;
import com.example.smallmongodbredisproject.repository.ExampleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    @Override
    public List<ExampleModel> findAll() {
        return exampleRepository.findAll();
    }

    @Override
    public ExampleModel findById(String id) {
        ExampleModel notFoundModel = new ExampleModel("bla", "FooModel", "Your stuff was not found", "bla@bla.com");
        return exampleRepository.findById(id).orElse(notFoundModel);
    }

    @Override
    public ExampleModel create(ExampleModel model) {
        return exampleRepository.save(model);
    }

    @Override
    public ExampleModel update(ExampleModel model) {
        return exampleRepository.save(model);
    }

    @Override
    public void delete(String id) {
        this.exampleRepository.deleteById(id);
    }
}
