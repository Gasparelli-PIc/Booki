/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject1.view;

import javax.swing.JOptionPane;

import com.mycompany.mavenproject1.App;
import com.mycompany.mavenproject1.Sessao;
import com.mycompany.mavenproject1.dao.UsuarioDAO;
import com.mycompany.mavenproject1.model.Users;

public class CadastroUsuarioLJPanel extends javax.swing.JPanel {

    private App app;

    public CadastroUsuarioLJPanel(App app) {
        this.app = app;
        initComponents();
    }

    private void limparCampos() {
        EntradaNomejTextField1.setText("");
        EntradaIdadejTextField1.setText("");
        EntradaLoginCadjTextField1.setText("");
        SenhajTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
        favoritoUmjComboBox2.setSelectedItem("Selecione...");
        favoritoDoisjComboBox.setSelectedItem("Selecione...");
    }

    private boolean validarCampos() {
        if (EntradaLoginCadjTextField1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo login é obrigatório.");
        }
        if (EntradaNomejTextField1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo nome é obrigatório.");
        }
        if (EntradaIdadejTextField1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo idade é obrigatório.");
        }
        if (SenhajTextField1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Senha é obrigatório.");
        }
        if (favoritoDoisjComboBox.getSelectedItem() == "Selecione..." && favoritoUmjComboBox2.getSelectedItem() == "Selecione...") {
            JOptionPane.showMessageDialog(this, "Selecione pelomenos um tipo de livro");
        }

        try {
            Integer.parseInt(EntradaIdadejTextField1.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O campo idade deve ser um número.");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NomejLabel1 = new javax.swing.JLabel();
        EntradaNomejTextField1 = new javax.swing.JTextField();
        IdadejLabel1 = new javax.swing.JLabel();
        EntradaIdadejTextField1 = new javax.swing.JTextField();
        TipoUsuariojLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        TipoLivrojLabel1 = new javax.swing.JLabel();
        SalvarUsuariojButton1 = new javax.swing.JButton();
        CancelarUsuariojButton2 = new javax.swing.JButton();
        LoginjLabel1 = new javax.swing.JLabel();
        EntradaLoginCadjTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SenhajTextField1 = new javax.swing.JTextField();
        favoritoDoisjComboBox = new javax.swing.JComboBox<>();
        favoritoUmjComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(31, 79, 144));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        NomejLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        NomejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        NomejLabel1.setText("Nome");

        EntradaNomejTextField1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EntradaNomejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNomejTextField1ActionPerformed(evt);
            }
        });

        IdadejLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        IdadejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        IdadejLabel1.setText("Idade");

        EntradaIdadejTextField1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EntradaIdadejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIdadejTextField1ActionPerformed(evt);
            }
        });

        TipoUsuariojLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TipoUsuariojLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TipoUsuariojLabel1.setText("Tipo de Usuário");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Usuário Administrador", "Usuário Comum" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TipoLivrojLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TipoLivrojLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TipoLivrojLabel1.setText("Tipos de Livros Favoritos");

        SalvarUsuariojButton1.setBackground(new java.awt.Color(87, 176, 109));
        SalvarUsuariojButton1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        SalvarUsuariojButton1.setForeground(new java.awt.Color(255, 255, 255));
        SalvarUsuariojButton1.setText("Salvar");
        SalvarUsuariojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarUsuariojButton1ActionPerformed(evt);
            }
        });

        CancelarUsuariojButton2.setBackground(new java.awt.Color(212, 51, 51));
        CancelarUsuariojButton2.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        CancelarUsuariojButton2.setForeground(new java.awt.Color(255, 255, 255));
        CancelarUsuariojButton2.setText("Cancelar");
        CancelarUsuariojButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarUsuariojButton2ActionPerformed(evt);
            }
        });

        LoginjLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LoginjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        LoginjLabel1.setText("Login");

        EntradaLoginCadjTextField1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        EntradaLoginCadjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLoginCadjTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha");

        SenhajTextField1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        favoritoDoisjComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        favoritoDoisjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cinema e Fotografia", "Autoajuda", "Aventura", "Ciência e Sociedade", "Direito", "Fantasia", "Filosofia", "História", "Poesia", "Política", "Romance", "Sustentabilidade", "Tecnologia", "Terror", "Turismo e Viagem" }));
        favoritoDoisjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritoDoisjComboBoxActionPerformed(evt);
            }
        });

        favoritoUmjComboBox2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        favoritoUmjComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Cinema e Fotografia", "Autoajuda", "Aventura", "Ciência e Sociedade", "Direito", "Fantasia", "Filosofia", "História", "Poesia", "Política", "Romance", "Sustentabilidade", "Tecnologia", "Terror", "Turismo e Viagem" }));
        favoritoUmjComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritoUmjComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NomejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TipoUsuariojLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SalvarUsuariojButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)))
                            .addComponent(IdadejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaIdadejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaLoginCadjTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(favoritoUmjComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(favoritoDoisjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LoginjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TipoLivrojLabel1)
                                    .addComponent(SenhajTextField1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(CancelarUsuariojButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EntradaNomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CancelarUsuariojButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginjLabel1)
                            .addComponent(NomejLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EntradaLoginCadjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaNomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SenhajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(IdadejLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EntradaIdadejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TipoUsuariojLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TipoLivrojLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(favoritoUmjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(favoritoDoisjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(SalvarUsuariojButton1)))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaNomejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNomejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNomejTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void EntradaLoginCadjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaLoginCadjTextField1ActionPerformed

    }//GEN-LAST:event_EntradaLoginCadjTextField1ActionPerformed

    private void EntradaIdadejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaIdadejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaIdadejTextField1ActionPerformed

    private void SalvarUsuariojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarUsuariojButton1ActionPerformed
        if (!validarCampos()) {
            return;
        }

        int idUsuarioLogado = Sessao.getIdUsuario();

        String nomeDoUsuario = EntradaNomejTextField1.getText().trim();
        int idadeDoUsuario = Integer.parseInt(EntradaIdadejTextField1.getText().trim());
        String loginDoUsuario = EntradaLoginCadjTextField1.getText().trim();
        String SenhaDoUsuario = SenhajTextField1.getText().trim();
        Boolean usuarioAdministrador = jComboBox1.getSelectedItem().equals("Usuário Administrador");

        int tipo1 = 0;
        int tipo2 = 0; 
        
        if (favoritoUmjComboBox2.getSelectedItem().equals("Cinema e Fotografia")) {
            tipo1 = 1;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Autoajuda")) {
            tipo1 = 2;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Aventura")) {
            tipo1 = 3;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Ciência e Sociedade")) {
            tipo1 = 4;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Direito")) {
            tipo1 = 5;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Fantasia")) {
            tipo1 = 6;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Filosofia")) {
            tipo1 = 7;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("História")) {
            tipo1 = 8;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Poesia")) {
            tipo1 = 9;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Política")) {
            tipo1 = 10;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Romance")) {
            tipo1 = 11;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Sustentabilidade")) {
            tipo1 = 12;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Tecnologia")) {
            tipo1 = 13;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Terror")) {
            tipo1 = 14;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Turismo e Viagem")) {
            tipo1 = 15;
        } else if (favoritoUmjComboBox2.getSelectedItem().equals("Selecione...")){
            tipo1 = 16;
        }
        
        if (favoritoDoisjComboBox.getSelectedItem().equals("Cinema e Fotografia")) {
            tipo2 = 1;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Autoajuda")) {
            tipo2 = 2;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Aventura")) {
            tipo2 = 3;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Ciência e Sociedade")) {
            tipo2 = 4;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Direito")) {
            tipo2 = 5;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Fantasia")) {
            tipo2 = 6;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Filosofia")) {
            tipo2 = 7;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("História")) {
            tipo2 = 8;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Poesia")) {
            tipo2 = 9;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Política")) {
            tipo2 = 10;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Romance")) {
            tipo2 = 11;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Sustentabilidade")) {
            tipo2 = 12;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Tecnologia")) {
            tipo2 = 13;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Terror")) {
            tipo2 = 14;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Turismo e Viagem")) {
            tipo2 = 15;
        } else if (favoritoDoisjComboBox.getSelectedItem().equals("Selecione...")){
            tipo2 = 16;
        }
        
        if (tipo1 == 0 || tipo2 == 0){
            JOptionPane.showMessageDialog(this, "como voce conseguiu fazer isso, coloque alguma coisa");
        }

        Users usuario = new Users(0, nomeDoUsuario, idadeDoUsuario, usuarioAdministrador, loginDoUsuario, SenhaDoUsuario, tipo1, tipo2);
        UsuarioDAO usDAO = new UsuarioDAO();

        try {
            usDAO.inserir(usuario);
            JOptionPane.showMessageDialog(this, "Usuario Cadastrado com sucesso!!!");
            limparCampos();
            app.getCardLayout().show(app.getContainer(), "Admin");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar Usuario. \n erro: " + e.getMessage());
        }

    }//GEN-LAST:event_SalvarUsuariojButton1ActionPerformed

    private void CancelarUsuariojButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarUsuariojButton2ActionPerformed
        app.getCardLayout().show(app.getContainer(), "Admin");
    }//GEN-LAST:event_CancelarUsuariojButton2ActionPerformed

    private void favoritoDoisjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritoDoisjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favoritoDoisjComboBoxActionPerformed

    private void favoritoUmjComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritoUmjComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_favoritoUmjComboBox2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarUsuariojButton2;
    private javax.swing.JTextField EntradaIdadejTextField1;
    private javax.swing.JTextField EntradaLoginCadjTextField1;
    private javax.swing.JTextField EntradaNomejTextField1;
    private javax.swing.JLabel IdadejLabel1;
    private javax.swing.JLabel LoginjLabel1;
    private javax.swing.JLabel NomejLabel1;
    private javax.swing.JButton SalvarUsuariojButton1;
    private javax.swing.JTextField SenhajTextField1;
    private javax.swing.JLabel TipoLivrojLabel1;
    private javax.swing.JLabel TipoUsuariojLabel1;
    private javax.swing.JComboBox<String> favoritoDoisjComboBox;
    private javax.swing.JComboBox<String> favoritoUmjComboBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
