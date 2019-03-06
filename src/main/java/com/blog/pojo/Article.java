package com.blog.pojo;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private Date date;

    private String content;

    private String tag;

    public Article(Integer id, String title, Date date, String content, String tag) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
        this.tag = tag;
    }

    public Article() {
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
        this.title = title == null ? null : title.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}