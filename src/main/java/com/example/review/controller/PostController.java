package com.example.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/list-post")
    public String listpost(){
        return "post";
    }
}
