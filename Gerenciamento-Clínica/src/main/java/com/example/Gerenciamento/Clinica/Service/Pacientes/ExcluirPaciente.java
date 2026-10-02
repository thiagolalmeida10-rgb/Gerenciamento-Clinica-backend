package com.example.Gerenciamento.Clinica.Service.Pacientes;

import com.example.Gerenciamento.Clinica.Entity.Pacientes;
import com.example.Gerenciamento.Clinica.Repository.PacientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ExcluirPaciente {

    private final PacientesRepository repository;

    public ExcluirPaciente(PacientesRepository repository){
        this.repository = repository;
    }

    public void excluir(Long id){
        Pacientes paciente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado!"));
        repository.delete(paciente);
    }
}
