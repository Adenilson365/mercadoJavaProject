/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package br.com.adenilson.mercado.core.controller;

import br.com.adenilson.mercado.core.entity.CaixaEntity;
import br.com.adenilson.mercado.core.service.CaixaService;

/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class CaixaController {
  public CaixaEntity consultaCaixa(CaixaEntity caixa){
        CaixaService caixaService = new CaixaService();
        return caixaService.consultaCaixa(caixa);
    }
}
