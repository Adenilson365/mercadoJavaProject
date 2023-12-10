
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
    private List<ProdutoEntity> produtos = new ArrayList<ProdutoEntity>(); 

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
    
    public void removeProduct(ProdutoEntity p){
        produtos.remove(p);
    }
    
    public void addProdutct(ProdutoEntity p ){
        produtos.add(p);
    }
   
    
}
