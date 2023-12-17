package br.com.adenilson.mercado.core.service;

import br.com.adenilson.mercado.core.entity.ProdutoEntity;
import br.com.adenilson.mercado.core.dao.ProdutoDao;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class ProdutoService {

    public ProdutoEntity consultaProduto(ProdutoEntity p) {
        ProdutoDao produtoDao = new ProdutoDao();
        p = produtoDao.consultaProduto(p);
        return RestricaoEstoqueNegativo(p);

    }

    private ProdutoEntity RestricaoEstoqueNegativo(ProdutoEntity p) {
        if (p != null) {
            if (p.getEstoque() < 1.0f) {
                p = null;
                return p;
            } else {
                return p;
            }

        }
        return p;
    }
}
