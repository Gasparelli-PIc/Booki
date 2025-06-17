package com.mycompany.mavenproject1.model;

public class LivrosLidos {

    private int id;
    private String titulo;
    private String autor;
    private int idTipoLivro;
    private int idUsers;

    public LivrosLidos(int id, String titulo, String autor, int idTipoLivro, int idUsers) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.idTipoLivro = idTipoLivro;
        this.idUsers = idUsers;
    }

    // Sets
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTipoLivro(int tipoLivro) {
        this.idTipoLivro = tipoLivro;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    // Gets
    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getTipoLivro() {
        return this.idTipoLivro;
    }

    public int getIdUsers() {
        return this.idUsers;
    }
}
