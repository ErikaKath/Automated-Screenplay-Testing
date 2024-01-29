package com.co.bonbonite.models;

public class DataRegister {
    private String iD;
    private String email;
    private String password;

    public DataRegister(String iD, String email, String password) {
        this.iD = iD;
        this.email = email;
        this.password = password;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
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
