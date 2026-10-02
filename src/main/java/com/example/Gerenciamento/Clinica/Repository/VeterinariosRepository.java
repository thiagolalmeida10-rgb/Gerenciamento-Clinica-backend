package com.example.Gerenciamento.Clinica.Repository;

import com.example.Gerenciamento.Clinica.Entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinariosRepository extends JpaRepository<Veterinario, Long> {
}
