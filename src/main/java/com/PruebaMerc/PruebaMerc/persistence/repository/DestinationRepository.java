package com.PruebaMerc.PruebaMerc.persistence.repository;

import com.PruebaMerc.PruebaMerc.persistence.entity.Destination;
import com.PruebaMerc.PruebaMerc.persistence.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {
}
