package com.wk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wangkun
 * @date 2020/8/4
 * @description
 **/
@RestController
public class WeiXinController {

    @RequestMapping("test")
    public void test(){
        System.out.println("test1212324");
    }
}
