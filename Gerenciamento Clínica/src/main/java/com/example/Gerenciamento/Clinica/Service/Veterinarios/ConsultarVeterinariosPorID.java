package com.example.Gerenciamento.Clinica.Service.Veterinarios;

import com.example.Gerenciamento.Clinica.Entity.Veterinario;
import com.example.Gerenciamento.Clinica.Repository.VeterinariosRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultarVeterinariosPorID {

    private final VeterinariosRepository repository;

    public ConsultarVeterinariosPorID(VeterinariosRepository repository){
        this.repository =repository;
    }

    public Veterinario consultarPorId(Long id){
        return repository.findById(id).orElseThrow(() ->
                new RuntimeException("Veterinário não encontrado!"));
    }
}
