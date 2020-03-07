package com.example.demo.util;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultDataUtil {
    @Autowired
    private ProductRepository productRepository;
    private List<Product> productList(){
        List<Product> products=new ArrayList<>();
        Product p1=new Product();
        p1.setName("Redmi note 7");
        p1.setDescription("Redmi Note 7 Pro (Neptune Blue, 64 GB)  (4 GB RAM)");
        p1.setImg("https://rukminim1.flixcart.com/image/416/416/jt641ow0/mobile/d/w/k/mi-redmi-note-7-pro-na-original-imafe4bbyfppbnuu.jpeg?q=70");
        p1.setPrice(new BigDecimal("9999"));
        p1.setQuantity(new BigInteger("5"));
        p1.setType("Smart Phones");
        products.add(p1);
        Product p2=new Product();
        p2.setName("Samsung Galaxy M30s");
        p2.setDescription("Black, 64 GB - 4 GB RAM");
        p2.setImg("https://rukminim1.flixcart.com/image/312/312/k1fbmvk0/mobile/m/w/6/samsung-galaxy-m30s-dummy-original-imafkzzxdbfut6ta.jpeg?q=70");
        p2.setPrice(new BigDecimal("14999"));
        p2.setQuantity(new BigInteger("15"));
        p2.setType("Smart Phones");
        products.add(p2);
        Product p3=new Product();
        p3.setName("Samsung Galaxy Note 10");
        p3.setDescription("Aura Black, 256 GB - 8 GB RAM");
        p3.setImg("https://rukminim1.flixcart.com/image/416/416/jz1l7rk0/mobile/m/c/g/samsung-galaxy-note-10-sm-n970fzkdins-original-imafj55hjxrbfgyx.jpeg?q=70");
        p3.setPrice(new BigDecimal("69999"));
        p3.setQuantity(new BigInteger("10"));
        p3.setType("Smart Phones");
        products.add(p3);
        Product p4=new Product();
        p4.setName("LG All in one");
        p4.setDescription("HD Ready LED Smart TV (32 inch)");
        p4.setImg("https://rukminim1.flixcart.com/image/416/416/k2tc1ow0/television/a/3/h/lg-32lm560bptc-original-imafm3fgysdhth8k.jpeg?q=70");
        p4.setPrice(new BigDecimal("13999"));
        p4.setQuantity(new BigInteger("14"));
        p4.setType("Television");
        products.add(p4);
        Product p5=new Product();
        p5.setName("Samsung Q Series");
        p5.setDescription("163cm (65 inch) Ultra HD (4K) QLED Smart TV");
        p5.setImg("https://rukminim1.flixcart.com/image/416/416/jialea80/television/y/s/t/samsung-65q8cn-original-imaf64eyxrnhrpsn.jpeg?q=70");
        p5.setPrice(new BigDecimal("370000"));
        p5.setQuantity(new BigInteger("7"));
        p5.setType("Television");
        products.add(p5);

        Product p6=new Product();
        p6.setName("Sony Headphone");
        p6.setDescription("Sony Digital Noise Cancellation Bluetooth Headset");
        p6.setImg("https://rukminim1.flixcart.com/image/416/416/jb5e4y80/headphone/h/3/p/sony-wh-h900n-original-imafykgfxmafgena.jpeg?q=70");
        p6.setPrice(new BigDecimal("14999"));
        p6.setQuantity(new BigInteger("30"));
        p6.setType("Headphone");
        products.add(p6);
        return products;
    }
    @PostConstruct
    public void init(){
        productRepository.saveAll(productList());
    }
}
