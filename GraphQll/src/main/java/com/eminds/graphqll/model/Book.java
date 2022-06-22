package com.eminds.graphqll.model;

public class Book {

    private Integer id ;
    private String title;
    private Integer pages;
    private Author author;

    public Book() {
    }

    public Book(Integer id, String title, Integer pages, Author author) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public Author SetAuthor(Author author) {
        return this.author = author;
    }
}
