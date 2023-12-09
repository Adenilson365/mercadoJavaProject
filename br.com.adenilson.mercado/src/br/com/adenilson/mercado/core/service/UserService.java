
package br.com.adenilson.mercado.core.service;



import br.com.adenilson.mercado.core.entity.UserEntity;
import br.com.adenilson.mercado.core.dao.UserDao;
import java.sql.ResultSet;


public class UserService {
    
    public ResultSet verificarLogin(UserEntity user){
        UserDao userDao = new UserDao();
        return  userDao.verificaLogin(user);
    }  
}
