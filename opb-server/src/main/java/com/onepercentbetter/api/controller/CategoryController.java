package com.onepercentbetter.api.controller;

import com.onepercentbetter.api.domain.category.Category;
import com.onepercentbetter.api.domain.category.CategoryRequestDTO;
import com.onepercentbetter.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody CategoryRequestDTO body) {
        return new ResponseEntity<>(categoryService.createCategory(body), HttpStatus.CREATED);
    }
}
