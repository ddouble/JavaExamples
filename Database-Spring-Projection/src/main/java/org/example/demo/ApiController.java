package org.example.demo;

import jakarta.persistence.EntityManager;
import org.example.demo.repository.CategoryProjection;
import org.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    EntityManager entityManager;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/api/database-spring-projection")
    public ResponseEntity<CategoryProjection> demo() {
        // by projection
        return ResponseEntity.ok(categoryRepository.find(1L));
    }

}


