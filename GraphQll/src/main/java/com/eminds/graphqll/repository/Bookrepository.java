package com.eminds.graphqll.repository;


import com.eminds.graphqll.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Bookrepository {
    private List<Book> books = new ArrayList<>();



    public List<Book> findAll() {


        return books;
    }

    public Book findOne(Integer id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @PostConstruct
    private void init() {
        books.add(new Book(1,"Reactive Spring", 484,"vijay"));
        books.add(new Book(2,"Spring Boot Up & Running", 328,"Karal Saritha"));
        books.add(new Book(3,"Hacking with Spring Boot 2.3", 392,"karal"));
    }

}
