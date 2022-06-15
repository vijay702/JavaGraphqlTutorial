package com.eminds.graphqll.model;

public class Book {

    private Integer id ;
    private String title;
    private Integer pages;
    private String author;

    public Book() {
    }

    public Book(Integer id, String title, Integer pages, String author) {
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

    public String getAuthor() {
        return author;
    }

    public String SetAuthor(String author) {
        return this.author = author;
    }
}
