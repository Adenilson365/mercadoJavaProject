
package br.com.adenilson.mercado.core.service;

import br.com.adenilson.mercado.core.entity.ProdutoEntity;
import br.com.adenilson.mercado.core.dao.ProdutoDao;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class ProdutoService {
    
    public void salvarProduto(ProdutoEntity produto){
        System.out.println("Passando pelo Service");
        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.salvarProduto(produto);
      
    }
    
}
