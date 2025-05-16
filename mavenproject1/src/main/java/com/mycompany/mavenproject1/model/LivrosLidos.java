package com.mycompany.mavenproject1.model;

/**
 * 
 * @author Marcelo
 */
public class LivrosLidos {
    
    private int id;
    private String titulo;
    private String autor;
    private String tipoLivro;
    private int idUsers;

    public LivrosLidos(int id, String titulo, String autor, String tipoLivro, int idUsers) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tipoLivro = tipoLivro;
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

    public void setTipoLivro(String tipoLivro) {
        this.tipoLivro = tipoLivro;
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

    public String getTipoLivro() {
        return this.tipoLivro;
    }

    public int getIdUsers() {
        return this.idUsers;
    }
}
