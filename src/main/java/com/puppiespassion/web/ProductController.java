package com.puppiespassion.web;

import com.puppiespassion.model.Product;
import com.puppiespassion.model.enums.CategoryEnum;
import com.puppiespassion.service.impl.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@Slf4j
public class ProductController {
    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

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
    public String getCategoryPage(@PathVariable String category, Model model) {
        CategoryEnum[] values = CategoryEnum.values();
        for (CategoryEnum value : values) {
            log.info("Selected Category [{}]", category);
            if (value.getName().toLowerCase().equals(category)) {
                List<Product> products = productService.getProductsByCategory(category);

                // Add the products to the model
                model.addAttribute("products", products);
                model.addAttribute("selectedCategory", value);
                log.info("Moving to page [/products/category/{}.html]", category);
                return "products/" + category;
            }
        }
        log.info("Redirecting to page [/products/products.html]");
        return "redirect:/products";
    }



}






