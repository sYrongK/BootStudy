package com.study.bootstudy.business.common.controller;

import com.study.bootstudy.common.exception.BootStudyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("login")
    public String login() throws BootStudyException {
        return "main/LoginPage";
    }

    @GetMapping("join")
    public String join() throws BootStudyException {
        return "main/JoinPage";
    }
}
