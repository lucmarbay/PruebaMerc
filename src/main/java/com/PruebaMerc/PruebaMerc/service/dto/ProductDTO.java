package com.PruebaMerc.PruebaMerc.service.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer EANcode;
    @NotNull
    private Integer idSupplier;
    @NotNull
    private Integer idDestination;
    @NotNull
    private String name;
}
