package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

//    List<Product> findByPrice(BigDecimal p);

    List<Product> findByType(String productName);
    @Query("select distinct type from Product")
    List<String> findDistinctType();
}
