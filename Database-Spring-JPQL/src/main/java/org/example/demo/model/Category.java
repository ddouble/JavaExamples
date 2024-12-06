package org.example.demo.model;

import jakarta.persistence.*;

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