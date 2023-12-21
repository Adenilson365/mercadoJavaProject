package br.com.adenilson.mercado.core.entity;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class FormaPgtoEntity {

    int id;
    Double valor;
    TipoPgtoEntity tipo;
    
    public FormaPgtoEntity() {
    }

    public FormaPgtoEntity(Double valor, TipoPgtoEntity tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
