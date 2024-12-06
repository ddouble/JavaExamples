package org.example.demo.repository;

import org.example.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("SELECT c FROM Category c JOIN FETCH c.products WHERE c.id = :id")
    CategoryProjection find(@Param("id") Long id);
}
