package com.gy.springbootdemo.core.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "swagger使用测试")
@RequestMapping("/v1/swagger")
public class SwaggerUseController {

    @GetMapping("/testSwagger")
    @ApiOperation(value = "测试使用swagger相关注解")
    @ApiImplicitParams({@ApiImplicitParam(name = "sname",value = "学生姓名",dataType = "String",paramType = "query",required = true,defaultValue = "Gy"),
                        @ApiImplicitParam(name = "password",value = "密码",dataType = "String",paramType = "query",required = true,defaultValue = "12345")})
    @ApiResponse(code = 200,message = "请求成功")
    public String testSwagger(String sname,String password){

        return sname+"_"+password;
    }
}
