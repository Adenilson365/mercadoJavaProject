package br.com.adenilson.mercado.core.controller;

import br.com.adenilson.mercado.core.entity.CaixaEntity;
import br.com.adenilson.mercado.core.entity.PdvEntity;
import br.com.adenilson.mercado.core.entity.UserEntity;
import br.com.adenilson.mercado.core.service.CaixaService;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class CaixaController {

    public CaixaEntity consultaCaixa(CaixaEntity caixa) {
        CaixaService caixaService = new CaixaService();
        return caixaService.consultaCaixa(caixa);
    }

    public CaixaEntity abrirCaixa(UserEntity user, PdvEntity pdv) {
        CaixaService caixaService = new CaixaService();
        return caixaService.abrirCaixa(user, pdv);

    }
}
