

package br.com.adenilson.mercado.core.service;

import java.sql.ResultSet;
import br.com.adenilson.mercado.core.dao.PdvDao;


/**
 *
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class PdvService {
    
    public ResultSet consultaPdv(){
        PdvDao pdvDao = new PdvDao();
        return pdvDao.consultaPdv();
    }
}
