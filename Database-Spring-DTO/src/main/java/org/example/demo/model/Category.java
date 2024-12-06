package org.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Category", schema = "Northwind")
public class Category {
    @Id
    @Column(name = "categoryId", nullable = false)
    private Integer id;

    @Column(name = "categoryName", nullable = false, length = 15)
    private String categoryName;

    @Lob
    @Column(name = "description")
    private String description;

    @Column(name = "picture")
    private byte[] picture;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

}