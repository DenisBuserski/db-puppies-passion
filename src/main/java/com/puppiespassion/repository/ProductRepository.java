package com.puppiespassion.repository;

import com.puppiespassion.model.Category;
import com.puppiespassion.model.Product;
import com.puppiespassion.model.enums.CategoryEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryName(String categoryName);
}
