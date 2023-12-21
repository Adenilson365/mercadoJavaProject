
package br.com.adenilson.mercado.core.entity;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class TipoPgtoEntity {

    int id;
    String name;

    public TipoPgtoEntity() {
    }

    public TipoPgtoEntity(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
