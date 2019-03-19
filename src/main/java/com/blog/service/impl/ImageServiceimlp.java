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
    public String add(Image image) {
        if (imageMapper.insert(image) == 1){
            return "添加成功";
        }
        else {
            return "添加失败";
        }
    }

    @Override
    public String delete(String name) {
        if (imageMapper.deleteByPrimaryKey(name) == 1){
            return "添加成功";
        }
        else {
            return "添加失败";
        }
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
