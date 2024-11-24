package com.puppiespassion.service.impl;

import com.puppiespassion.model.Category;
import com.puppiespassion.repository.CategoryRepository;
import com.puppiespassion.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findCategoryByName(String categoryName) {
        return this.categoryRepository.findByName(categoryName);
    }
}
