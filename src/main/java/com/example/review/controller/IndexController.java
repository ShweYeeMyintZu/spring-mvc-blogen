package com.example.review.controller;

import com.example.review.entity.Category;
import com.example.review.entity.Post;
import com.example.review.entity.Users;
import com.example.review.service.CategoryService;
import com.example.review.service.PostService;
import com.example.review.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private PostService postService;
    @Autowired
    private UsersService usersService;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("categories",categoryService.findAllCategory());
        model.addAttribute("category",new Category());
        model.addAttribute("user",new Users());
        model.addAttribute("users",usersService.findAllUsers());
        model.addAttribute("post",new Post());

        return "home";
    }
}
