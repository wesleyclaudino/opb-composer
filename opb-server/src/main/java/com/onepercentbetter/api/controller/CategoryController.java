package com.onepercentbetter.api.controller;

import com.onepercentbetter.api.domain.category.Category;
import com.onepercentbetter.api.domain.category.CategoryRequestDTO;
import com.onepercentbetter.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody CategoryRequestDTO body) {
        return new ResponseEntity<>(categoryService.createCategory(body), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> getCategory(@PathVariable UUID id) {
        return ResponseEntity.ok(categoryService.getCategory(id));
    }

    @GetMapping
    public ResponseEntity<List<Category>> getCategoryList() {
        return ResponseEntity.ok(categoryService.getCategoryList());
    }
}
