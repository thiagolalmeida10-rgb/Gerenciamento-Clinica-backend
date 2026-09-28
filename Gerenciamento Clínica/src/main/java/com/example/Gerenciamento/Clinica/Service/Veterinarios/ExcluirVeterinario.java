package com.example.Gerenciamento.Clinica.Service.Veterinarios;

import com.example.Gerenciamento.Clinica.Entity.Veterinario;
import com.example.Gerenciamento.Clinica.Repository.VeterinariosRepository;
import org.springframework.stereotype.Service;

@Service
public class ExcluirVeterinario {

    private final VeterinariosRepository repository;

    public ExcluirVeterinario(VeterinariosRepository repository){
        this.repository = repository;
    }

    public void excluir(Long id){
        Veterinario veterinario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veterinário não encontrado!"));
        repository.delete(veterinario);
    }
}
