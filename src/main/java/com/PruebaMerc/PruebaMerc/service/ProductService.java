package com.PruebaMerc.PruebaMerc.service;

import com.PruebaMerc.PruebaMerc.mapper.ProductDTOToProduct;
import com.PruebaMerc.PruebaMerc.persistence.entity.EAN;
import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import com.PruebaMerc.PruebaMerc.persistence.repository.ProductRepository;
import com.PruebaMerc.PruebaMerc.service.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductDTOToProduct mapper;

    public ProductService(ProductRepository repository, ProductDTOToProduct mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Product createProduct(ProductDTO productDTO){
        Product product = mapper.map(productDTO);
        return this.repository.save(product);
    }

    public List<Product> findAll(){
        return this.repository.findAll();
    }

    public Optional<Product> findByEAN(Integer ean){
        return this.repository.findByEAN(ean);
    }
}
