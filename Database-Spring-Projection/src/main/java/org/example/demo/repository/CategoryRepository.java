package org.example.demo.repository;

import org.example.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("SELECT c FROM Category c JOIN FETCH c.products WHERE c.id = :id")
    <T>
    T find(@Param("id") Long id, Class<T> type);

    @Query("select c from Category c where c.categoryName like ?1")
    <T>
    List<T> findByCategoryName(String categoryName, Class<T> type);
}
