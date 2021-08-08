package models;

import java.util.Scanner;

public class congvandi extends congvan{
    private String Doituongnhan, Ngaygui;
    Scanner scG = new Scanner(System.in);
    public congvandi(String soCV, String ngayCV, String nguoiki, String ghichu, String trichyeu, String doituongnhan,
            String ngaygui) {
        super(soCV, ngayCV, nguoiki, ghichu, trichyeu);
        Doituongnhan = doituongnhan;
        Ngaygui = ngaygui;
    }

    public congvandi(){
        super();
        Doituongnhan="";
        Ngaygui="";
    }

    public String getDoituongnhan() {
        return Doituongnhan;
    }

    public void setDoituongnhan(String doituongnhan) {
        Doituongnhan = doituongnhan;
    }

    public String getNgaygui() {
        return Ngaygui;
    }

    public void setNgaygui(String ngaygui) {
        Ngaygui = ngaygui;
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();        
        System.out.print("doi tuong nhan: "); this.Doituongnhan=scG.nextLine();
        System.out.print("ngay gui: "); this.Ngaygui = scG.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+ "congvandi [Doituongnhan=" + Doituongnhan + ", Ngaygui=" + Ngaygui + "]";
    }
    
}
