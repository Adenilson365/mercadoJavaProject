
package br.com.adenilson.mercado;

import br.com.adenilson.mercado.core.controller.PdvController;
import br.com.adenilson.mercado.core.controller.ProdutoController;
import br.com.adenilson.mercado.core.entity.PdvEntity;
import br.com.adenilson.mercado.core.entity.ProdutoEntity;
import br.com.adenilson.mercado.view.TelaLogin;



/**
 * 
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProdutoEntity produto = new ProdutoEntity();
        ProdutoController pc = new ProdutoController();
        pc.salvarProduto(produto);
        
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        
        
        
        

        
    }
    
}
