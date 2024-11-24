package com.puppiespassion.service;

import com.puppiespassion.model.Category;

public interface CategoryService {
    Category findCategoryByName(String categoryName);
}
