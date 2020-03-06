package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Product {
    @Id
    String productId;
    String productName;
    BigDecimal price;
    BigDecimal stock;


}
