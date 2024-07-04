package com.example.prova2024.Controller;

import com.example.prova2024.Entity.Carro;
import com.example.prova2024.Service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@RestController
@RequestMapping("carro")
public class CarroController {

    @Autowired
    CarroService carroService;
    @GetMapping("buscar/{id}")
    public Carro buscarCarro(@PathVariable Long id){
  return carroService.buscarCarro(id);

    }
    @PostMapping("cadastrar")
    public Carro cadastrarCarro(@RequestBody Carro carro){
        return carroService.cadastrarCarro(carro);
    }
    @DeleteMapping("deletar/{id}")
    public String deletarCarro(@PathVariable Long id) {
        carroService.deletarCarro(id);
return "Carro deletado com sucesso";
    }
    @PutMapping("atualizar")
    public String atualizarCarro(@RequestBody Carro carro){
        carroService.atualizarCarro(carro);
        return "Carro aualizado com sucesso";
    }
}
