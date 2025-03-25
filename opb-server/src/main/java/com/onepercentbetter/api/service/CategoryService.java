package com.onepercentbetter.api.service;

import com.onepercentbetter.api.domain.category.Category;
import com.onepercentbetter.api.domain.category.CategoryRequestDTO;
import com.onepercentbetter.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(CategoryRequestDTO data) {
        Category category = new Category();
        category.setName(data.name());
        category.setDescription(data.description());

        categoryRepository.save(category);
        return category;
    }
}
