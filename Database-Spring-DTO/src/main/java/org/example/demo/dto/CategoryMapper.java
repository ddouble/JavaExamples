package org.example.demo.dto;

import org.example.demo.model.Category;
import org.mapstruct.Mapper;

@Mapper(uses = {ProductMapper.class})
public interface CategoryMapper {
    CategoryFullDto toFullDto(Category category);

    CategoryDto toDto(Category category);
}
