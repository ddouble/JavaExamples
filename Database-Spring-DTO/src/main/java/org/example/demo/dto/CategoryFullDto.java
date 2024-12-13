package org.example.demo.dto;

import org.example.demo.model.Category;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * DTO for {@link Category}
 */
public class CategoryFullDto implements Serializable {
    private Integer id;
    private String categoryName;
    private String description;
    private List<ProductFullDto> products;

    public CategoryFullDto() {
    }

    public CategoryFullDto(Integer id, String categoryName, String description, List<ProductFullDto> products) {
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

    public List<ProductFullDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductFullDto> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryFullDto entity = (CategoryFullDto) o;
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