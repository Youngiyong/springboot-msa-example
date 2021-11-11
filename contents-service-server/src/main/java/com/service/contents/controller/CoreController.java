package com.service.contents.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RefreshScope
public class CoreController {

    @Value("${server.port}")
    private int port;

    @Value("${spring.message}")
    private String message;

    @Value("${user.password}")
    private String password;

    @GetMapping("/contents/detail")
    public String contents() {
        return "Contents Detail - Port " + port + " - " + message;
    }

    @GetMapping("/member/password")
    public String memberPassword() {
           return "Member Password - " + password;
    }

}
