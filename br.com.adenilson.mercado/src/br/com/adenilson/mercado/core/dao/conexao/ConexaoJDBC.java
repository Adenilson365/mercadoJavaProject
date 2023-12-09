/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.adenilson.mercado.core.dao.conexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Adenilson
 */
public class ConexaoJDBC {

    private static final String URL = "jdbc:mysql://localhost:3306/mercado";
    private static final String USER = "adminMercado";
    private static final String PASSWORD = "adminMercado";

    private static Connection conn;

    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conectado");
                return conn;
            } else {
                System.out.println("Já Conectado");
                return conn;
            }
        } catch (SQLException e) {
            System.out.println("Erro Conexao");
            //JOptionPane.showMessageDialog(null, "Houve um erro de Conexão!");
            return null;
        }
    }
}
