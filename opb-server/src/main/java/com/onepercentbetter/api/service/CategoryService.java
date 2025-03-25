package com.onepercentbetter.api.service;

import com.onepercentbetter.api.domain.category.Category;
import com.onepercentbetter.api.domain.category.CategoryRequestDTO;
import com.onepercentbetter.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public Optional<Category> getCategory(UUID id) {
        return categoryRepository.findById(id);
    }

    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    public Category updateCategory(UUID id, CategoryRequestDTO data) {
        Optional<Category> olderCategory = categoryRepository.findById(id);

        if (olderCategory.isPresent()) {
            Category newCategory = olderCategory.get();
            newCategory.setName(data.name());
            newCategory.setDescription(data.description());

            categoryRepository.save(newCategory);
            return newCategory;
        }

        return null;
    }

    public void deleteCategory(UUID id) {
        categoryRepository.deleteById(id);
    }
}
