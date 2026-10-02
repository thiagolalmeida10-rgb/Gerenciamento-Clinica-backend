package com.example.Gerenciamento.Clinica.Service.Tutores;

import com.example.Gerenciamento.Clinica.Entity.Tutores;
import com.example.Gerenciamento.Clinica.Repository.TutoresRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultarTutoresPorID {

    private final TutoresRepository repository;

    public ConsultarTutoresPorID(TutoresRepository repository){
        this.repository = repository;
    }

    public Tutores consultarPorId(Long id){
        return repository.findById(id).orElseThrow(()->
                new RuntimeException("Tutor não encontrado!"));
    }
}
