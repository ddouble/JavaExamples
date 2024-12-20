package org.example.demo.dto;

import org.example.demo.model.Product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * DTO for {@link Product}
 */
public class ProductDto implements Serializable {
    private Integer id;
    private String productName;

    public ProductDto() {
    }

    public ProductDto(Integer id, String productName, BigDecimal unitPrice) {
        this.id = id;
        this.productName = productName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto entity = (ProductDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.productName, entity.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "productName = " + productName + ")";
    }
}