package com.ruoyi.generator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ThreeController {

    @RequestMapping("/three")
    public String three(){
        return "hello world!";
    }
}
