package com.example.prova2024.Service;

import com.example.prova2024.Entity.Carro;
import com.example.prova2024.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    @Autowired
    CarroRepository carroRepository;

public Carro cadastrarCarro(Carro carro){
    return carroRepository.save(carro);
}
public Carro atualizarCarro(Carro carro){
    return carroRepository.save(carro);
}
public void deletarCarro(Long id) {
        carroRepository.deleteById(id);
    }

public Carro buscarCarro(Long id){
    return carroRepository .findById(id).get();
}

}
