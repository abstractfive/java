package com.abstractfive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * Created by 张老C on 2018/4/11.
 */
//注意这里使用Controller而不是RestController
@Controller
public class HtmlConntroller {

    /**
     * 测试一哈html
     * @return
     */
    @GetMapping("/html/{path}")
    public String testHtml(@PathVariable String path){
        //url=xxx.xxx/path 会跳到application.properties配置中的地址
        return path;
    }
}
