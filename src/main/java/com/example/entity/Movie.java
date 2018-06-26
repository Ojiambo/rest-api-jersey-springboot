package com.example.entity;

import java.io.Serializable;
import java.util.List;

public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String title;

    private Integer releaseYear;

    private List<MovieActors> casting;

    private List<MovieDirectors> directors;

    private List<MovieProducers> producers;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

}