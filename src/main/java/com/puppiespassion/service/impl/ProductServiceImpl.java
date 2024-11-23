package com.puppiespassion.service.impl;

import com.puppiespassion.model.Product;
import com.puppiespassion.repository.ProductRepository;
import com.puppiespassion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
