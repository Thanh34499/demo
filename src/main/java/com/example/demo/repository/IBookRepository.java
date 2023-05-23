package com.example.lab4.repository;

import com.example.lab4.entity.Book;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface IBookRepository extends JpaRepository<Book,Long> {
}
