package org.example.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Product", schema = "Northwind")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId", nullable = false)
    private Integer id;

    @Column(name = "productName", nullable = false, length = 40)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

    @Column(name = "quantityPerUnit", length = 20)
    private String quantityPerUnit;

    @Column(name = "unitPrice", precision = 10, scale = 2)
    private BigDecimal unitPrice;

    @Column(name = "unitsInStock")
    private Short unitsInStock;

    @Column(name = "unitsOnOrder")
    private Short unitsOnOrder;

    @Column(name = "reorderLevel")
    private Short reorderLevel;

    @Column(name = "discontinued", nullable = false)
    private Character discontinued;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Character getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Character discontinued) {
        this.discontinued = discontinued;
    }

}