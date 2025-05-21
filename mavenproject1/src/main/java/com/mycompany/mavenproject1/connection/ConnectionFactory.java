
package com.mycompany.mavenproject1.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gabriel s.c
 */
public class ConnectionFactory {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_projetoa3";
    private static String usuario = "root";
    private static String senha = "1234";
    
    public static Connection obtemConexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+db+"?user="+usuario+"&password="+senha+"&useTimezone=true&serverTimezone=America/Sao_Paulo");
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
