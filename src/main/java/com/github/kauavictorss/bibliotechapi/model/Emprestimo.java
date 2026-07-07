package com.github.kauavictorss.bibliotechapi.model;

import java.time.LocalDate;
import java.util.UUID;

public class Emprestimo {
    private UUID uuid;
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
        this.uuid = UUID.randomUUID();
        this.dataEmprestimo = java.time.LocalDate.now();
        this.dataDevolucaoPrevista = this.dataEmprestimo.plusDays(7);
    }

    public UUID getUuid() {
        return uuid;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public java.time.LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(java.time.LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public java.time.LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(java.time.LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public java.time.LocalDate getDataDevolucaoEfetiva() {
        return dataDevolucaoEfetiva;
    }

    public void setDataDevolucaoEfetiva(java.time.LocalDate dataDevolucaoEfetiva) {
        this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
    }

}
