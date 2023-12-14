
package br.com.adenilson.mercado.core.service;

import br.com.adenilson.mercado.core.entity.ProdutoEntity;
import br.com.adenilson.mercado.core.dao.ProdutoDao;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class ProdutoService {
    
 public ProdutoEntity consultaProduto(ProdutoEntity p){
        ProdutoDao produtoDao = new ProdutoDao();
        return produtoDao.consultaProduto(p);
    }   
}
