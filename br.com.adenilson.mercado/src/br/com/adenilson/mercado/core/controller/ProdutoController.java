package br.com.adenilson.mercado.core.controller;



import br.com.adenilson.mercado.core.entity.ProdutoEntity;
import br.com.adenilson.mercado.core.service.ProdutoService;


/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class ProdutoController {

    public ProdutoEntity consultaProduto(ProdutoEntity p) {
        ProdutoService produtoService = new ProdutoService();
        return produtoService.consultaProduto(p);
    } 
}