package domain;

public interface SuperAccount {

    Admin createAdmin();

    AIB createAib();

    void setRole();

    void setLogin();

    void setPassword();

    void deleteAccount();

    void showAccounts();


}
