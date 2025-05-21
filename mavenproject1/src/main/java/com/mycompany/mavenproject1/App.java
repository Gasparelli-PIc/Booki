package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.view.*;
/**
 *
 * @author Gabriel S.C
 */

import javax.swing.*;
import java.awt.*;

public class App {
    
    private JFrame frame;
    private JPanel container;
    private CardLayout cardLayout;
    
    
    public App() {
         frame = new JFrame("Livros");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(600, 400);
         frame.setLocationRelativeTo(null);
         
         cardLayout = new CardLayout();
         container = new JPanel(cardLayout);
         
         LoginTelaPanel login = new LoginTelaPanel();
         AdminJPanel admin = new AdminJPanel();
         CadastroLivroJPanel cadLivro = new CadastroLivroJPanel();
         CadastroUsuarioLJPanel cadUsuario = new CadastroUsuarioLJPanel();
         ConsultarUsuariosJPanel consultUsuario = new ConsultarUsuariosJPanel();
         UsuarioJPanel usuario = new UsuarioJPanel();
         VisualizarLivrosJPanel visLivro = new VisualizarLivrosJPanel();
         
         //COLOCAR OS FRAMES DENTRO CARDLAYOUT VARIAS LINHAS 
         container.add(login, "Login");
         container.add(admin, "Admin");
         container.add(cadLivro, "CadLivro");
         container.add(cadUsuario, "CadUsuario");
         container.add(consultUsuario, "ConsultUsuario");
         container.add(usuario, "Usuario");
         container.add(visLivro, "VisLivro");
         
         frame.setContentPane(container);
         
         frame.setVisible(true);
         
         cardLayout.show(container, "Login");    
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new App());
    }
}
