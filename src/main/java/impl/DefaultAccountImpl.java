package impl;

import domain.DefaultAccount;

public class DefaultAccountImpl implements DefaultAccount {

    private String login;
    private String password;
    private String firstname;
    private String middlename;
    private String lastname;

    @Override
    public void setId() {

    }

    @Override
    public void setLogin() {

    }

    @Override
    public void setPassword() {

    }


    public void setFirstName(String firstname) {
        this.firstname = firstname;

    }

    public void setMiddleName(String middlename) {
        this.middlename = middlename;

    }

    public void setLastName(String lastName) {
        this.lastname = lastName;

    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getLogin() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    String getMyLogin() {
        return this.login;
    }

    String getMyPassword() {
        return this.password;
    }

    DefaultAccount defaultUserMenu() {
        System.out.println("Приветствую вас");
        System.out.print("Выберите действие: \n" +
                "1. Указать Имя\n" +
                "2. Указать Фамилию\n" +
                "3. Указать Отчество");
        return null;
    }
}
