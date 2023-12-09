package br.com.adenilson.mercado.core.controller;



import br.com.adenilson.mercado.core.entity.ProdutoEntity;
import br.com.adenilson.mercado.core.service.ProdutoService;


/**
 *
 * @author Adenilson Konzelmann
 */
public class ProdutoController {

    public void salvarProduto(ProdutoEntity produto) {
        System.out.println("Passando pelo controller");
        ProdutoService produtoService = new ProdutoService();
        produtoService.salvarProduto(produto);
        
        
    }

}
