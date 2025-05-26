/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.mavenproject1.view;

import com.mycompany.mavenproject1.App;
import javax.swing.*;
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
        if (!CienciaESociedadejCheckBox1.isSelected() && !SustentabilidadejCheckBox2.isSelected() && !TecnologiajCheckBox3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione pelo menos um tipo de livro favorito.");
            return false; // Impede o salvamento se nenhuma checkbox estiver selecionada
        }
        try {
            Integer.parseInt(EntradaIdadejTextField1.getText().trim());
        }catch (NumberFormatException e) {
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
        entradaSenhaCadjPasswordField1 = new javax.swing.JPasswordField();

        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        NomejLabel1.setText("Nome");

        EntradaNomejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNomejTextField1ActionPerformed(evt);
            }
        });

        IdadejLabel1.setText("Idade");

        EntradaIdadejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaIdadejTextField1ActionPerformed(evt);
            }
        });

        TipoUsuariojLabel1.setText("Tipo Usuário");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário Administrador", "Usuário Comum" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        TipoLivrojLabel1.setText("Tipo de Livro Favorito");

        CienciaESociedadejCheckBox1.setText("Ciência e Tecnlogia");
        CienciaESociedadejCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CienciaESociedadejCheckBox1ActionPerformed(evt);
            }
        });

        SustentabilidadejCheckBox2.setText("Sustentabilidade");
        SustentabilidadejCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SustentabilidadejCheckBox2ActionPerformed(evt);
            }
        });

        TecnologiajCheckBox3.setText("Tecnologia");
        TecnologiajCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecnologiajCheckBox3ActionPerformed(evt);
            }
        });

        SalvarUsuariojButton1.setText("Salvar");
        SalvarUsuariojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarUsuariojButton1ActionPerformed(evt);
            }
        });

        CancelarUsuariojButton2.setText("Cancelar");
        CancelarUsuariojButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarUsuariojButton2ActionPerformed(evt);
            }
        });

        LoginjLabel1.setText("Login");

        EntradaLoginCadjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaLoginCadjTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Senha");

        entradaSenhaCadjPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NomejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaNomejTextField1)
                            .addComponent(IdadejLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EntradaIdadejTextField1)
                            .addComponent(TipoUsuariojLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 0, Short.MAX_VALUE)
                            .addComponent(TipoLivrojLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CienciaESociedadejCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TecnologiajCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SustentabilidadejCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(SalvarUsuariojButton1)
                        .addGap(67, 67, 67)
                        .addComponent(CancelarUsuariojButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EntradaLoginCadjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entradaSenhaCadjPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginjLabel1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntradaLoginCadjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaSenhaCadjPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(NomejLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntradaNomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IdadejLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntradaIdadejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TipoUsuariojLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TipoLivrojLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CienciaESociedadejCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SustentabilidadejCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TecnologiajCheckBox3)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarUsuariojButton1)
                    .addComponent(CancelarUsuariojButton2))
                .addContainerGap())
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
        

//       if (validarCampos()) {
//           JOptionPane.showMessageDialog(this, "Usuário salvo com sucesso!");
//           
//           app.getCardLayout().show(app.getContainer(), "Admin");
//       }
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
    private javax.swing.JCheckBox SustentabilidadejCheckBox2;
    private javax.swing.JCheckBox TecnologiajCheckBox3;
    private javax.swing.JLabel TipoLivrojLabel1;
    private javax.swing.JLabel TipoUsuariojLabel1;
    private javax.swing.JPasswordField entradaSenhaCadjPasswordField1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
