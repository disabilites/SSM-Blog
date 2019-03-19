package com.blog.service;

import com.blog.pojo.Image;

import java.util.List;

public interface ImageService {

    String add(Image image);

    String delete(String name);

    Image select(String name);

    List<Image> getAll();

    int getCount();
}
