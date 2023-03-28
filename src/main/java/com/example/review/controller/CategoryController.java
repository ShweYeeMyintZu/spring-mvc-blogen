package com.example.review.controller;

import com.example.review.dao.CategoryDao;
import com.example.review.entity.Category;
import com.example.review.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list-category")
    public String listCategory(Model model){
        model.addAttribute(
                "categories", categoryService.findAllCategory()
        );
        return "category";
    }
    @PostMapping("/save-category")
    public String saveCategory(Category category, BindingResult result){
        if(result.hasErrors()){
            return "home";
        }
        categoryService.saveCategory(category);
        return "redirect:/";

    }
}
