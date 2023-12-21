
package br.com.adenilson.mercado.core.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class VendaEntity {
    private int id;
    private long numeroNF;
    private UserEntity operadorPDV;
    private ClienteEntity cliente;
    private Double valorVenda;
    private List<ItensVendaEntity> produtos = new ArrayList<ItensVendaEntity>(); 
    private PgtoEntity pgto;

    public VendaEntity() {
    }

    public VendaEntity(UserEntity operadorPDV, ClienteEntity cliente, PgtoEntity pgto) {
        this.operadorPDV = operadorPDV;
        this.cliente = cliente;
        this.pgto = pgto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(long numeroNF) {
        this.numeroNF = numeroNF;
    }

    public UserEntity getOperadorPDV() {
        return operadorPDV;
    }

    public void setOperadorPDV(UserEntity operadorPDV) {
        this.operadorPDV = operadorPDV;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
   
    public void addItem(ItensVendaEntity item){
        produtos.add(item);
    }
        public void removeItem(ItensVendaEntity item){
        produtos.remove(item);
    }
}
