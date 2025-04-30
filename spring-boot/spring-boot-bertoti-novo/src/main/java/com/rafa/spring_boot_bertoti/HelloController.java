package com.rafa.spring_boot_bertoti;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<h1>VAI CORINTHIANS!</h1>" +
                "<img src='https://media.giphy.com/media/fTXd1V9hHcP8UT7GEy/giphy.gif' alt='GIF'>";
    }
}
