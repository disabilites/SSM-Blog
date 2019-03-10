package com.blog.utils;

import org.springframework.util.DigestUtils;

public class MD5Encode {

    private static final String slat = "&%5123***&&%%$$#@";

    public static String MD5Encoding(String string){
        String base = string + "/" + slat;
        String newSting = DigestUtils.md5DigestAsHex(base.getBytes());
        return newSting;
    }
}
