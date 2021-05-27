package com.study.bootstudy.business.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @GetMapping("/test")
    public String test() {
        return "sample/sample";
    }
}
