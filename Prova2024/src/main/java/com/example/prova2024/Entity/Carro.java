package com.example.prova2024.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Carro {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;

    @Size(min = 5, max = 10, message = "O nome deve conter entre 5 a 10 caracteres")
    private String modelo;

    @Size(min = 5, max = 10, message = "O nome deve conter entre 5 a 10 caracteres")
    private String marca;

    @Min(value = 1775, message = "Esse é o menor ano possivel")
    @Max(value = 1900, message = "Esse é o maior ano posiivel")
    private int ano;
    private String cor;

    @Min(value = 200, message = "Esse o valor minimo")
    @Max(value = 300, message = "Esse é o valor maximo")
    private double preco;
    private Tipos tipos;

    @Min(value = 1,message = "Esse é o valo minimo de quilometragem")
    private double quilometragem;
    private LocalDate dataCadastro;
    @ManyToOne
    private Propietario propietarios;
}
