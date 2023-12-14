
package br.com.adenilson.mercado.view;

import br.com.adenilson.mercado.core.controller.CaixaController;
import br.com.adenilson.mercado.core.controller.PdvController;
import br.com.adenilson.mercado.core.entity.CaixaEntity;
import br.com.adenilson.mercado.core.entity.PdvEntity;
import br.com.adenilson.mercado.core.entity.UserEntity;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class TelaPdvSelect extends javax.swing.JFrame {

    UserEntity user;

    public TelaPdvSelect() {
    }

    ;
    /**
     * Creates new form TelaPdvSelect
     * @param user
     */
    public TelaPdvSelect(UserEntity user) {
        this.user = user;
        initComponents();
        PdvController pdc = new PdvController();
        //refatorar para trazer uma lista de pdv entity, e ent�o n�o preciso do m�todo validapdv
        try {
            ResultSet rs = pdc.consultaPdv();
            DefaultTableModel dtm = (DefaultTableModel) jTablePdv.getModel();
            rs.next();
            do {
                Object[] dados = {rs.getString("pdvName"), rs.getBoolean("status"), rs.getDate("dataStatus"), rs.getString("userName")};
                dtm.addRow(dados);
            } while (rs.next());
        } catch (SQLException ex) {
            System.out.println("Erro!!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePdv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AKA Systems");

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTablePdv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PDV", "Situa��o", "Data", "Usu�rio"
            }
        ));
        jTablePdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePdvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePdv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.out.print(jTablePdv.getSelectedRow());
        String pdvName = (String) jTablePdv.getValueAt(jTablePdv.getSelectedRow(), 0);
        PdvEntity pdv = new PdvEntity();
        pdv.setPdvName(pdvName);
        PdvController pdvc = new PdvController();
        pdv = pdvc.validaPdv(pdv);
        if (pdv.isOpen()) {
            TelaPrincipalPDV tpp = new TelaPrincipalPDV();
            dispose();
            tpp.setVisible(true);
            System.out.println("ID:"+pdv.getId()+"  "+pdv.getPdvName());
            CaixaEntity caixa = new CaixaEntity();
            caixa.setId(pdv.getIdCaixa());
            CaixaController cc = new CaixaController();
            cc.consultaCaixa(caixa);
            System.out.println(caixa.getSaldoInicial());
            
        } else {
            TelaPdvOpenClose tpoc = new TelaPdvOpenClose(user, pdv);
            System.out.println("select:"+this.user.getId());
            dispose();
            tpoc.setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTablePdvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePdvMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jTablePdvMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPdvSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPdvSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPdvSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPdvSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPdvSelect().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePdv;
    // End of variables declaration//GEN-END:variables
}
