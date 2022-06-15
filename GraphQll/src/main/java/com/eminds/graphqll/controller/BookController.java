package com.eminds.graphqll.controller;

import com.eminds.graphqll.model.Book;
import com.eminds.graphqll.repository.Bookrepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {


    private final Bookrepository  bookrepository;


    public BookController(  Bookrepository bookrepository) {

        this.bookrepository = bookrepository;
    }

//    @SchemaMapping(typeName = "Query",value = "allBooks")
    @QueryMapping(value = "allBooks")
    public List<Book> allBooks() {

        return bookrepository.findAll();
    }

    @QueryMapping
    public Book findOne(@Argument Integer id){

        return  bookrepository.findOne(id);
    }
}
