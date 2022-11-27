package com.PruebaMerc.PruebaMerc.persistence.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "producto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int ean;
    private String name;
    private Integer idSupplier;
    private Integer idDestination;

}
