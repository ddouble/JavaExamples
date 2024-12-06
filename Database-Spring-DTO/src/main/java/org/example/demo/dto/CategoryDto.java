package org.example.demo.dto;

import org.example.demo.model.Category;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link Category}
 */
public class CategoryDto implements Serializable {
    private Integer id;
    private String categoryName;
    private String description;
    private List<ProductDto> products;

    public CategoryDto() {
    }

    public CategoryDto(Integer id, String categoryName, String description, List<ProductDto> products) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
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

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDto entity = (CategoryDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.categoryName, entity.categoryName) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.products, entity.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName, description, products);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "categoryName = " + categoryName + ", " +
                "description = " + description + ", " +
                "products = " + products + ")";
    }
}