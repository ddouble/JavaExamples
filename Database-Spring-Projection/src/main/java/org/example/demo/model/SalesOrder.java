package org.example.demo.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SalesOrder", schema = "Northwind")
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private java.lang.Integer id;

    @Column(name = "employeeId")
    private java.lang.Integer employeeId;

    @Column(name = "orderDate")
    private java.time.Instant orderDate;

    @Column(name = "requiredDate")
    private java.time.Instant requiredDate;

    @Column(name = "shippedDate")
    private java.time.Instant shippedDate;

    @Column(name = "freight", precision = 10, scale = 2)
    private java.math.BigDecimal freight;

    @Column(name = "shipName", length = 40)
    private java.lang.String shipName;

    @Column(name = "shipAddress", length = 60)
    private java.lang.String shipAddress;

    @Column(name = "shipCity", length = 15)
    private java.lang.String shipCity;

    @Column(name = "shipRegion", length = 15)
    private java.lang.String shipRegion;

    @Column(name = "shipPostalCode", length = 10)
    private java.lang.String shipPostalCode;

    @Column(name = "shipCountry", length = 15)
    private java.lang.String shipCountry;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(java.lang.Integer employeeId) {
        this.employeeId = employeeId;
    }

    public java.time.Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.time.Instant orderDate) {
        this.orderDate = orderDate;
    }

    public java.time.Instant getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(java.time.Instant requiredDate) {
        this.requiredDate = requiredDate;
    }

    public java.time.Instant getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(java.time.Instant shippedDate) {
        this.shippedDate = shippedDate;
    }

    public java.math.BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(java.math.BigDecimal freight) {
        this.freight = freight;
    }

    public java.lang.String getShipName() {
        return shipName;
    }

    public void setShipName(java.lang.String shipName) {
        this.shipName = shipName;
    }

    public java.lang.String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(java.lang.String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public java.lang.String getShipCity() {
        return shipCity;
    }

    public void setShipCity(java.lang.String shipCity) {
        this.shipCity = shipCity;
    }

    public java.lang.String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(java.lang.String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public java.lang.String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(java.lang.String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public java.lang.String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(java.lang.String shipCountry) {
        this.shipCountry = shipCountry;
    }

}