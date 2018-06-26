package com.example.entity;

import java.io.Serializable;

public class MovieProducers implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private int personId;

    private int movieId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}