package com.example.Gerenciamento.Clinica.Repository;

import com.example.Gerenciamento.Clinica.Entity.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends JpaRepository<Pacientes, Long> {
}
