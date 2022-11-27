package com.PruebaMerc.PruebaMerc.service;

import com.PruebaMerc.PruebaMerc.persistence.entity.Destination;
import com.PruebaMerc.PruebaMerc.persistence.entity.Supplier;
import com.PruebaMerc.PruebaMerc.persistence.repository.DestinationRepository;
import com.PruebaMerc.PruebaMerc.persistence.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DestinationService {
    private final DestinationRepository repository;

    public DestinationService(DestinationRepository repository) {
        this.repository = repository;
    }

    public Optional<Destination> findById(Integer id){
        return this.repository.findById(id);
    }
}
