package org.example.demo.projection;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

/**
 * Projection for {@link org.example.demo.model.SalesOrder}
 */
public interface SalesOrderFullProjection {
    Integer getId();

    Integer getEmployeeId();

    Instant getOrderDate();

    Instant getRequiredDate();

    Instant getShippedDate();

    BigDecimal getFreight();

    String getShipName();

    String getShipAddress();

    String getShipCity();

    String getShipRegion();

    String getShipPostalCode();

    String getShipCountry();

    List<OrderDetailProjection> getOrderDetails();
}