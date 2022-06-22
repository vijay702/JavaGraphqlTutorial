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

    @Autowired
    private AuthorRepository authorRepository;



    public List<Book> findAll() {

         books.add(new Book(1,"harry potter",355,authorRepository.findByName("vijay")));


        return books;
    }

    public Book findOne(Integer id) {
        return books.stream().filter(book -> book.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Book not found"));
    }




}
