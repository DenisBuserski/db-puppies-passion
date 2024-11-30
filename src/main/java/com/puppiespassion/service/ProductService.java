package com.puppiespassion.service;

import com.puppiespassion.model.Product;

import java.util.Collection;
import java.util.List;

public interface ProductService {
    void insertNewProduct(Product product);

    List<Product> findBestSellers();

    List<Product> findByCategoryName(String categoryName);

    Product findProductById(long id);
}
