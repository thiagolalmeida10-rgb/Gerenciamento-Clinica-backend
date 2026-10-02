package com.example.Gerenciamento.Clinica.Controller;

import com.example.Gerenciamento.Clinica.Entity.ClinicaVeterinaria;
import com.example.Gerenciamento.Clinica.Service.Clinica.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://gerenciamento-clinica-frontend.onrender.com")
@RestController
@RequestMapping("/clinicas")
public class ClinicaVeterinariaController {

    private final CadastrarClinicas cadastrarClinicas;
    private final ConsultarClinicasPorID consultarClinicasPorId;
    private final ExcluirClinicas excluirClinicas;
    private final ListarClinicas listarClinicas;
    private final ClinicasModificarCadastro modificar;

    public ClinicaVeterinariaController(CadastrarClinicas cadastrarClinicas,
                                        ConsultarClinicasPorID consultarClinicasPorId,
                                        ExcluirClinicas excluirClinicas,
                                        ListarClinicas listarClinicas,
                                        ClinicasModificarCadastro modificar){
        this.cadastrarClinicas = cadastrarClinicas;
        this.consultarClinicasPorId = consultarClinicasPorId;
        this.excluirClinicas = excluirClinicas;
        this.listarClinicas = listarClinicas;
        this.modificar = modificar;
    }

    @PostMapping
    public ClinicaVeterinaria cadastrar(@RequestBody ClinicaVeterinaria clinica){
        return cadastrarClinicas.cadastrar(clinica);
    }

    @GetMapping("/{id}")
    public ClinicaVeterinaria consultarPorId(@PathVariable Long id){
        return consultarClinicasPorId.consultarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        excluirClinicas.excluir(id);
    }

    @GetMapping
    public List<ClinicaVeterinaria> listar(){
        return listarClinicas.listar();
    }

    @PutMapping("/{id}")
    public ClinicaVeterinaria modificar(@PathVariable Long id,
                                        @RequestBody ClinicaVeterinaria clinica){
        return modificar.modificar(id, clinica);
    }
}
