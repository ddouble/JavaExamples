package org.example.demo.dto;

import org.example.demo.model.Category;
import org.example.demo.model.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    ProductDto toDto(Product product);

    ProductFullDto toFullDto(Product product);
}
