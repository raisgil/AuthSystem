package impl;

import domain.*;

import java.util.Scanner;

public class RegistratorImpl implements Registrator {
    private final SuperImpl superimpl;
    private final AdminImpl adminimpl;
    private final AIBImpl aibimpl;
    private final DefaultAccountImpl defaultaccountimpl;

    public RegistratorImpl(SuperImpl superimpl, AdminImpl adminimpl, AIBImpl aibimpl, DefaultAccountImpl defaultaccountimpl) {
        this.superimpl = superimpl;
        this.adminimpl = adminimpl;
        this.aibimpl = aibimpl;
        this.defaultaccountimpl = defaultaccountimpl;
    }




    @Override
    public void chooseAccount() {
        System.out.println("Введите логин и пароль чтобы войти или зарегистрироваться.");
        System.out.println("Введите логин: ");
        String login = new Scanner(System.in).nextLine();
        System.out.println("Введите пароль: ");
        String password = new Scanner(System.in).nextLine();
        if ((login.equals(superimpl.getMyLogin())) && password.equals(superimpl.getMyPassword())) {
            //Возврат в меню аккаунта Супер
            superimpl.showActions();
        } else if ((login.equals(adminimpl.getMyLogin())) && password.equals(adminimpl.getMyPassword())) {
            ///Возврат в меню аккаунта Админ
        } else if ((login.equals(aibimpl.getMyLogin())) && password.equals(aibimpl.getMyPassword())) {
            ///Возврат в меню аккаунта АИБ
        } else if ((login.equals(defaultaccountimpl.getMyLogin())) && password.equals(defaultaccountimpl.getMyPassword())) {
            ///Возврат в меню аккаунта обычного пользователя
        } else
            createDefaultAccount();
    }


    @Override
    public DefaultAccount createDefaultAccount() {
        new DefaultAccountImpl();
        return defaultaccountimpl.defaultUserMenu();
    }

    @Override
    public SuperAccount createSuperAccount() {
        return new SuperImpl();
    }
}
