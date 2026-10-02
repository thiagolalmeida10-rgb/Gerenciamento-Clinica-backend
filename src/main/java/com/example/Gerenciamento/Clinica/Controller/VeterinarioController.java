package com.example.Gerenciamento.Clinica.Controller;

import com.example.Gerenciamento.Clinica.Entity.Veterinario;
import com.example.Gerenciamento.Clinica.Service.Veterinarios.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    private final CadastrarVeterinario cadastrar;
    private final ConsultarVeterinariosPorID consultarVeterinariosPorId;
    private final ExcluirVeterinario excluir;
    private final ListarVeterinario listar;
    private final ModificarCadastroVeterinarios modificar;

    public VeterinarioController(CadastrarVeterinario cadastrar, ConsultarVeterinariosPorID consultarVeterinariosPorId, ExcluirVeterinario excluir, ListarVeterinario listar, ModificarCadastroVeterinarios modificar){
        this.cadastrar = cadastrar;
        this.consultarVeterinariosPorId = consultarVeterinariosPorId;
        this.excluir = excluir;
        this.listar = listar;
        this.modificar = modificar;
    }

    @PostMapping
    public Veterinario cadastrar(@RequestBody Veterinario veterinario){
        return cadastrar.cadastrar(veterinario);
    }

    @GetMapping("/{id}")
    public Veterinario consultarPorId(@PathVariable Long id){
        return consultarVeterinariosPorId.consultarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        excluir.excluir(id);
    }

    @GetMapping
    public List<Veterinario> listar(){
        return listar.listar();
    }

    @PutMapping("/{id}")
    public Veterinario modificar(@PathVariable Long id,
                                 @RequestBody Veterinario veterinario){
        return modificar.modificar(id, veterinario);
    }
}
