package com.example.service;

import com.example.entity.Movie;
import com.example.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DB {

    private static Map<Integer, Movie> movies = new HashMap<>();
    private static Map<Integer, User> users = new HashMap<>();

    public static Movie getMovieById(int id){
        return movies.get(id);
    }

    public static User getUserById(int id){
        return users.get(id);
    }

    public static List<Movie> getAllMovies(){
        List<Movie> listMovies = movies.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        return listMovies;
    }

    static
    {
        Movie m = new Movie();
        m.setId(1);
        m.setReleaseYear(2000);

        Movie m2 = new Movie();
        m2.setId(2);
        m2.setReleaseYear(2010);

        movies.put(m.getId(), m);
        movies.put(m2.getId(), m2);

        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Leo");
        user1.setLastName("Ampuero");

        users.put(user1.getId(), user1);
    }
}
