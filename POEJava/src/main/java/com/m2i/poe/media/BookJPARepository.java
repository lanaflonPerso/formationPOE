package com.m2i.poe.media;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@Path("/bookrepo")
public class BookJPARepository {
    private static EntityManager em = EntityManagerFactorySingleton.getEntityManager();

    private BookJPARepository() {
    }

    public static List<Book> getAll() {
        return em.createQuery("select b from Book b").getResultList();
    }

    public static Book getById(int id) {
        return em.find(Book.class, id);
    }

    public static List<Book> getByTitle(String title) {
        return em.createQuery("select b from Book b where upper(b.title) like '%" + title.toUpperCase() + "%'")
                .getResultList();
    }


    public static List<Book> getByPrice(double price) {
        return  em.createQuery("select b from Book b where b.price <= " + price).getResultList();
    }


    public static List<Book> getByPublisher(String publisherName) {
        return em.createQuery
                ("select b from Book b where b.publisher ==" + Integer.parseInt(publisherName))
                .getResultList();
    }


    public static Response createBook(String title, double price) {
        Book b = new Book();
        b.setPrice(price);
        b.setTitle(title);
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(b);
        t.commit();
        return Response.ok().build();
    }



    public static void remove(int id) {
        Book b = em.find(Book.class, id);
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(b);
        tx.commit();
    }


    public static void update(Book b) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(em.merge(b));
        t.commit();
    }
}
