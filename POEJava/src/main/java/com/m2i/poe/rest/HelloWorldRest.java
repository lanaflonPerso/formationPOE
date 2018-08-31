package com.m2i.poe.rest;

import com.m2i.poe.media.Book;
import com.m2i.poe.media.BookJPARepository;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

@Path("/hello")
public class HelloWorldRest {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getHello() {
        return BookJPARepository.getAll();
    }

    @GET
    @Path("/bookid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getById(@PathParam("id") int id) {
        return BookJPARepository.getById(id);
    }

    @GET
    @Path("/booktitle/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getByTitle(@PathParam("title") String title) {
        return BookJPARepository.getByTitle(title);
    }

    @GET
    @Path("/bookprice/{price}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getByPrice(@PathParam("price") double price) {
        return BookJPARepository.getByPrice(price);
    }

    @GET
    @Path("bookpublisher/{publisher}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getByPublisher(@PathParam("publisher") String publisher) {
        return BookJPARepository.getByPublisher(publisher);
    }


    @DELETE
    @Path("/deletebook/{id}")
    public Response getBook(@PathParam("id") int id) {
        try {
            BookJPARepository.remove(id);
            return Response.ok().build();
        }
        catch (IllegalArgumentException e){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/createbook/{title}/{price}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addBook(@PathParam("title") String title, @PathParam("price") double price) {
            BookJPARepository.createBook(title, price);
    }

    @POST
    @Path("/book")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postBook(Book b){
        try{
            BookJPARepository.update(b);
            return Response.status(Response.Status.ACCEPTED).build();
        }
        catch (Exception e){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}