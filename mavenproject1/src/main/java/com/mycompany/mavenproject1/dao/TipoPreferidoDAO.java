package com.mycompany.mavenproject1.dao;

import com.mycompany.mavenproject1.connection.ConnectionFactory;
import com.mycompany.mavenproject1.model.TipoPreferido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO para a tabela tipo_preferido
 * @author Marcelo
 */
public class TipoPreferidoDAO {

    // Inserir novo tipo preferido
    public void inserir(TipoPreferido tipoPreferido) {
        String sql = "INSERT INTO tipo_preferido (idUsers, idTipoLivro) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, tipoPreferido.getIdUsers());
            stmt.setInt(2, tipoPreferido.getIdTipoLivro());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Listar todos os tipos preferidos
    public List<TipoPreferido> listarTodos() {
        List<TipoPreferido> lista = new ArrayList<>();
        String sql = "SELECT * FROM tipo_preferido";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                TipoPreferido tp = new TipoPreferido(
                        rs.getInt("id"),
                        rs.getInt("idUsers"),
                        rs.getInt("idTipoLivro")
                );
                lista.add(tp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // Buscar tipo preferido por ID
    public TipoPreferido buscarPorId(int id) {
        TipoPreferido tipo = null;
        String sql = "SELECT * FROM tipo_preferido WHERE id = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    tipo = new TipoPreferido(
                            rs.getInt("id"),
                            rs.getInt("idUsers"),
                            rs.getInt("idTipoLivro")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return tipo;
    }

    // Atualizar tipo preferido
    public void atualizar(TipoPreferido tipoPreferido) {
        String sql = "UPDATE tipo_preferido SET idUsers = ?, idTipoLivro = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, tipoPreferido.getIdUsers());
            stmt.setInt(2, tipoPreferido.getIdTipoLivro());
            stmt.setInt(3, tipoPreferido.getId());

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Deletar tipo preferido por ID
    public void deletar(int id) {
        String sql = "DELETE FROM tipo_preferido WHERE id = ?";

        try (Connection conn = ConnectionFactory.obtemConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
