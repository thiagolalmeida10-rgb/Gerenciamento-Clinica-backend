package com.example.Gerenciamento.Clinica.Service.Tutores;

import com.example.Gerenciamento.Clinica.Entity.Tutores;
import com.example.Gerenciamento.Clinica.Repository.TutoresRepository;
import org.springframework.stereotype.Service;

@Service
public class ModificarCadastroTutores {

    private final TutoresRepository repository;

    public ModificarCadastroTutores(TutoresRepository repository){
        this.repository = repository;
    }

    public Tutores modificar(Long id, Tutores dados){
        Tutores tutor = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tutor não encontrado!"));

        tutor.setNome(dados.getNome());
        tutor.setEmail(dados.getEmail());
        tutor.setTelefone(dados.getTelefone());
        tutor.setEndereco(dados.getEndereco());

        return repository.save(tutor);
    }
}
