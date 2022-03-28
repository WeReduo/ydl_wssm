package com.ydlclass.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name: ydl_wssm_2
 * File Name: TestController
 *
 * @version 1.0
 * @author:wenerduo
 * @Date: 2022/03/28/上午 7:55
 * Copyright (c) 2022,
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public  String test() {
        return "hello ssm pro";
    }

}
