package models;

import java.util.Scanner;

public class employee extends account{
    private String Position,Hoten,Namsinh,Diachi;
    Scanner scE = new Scanner(System.in);
    public employee(String username, String password, String email,String phonenumber,String hoten,  String position,
            String namsinh, String diachi) {
        super(username, password, email, phonenumber);
        this.Position = position;
        this.Hoten = hoten;
        this.Namsinh = namsinh;
        this.Diachi = diachi;
    }
    public employee(int id,String username, String password, String email,String phonenumber,String hoten,  String position,
            String namsinh, String diachi) {
        super(id,username, password, email, phonenumber);
        this.Position = position;
        this.Hoten = hoten;
        this.Namsinh = namsinh;
        this.Diachi = diachi;
    }
    public employee() {
        super();
        this.Position = "";
        this.Hoten ="";
        this.Namsinh = "";
        this.Diachi = "";
    }
    public String getPosition() {
        return Position;
    }
    public String getHoten() {
        return Hoten;
    }
    public void setHoten(String hoten) {
        this.Hoten = hoten;
    }
    public String getNamsinh() {
        return Namsinh;
    }
    public void setNamsinh(String namsinh) {
        this.Namsinh = namsinh;
    }
    public String getDiachi() {
        return Diachi;
    }
    public void setDiachi(String diachi) {
        this.Diachi = diachi;
    }
    public void setPosition(String position) {
        this.Position = position;
    }

    @Override
    public String toString() {
        return super.toString() + "employee [Diachi=" + Diachi + ", Hoten=" + Hoten + ", Namsinh=" + Namsinh + ", Position=" + Position
                +  "]";
    }

    
    
}
