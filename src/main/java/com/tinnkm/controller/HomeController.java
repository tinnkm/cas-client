package com.tinnkm.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tinnkm on 2017/8/3.
 */
@RestController
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "hello world!";
    }
}
