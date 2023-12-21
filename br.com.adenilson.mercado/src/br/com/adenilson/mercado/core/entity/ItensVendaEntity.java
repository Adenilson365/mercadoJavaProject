package br.com.adenilson.mercado.core.entity;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class ItensVendaEntity {

    int id;
    Double quantidade;
    Double preco;
    ProdutoEntity produto;
    
    public ItensVendaEntity(){}

    public ItensVendaEntity(Double quantidade, Double preco, ProdutoEntity produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ProdutoEntity getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }

    public Double subTotal(){
        return quantidade * preco;
    }
}
