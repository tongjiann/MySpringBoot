package com.xiw.supplier;

/**
 * @author xiwang
 * @apiNote
 * @since 2022-06-13 10:45
 */
public class User {

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
