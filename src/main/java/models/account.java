package models;

import java.util.Scanner;

public class account {
    int Id;
    private String Username,Password, Phonenumber, Email;
    Scanner scA = new Scanner(System.in);
    public account(String username, String password, String email, String phonenumber) {
        this.Username=username;
        this.Password=password;
        this.Email=email;
        this.Phonenumber=phonenumber;
    }

    public account(int id,String username, String password, String email, String phonenumber) {
        this.Id=id;
        this.Username=username;
        this.Password=password;
        this.Email=email;
        this.Phonenumber=phonenumber;
    
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public account() {
        this.Id=0;
        this.Username="";
        this.Password="";
        this.Email="";
        this.Phonenumber="";
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.Phonenumber = phonenumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    @Override
    public String toString() {
        return "account [Email=" + Email + ", Password=" + Password + ", Phonenumber=" + Phonenumber + ", Username="
                + Username + "]";
    }

    
}
