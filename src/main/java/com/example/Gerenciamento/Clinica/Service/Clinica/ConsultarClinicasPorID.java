package com.example.Gerenciamento.Clinica.Service.Clinica;

import com.example.Gerenciamento.Clinica.Entity.ClinicaVeterinaria;
import com.example.Gerenciamento.Clinica.Repository.ClinicaVeterinariaRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultarClinicasPorID {

    private final ClinicaVeterinariaRepository repository;

    public ConsultarClinicasPorID(ClinicaVeterinariaRepository repository){
        this.repository = repository;
    }

    public ClinicaVeterinaria consultarPorId(Long id){
        return repository.findById(id).orElseThrow(() ->
                new RuntimeException("Clínica não encontrada!"));
    }
}
