package com.puppiespassion.service.impl;

import com.puppiespassion.model.Category;
import com.puppiespassion.model.Product;
import com.puppiespassion.model.enums.CategoryEnum;
import com.puppiespassion.repository.ProductRepository;
import com.puppiespassion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void insertNewProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public List<Product> findBestSellers() {
        return this.productRepository.findBestSellers();
    }

    @Override
    public List<Product> findByCategoryName(String categoryName) {
        return this.productRepository.findByCategoryName(categoryName);
    }

    public Product findProductById(long id) {
        Optional<Product> productById = this.productRepository.findById(id);

        if (!productById.isEmpty()) {
            return productById.get();
        }
        return null;
    }
}
