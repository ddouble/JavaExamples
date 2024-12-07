package org.example.demo.repository;

import org.example.demo.model.SalesOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Integer> {
  /**
   * do the nest query to get things like: category.products
   */
  @Query("SELECT s FROM SalesOrder s JOIN FETCH s.orderDetails WHERE s.id = :id")
  <T>
  T find(@Param("id") Long id, Class<T> type);
}