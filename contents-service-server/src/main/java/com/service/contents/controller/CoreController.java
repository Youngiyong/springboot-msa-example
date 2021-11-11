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

    @GetMapping("/contents/detail")
    public String contents() {
        return "Contents Detail - Port " + port + " - " + message;
    }

    @GetMapping("/pay/detail")
    public String pay() {
        return "Pay Detail - Port " + port + " - " + message;
    }

    @GetMapping("/comment")
    public String comment() {
        return "Comment - Port " + port + " - " + message;
    }

    @GetMapping("/board")
    public String board() {
        return "Board - Port " + port + " - " + message;
    }
}
