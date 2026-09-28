package com.example.Gerenciamento.Clinica.Service.Clinica;

import com.example.Gerenciamento.Clinica.Entity.ClinicaVeterinaria;
import com.example.Gerenciamento.Clinica.Repository.ClinicaVeterinariaRepository;
import org.springframework.stereotype.Service;

@Service
public class ClinicasModificarCadastro {

    private final ClinicaVeterinariaRepository repository;

    public ClinicasModificarCadastro(ClinicaVeterinariaRepository repository){
        this.repository = repository;
    }

    public ClinicaVeterinaria modificar(Long id, ClinicaVeterinaria dados){
        ClinicaVeterinaria clinica = repository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Clínica não encontrada!"));

        clinica.setNome(dados.getNome());
        clinica.setEndereco(dados.getEndereco());
        clinica.setEmail(dados.getEmail());
        clinica.setTelefone(dados.getTelefone());

        return repository.save(clinica);
    }
}
