package com.co.bonbonite.models;

public class DataRegister {
    private String ID;
    private String email;
    private String password;

    public DataRegister(String ID, String email, String password) {
        this.ID = ID;
        this.email = email;
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
