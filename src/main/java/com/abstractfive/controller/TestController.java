package com.abstractfive.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 * Created by 张老西 on 2018/4/3.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    /**
     * 测试一哈
     * @param userName
     * @return
     */
    @RequestMapping("/{userName}")
    public String test(@PathVariable String userName){
        return userName;
    }
}
