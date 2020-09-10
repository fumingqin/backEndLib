package com.ruoyi.api;

import com.ruoyi.common.core.domain.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(tags = "接口测试")
public class GyController {

    @GetMapping("/one")
    @ApiOperation("helloworld接口")
    public AjaxResult test(){
        return AjaxResult.success("hello world!");
    }
}
