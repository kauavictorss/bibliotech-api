package com.github.kauavictorss.bibliotechapi.model;

import java.util.UUID;

public class Usuario {
    private UUID uuid;
    private String nome;
    private Integer idade;
    private String cpf;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, Integer idade, String cpf, String email) {
        this.uuid = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
