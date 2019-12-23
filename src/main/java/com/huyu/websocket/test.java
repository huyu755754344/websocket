package com.huyu.websocket;

import org.springframework.util.DigestUtils;

public class test {
    public static void main(String[] args) {
        String huyu= "huyu";
        String b = DigestUtils.md5DigestAsHex(huyu.getBytes());
        int a = b.length();
        System.out.println(a);
    }
}
