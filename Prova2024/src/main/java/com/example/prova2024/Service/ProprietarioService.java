package com.example.prova2024.Service;

import com.example.prova2024.Entity.Propietario;
import com.example.prova2024.Repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public Propietario buscarProprietario(Long id) {
        return proprietarioRepository .findById(id).get();

    }

    public void deletarProprietario(Long id) {
        proprietarioRepository.deleteById(id);
    }

    public Propietario atualizarPropietraio(Propietario propietario) {
        return proprietarioRepository.save(propietario);

    }
    public  Propietario cadastrarPropietario(Propietario propietario){
        return proprietarioRepository.save(propietario);
    }
}