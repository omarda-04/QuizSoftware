package com.example.Universidad.repositorios;

import com.example.Universidad.entidades.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoriosUniversidad extends JpaRepository<Universidad, Long> {
}
