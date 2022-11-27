package com.PruebaMerc.PruebaMerc.mapper;

import com.PruebaMerc.PruebaMerc.persistence.entity.Product;
import com.PruebaMerc.PruebaMerc.service.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductDTOToProduct implements IMapper<ProductDTO, Product>{

    @Override
    public Product map(ProductDTO in) {
        Product product = new Product();
        product.setName(in.getName());
        product.setIdSupplier(in.getIdSupplier());
        product.setIdDestination(in.getIdDestination());
        return product;
    }
}
