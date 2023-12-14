

package br.com.adenilson.mercado.core.service;

import br.com.adenilson.mercado.core.dao.CaixaDao;
import br.com.adenilson.mercado.core.entity.CaixaEntity;
import br.com.adenilson.mercado.core.entity.PdvEntity;
import br.com.adenilson.mercado.core.entity.UserEntity;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class CaixaService {

        public CaixaEntity consultaCaixa(CaixaEntity caixa){
        CaixaDao caixaDao = new CaixaDao();
        return caixaDao.consultaCaixa(caixa);
    }
        
        public CaixaEntity abrirCaixa(UserEntity user, PdvEntity pdv){
            CaixaDao caixaDao = new CaixaDao();
            return caixaDao.abrirCaixa(user, pdv);
            
        }
}
