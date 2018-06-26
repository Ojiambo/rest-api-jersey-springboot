package com.example.service;

import com.example.entity.Person;
import com.example.exception.ApiException;
import com.example.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("personService")
public class PersonService implements ApiService<Person> {


    @Override
    public Person getById(int i) throws ApiException, ResourceNotFoundException {
        return null;
    }

    @Override
    public List<Person> getAll() throws ApiException {
        return null;
    }
}
