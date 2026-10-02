package com.example.Gerenciamento.Clinica.Service.Tutores;

import com.example.Gerenciamento.Clinica.Entity.Tutores;
import com.example.Gerenciamento.Clinica.Repository.TutoresRepository;
import org.springframework.stereotype.Service;

@Service
public class ExcluirTutores {

    private final TutoresRepository repository;

    public ExcluirTutores(TutoresRepository repository){
        this.repository = repository;
    }

    public void excluir(Long id){
        Tutores tutor = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tutor não encontrado!"));
        repository.delete(tutor);
    }
}
