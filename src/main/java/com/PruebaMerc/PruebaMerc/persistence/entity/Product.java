package com.PruebaMerc.PruebaMerc.persistence.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer ean;
    private String name;
    @ManyToOne
    private Supplier supplier;
    @ManyToOne
    private Destination destination;

}
