package com.example.Gerenciamento.Clinica.Service.Veterinarios;

import com.example.Gerenciamento.Clinica.Entity.Veterinario;
import com.example.Gerenciamento.Clinica.Repository.VeterinariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarVeterinario {

    private final VeterinariosRepository repository;

    public ListarVeterinario(VeterinariosRepository repository){
        this.repository =repository;
    }

    public List<Veterinario> listar(){
        return repository.findAll();
    }
}
