package com.blog.service;

import com.blog.pojo.Image;

import java.util.List;

public interface ImageService {

    int add(Image image);

    int delete(String name);

    Image select(String name);

    List<Image> getAll();

    int getCount();
}
