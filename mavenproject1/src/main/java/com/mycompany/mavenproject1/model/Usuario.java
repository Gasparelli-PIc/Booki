
package com.mycompany.mavenproject1.model;
/**
 *
 * @author Gabriel s.c
 */
public class Usuario {
    
    private int id;
    private String nome;
    private int idade;
    private boolean administrador;
    private String login;
    private String senha;
    
    public Usuario(int id, String nome, int idade, boolean administrador, String login, String senha){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.administrador = administrador;
        this.login = login;
        this.senha = senha;
    }
    //sets
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAdministrador(boolean administrador){
        this.administrador = administrador;        
    }
    public void setLogin(String login){
        this.login =  login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    ///gets
    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public boolean getAdministrador(){
        return this.administrador;
    }
    public String getLogin(){
        return this.login;
    }
    public String getSenha(){
        return this.senha;
    }
}
