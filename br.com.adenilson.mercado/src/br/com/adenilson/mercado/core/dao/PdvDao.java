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

    public ResultSet consultaPdv() {
        String sql = "select pdv.*,user.userName from pdv join caixa on caixa.caixaID = pdv.caixaId join user on caixa.userID = user.userID";
        PreparedStatement ps;

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

    public PdvEntity validaPdv(PdvEntity pdv) {
        String sql = "Select * from pdv where pdvName = ?";
        PreparedStatement ps;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, "" + pdv.getPdvName());
            ResultSet rs = ps.executeQuery();
            rs.next();
            pdv.setId(rs.getInt("pdvId"));
            pdv.setOpen(rs.getBoolean("status"));
            pdv.setPdvName(rs.getString("pdvName"));
            pdv.setCash(rs.getDouble("saldo"));
            pdv.setPdvDateStatus(rs.getDate("dataStatus"));
            pdv.setIdCaixa(rs.getInt("caixaId"));

            return pdv;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Houve um Erro PDV DAO! Entity");
            System.err.println(e);
            return null;
        }
    }
}
