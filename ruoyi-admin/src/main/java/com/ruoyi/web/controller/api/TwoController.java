package com.ruoyi.web.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TwoController {

    @RequestMapping("/two")
    public String two(){
        return "hello world!";
    }
}
