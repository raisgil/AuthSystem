package impl;

import domain.Admin;
import domain.AIB;
import domain.SuperAccount;
import java.util.Scanner;

public class SuperImpl implements SuperAccount {
    public static final String role = "Super";
    private final String login = "super";
    private final String password = "super";

    public void showActions() {
        System.out.print("Приветствую тебя, супер! Что желаешь сделать:" +
                "\n1. Создать админа" +
                "\n2. Создать AIBa" +
                "\n3. Введите логин пользователя: ");
        String choose = new Scanner(System.in).nextLine();
        if (choose.equalsIgnoreCase("1")) {
            createAdmin();
        }
        if (choose.equalsIgnoreCase("2")) {
            createAib();
        }
        if (choose.equalsIgnoreCase("3")) {
            System.out.println("Желаемое действие с пользователем"+choose+"\n" +
                    "1. Поменять роль\n");
        }
    }


    @Override
    public Admin createAdmin() {
        return new AdminImpl();
    }

    @Override
    public AIB createAib() {
        return new AIBImpl();
    }

    @Override
    public void setRole() {


    }

    @Override
    public void setLogin() {

    }

    @Override
    public void setPassword() {

    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public void showAccounts() {

    }

    String getMyLogin() {
        return this.login;
    }

    String getMyPassword() {
        return this.password;
    }

}

