
package br.com.adenilson.mercado.core.entity;

/**
 *
 * @author Adenilson Konzelmann Alves   
 */
public class UserEntity {
    private String userName;
    private String userPassword;
    private Boolean userLogged;

    public Boolean getUserLogged() {
        return userLogged;
    }

    public void setUserLogged(Boolean userLogged) {
        this.userLogged = userLogged;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
            
}
