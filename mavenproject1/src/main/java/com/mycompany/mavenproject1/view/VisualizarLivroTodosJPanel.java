/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject1.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import com.mycompany.mavenproject1.dao.LivrosLidosDAO;
import com.mycompany.mavenproject1.model.LivrosLidos;
import com.mycompany.mavenproject1.dao.TipoLivroDAO;
import com.mycompany.mavenproject1.model.TipoLivro;
import com.mycompany.mavenproject1.App;
import com.mycompany.mavenproject1.dao.UsuarioDAO;
import com.mycompany.mavenproject1.model.Users;

public class VisualizarLivroTodosJPanel extends javax.swing.JPanel {
    
    private App app;

    public VisualizarLivroTodosJPanel(App app) {
        this.app = app;
        initComponents();
        carregarLivrosDeTodosUsuarios();
    }

    public void carregarLivrosDeTodosUsuarios() {
        LivrosLidosDAO livrosDao = new LivrosLidosDAO();
        TipoLivroDAO tipoDao = new TipoLivroDAO();
        UsuarioDAO usuarioDao = new UsuarioDAO();

        List<LivrosLidos> livros = livrosDao.listarTodos();

        livros.sort((u1, u2) -> u1.getTitulo().compareToIgnoreCase(u2.getTitulo()));

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        for (LivrosLidos l : livros) {
            
            String nomeUsuario = "Desconhecido";
            if (l.getIdUsers() > 0) {
                Users usuario = usuarioDao.BuscarUsuario(l.getIdUsers()); 
                if (usuario != null) {
                    nomeUsuario = usuario.getNome();
                }
            }
            
            int idTipo = l.getTipoLivro();
            TipoLivro tipoLivro = tipoDao.buscarPorId(idTipo);
            
            String nomeTipo = (tipoLivro != null) ? tipoLivro.getTipo() : "Desconhecido";

            modelo.addRow(new Object[]{
                l.getTitulo(),
                l.getAutor(),
                nomeTipo,
                nomeUsuario
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(31, 79, 144));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Tipo", "Usuario"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setMaximumSize(new java.awt.Dimension(560, 285));
        jTable1.setMinimumSize(new java.awt.Dimension(560, 285));
        jTable1.setPreferredSize(new java.awt.Dimension(560, 285));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(212, 51, 51));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        app.getCardLayout().show(app.getContainer(), "Usuario");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OrdenarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarjButton2ActionPerformed

    }//GEN-LAST:event_OrdenarjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
