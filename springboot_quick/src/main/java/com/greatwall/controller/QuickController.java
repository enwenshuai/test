package com.greatwall.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wenshuai
 * @title: QuickController
 * @projectName springboot_quick
 * @description: TODO
 * @date 2019/5/1717:01
 */
@Controller
@ConfigurationProperties(prefix = "name")
public class QuickController {

    @Value("${name}")
    private String name;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){

        return name;
    }
}
