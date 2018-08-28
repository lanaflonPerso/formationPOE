package com.m2i.poe.rest;

import com.m2i.poe.media.Book;
import com.m2i.poe.media.EntityManagerFactorySingleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.core.*;

import javax.ws.rs.*;

@Path("/hello")
public class HelloWorldRest {

    @GET
    @Path("/world")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello World!";
    }

    @GET
    @Path("/param/{s}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(@PathParam("s") String s) {
        return "Hello "+s;
    }

    @GET
    @Path("/mock/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getMock(@PathParam("id") int id) {
        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        Book b = em.find(Book.class,id);
        return b;
    }

    @DELETE
    @Path("/book/{id}")
    public Response getBook(@PathParam("id") int id) {
        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        Book b = em.find(Book.class, id);
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.remove(b);
        t.commit();
        return Response.ok().build();
    }

    @PUT
    @Path("addbook")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addBook(){
        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        Book b = new Book();
        b.setTitle("Toto");
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(b);
        t.commit();
        return Response.ok().build();
    }
}