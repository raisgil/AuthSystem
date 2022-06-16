package impl;

import domain.AIB;

public class AIBImpl implements AIB {
    public static String role = "AIB";
    private String login;
    private String password;

    String getMyLogin() {
        return this.login;
    }

    String getMyPassword() {
        return this.password;
    }
}
