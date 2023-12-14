package br.com.adenilson.mercado.core.controller;

import br.com.adenilson.mercado.core.entity.UserEntity;
import br.com.adenilson.mercado.core.service.UserService;
import java.sql.ResultSet;

/**
 * 
 * @author Adenilson Konzelmann Alves <https://github.com/Adenilson365>
 */
public class UserController {
     
    public ResultSet verificaLogin(UserEntity user) {
        UserService userService = new UserService();
        return userService.verificarLogin(user);  
    }
}
