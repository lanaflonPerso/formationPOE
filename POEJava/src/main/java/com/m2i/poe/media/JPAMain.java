package com.m2i.poe.media;

import com.m2i.poe.bank.Transaction;
import com.m2i.poe.media.Book;
import com.m2i.poe.media.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JPAMain {

    public static void main(String[] args) {

        EntityManager em = EntityManagerFactorySingleton.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        Book b = em.find(Book.class,8);
        tx.begin();
        em.remove(b);
        tx.commit();
        em.close();
    }
}
