package com.PruebaMerc.PruebaMerc.mapper;

import com.PruebaMerc.PruebaMerc.persistence.entity.Destination;
import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import com.PruebaMerc.PruebaMerc.persistence.entity.Supplier;
import com.PruebaMerc.PruebaMerc.service.DestinationService;
import com.PruebaMerc.PruebaMerc.service.ProductService;
import com.PruebaMerc.PruebaMerc.service.SupplierService;
import com.PruebaMerc.PruebaMerc.service.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductDTOToProduct implements IMapper<ProductDTO, Product>{
    @Autowired
    SupplierService supplierService;
    @Autowired
    DestinationService destinationService;
    @Override
    public Product map(ProductDTO in) {
        Product product = new Product();
        product.setName(in.getName());
        Supplier supplier = supplierService.findById(in.getIdSupplier()).get();
        //Optional<Supplier> supplierOptional = supplierService.findById(in.getIdSupplier()).get();
        if(supplier != null){
            product.setSupplier(supplier);
        } else throw new NullPointerException("Supplier Not Found");
        Destination destination = destinationService.findById(in.getIdDestination()).get();
        if(destination != null){
            product.setDestination(destination);
        } else throw new NullPointerException("Destination Not Found");
        return product;
    }
}
