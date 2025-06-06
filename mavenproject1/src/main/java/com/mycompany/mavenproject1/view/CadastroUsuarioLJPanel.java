/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject1.view;

import javax.swing.JOptionPane;

import com.mycompany.mavenproject1.App;
import com.mycompany.mavenproject1.dao.UsuarioDAO;
import com.mycompany.mavenproject1.model.Users;

/**
 *
 * @author jogar
 */
public class CadastroUsuarioLJPanel extends javax.swing.JPanel {

    private App app;  // ✅ Mantém a referência ao App para controle do CardLayout

    // ✅ Construtor ajustado para receber App
    public CadastroUsuarioLJPanel(App app) {
        this.app = app;
        initComponents();
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
        if (!CienciaESociedadejCheckBox1.isSelected() &&
        !SustentabilidadejCheckBox2.isSelected() &&
        !TecnologiajCheckBox3.isSelected()) {
        JOptionPane.showMessageDialog(this, "Selecione pelo menos um Tipo de Livro Favorito.");
        return false; // Impede o salvamento se nenhuma checkbox estiver selecionada
        }

        int selectedCount = 0;
        if (CienciaESociedadejCheckBox1.isSelected()) {
            selectedCount++;
        }
        if (SustentabilidadejCheckBox2.isSelected()) {
        selectedCount++;
        }
        if (TecnologiajCheckBox3.isSelected()) {
        selectedCount++;
        }

        if (selectedCount > 2) { // Alterado de '== 3' para '> 2' para ser mais robusto caso adicione mais no futuro
        JOptionPane.showMessageDialog(this, "Selecione no máximo dois Tipos de Livro Favorito.");
        return false; // Impede o salvamento se mais de duas checkbox estiverem selecionadas
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
        CienciaESociedadejCheckBox1 = new javax.swing.JCheckBox();
        SustentabilidadejCheckBox2 = new javax.swing.JCheckBox();
        TecnologiajCheckBox3 = new javax.swing.JCheckBox();
        SalvarUsuariojButton1 = new javax.swing.JButton();
        CancelarUsuariojButton2 = new javax.swing.JButton();
        LoginjLabel1 = new javax.swing.JLabel();
        EntradaLoginCadjTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SenhajTextField1 = new javax.swing.JTextField();
        favoritoUmjComboBox2 = new javax.swing.JComboBox<>();
        favoritoDoisjComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(31, 79, 144));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        NomejLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        NomejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        NomejLabel1.setText("Nome");

        EntradaNomejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNomejTextField1ActionPerformed(evt);
            }
        });

        IdadejLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        IdadejLabel1.setForeground(new java.awt.Color(255, 255, 255));
        IdadejLabel1.setText("Idade");

        EntradaIdadejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIdadejTextField1ActionPerformed(evt);
            }
        });

        TipoUsuariojLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TipoUsuariojLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TipoUsuariojLabel1.setText("Tipo Usuário");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Usuário Administrador", "Usuário Comum" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TipoLivrojLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        TipoLivrojLabel1.setForeground(new java.awt.Color(255, 255, 255));
        TipoLivrojLabel1.setText("Tipo de Livro Favorito");

        CienciaESociedadejCheckBox1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        CienciaESociedadejCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        CienciaESociedadejCheckBox1.setText("Ciência e sociedade");
        CienciaESociedadejCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CienciaESociedadejCheckBox1ActionPerformed(evt);
            }
        });

        SustentabilidadejCheckBox2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        SustentabilidadejCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        SustentabilidadejCheckBox2.setText("Sustentabilidade");
        SustentabilidadejCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SustentabilidadejCheckBox2ActionPerformed(evt);
            }
        });

        TecnologiajCheckBox3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TecnologiajCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        TecnologiajCheckBox3.setText("Tecnologia");
        TecnologiajCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecnologiajCheckBox3ActionPerformed(evt);
            }
        });

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

        EntradaLoginCadjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLoginCadjTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha");

        favoritoUmjComboBox2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        favoritoUmjComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Aventura", "Ciência e Sociedade", "Fantasia", "Filosofia", "Poesia", "Romance", "Sustentabilidade", "Tecnologia", "Terror" }));

        favoritoDoisjComboBox2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        favoritoDoisjComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Aventura", "Ciência e Sociedade", "Fantasia", "Filosofia", "Poesia", "Romance", "Sustentabilidade", "Tecnologia", "Terror" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(favoritoDoisjComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(favoritoUmjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EntradaLoginCadjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LoginjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(97, 97, 97))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(SalvarUsuariojButton1)
                            .addGap(157, 157, 157)
                            .addComponent(CancelarUsuariojButton2)
                            .addGap(106, 106, 106))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SenhajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EntradaNomejTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomejLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TipoUsuariojLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(107, 107, 107)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CienciaESociedadejCheckBox1)
                                .addComponent(TipoLivrojLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SustentabilidadejCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TecnologiajCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IdadejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EntradaIdadejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomejLabel1)
                    .addComponent(LoginjLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaNomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntradaLoginCadjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdadejLabel1)
                    .addComponent(favoritoUmjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SenhajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(favoritoDoisjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EntradaIdadejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoUsuariojLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoLivrojLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CienciaESociedadejCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SustentabilidadejCheckBox2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TecnologiajCheckBox3)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarUsuariojButton2)
                    .addComponent(SalvarUsuariojButton1))
                .addGap(47, 47, 47))
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
        String nomeDoUsuario = EntradaNomejTextField1.getText().trim();
        int idadeDoUsuario = Integer.parseInt(EntradaIdadejTextField1.getText().trim());
        String loginDoUsuario = EntradaLoginCadjTextField1.getText().trim();
        String SenhaDoUsuario = SenhajTextField1.getText().trim();
        Boolean usuarioAdministrador = jComboBox1.getSelectedItem().equals("Usuário Administrador");

        java.util.List<Integer> tiposSelecionados = new java.util.ArrayList<>();

        if (SustentabilidadejCheckBox2.isSelected()) {
            tiposSelecionados.add(1);
        }
        if (CienciaESociedadejCheckBox1.isSelected()) {
            tiposSelecionados.add(2);
        }
        if (TecnologiajCheckBox3.isSelected()) {
            tiposSelecionados.add(3);
        }

        int tipo1 = 0;
        int tipo2 = 0;

        tipo1 = tiposSelecionados.size() > 0 ? tiposSelecionados.get(0) : 0;
        tipo2 = tiposSelecionados.size() > 1 ? tiposSelecionados.get(1) : 0;

        Users usuario = new Users(0, nomeDoUsuario, idadeDoUsuario, usuarioAdministrador, loginDoUsuario, SenhaDoUsuario, tipo1, tipo2);
        UsuarioDAO usDAO = new UsuarioDAO();

        try {
            usDAO.inserir(usuario);
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com sucesso!!!");
            app.getCardLayout().show(app.getContainer(), "Admin");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Usuario. \n erro: " + e.getMessage());
        }
    }//GEN-LAST:event_SalvarUsuariojButton1ActionPerformed

    private void CancelarUsuariojButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarUsuariojButton2ActionPerformed
        app.getCardLayout().show(app.getContainer(), "Admin");
    }//GEN-LAST:event_CancelarUsuariojButton2ActionPerformed

    private void CienciaESociedadejCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CienciaESociedadejCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CienciaESociedadejCheckBox1ActionPerformed

    private void SustentabilidadejCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SustentabilidadejCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SustentabilidadejCheckBox2ActionPerformed

    private void TecnologiajCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecnologiajCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TecnologiajCheckBox3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarUsuariojButton2;
    private javax.swing.JCheckBox CienciaESociedadejCheckBox1;
    private javax.swing.JTextField EntradaIdadejTextField1;
    private javax.swing.JTextField EntradaLoginCadjTextField1;
    private javax.swing.JTextField EntradaNomejTextField1;
    private javax.swing.JLabel IdadejLabel1;
    private javax.swing.JLabel LoginjLabel1;
    private javax.swing.JLabel NomejLabel1;
    private javax.swing.JButton SalvarUsuariojButton1;
    private javax.swing.JTextField SenhajTextField1;
    private javax.swing.JCheckBox SustentabilidadejCheckBox2;
    private javax.swing.JCheckBox TecnologiajCheckBox3;
    private javax.swing.JLabel TipoLivrojLabel1;
    private javax.swing.JLabel TipoUsuariojLabel1;
    private javax.swing.JComboBox<String> favoritoDoisjComboBox2;
    private javax.swing.JComboBox<String> favoritoUmjComboBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
