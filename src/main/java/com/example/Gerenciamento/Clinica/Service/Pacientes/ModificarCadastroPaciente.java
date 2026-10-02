package com.example.Gerenciamento.Clinica.Service.Pacientes;

import com.example.Gerenciamento.Clinica.Entity.Pacientes;
import com.example.Gerenciamento.Clinica.Repository.PacientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ModificarCadastroPaciente {

    private final PacientesRepository repository;

    public ModificarCadastroPaciente(PacientesRepository repository){
        this.repository = repository;
    }

    public Pacientes modificar(Long id, Pacientes dados){
        Pacientes paciente = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Paciente não encontrado!"));

        paciente.setNome(dados.getNome());
        paciente.setEspecie(dados.getEspecie());
        paciente.setRaca(dados.getRaca());
        paciente.setSexo(dados.getSexo());
        paciente.setIdade(dados.getIdade());
        paciente.setPeso(dados.getPeso());

        return repository.save(paciente);
    }
}
