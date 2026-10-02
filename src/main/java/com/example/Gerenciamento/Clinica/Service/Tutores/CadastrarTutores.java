package com.example.Gerenciamento.Clinica.Service.Tutores;

import com.example.Gerenciamento.Clinica.Entity.Tutores;
import com.example.Gerenciamento.Clinica.Repository.TutoresRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarTutores {

    private final TutoresRepository repository;

    public CadastrarTutores(TutoresRepository repository){
        this.repository = repository;
    }

    public Tutores cadastrar(Tutores tutor){
        return repository.save(tutor);
    }
}
