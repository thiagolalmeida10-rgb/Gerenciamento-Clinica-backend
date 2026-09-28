package com.example.Gerenciamento.Clinica.Service.Veterinarios;

import com.example.Gerenciamento.Clinica.Entity.Veterinario;
import com.example.Gerenciamento.Clinica.Repository.VeterinariosRepository;
import org.springframework.stereotype.Service;

@Service
public class ModificarCadastroVeterinarios {

    private final VeterinariosRepository repository;

    public ModificarCadastroVeterinarios(VeterinariosRepository repository){
        this.repository = repository;
    }

    public Veterinario modificar(Long id, Veterinario dados){
        Veterinario veterinario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veterinário não encontrado!"));

        veterinario.setNome(dados.getNome());
        veterinario.setEmail(dados.getEmail());
        veterinario.setEspecialidade(dados.getEspecialidade());
        veterinario.setTelefone(dados.getTelefone());
        veterinario.setEndereco(dados.getEndereco());

        return repository.save(veterinario);
    }
}
