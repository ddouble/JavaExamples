package org.example.demo.dto;

import org.example.demo.model.Category;
import org.example.demo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto toDto(Product product);

    ProductFullDto toFullDto(Product product);
}
