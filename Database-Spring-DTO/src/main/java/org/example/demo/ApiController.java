package org.example.demo;

import jakarta.persistence.EntityManager;
import org.example.demo.dto.CategoryDto;
import org.example.demo.dto.ProductDto;
import org.example.demo.model.Category;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    EntityManager entityManager;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/api/database-spring-dto/map-dto-manually")
    public ResponseEntity<CategoryDto> MapDtoManually() {
        // map dto manually
        Category category = entityManager.find(Category.class, 1L);

        List<ProductDto> products = category.getProducts().stream().map(
                product -> new ProductDto(
                        product.getId(),
                        product.getProductName(),
                        product.getUnitPrice())).toList();

        CategoryDto categoryDto = new CategoryDto(
                category.getId(),
                category.getCategoryName(),
                category.getDescription(),
                products
        );
        return ResponseEntity.ok(categoryDto);

    }

    @GetMapping("/api/database-spring-dto/map-dto-automatically")
    public ResponseEntity<CategoryDto> hello() {
        // map dto automatically
        Category category = entityManager.find(Category.class, 1L);
        return ResponseEntity.ok(modelMapper.map(category, CategoryDto.class));
    }

}


