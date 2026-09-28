package com.example.Gerenciamento.Clinica.Service.Veterinarios;

import com.example.Gerenciamento.Clinica.Entity.Veterinario;
import com.example.Gerenciamento.Clinica.Repository.VeterinariosRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVeterinario {

    private final VeterinariosRepository repository;

    public CadastrarVeterinario(VeterinariosRepository repository){
        this.repository = repository;
    }

    public Veterinario cadastrar(Veterinario veterinario){
        return repository.save(veterinario);
    }
}
