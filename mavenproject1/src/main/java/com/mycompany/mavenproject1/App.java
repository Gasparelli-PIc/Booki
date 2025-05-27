package com.mycompany.mavenproject1;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.mycompany.mavenproject1.view.AdminJPanel;
import com.mycompany.mavenproject1.view.CadastroLivroJPanel;
import com.mycompany.mavenproject1.view.CadastroUsuarioLJPanel;
import com.mycompany.mavenproject1.view.ConsultarUsuariosJPanel;
import com.mycompany.mavenproject1.view.LoginTelaPanel;
import com.mycompany.mavenproject1.view.UsuarioJPanel;
import com.mycompany.mavenproject1.view.VisualizarLivrosJPanel;

public class App extends JFrame {

    private JPanel container;
    private CardLayout cardLayout;

    public App() {
        // Configuração da janela
        setTitle("Sistema de Compartilhamento de Leituras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setResizable(false);

        // Layout e container principal
        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        // Instanciar os painéis (telas), passando this (referência do App)
        LoginTelaPanel login = new LoginTelaPanel(this);
        AdminJPanel admin = new AdminJPanel(this);
        CadastroLivroJPanel cadLivro = new CadastroLivroJPanel(this);
        CadastroUsuarioLJPanel cadUsuario = new CadastroUsuarioLJPanel(this);
        ConsultarUsuariosJPanel consultUsuario = new ConsultarUsuariosJPanel(this);
        UsuarioJPanel usuario = new UsuarioJPanel(this);
        VisualizarLivrosJPanel visLivro = new VisualizarLivrosJPanel(this);

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
