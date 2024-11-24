package com.puppiespassion.web;

import com.puppiespassion.model.enums.CategoryEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
public class ProductController {
    @ModelAttribute("categories")
    public CategoryEnum[] populateCategories() {
        return CategoryEnum.values(); // Pass all enum values to the model
    }

    @GetMapping("/products")
    public String getAllProductsPage() {
        log.info("Moving to page [/products/products.html]");
        return "products/products.html";
    }

    @GetMapping("/products/category/{category}")
    public String getCategoryPage(@PathVariable String category) {
        CategoryEnum[] values = CategoryEnum.values();
        for (CategoryEnum value : values) {
            log.info("Selected Category [{}]", category);
            if (value.getName().toLowerCase().equals(category)) {
                log.info("Moving to page [/products/{}.html]", category);
                return "products/" + category;
            }
        }
        log.info("Redirecting to page [/products/products.html]");
        return "redirect:/products";
    }

}






