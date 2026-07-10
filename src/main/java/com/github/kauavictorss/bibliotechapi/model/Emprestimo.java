package com.github.kauavictorss.bibliotechapi.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class Emprestimo {
    private UUID id;
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoEfetiva;

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.id = UUID.randomUUID();
        this.dataEmprestimo = java.time.LocalDate.now();
        this.dataDevolucaoPrevista = this.dataEmprestimo.plusDays(7);
    }
}
