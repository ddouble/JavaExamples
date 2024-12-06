package org.example.demo.projection;

import java.util.List;

public interface CategoryFullProjection {
    Integer getId();

    String getCategoryName();

    String getDescription();

    byte[] getPicture();

    List<ProductFullProjection> getProducts();
}
