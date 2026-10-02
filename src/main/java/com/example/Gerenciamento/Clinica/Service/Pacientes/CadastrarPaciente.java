package com.example.Gerenciamento.Clinica.Service.Pacientes;

import com.example.Gerenciamento.Clinica.Entity.Pacientes;
import com.example.Gerenciamento.Clinica.Repository.PacientesRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarPaciente {

    private final PacientesRepository repository;

    public CadastrarPaciente(PacientesRepository repository){
        this.repository = repository;
    }

    public Pacientes cadastrar(Pacientes paciente){
        return repository.save(paciente);
    }
}
