package org.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

public interface CategoryProjection {
    Integer getId();

    String getCategoryName();

    String getDescription();

    byte[] getPicture();

    List<ProductProjection> getProducts();

    interface ProductProjection {
        Integer getId();

        String getProductName();

        public BigDecimal getUnitPrice();
    }
}
