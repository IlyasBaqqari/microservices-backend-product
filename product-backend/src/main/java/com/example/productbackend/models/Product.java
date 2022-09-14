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
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer inStock;
}
