/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.dao;

/**
 *
 * @author Marcelo
 */

import com.mycompany.mavenproject1.connection.ConnectionFactory;
import com.mycompany.mavenproject1.model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    //Inserir usuario
    public void inserir(Users usuario) {
        String sql = "INSERT INTO users (nome, idade, administrador, login, senha, tipoPreferido1, tipoPreferido2) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setInt(2, usuario.getIdade());
            stmt.setBoolean(3, usuario.getAdministrador());
            stmt.setString(4, usuario.getLogin());
            stmt.setString(5, usuario.getSenha());
            stmt.setInt(6, usuario.getTipoPreferido1());
            stmt.setInt(7, usuario.getTipoPreferido2());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Fazer lista dos usuario
    public List<Users> listarTodos() {
        List<Users> lista = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Users usuario = new Users(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getBoolean("administrador"),
                    rs.getString("login"),
                    rs.getString("senha"),
                    rs.getInt("tipoPreferido1"),
                    rs.getInt("tipoPreferido2")
                );
                lista.add(usuario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    
    //Fazer lista dos usuario
    public List<Users> listarOrdemAlfabética() {
        List<Users> lista = new ArrayList<>();
        String sql = "SELECT * FROM users ORDER BY nome ASC";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Users usuario = new Users(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getBoolean("administrador"),
                    rs.getString("login"),
                    rs.getString("senha"),
                    rs.getInt("tipoPreferido1"),
                    rs.getInt("tipoPreferido2")
                );
                lista.add(usuario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    //Buscar Usuario
    public Users BuscarUsuario(String login, String senha) {
        Users usuario = null;
        String sql = "SELECT * FROM users WHERE login = ? AND senha = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, login);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    usuario = new Users(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getBoolean("administrador"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getInt("tipoPreferido1"),
                        rs.getInt("tipoPreferido2")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuario;
    }
    //Deletar Usuario
    public void deletar(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}