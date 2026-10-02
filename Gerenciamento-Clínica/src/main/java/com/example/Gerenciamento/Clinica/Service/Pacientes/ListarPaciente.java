package com.example.Gerenciamento.Clinica.Service.Pacientes;

import com.example.Gerenciamento.Clinica.Entity.Pacientes;
import com.example.Gerenciamento.Clinica.Repository.PacientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarPaciente {

    private final PacientesRepository repository;

    public ListarPaciente(PacientesRepository repository){
        this.repository = repository;
    }

    public List<Pacientes> listar(){
        return repository.findAll();
    }
}
