package org.example.demo.projection;

import java.math.BigDecimal;

public interface ProductProjection {

    Integer getId();

    String getProductName();

    public BigDecimal getUnitPrice();

    public Short getUnitsOnOrder();
}
