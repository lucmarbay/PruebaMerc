package com.PruebaMerc.PruebaMerc.persistence.repository;

import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findByEAN(Integer ean);
}
