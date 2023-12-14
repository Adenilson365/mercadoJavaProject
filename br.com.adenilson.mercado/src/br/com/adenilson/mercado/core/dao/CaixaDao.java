
package br.com.adenilson.mercado.core.dao;

import br.com.adenilson.mercado.core.dao.conexao.ConexaoJDBC;
import br.com.adenilson.mercado.core.entity.CaixaEntity;
import br.com.adenilson.mercado.core.entity.PdvEntity;
import br.com.adenilson.mercado.core.entity.UserEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class CaixaDao {

    public CaixaEntity consultaCaixa(CaixaEntity caixa) {
        String sql = "select * from caixa where caixaId = ?";
        PreparedStatement ps;

        /*
        Alterar a lógica para receber um id de caixa, e aqui montar o caixa. Chamando o user e chamando o pdv.
         */
        //CaixaEntity caixa = new CaixaEntity();
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setInt(1, caixa.getId());
            ResultSet rs = ps.executeQuery();
            rs.next();
            caixa.setSaldoInicial(rs.getDouble("saldo"));
            return caixa;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Houve um Erro Caixa DAO!");
            System.err.println(e);
            return null;
        }
    }

    public CaixaEntity abrirCaixa(UserEntity user, PdvEntity pdv) {
        String sql = "insert into caixa (userID, pdvId, saldo, dataInicial) values (?,?,?, now())";
        PreparedStatement ps;

        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.setInt(2, pdv.getId());
            ps.setDouble(3, pdv.getCash());
            ps.execute();
            
            CaixaEntity caixa = new CaixaEntity( user, pdv);

            return caixa;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Houve um erro o criar novo caixa!");
            System.err.println(e);
            return null;
        }

    }

}
