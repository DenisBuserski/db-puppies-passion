package com.puppiespassion.web;

import com.puppiespassion.model.Category;
import com.puppiespassion.model.Product;
import com.puppiespassion.model.dto.UserLoginDTO;
import com.puppiespassion.service.ProductService;
import com.puppiespassion.service.UserService;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin-panel")
@Slf4j
public class AdminController {
    private final UserService userService;
    private final ProductService productService;

    @Autowired
    public AdminController(UserService userService, ProductService productService) {
        this.userService = userService;
        this.productService = productService;
    }
    @DeleteMapping("/delete/{user_id}")
    private void delete(@PathVariable("user_id") long id) {
        if (this.userService.deleteUserById(id)) {
            log.info("User with id: {} was deleted!", id);
        } else {
            log.info("User with id: {} does no exist!", id);
        }
    }

    @GetMapping("/insert-new-product")
    public String insertNewProduct() {
        return "";
    }

    @PostMapping("/insert-new-product")
    public String insertNewProduct(Product productModel) {
//        Product product = Product.builder()
//                .name("")
//                .url("")
//                .description("")
//                .category(new Category())
//                .availableQuantity(0)
//                .quantitySold(0)
//                .build();
//        this.productService.insertNewProduct(product);
//        log.info("Successfully added new product [{}]", product.getName());
        return "redirect:/insert-new-product";
    }

}
