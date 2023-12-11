
package br.com.adenilson.mercado.core.entity;

import java.util.Date;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class PdvEntity {
    private int id;
    private String pdvName;
    private Date pdvDateStatus;
    private double saldo;
    private boolean open;

    public String getPdvName() {
        return pdvName;
    }

    public void setPdvName(String pdvName) {
        this.pdvName = pdvName;
    }

    public Date getPdvDateStatus() {
        return pdvDateStatus;
    }

    public void setPdvDateStatus(Date pdvDateStatus) {
        this.pdvDateStatus = pdvDateStatus;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
    private Double cash;

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
