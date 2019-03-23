package com.blog.pojo;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer aId;

    private String name;

    private String email;

    private Date date;

    private String content;

    private String aTitle;

    private Integer state;

    public Comment(Integer id, Integer aId, String name, String email, Date date, String content, String aTitle, Integer state) {
        this.id = id;
        this.aId = aId;
        this.name = name;
        this.email = email;
        this.date = date;
        this.content = content;
        this.aTitle = aTitle;
        this.state = state;
    }

    public Comment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle == null ? null : aTitle.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}