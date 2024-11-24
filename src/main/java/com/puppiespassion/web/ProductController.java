package com.puppiespassion.web;

import com.puppiespassion.model.Category;
import com.puppiespassion.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {
    private static final List<String> CATEGORIES = List.of("bags", "beds", "bowls", "clothes", "combs", "jewelry", "leashes", "toys");
    private final CategoryService categoryService;

    @Autowired
    public ProductController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ModelAttribute("categories")
    public List<String> populateCategories() {
        return CATEGORIES;
    }

    @GetMapping("/products")
    public String getAllProductsPage() {
        return "products/products.html";
    }

    @GetMapping("/products/category/{category}")
    public String getCategoryPage(@PathVariable String category, Model model) {
        model.addAttribute("categories", CATEGORIES);
        if (CATEGORIES.contains(category)) {
            return "products/" + category;
        }
        return "redirect:/products";
    }

    @GetMapping("/products/category/{category}/")
    public String getAllProductsPerCategoryPage() {
        return "";
    }
}






