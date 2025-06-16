
package com.mycompany.mavenproject1.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gabriel s.c
 */
public class ConnectionFactory {
    private static final String host = "localhost";
    private static final String porta = "3306";
    private static final String db = "projeto_a3";
    private static final String usuario = "root";
    private static final String senha = "12345";
    
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
