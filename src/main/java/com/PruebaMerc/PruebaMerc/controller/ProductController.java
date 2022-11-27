package com.PruebaMerc.PruebaMerc.controller;

import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import com.PruebaMerc.PruebaMerc.service.ProductService;
import com.PruebaMerc.PruebaMerc.service.dto.ProductDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody ProductDTO productDTO){
        return this.productService.createProduct(productDTO);
    }
}
