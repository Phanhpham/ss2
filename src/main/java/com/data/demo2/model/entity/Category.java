package com.data.demo2.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Category {
    @Id
    @Column(name = "category_id", length = 15)
    private String categoryId;

    @Column(name = "category_name",  length = 100, nullable = false, unique = true)
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
