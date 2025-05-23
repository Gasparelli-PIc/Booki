package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.view.*;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    private JPanel container;
    private CardLayout cardLayout;

    public App() {
        // Configuração da janela
        setTitle("Sistema de Compartilhamento de Leituras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Layout e container principal
        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        // Instanciar os painéis (telas), passando this (referência do App)
        LoginTelaPanel login = new LoginTelaPanel(this);
        AdminJPanel admin = new AdminJPanel(this);
        CadastroLivroJPanel cadLivro = new CadastroLivroJPanel();
        CadastroUsuarioLJPanel cadUsuario = new CadastroUsuarioLJPanel(this);
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

        setContentPane(container);
        setVisible(true);

        // Tela que abre primeiro
        cardLayout.show(container, "Login");
    }

    // Getters para permitir acesso ao CardLayout e Container nas telas
    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public JPanel getContainer() {
        return container;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}