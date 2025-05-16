package com.mycompany.mavenproject1.model;

/**
 * 
 * @author Marcelo
 */
public class TipoPreferido {
    
    private int id;
    private int idUsers;
    private int idTipoLivro;

    public TipoPreferido(int id, int idUsers, int idTipoLivro) {
        this.id = id;
        this.idUsers = idUsers;
        this.idTipoLivro = idTipoLivro;
    }

    // Sets
    public void setId(int id) {
        this.id = id;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public void setIdTipoLivro(int idTipoLivro) {
        this.idTipoLivro = idTipoLivro;
    }

    // Gets
    public int getId() {
        return this.id;
    }

    public int getIdUsers() {
        return this.idUsers;
    }

    public int getIdTipoLivro() {
        return this.idTipoLivro;
    }
}
