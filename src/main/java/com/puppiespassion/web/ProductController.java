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

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Slf4j
public class ProductController {
    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @ModelAttribute("categories") // Pass all enum values to the model
    public CategoryEnum[] populateCategories() {
        return CategoryEnum.values();
    }

    @GetMapping("/products")
    public String getAllProductsPage(Model model) {
        log.info("Moving to page [/products/products.html]");
        List<Product> products = productService.findBestSellers();

        // Add the products to the model
        model.addAttribute("products", products);
        return "products/products.html";
    }

    @GetMapping("/products/category/{category}")
    public String getCategoryPage(@PathVariable String category, Model model) {
        CategoryEnum[] values = CategoryEnum.values();
        for (CategoryEnum value : values) {
            log.info("Selected Category [{}]", category);
            if (value.getName().toLowerCase().equals(category)) {

                // List<Product> products = productService.getProductsByCategory(category);

                // Add the products to the model
//                model.addAttribute("products", products);
                log.info("Moving to page [/products/category/{}.html]", category);
                return "products/" + category;
            }
        }
        log.info("Redirecting to page [/products/products.html]");
        return "redirect:/products";
    }

    @GetMapping("/products/{id}")
    public String getProductPage(@PathVariable int id) {
        return "";
    }



}






