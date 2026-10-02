package com.example.Gerenciamento.Clinica.Controller;

import com.example.Gerenciamento.Clinica.Entity.Pacientes;
import com.example.Gerenciamento.Clinica.Service.Pacientes.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://gerenciamento-clinica-frontend.onrender.com")
@RestController
@RequestMapping("/pacientes")
public class PacientesController {

    private final CadastrarPaciente cadastrarPaciente;
    private final ConsultarPacientePorID consultarPacientePorId;
    private final ExcluirPaciente excluirPaciente;
    private final ListarPaciente listarPaciente;
    private final ModificarCadastroPaciente modificar;

    public PacientesController(CadastrarPaciente cadastrarPaciente,
                               ConsultarPacientePorID consultarPacientePorId,
                               ExcluirPaciente excluirPaciente,
                               ListarPaciente listarPaciente,
                               ModificarCadastroPaciente modificar) {
        this.cadastrarPaciente = cadastrarPaciente;
        this.consultarPacientePorId = consultarPacientePorId;
        this.excluirPaciente = excluirPaciente;
        this.listarPaciente = listarPaciente;
        this.modificar = modificar;
    }

    @PostMapping
    public Pacientes cadastrar(@RequestBody Pacientes paciente){
        return cadastrarPaciente.cadastrar(paciente);
    }

    @GetMapping("/{id}")
    public Pacientes consultarPorId(@PathVariable Long id){
        return consultarPacientePorId.consultarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        excluirPaciente.excluir(id);
    }

    @GetMapping
    public List<Pacientes> listar(){
        return listarPaciente.listar();
    }

    @PutMapping("/{id}")
    public Pacientes modificar(@PathVariable Long id,
                               @RequestBody Pacientes paciente){
        return modificar.modificar(id, paciente);
    }
}
