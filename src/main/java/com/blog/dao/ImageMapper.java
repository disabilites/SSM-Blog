package com.blog.dao;

import com.blog.pojo.Image;

import java.util.List;

public interface ImageMapper {
    int deleteByPrimaryKey(String name);

    int insert(Image image);

    Image selectByPrimaryKey(String name);

    List<Image> getAll();

    int getCount();
}