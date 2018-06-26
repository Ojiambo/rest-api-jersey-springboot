package com.example.service;

import com.example.entity.Movie;
import com.example.exception.ApiException;
import com.example.exception.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("movieService")
public class MovieService implements ApiService<Movie> {

    @Override
    public Movie getById(int i) throws ApiException, ResourceNotFoundException {
        try {
            Movie movie = DB.getMovieById(i);

            if(movie == null){
                throw new ResourceNotFoundException("Movie id: " + i + " not found");
            }

            return movie;

        }catch (ResourceNotFoundException e){
            throw e;
        } catch (Exception e){
            throw new ApiException("Error getting movie by Id: " + i);
        }
    }

    @Override
    public List<Movie> getAll() throws ApiException {
        try {
            return DB.getAllMovies();
        }catch (Exception e){
            throw new ApiException("Error getting movies");
        }
    }

}
