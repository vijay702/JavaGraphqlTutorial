//package com.eminds.graphqll.repository;
//
//import com.eminds.graphqll.model.Author;
//import com.eminds.graphqll.model.Book;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class AuthorRepository {
//
//
//    private List<Author> authors = new ArrayList<>();
//
//    public List<Author> findAll(){
//        List<Author> authors = new ArrayList<>();
//
//        return authors;
//
//
//    }
//
//    public Author findByName(String s) {
//
//        return authors.stream().filter(author -> author.getName().equals(s)).findFirst()
//                .orElseThrow(() ->  new RuntimeException("Author not found"));
//    }
//
//
//    @PostConstruct
//    private void init() {
//        authors.add(new Author(1,"JoshLong"));
//        authors.add(new Author(2,"MarkHeckler"));
//        authors.add(new Author(3,"GregTurnquist"));
//    }
//}
