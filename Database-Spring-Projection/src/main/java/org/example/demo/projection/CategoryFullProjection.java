package org.example.demo.projection;

import java.math.BigDecimal;
import java.util.List;

public interface CategoryFullProjection {
    Integer getId();

    String getCategoryName();

    String getDescription();

    byte[] getPicture();

    List<ProductProjection> getProducts();

    interface ProductProjection {
        Integer getId();

        String getProductName();

        public BigDecimal getUnitPrice();

        public Short getUnitsOnOrder();
    }
}
