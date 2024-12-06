package org.example.demo.projection;

import java.util.List;

public interface CategoryProjection {
    Integer getId();

    String getCategoryName();

    List<ProductProjection> getProducts();
}
