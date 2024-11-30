package com.puppiespassion.web;

import com.puppiespassion.model.Category;
import com.puppiespassion.model.Product;
import com.puppiespassion.model.enums.CategoryEnum;
import com.puppiespassion.service.CategoryService;
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
    private final CategoryService categoryService;

    @Autowired
    public ProductController(ProductServiceImpl productService, CategoryService categoryService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @ModelAttribute("categories") // Pass all enum values to the model
    public CategoryEnum[] populateCategories() {
        return CategoryEnum.values();
    }

    @GetMapping("/products")
    public String getAllProductsPage(Model model) {
        log.info("Moving to page [/products/categories.html]");
        List<Product> products = productService.findBestSellers();
        model.addAttribute("products", products); // Add the products to the model
        return "products/categories";
    }

    @GetMapping("/products/category/{category}")
    public String getCategoryPage(@PathVariable String category, Model model) {
        CategoryEnum[] values = CategoryEnum.values();
        for (CategoryEnum value : values) {
            log.info("Selected Category [{}]", category);
            if (value.getName().toLowerCase().equals(category)) {
                Category categoryByName = this.categoryService.findCategoryByName(category);
                List<Product> products = this.productService.findByCategoryName(category);

                model.addAttribute("category", categoryByName);
                model.addAttribute("products", products);
                log.info("Moving to page [/products/category/{}.html]", category);
                return "products/category";
            }
        }
        log.info("Redirecting to page [/products/categories.html]");
        return "redirect:/categories";
    }

    @GetMapping("/products/{category}/{id}")
    public String getProductPage(
            @PathVariable String category,
            @PathVariable long id,
            Model model) {
        Product product = this.productService.findProductById(id);
        model.addAttribute("product", product);

        return "products/product";
    }



}






