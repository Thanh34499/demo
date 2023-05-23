package com.example.lab4.repository;
import com.example.lab4.entity.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
