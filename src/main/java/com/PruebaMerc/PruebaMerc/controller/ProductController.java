package com.PruebaMerc.PruebaMerc.controller;

import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import com.PruebaMerc.PruebaMerc.service.DestinationService;
import com.PruebaMerc.PruebaMerc.service.ProductService;
import com.PruebaMerc.PruebaMerc.service.SupplierService;
import com.PruebaMerc.PruebaMerc.service.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    private final DestinationService destinationService;
    private final SupplierService supplierService;

    public ProductController(ProductService productService, DestinationService destinationService, SupplierService supplierService){
        this.productService = productService;
        this.destinationService = destinationService;
        this.supplierService = supplierService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody ProductDTO productDTO){
        return this.productService.createProduct(productDTO);
    }

    @GetMapping
    public List<Product> findAll(){
        return this.productService.findAll();
    }

    @GetMapping("/EAN/{EAN}")
    public Optional<Product> findByEAN(@PathVariable("EAN") Integer ean){
        return this.productService.findByEAN(ean);
    }
}
