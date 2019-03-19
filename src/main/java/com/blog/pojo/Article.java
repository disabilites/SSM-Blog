package com.blog.pojo;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private Date date;

    private String content_html;

    private String content_md;

    private String classification;

    private String state;

    public Article(Integer id, String title, Date date, String content_html, String content_md, String classification, String state) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content_html = content_html;
        this.content_md = content_md;
        this.classification = classification;
        this.state = state;
    }

    public Article(){
        super();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent_html() {
        return content_html;
    }

    public void setContent_html(String content_html) { this.content_html = content_html; }

    public String getContext_md() {
        return content_md;
    }

    public void setContext_md(String context_md) {
        this.content_md = context_md;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}