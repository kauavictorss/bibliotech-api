package com.github.kauavictorss.bibliotechapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Livro {
    private UUID id;
    private String isbn;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;

    public Livro() {
    }

    public Livro(String isbn, String titulo, String autor, Integer anoPublicacao) {
        this.id = UUID.randomUUID();
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
}
