package com.geekbrains.cloud.front.controller;

import com.geekbrains.cloud.common.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class FrontController {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
//        String data = restTemplate.getForObject("http://slow-service/api/v1/slow?delay={delay}", String.class, "3");
//        String data = restTemplate.getForObject("http://localhost:63641/api/v1/slow", String.class);
        List<ProductDto> products = restTemplate.getForObject("http://product-service/api/v1/products", List.class);
        return products;
    }
}
