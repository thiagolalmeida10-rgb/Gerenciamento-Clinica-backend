package com.example.Gerenciamento.Clinica.Repository;

import com.example.Gerenciamento.Clinica.Entity.Tutores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutoresRepository extends JpaRepository<Tutores, Long> {
}
