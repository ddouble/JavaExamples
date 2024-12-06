package org.example.demo;

import jakarta.persistence.EntityManager;
import org.example.demo.projection.CategoryFullProjection;
import org.example.demo.projection.CategoryProjection;
import org.example.demo.repository.CategoryRepository;
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
    CategoryRepository categoryRepository;

    @GetMapping("/api/database-spring-projection/get-single-entity")
    public ResponseEntity<CategoryFullProjection> getSingleEntity() {
        return ResponseEntity.ok(categoryRepository.find(1L, CategoryFullProjection.class)
        );
    }

    @GetMapping("/api/database-spring-projection/get-entity-list")
    public ResponseEntity<List<CategoryProjection>> getEntityList() {
        return ResponseEntity.ok(categoryRepository.findByCategoryName("%a%", CategoryProjection.class));
    }

}


