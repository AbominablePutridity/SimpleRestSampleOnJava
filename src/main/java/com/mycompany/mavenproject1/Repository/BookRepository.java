package com.mycompany.mavenproject1.Repository;

import com.mycompany.mavenproject1.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}