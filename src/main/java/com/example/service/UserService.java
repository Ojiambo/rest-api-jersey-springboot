package com.example.service;

import com.example.entity.User;
import com.example.exception.ApiException;
import com.example.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("userService")
public class UserService implements ApiService<User> {

    @Override
    public User getById(int i) throws ApiException, ResourceNotFoundException {
        try {
            User user = DB.getUserById(i);

            if(user == null){
                throw new ResourceNotFoundException("User id: " + i + " not found");
            }

            return user;

        }catch (ResourceNotFoundException e){
            throw e;
        } catch (Exception e){
            throw new ApiException("Error getting user by Id: " + i);
        }
    }

    @Override
    public List<User> getAll() throws ApiException {
        return null;
    }

}
