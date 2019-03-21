package com.blog.pojo;

import java.util.Date;

public class Image {

    private String name;

    private String url;

    private Date date;

    public Image(String name, String url, Date date) {
        this.name = name;
        this.url = url;
        this.date = date;
    }

    public Image() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}