package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Orders {
    @Id
    String orderId;
    String userId;
    String productId;
    String productName;
    String quantity;
    Date eventTimeStamp;
}
