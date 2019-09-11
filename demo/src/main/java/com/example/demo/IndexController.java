package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:xialei
 * @date: 2019/9/11 15:11
 */
@Controller
public class IndexController {


    @ResponseBody
    @RequestMapping("/index")
    public String index(){
        return "hello,springboot";
    }
}
