package org.example.demo.dto;

import org.example.demo.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ProductMapper.class})
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryFullDto toFullDto(Category category);

    CategoryDto toDto(Category category);
}
