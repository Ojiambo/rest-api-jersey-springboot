package com.example.controller;

import com.example.exception.ApiException;
import com.example.exception.ResourceNotFoundException;
import com.example.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Controller
@Path("/movie")
public class MovieController extends BaseController {

    @Autowired
    @Qualifier("movieService")
    public ApiService service;

    @GET
    @Path("/")
    @Produces("application/json")
    public Response getAll()
    {
        return getAll(service);
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getById(@PathParam("id") int id)
    {
        return getById(service, id);
    }
}
