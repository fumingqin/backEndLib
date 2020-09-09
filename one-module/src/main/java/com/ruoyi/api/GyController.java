package com.ruoyi.api;

import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GyController {

    @RequestMapping("/one")
    public AjaxResult test(){
        return AjaxResult.success("hello world!");
    }
}
