package com.example.service;

import com.example.exception.ApiException;
import com.example.exception.ResourceNotFoundException;

import java.util.List;

public interface ApiService<T> {

    T getById(int i) throws ApiException, ResourceNotFoundException;
    List<T> getAll() throws ApiException;
}
