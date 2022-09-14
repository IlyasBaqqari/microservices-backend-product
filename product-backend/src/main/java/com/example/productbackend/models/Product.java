package com.example.productbackend.models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Column
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "inStock", nullable = false)
    private Integer inStock;
}
