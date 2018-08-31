package com.m2i.poe.media;

import javax.ws.rs.core.Response;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IBookRepository {

    void load(String uri) throws IOException, ClassNotFoundException, SQLException;

    List<Book> getAll() ;
    Book getById(int id) ;
    List<Book> getByTitle(String title) ;
    List<Book> getByPrice(double price) ;
    List<Book> getByPublisher(String publisherName) ; // Bonus
    // Bonus
    void createBook(String title, double price);
    Response remove(int id) ;
    void update(Book b) ;

}
