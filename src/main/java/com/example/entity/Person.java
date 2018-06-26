package com.example.entity;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String firstName;

    private String lastName;

    private String aliases;

    private List<MovieActors> moviesAsActor;

    private List<MovieDirectors> moviesAsDirector;

    private List<MovieProducers> moviesAsProducer;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAliases() {
        return aliases;
    }
    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

}