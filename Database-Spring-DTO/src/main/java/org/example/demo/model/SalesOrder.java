package org.example.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "SalesOrder", schema = "Northwind")
public class SalesOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private Integer id;

    @Column(name = "employeeId")
    private Integer employeeId;

    @Column(name = "orderDate")
    private java.time.Instant orderDate;

    @Column(name = "requiredDate")
    private java.time.Instant requiredDate;

    @Column(name = "shippedDate")
    private java.time.Instant shippedDate;

    @Column(name = "freight", precision = 10, scale = 2)
    private java.math.BigDecimal freight;

    @Column(name = "shipName", length = 40)
    private String shipName;

    @Column(name = "shipAddress", length = 60)
    private String shipAddress;

    @Column(name = "shipCity", length = 15)
    private String shipCity;

    @Column(name = "shipRegion", length = 15)
    private String shipRegion;

    @Column(name = "shipPostalCode", length = 10)
    private String shipPostalCode;

    @Column(name = "shipCountry", length = 15)
    private String shipCountry;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
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

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

}