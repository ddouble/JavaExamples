package org.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.demo.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    EntityManager entityManager;

    @GetMapping("/api/database-spring-jpql/return-object-list")
    public ResponseEntity<List<Object>> returnObjectList() {
        TypedQuery<Object> query = entityManager.createQuery(
                "SELECT c FROM Category c WHERE c.categoryName like :name",
                Object.class
        );
        query.setParameter("name", "%rain%");
        return ResponseEntity.ok(query.getResultList());
    }

    @GetMapping("/api/database-spring-jpql/return-entity-list")
    public ResponseEntity<List<Category>> returnEntityList() {
        TypedQuery<org.example.demo.model.Category> query;
        query = entityManager.createQuery("SELECT c FROM Category c WHERE c.categoryName like :name", Category.class);
        query.setParameter("name", "%a%");
        return ResponseEntity.ok(query.getResultList());
    }

}


