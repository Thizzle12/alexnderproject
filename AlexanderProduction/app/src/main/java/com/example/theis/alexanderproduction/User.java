package com.example.theis.alexanderproduction;

/**
 * Created by Theis on 30-04-2017.
 */
public class User {


    private String password;
    private String fullName;



    public User(String fullName, String password, int spiritanimal) {
        this.fullName = fullName;
        this.password = password;
    }

    public String getPassword()

    {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}

