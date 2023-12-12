
package br.com.adenilson.mercado.core.controller;

import br.com.adenilson.mercado.core.entity.PdvEntity;
import br.com.adenilson.mercado.core.service.PdvService;
import java.sql.ResultSet;
/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class PdvController {

    public ResultSet consultaPdv(){
        
        PdvService pdvService = new PdvService();
        return pdvService.consultaPdv();
    }
    
    public PdvEntity validaPdv(PdvEntity pdv){
        PdvService pdvService = new PdvService();
        pdvService.validaPdv(pdv);
        return pdv;
    }
}
