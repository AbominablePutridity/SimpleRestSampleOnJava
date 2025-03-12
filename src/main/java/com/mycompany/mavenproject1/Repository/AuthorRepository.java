package com.mycompany.mavenproject1.Repository;

import com.mycompany.mavenproject1.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}