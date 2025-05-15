package com.mycompany.mavenproject1;

/**
 *
 * @author Gabriel S.C
 */

import javax.swing.*;
import java.awt.*;

// IMPORTAR TODOS OS PANES DENTRO DO PECKAGE VIEW
// PARA COLOCAR DENTRO DO CARDLAYOULT

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
         
         
         //COLOCAR OS FRAMES DENTRO CARDLAYOUT VARIAS LINHAS 
         container.add(CLASSE, Apelidar o painel dentro do card);
         
         frame.setContentPane(container);
         
         frame.setVisible(true);
         
         cardLayout.show(container, COLOCAR O APELIDO DA TELA DE LOGIN);    
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new App());
    }
}
