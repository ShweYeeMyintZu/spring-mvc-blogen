package com.example.review.controller;

import com.example.review.entity.Users;
import com.example.review.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UsersService usersService;
    @GetMapping("/list-user")
    public String listuser(Model model){
        model.addAttribute("users",usersService.findAllUsers());
        return "user";
    }
    @PostMapping("/saveusers")
    public String saveuser(Users user, BindingResult result){
       if(result.hasErrors()){
            return "home";
        }
       usersService.saveUser(user);
       return "redirect:/";
    }
}
