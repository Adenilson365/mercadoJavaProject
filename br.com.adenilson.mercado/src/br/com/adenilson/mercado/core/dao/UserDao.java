package br.com.adenilson.mercado.core.dao;

/**
 * 
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */

import br.com.adenilson.mercado.core.dao.conexao.ConexaoJDBC;
import br.com.adenilson.mercado.core.entity.UserEntity;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class UserDao {
  public ResultSet verificaLogin(UserEntity user){
      String sql = "SELECT * FROM user WHERE name = ? AND password = ?";
      PreparedStatement ps ;
      
      try {
          ps = ConexaoJDBC.getConexao().prepareStatement(sql);
          ps.setString(1, user.getUserName());
          ps.setString(2, user.getUserPassword());
          ResultSet rs = ps.executeQuery();
          return rs;
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Houve um erro de Login!");
          return null;
      }
      
  }  
}
