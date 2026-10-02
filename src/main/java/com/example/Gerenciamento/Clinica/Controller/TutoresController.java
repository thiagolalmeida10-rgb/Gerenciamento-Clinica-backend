package com.example.Gerenciamento.Clinica.Controller;

import com.example.Gerenciamento.Clinica.Entity.Tutores;
import com.example.Gerenciamento.Clinica.Service.Tutores.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://gerenciamento-clinica-frontend.onrender.com")
@RestController
@RequestMapping("/tutores")
public class TutoresController {

    private final CadastrarTutores cadastrar;
    private final ConsultarTutoresPorID consultarTutoresPorId;
    private final ExcluirTutores excluir;
    private final ListarTutores listar;
    private final ModificarCadastroTutores modificar;

    public TutoresController(CadastrarTutores cadastrar, ConsultarTutoresPorID consultarTutoresPorId, ExcluirTutores excluir, ListarTutores listar, ModificarCadastroTutores modificar) {
        this.cadastrar = cadastrar;
        this.consultarTutoresPorId = consultarTutoresPorId;
        this.excluir = excluir;
        this.listar = listar;
        this.modificar = modificar;
    }

    @PostMapping
    public Tutores cadastrar(@RequestBody Tutores tutor){
        return cadastrar.cadastrar(tutor);
    }

    @GetMapping("/{id}")
    public Tutores consultarPorId(@PathVariable Long id) {
        return consultarTutoresPorId.consultarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        excluir.excluir(id);
    }

    @GetMapping
    public List<Tutores> listar() {
        return listar.listar();
    }

    @PutMapping("/{id}")
    public Tutores modificar(@PathVariable Long id,
                             @RequestBody Tutores tutor) {
        return modificar.modificar(id, tutor);
    }
}
