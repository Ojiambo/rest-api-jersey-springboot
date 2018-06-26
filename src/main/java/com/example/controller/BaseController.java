package com.example.controller;

import com.example.exception.ApiException;
import com.example.exception.ResourceNotFoundException;
import com.example.service.ApiService;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public abstract class BaseController {

    public Response getById(ApiService service, Integer id){
        try {
            return Response.ok()
                    .entity(service.getById(id))
                    .type(MediaType.APPLICATION_JSON)
                    .build();

        }catch (ResourceNotFoundException e){
            return Response.status(404)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        } catch (ApiException e){
            return Response.status(500)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }catch (Exception e){
            return Response.serverError()
                    .type(MediaType.APPLICATION_JSON)
                    .build();
        }
    }

    public Response getAll(ApiService service){
        try {
            return Response.ok()
                    .entity(service.getAll())
                    .type(MediaType.APPLICATION_JSON)
                    .build();
        } catch (ApiException e){
            return Response.status(500)
                    .entity(e.getMessage())
                    .type(MediaType.TEXT_PLAIN)
                    .build();
        }catch (Exception e){
            return Response.serverError()
                    .type(MediaType.APPLICATION_JSON)
                    .build();
        }
    }
}