package com.PruebaMerc.PruebaMerc.service;

import com.PruebaMerc.PruebaMerc.mapper.ProductDTOToProduct;
import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import com.PruebaMerc.PruebaMerc.persistence.entity.Supplier;
import com.PruebaMerc.PruebaMerc.persistence.repository.ProductRepository;
import com.PruebaMerc.PruebaMerc.persistence.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplierService {
    private final SupplierRepository repository;

    public SupplierService(SupplierRepository repository) {
        this.repository = repository;
    }

    public Optional<Supplier> findById(Integer id){
        return this.repository.findById(id);
    }
}
