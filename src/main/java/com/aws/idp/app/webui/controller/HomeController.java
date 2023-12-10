package com.aws.idp.app.webui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String initHellWorld() {
        return "Hello World";
    }
    @GetMapping("/home")
    public String initHello() {
        return "Hello Nam";
    }
}
