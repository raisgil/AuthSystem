package app;

import domain.*;
import impl.*;

public class Application {
    public static void main(String[] args) {
        SuperAccount superAccount = new SuperImpl();
        Admin admin = new AdminImpl();
        AIB aib = new AIBImpl();
        DefaultAccount defaultAccount = new DefaultAccountImpl();
        Registrator registrator = new RegistratorImpl((SuperImpl) superAccount, (AdminImpl) admin, (AIBImpl) aib, (DefaultAccountImpl) defaultAccount);
        registrator.chooseAccount();
    }

}
