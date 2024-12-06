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
    private BigDecimal unitPrice;

    public ProductDto() {
    }

    public ProductDto(Integer id, String productName, BigDecimal unitPrice) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto entity = (ProductDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.productName, entity.productName) &&
                Objects.equals(this.unitPrice, entity.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, unitPrice);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "productName = " + productName + ", " +
                "unitPrice = " + unitPrice + ")";
    }
}