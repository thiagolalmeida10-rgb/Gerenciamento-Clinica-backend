package com.example.Gerenciamento.Clinica.Service.Clinica;

import com.example.Gerenciamento.Clinica.Entity.ClinicaVeterinaria;
import com.example.Gerenciamento.Clinica.Repository.ClinicaVeterinariaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarClinicas {

    private final ClinicaVeterinariaRepository repository;

    public ListarClinicas(ClinicaVeterinariaRepository repository){
        this.repository = repository;
    }

    public List<ClinicaVeterinaria> listar(){
        return repository.findAll();
    }
}
