package com.mycompany.mavenproject1;
//import dos pacotes/bibliotecas 
import java.awt.CardLayout;

//import packages do projeto
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import java.awt.Image;

import com.mycompany.mavenproject1.view.*;

public class App extends JFrame {

    //declarando os item para organização dos layouts
    private JPanel container;
    private CardLayout cardLayout;

    // declaração das variaveis containers
    private ConsultarUsuariosJPanel consultUsuario;
    private VisualizarLivrosJPanel visLivro;
    private CadastroUsuarioLJPanel cadUsuario; 
    private CadastroLivroJPanel cadLivro;   
    private VisualizarLivroTodosJPanel visLivroTodos;
    
    public App() {
        
        // Configuração da janela
        setTitle("Booki");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        
        //Trabalhar com as imagens
        Image icon = new ImageIcon(getClass().getResource("/images/Logo.png")).getImage();
        setIconImage(icon);

        // Layout e container principal
        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        // Instanciar os painéis (telas)
        LoginTelaPanel login = new LoginTelaPanel(this);
        AdminJPanel admin = new AdminJPanel(this);
        UsuarioJPanel usuario = new UsuarioJPanel(this);
        cadLivro = new CadastroLivroJPanel(this);     
        cadUsuario = new CadastroUsuarioLJPanel(this);
        consultUsuario = new ConsultarUsuariosJPanel();
        visLivro = new VisualizarLivrosJPanel();
        visLivroTodos = new VisualizarLivroTodosJPanel(this);
        consultUsuario.setApp(this);
        visLivro.setApp(this);
        

        // Adicionar os painéis no container com nomes para navegação
        container.add(login, "Login");
        container.add(admin, "Admin");
        container.add(cadLivro, "CadLivro");
        container.add(cadUsuario, "CadUsuario");
        container.add(consultUsuario, "ConsultUsuario");
        container.add(usuario, "Usuario");
        container.add(visLivro, "VisLivro");
        container.add(visLivroTodos, "visLivroTodos");

        setContentPane(container);
        setVisible(true);

        cardLayout.show(container, "Login");
    }

    // Getters para permitir acesso ao CardLayout e Container nas telas
    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public JPanel getContainer() {
        return container;
    }
    
    public ConsultarUsuariosJPanel getConsultarUsuariosJPanel(){
        return consultUsuario;
    }
    
    public VisualizarLivroTodosJPanel getVisualizarLivroTodosJPanel(){
        return visLivroTodos;
    }
    
    public VisualizarLivrosJPanel getVisualizarLivrosJPanel(){
        return visLivro;
    }
    
    public CadastroUsuarioLJPanel getCadastroUsuarioLJPanel() {
        return cadUsuario;
    }

    public CadastroLivroJPanel getCadastroLivroJPanel() {
        return cadLivro;
    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}
