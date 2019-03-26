package com.example.demo.Model;

public class User {
    private String fName;
    private String lName;
    private String opis;

    public User() {
    }

    public User(String fName, String lName, String opis) {

        this.fName = fName;
        this.lName = lName;
        this.opis = opis;

    }

    public User(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }



    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
