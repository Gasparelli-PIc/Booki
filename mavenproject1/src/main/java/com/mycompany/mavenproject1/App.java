package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Gabriel
 */
public class App {

    private JFrame frame;
    private JPanel container;
    private CardLayout cardLayout;

    public App() {
        // Configuração da janela
        frame = new JFrame("Sistema de Compartilhamento de Leituras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        // Layout e container principal
        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        // Instanciar os painéis (telas)
        LoginTelaPanel login = new LoginTelaPanel();
        AdminJPanel admin = new AdminJPanel();
        CadastroLivroJPanel cadLivro = new CadastroLivroJPanel();
        CadastroUsuarioLJPanel cadUsuario = new CadastroUsuarioLJPanel();
        ConsultarUsuariosJPanel consultUsuario = new ConsultarUsuariosJPanel();
        UsuarioJPanel usuario = new UsuarioJPanel();
        VisualizarLivrosJPanel visLivro = new VisualizarLivrosJPanel();

        // Adicionar os painéis no container com nomes para navegação
        container.add(login, "Login");
        container.add(admin, "Admin");
        container.add(cadLivro, "CadLivro");
        container.add(cadUsuario, "CadUsuario");
        container.add(consultUsuario, "ConsultUsuario");
        container.add(usuario, "Usuario");
        container.add(visLivro, "VisLivro");

        // =========================
        // 🔐 Login ➝ Admin (validação)
        login.getLoginjButton1().addActionListener((ActionEvent e) -> {
            String usuarioDigitado = login.getEntradaUsuariojTextField1().getText();
            String senhaDigitada = new String(login.getEntradaSenhajPasswordField1().getPassword());

            if (usuarioDigitado.equalsIgnoreCase("Admin") && senhaDigitada.equals("1234")) {
                cardLayout.show(container, "Admin");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
            }
        });

        // 🔘 Sair no Login (opcional)
        login.getSairLoginjButton1().addActionListener(e -> {
            frame.dispose();
        });

        // =========================
        // 🔄 Navegação dos botões

        // Admin ➝ Cadastro Usuário
        admin.getCadastrarUsuariosjButton1().addActionListener(e -> {
            cardLayout.show(container, "CadUsuario");
        });

        // Admin ➝ Consultar Usuário
        admin.getVisalizarUsuariojButton2().addActionListener(e -> {
            cardLayout.show(container, "ConsultUsuario");
        });

        // Admin ➝ Cadastro Livro
        admin.getCadastrarLivrosjButton3().addActionListener(e -> {
            cardLayout.show(container, "CadLivro");
        });

        // Admin ➝ Visualizar Livros
        admin.getVisualizarLivrosjButton4().addActionListener(e -> {
            cardLayout.show(container, "VisLivro");
        });

        // Cadastro Usuário ➝ Voltar para Admin
        cadUsuario.getCancelarUsuariojButton2().addActionListener(e -> {
            cardLayout.show(container, "Admin");
        });

        // Cadastro Livro ➝ Voltar para Admin
        cadLivro.getCancelarLivrojButton2().addActionListener(e -> {
            cardLayout.show(container, "Admin");
        });

        // Consultar Usuário ➝ Voltar para Admin
        consultUsuario.getVoltarConsultaUsuariojButton().addActionListener(e -> {
            cardLayout.show(container, "Admin");
        });

        // Visualizar Livros ➝ Voltar para Admin
        visLivro.getVoltarVisualizarLivrosjButton().addActionListener(e -> {
            cardLayout.show(container, "Admin");
        });

        // =========================

        frame.setContentPane(container);
        frame.setVisible(true);

        // Tela que abre primeiro
        cardLayout.show(container, "Login");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}