package org.example.demo.projection;

import java.math.BigDecimal;

public interface ProductFullProjection {

    Integer getId();

    String getProductName();

    public BigDecimal getUnitPrice();

    public Short getUnitsOnOrder();
}
