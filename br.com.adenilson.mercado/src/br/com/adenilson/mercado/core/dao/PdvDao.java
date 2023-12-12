/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.adenilson.mercado.core.dao;


import br.com.adenilson.mercado.core.dao.conexao.ConexaoJDBC;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class PdvDao {
    
    public ResultSet consultaPdv(){
      String sql = "SELECT * FROM pdv";
      PreparedStatement ps ;
      
      try {
          ps = ConexaoJDBC.getConexao().prepareStatement(sql);
          //ps.setString(1,pdv.getPdvName());
          ResultSet rs = ps.executeQuery();
          return rs;
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Houve um Erro PDV DAO!");
          System.err.println(e);
          return null;
      } 
        
    }
}
