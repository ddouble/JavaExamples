package org.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "OrderDetail", schema = "Northwind")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderDetailId", nullable = false)
    private java.lang.Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    @Column(name = "unitPrice", nullable = false, precision = 10, scale = 2)
    private java.math.BigDecimal unitPrice;

    @Column(name = "quantity", nullable = false)
    private java.lang.Short quantity;

    @Column(name = "discount", nullable = false, precision = 10, scale = 2)
    private java.math.BigDecimal discount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderId", nullable = false)
    private SalesOrder order;

    public SalesOrder getOrder() {
        return order;
    }

    public void setOrder(SalesOrder order) {
        this.order = order;
    }

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(java.math.BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public java.lang.Short getQuantity() {
        return quantity;
    }

    public void setQuantity(java.lang.Short quantity) {
        this.quantity = quantity;
    }

    public java.math.BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(java.math.BigDecimal discount) {
        this.discount = discount;
    }

}