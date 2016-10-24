/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author hudson.rsilva1
 */
@Stateless
public class loginEJB implements loginEJBLocal {

    private String login;
    private Long password;
    
    @Override
    public void validateLogin() {
    
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    
    
}
