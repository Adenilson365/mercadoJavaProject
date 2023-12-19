package br.com.adenilson.mercado.core.dao;
import br.com.adenilson.mercado.core.dao.conexao.ConexaoJDBC;
import br.com.adenilson.mercado.core.entity.ProdutoEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class ProdutoDao {
   
        public ProdutoEntity consultaProduto(ProdutoEntity p) {    
        String sql = "Select * from produto where  codigoBarras = ?";
        PreparedStatement ps;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, p.getCodigoDeBarras());
            ResultSet rs = ps.executeQuery();
            rs.next();
            p.setEstoque(rs.getFloat("estoque"));
            p.setNome(rs.getString("nomeproduto"));
            p.setPrecoVenda(rs.getFloat("precovenda"));
            p.setRestringirEstoque(rs.getBoolean("restringirEstoqueNegativo"));
            return p;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao consultar produto no BD, ProdutoDAO!");
            System.err.println(e);
        }
            return null;
    }   
}
