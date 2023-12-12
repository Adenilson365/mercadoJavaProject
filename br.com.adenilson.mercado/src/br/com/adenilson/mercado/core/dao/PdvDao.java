
package br.com.adenilson.mercado.core.dao;


import br.com.adenilson.mercado.core.dao.conexao.ConexaoJDBC;
import br.com.adenilson.mercado.core.entity.PdvEntity;
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
          ResultSet rs = ps.executeQuery();
          return rs;
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Houve um Erro PDV DAO!");
          System.err.println(e);
          return null;
      } 
        
    }
    
    public PdvEntity validaPdv(PdvEntity pdv){
        String sql = "Select * from pdv where pdvId = ?";
        PreparedStatement ps ;
         try {
          ps = ConexaoJDBC.getConexao().prepareStatement(sql);
          System.out.println(pdv.getId());
          ps.setString(1,""+pdv.getId());
          ResultSet rs = ps.executeQuery();
          rs.next();
          pdv.setOpen(rs.getBoolean("status"));
          pdv.setPdvName(rs.getString("pdvName"));
          pdv.setCash(rs.getDouble("saldo"));
         
          pdv.setPdvDateStatus(rs.getDate("dataStatus"));
          
          return pdv;
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(null, "Houve um Erro PDV DAO! Entity");
          System.err.println(e);
          return null;
      } 
    }
}
