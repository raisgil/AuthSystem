package domain;

public interface Registrator {
    void chooseAccount();


    DefaultAccount createDefaultAccount();

    SuperAccount createSuperAccount();

}