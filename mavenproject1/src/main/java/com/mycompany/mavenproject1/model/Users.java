
package com.mycompany.mavenproject1.model;
/**
 *
 * @author Marcelo
 */
public class Users {
    
    private int id;
    private String nome;
    private int idade;
    private boolean administrador;
    private String login;
    private String senha;
    private String tipoPreferido1;
    private String tipoPreferido2;

    
    public Users(int id, String nome, int idade, boolean administrador, String login, String senha, String tipoPreferido1, String tipoPreferido2){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.administrador = administrador;
        this.login = login;
        this.senha = senha;
        this.tipoPreferido1 = tipoPreferido1;
        this.tipoPreferido2 = tipoPreferido2;
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
    public void setTipoPreferido1(String tipoPreferido1){
    	this.tipoPreferido1 = tipoPreferido1;
    }
    public void setTipoPreferido2(String tipoPreferido2){
    	this.tipoPreferido2 = tipoPreferido2;
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
    public String getTipoPreferido1(){
        return this.tipoPreferido1;
    }
    public String getTipoPreferido2(){
        return this.tipoPreferido2;
    }
}
