package br.com.adenilson.mercado.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class PgtoEntity {

    int id;
    Boolean totalPago;
    Date dateTime;
    Double valorTotal;
    Double valorPago;

    private List<FormaPgtoEntity> pgto = new ArrayList<FormaPgtoEntity>();

    public PgtoEntity() {
    }

    public PgtoEntity(Double valorTotal) {

        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Boolean totalPago) {
        this.totalPago = totalPago;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
}
