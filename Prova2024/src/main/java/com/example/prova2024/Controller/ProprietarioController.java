package com.example.prova2024.Controller;

import com.example.prova2024.Entity.Propietario;
import com.example.prova2024.Service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@RestController
@RequestMapping("proprietario")
public class ProprietarioController {
    @Autowired
    ProprietarioService proprietarioService;

    @GetMapping("buscar/{id}")
    public Propietario buscarPropietario(@PathVariable Long id){
        return proprietarioService.buscarProprietario(id);
    }
    @PostMapping("cadastrar")
    public Propietario cadastrarPropietario(@RequestBody Propietario propietario){
        return  proprietarioService.cadastrarPropietario(propietario);
    }
    @PutMapping("atualiazar/{id}")
    public String atualizarPropietario(@RequestBody Propietario propietario){
        proprietarioService.atualizarPropietraio(propietario);
        return "Carro atualizado com sucesso";
    }
    @DeleteMapping("deletar/{id}")
    public String deletarCarro(@PathVariable Long id){
        proprietarioService.deletarProprietario(id);
        return "Carro deletado com sucesso";
    }
}
