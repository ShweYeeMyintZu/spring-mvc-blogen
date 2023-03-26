package com.example.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @GetMapping("/list-category")
    public String listCategory(){
        return "category";
    }
}
