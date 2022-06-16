package impl;

import domain.Admin;

public class AdminImpl implements Admin {
    public static String role = "Admin";
    public String login;
    public String password;

    @Override
    public void setRole() {

    }

    @Override
    public void getRole() {

    }

    @Override
    public void setLogin() {

    }

    @Override
    public void getLogin() {

    }

    @Override
    public void setPassword() {

    }

    @Override
    public void getPassword() {

    }

    String getMyLogin(){
        return this.login;
    }

    String getMyPassword(){
        return this.password;
    }
}
