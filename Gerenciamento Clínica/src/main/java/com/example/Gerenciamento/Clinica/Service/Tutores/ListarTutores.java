package com.example.Gerenciamento.Clinica.Service.Tutores;

import com.example.Gerenciamento.Clinica.Entity.Tutores;
import com.example.Gerenciamento.Clinica.Repository.TutoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarTutores {

    private final TutoresRepository repository;

    public ListarTutores(TutoresRepository repository){
        this.repository = repository;
    }

    public List<Tutores> listar(){
        return repository.findAll();
    }
}
