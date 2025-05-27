package com.mycompany.mavenproject1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.mavenproject1.connection.ConnectionFactory;
import com.mycompany.mavenproject1.model.LivrosLidos;

/**
 * DAO para a tabela livros_lidos
 * @author Marcelo
 */
public class LivrosLidosDAO {

    // Inserir um novo livro lido
    public void inserir(LivrosLidos livro) {
        String sql = "INSERT INTO livrosLidos (titulo, autor, idTipo, idUsers) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getTipoLivro());
            stmt.setInt(4, livro.getIdUsers());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Listar todos os livros lidos
    public List<LivrosLidos> listarTodos() {
        List<LivrosLidos> lista = new ArrayList<>();
        String sql = "SELECT * FROM livrosLidos";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                LivrosLidos livro = new LivrosLidos(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getInt("idTipo"),
                        rs.getInt("idUsers")
                );
                lista.add(livro);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Buscar livro lido por ID
    public LivrosLidos buscarPorId(int id) {
        LivrosLidos livro = null;
        String sql = "SELECT * FROM livrosLidos WHERE id = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    livro = new LivrosLidos(
                            rs.getInt("id"),
                            rs.getString("titulo"),
                            rs.getString("autor"),
                            rs.getInt("idTipo"),
                            rs.getInt("idUsers")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return livro;
    }

    // Deletar livro lido por ID
    public void deletar(int id) {
        String sql = "DELETE FROM livrosLidos WHERE id = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
