package com.blog.service.impl;

import com.blog.dao.ImageMapper;
import com.blog.pojo.Image;
import com.blog.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("imageService")
public class ImageServiceimlp implements ImageService {

    @Autowired
    private ImageMapper imageMapper;

    public ImageMapper getImageMapper() {
        return imageMapper;
    }

    public void setImageMapper(ImageMapper imageMapper) {
        this.imageMapper = imageMapper;
    }

    @Override
    public int add(Image image) {
        return imageMapper.insert(image);
    }

    @Override
    public int delete(String name) {
        return imageMapper.deleteByPrimaryKey(name);
    }

    @Override
    public Image select(String name) {
        return imageMapper.selectByPrimaryKey(name);
    }

    @Override
    public List<Image> getAll() {
        return imageMapper.getAll();
    }

    @Override
    public int getCount() {
        return imageMapper.getCount();
    }
}
