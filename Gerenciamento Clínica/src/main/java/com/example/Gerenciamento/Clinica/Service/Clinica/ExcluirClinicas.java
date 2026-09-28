package com.example.Gerenciamento.Clinica.Service.Clinica;

import com.example.Gerenciamento.Clinica.Entity.ClinicaVeterinaria;
import com.example.Gerenciamento.Clinica.Repository.ClinicaVeterinariaRepository;
import org.springframework.stereotype.Service;

@Service
public class ExcluirClinicas {

    private final ClinicaVeterinariaRepository repository;

    public ExcluirClinicas(ClinicaVeterinariaRepository repository){
        this.repository = repository;
    }

    public void excluir(Long id){
        ClinicaVeterinaria clinica = repository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Clínica não encontrada!"));
        repository.delete(clinica);
    }
}
