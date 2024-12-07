package org.example.demo.projection;

import java.math.BigDecimal;

/**
 * Projection for {@link org.example.demo.model.OrderDetail}
 */
public interface OrderDetailProjection {
    Integer getId();

    BigDecimal getUnitPrice();

    Short getQuantity();

    BigDecimal getDiscount();

    // Custom method for the calculated field
    default BigDecimal getTotal() {
        return getUnitPrice().multiply(BigDecimal.valueOf(getQuantity()));
    }
}