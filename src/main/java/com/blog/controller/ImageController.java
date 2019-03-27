package com.blog.controller;

import com.blog.pojo.Image;
import com.blog.service.ImageService;
import com.blog.utils.UploadImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@Controller
public class ImageController {

    @Autowired
    private ImageService imageService;

    @RequestMapping("/admin/upload")
    public ModelAndView uploadImage(@RequestParam(value = "uploadImage", required = false) MultipartFile image, HttpSession session) throws IOException {
        ModelAndView mav = new ModelAndView();
        String parh = "E:\\uploadImages";
        String name = image.getOriginalFilename();
        if (imageService.select(name) == null){
            UploadImage.uploadImage(parh, image);
            imageService.add(new Image(image.getOriginalFilename(),
                    "/images/" + image.getOriginalFilename(), new Date()));
            mav.setViewName("redirect:/admin/images");
            System.out.println("上传成功");
        }
        else {
            mav.setViewName("redirect:/admin/upload-fail");
            System.out.println("上传失败");
        }
        return mav;
    }

    @RequestMapping("/admin/upload-fail")
    public ModelAndView uploadFail(){
        ModelAndView mav = new ModelAndView("admin/uploadFail");
        return mav;
    }
}
