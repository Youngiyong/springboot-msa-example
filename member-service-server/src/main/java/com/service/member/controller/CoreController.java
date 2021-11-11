package com.service.member.controller;

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

    @GetMapping("/member/detail")
    public String member() {
        return "Member Detail - Port " + port + " - " + message;
    }

}