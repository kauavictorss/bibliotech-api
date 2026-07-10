package com.github.kauavictorss.bibliotechapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Usuario {
    private UUID id;
    private String nome;
    private Integer idade;
    private String cpf;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, Integer idade, String cpf, String email) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }
}
