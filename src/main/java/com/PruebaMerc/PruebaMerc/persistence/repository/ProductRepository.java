package com.PruebaMerc.PruebaMerc.persistence.repository;

import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
