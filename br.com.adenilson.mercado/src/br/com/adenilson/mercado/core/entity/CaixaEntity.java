
package br.com.adenilson.mercado.core.entity;

import java.util.Date;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class CaixaEntity {

    private int id;
    private UserEntity operadorPdv;
    private PdvEntity pdv;
    private double saldoInicial;
    private double saldoFinalContabil;
    private double saldoFinalFisico;
    private double sobraFalta;
    private Date dataInicial;
    private Date dataFinal;

    public CaixaEntity(UserEntity operadorPdv, PdvEntity pdv) {
        this.operadorPdv = operadorPdv;
        this.pdv = pdv;
        saldoInicial = pdv.getCash();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoFinalContabil() {
        return saldoFinalContabil;
    }

    public void setSaldoFinalContabil(double saldoFinalContabil) {
        this.saldoFinalContabil = saldoFinalContabil;
    }

    public double getSaldoFinalFisico() {
        return saldoFinalFisico;
    }

    public void setSaldoFinalFisico(double saldoFinalFisico) {
        this.saldoFinalFisico = saldoFinalFisico;
    }

    public double getSobraFalta() {
        return sobraFalta;
    }

    public void setSobraFalta(double sobraFalta) {
        this.sobraFalta = sobraFalta;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    
}
