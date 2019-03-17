package com.blog.pojo;

public class Image {

    private String name;

    private String url;

    public Image(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Image() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}