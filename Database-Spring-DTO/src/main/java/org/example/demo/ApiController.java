package org.example.demo;

import jakarta.persistence.EntityManager;
import org.example.demo.dto.CategoryDto;
import org.example.demo.dto.CategoryFullDto;
import org.example.demo.dto.CategoryMapper;
import org.example.demo.dto.ProductDto;
import org.example.demo.model.Category;
import org.example.demo.repository.CategoryRepository;
import org.mapstruct.factory.Mappers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/api/database-spring-dto/map-dto-manually")
    public ResponseEntity<CategoryDto> mapDtoManually() {
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
                category.getPicture()
        );
        return ResponseEntity.ok(categoryDto);

    }

    /**
     * ModelMapper is a runtime mapping library that allows you to map objects from one type to another.
     * It provides a simple and flexible API for mapping objects, making it easy to map between different object types.
     *
     */
    @GetMapping("/api/database-spring-dto/map-dto-with-modelmapper")
    public ResponseEntity<CategoryDto> mapDtoWithModelMapper() {
        // map dto automatically
        Category category = entityManager.find(Category.class, 1L);
        return ResponseEntity.ok(modelMapper.map(category, CategoryDto.class));
    }


    /**
     * MapStruct is a code generation library that generates type-safe, immutable mapper implementations at compile time.
     *
     * Performance Priority: MapStruct is better as it performs mapping at compile time
     * Ease and Flexibility: ModelMapper offers more flexibility and requires less configuration.
     * Error Checking: MapStruct provides compile-time error checking, making it more reliable.
     *
     */
    @GetMapping("/api/database-spring-dto/map-dto-with-mapstruct")
    public ResponseEntity<CategoryFullDto> mapDtoWithModelStruct() {
        // map dto automatically
        Category category = entityManager.find(Category.class, 1L);
        return ResponseEntity.ok(Mappers.getMapper( CategoryMapper.class ).toFullDto(category));
    }

    @GetMapping("/api/database-spring-dto/pagination")
    public ResponseEntity<Page<CategoryDto>> pagination() {
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);
        Page<Category> list = categoryRepository.findAll(pageable);

        return ResponseEntity.ok(
                list.map(CategoryMapper.INSTANCE::toDto)
        );
    }

}


