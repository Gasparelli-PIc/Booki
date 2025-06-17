package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.connection.ConnectionFactory;
import com.mycompany.mavenproject1.model.TipoLivro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoLivroDAO {

	//Inserir um novo TipoLivro no banco
	public void inserir(TipoLivro tipoLivro) {
	    String sql = "INSERT INTO tipoLivro (tipo) VALUES (?)";

	    try (Connection conn = ConnectionFactory.obtemConexao();
	         PreparedStatement stmt = conn.prepareStatement(sql)) {

	        stmt.setString(1, tipoLivro.getTipo());
	        stmt.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	// Buscar todos os tipos de livro
	public List<TipoLivro> listarTodos() {
	    List<TipoLivro> lista = new ArrayList<>();
	    String sql = "SELECT * FROM tipoLivro";

	    try (Connection conn = ConnectionFactory.obtemConexao();
	         PreparedStatement stmt = conn.prepareStatement(sql);
	         ResultSet rs = stmt.executeQuery()) {

	        while (rs.next()) {
	            TipoLivro tipo = new TipoLivro();
	            tipo.setId(rs.getInt("id"));
	            tipo.setTipo(rs.getString("tipo"));
	            lista.add(tipo);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return lista;
	}

	// Buscar TipoLivro por ID
	public TipoLivro buscarPorId(int id) {
	    TipoLivro tipo = null;
	    String sql = "SELECT * FROM tipoLivro WHERE id = ?";

	    try (Connection conn = ConnectionFactory.obtemConexao();
	         PreparedStatement stmt = conn.prepareStatement(sql)) {

	        stmt.setInt(1, id);

	        try (ResultSet rs = stmt.executeQuery()) {
	            if (rs.next()) {
	                tipo = new TipoLivro();
	                tipo.setId(rs.getInt("id"));
	                tipo.setTipo(rs.getString("tipo"));
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return tipo;
	}
	// Deletar TipoLivro por ID
	public void deletar(int id) {
	    String sql = "DELETE FROM tipoLivro WHERE id = ?";

	    try (Connection conn = ConnectionFactory.obtemConexao();
	         PreparedStatement stmt = conn.prepareStatement(sql)) {

	        stmt.setInt(1, id);
	        stmt.executeUpdate();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
