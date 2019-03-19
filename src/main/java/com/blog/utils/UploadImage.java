package com.blog.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class UploadImage {

    public static void uploadImage(String path, MultipartFile image) throws IOException {
        String fileName = image.getOriginalFilename();
        File newFile = new File(path, fileName);
        image.transferTo(newFile);
    }
}
