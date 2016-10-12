package com.huoh.study.integrate.controller;

/**
 *
 * Created by huohao on 16/8/8.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){

        return "";
    }
}
