package com.puppiespassion.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    private static final List<String> CATEGORIES = List.of("bags", "beds", "bowls", "clothes", "combs", "jewelry", "leashes", "toys");
    @GetMapping("/products")
    public String getAllProductsPage() {
        return "products/products.html";
    }

    @GetMapping("/products/category/{category}")
    public String getCategoryPage(@PathVariable String category) {

        if (CATEGORIES.contains(category)) {
            return "products/" + category;
        }
        return "redirect:/products";
    }
}






