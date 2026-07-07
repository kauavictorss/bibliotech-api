package com.github.kauavictorss.bibliotechapi.model;

import java.util.UUID;

public class Livro {
    private UUID uuid;
    private String isbn;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro() {
    }

    public Livro(String isbn, String titulo, String autor, Integer anoPublicacao) {
        this.uuid = UUID.randomUUID();
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

}
