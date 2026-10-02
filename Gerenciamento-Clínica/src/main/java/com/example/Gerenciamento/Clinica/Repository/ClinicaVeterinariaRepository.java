package com.example.Gerenciamento.Clinica.Repository;

import com.example.Gerenciamento.Clinica.Entity.ClinicaVeterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaVeterinariaRepository extends JpaRepository<ClinicaVeterinaria,  Long> {
}
