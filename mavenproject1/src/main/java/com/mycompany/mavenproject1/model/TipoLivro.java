package com.mycompany.mavenproject1.model;
/**
 *
 * @author Marcelo
 */
public class TipoLivro {
    
    private int id;
    private String tipo;
    
    public TipoLivro(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    // Sets
    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Gets
    public int getId() {
        return this.id;
    }

    public String getTipo() {
        return this.tipo;
    }
}
