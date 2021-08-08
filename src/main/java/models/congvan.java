package models;

import java.util.Scanner;

public class congvan {
    private String SoCV;
    Scanner sc = new Scanner(System.in);
    private String NgayCV,Nguoiki,Ghichu,Trichyeu;
    public congvan(String soCV, String ngayCV, String nguoiki, String ghichu, String trichyeu) {
        SoCV = soCV;
        NgayCV = ngayCV;
        Nguoiki = nguoiki;
        Ghichu = ghichu;
        Trichyeu = trichyeu;
    }

    public congvan(){
        SoCV = "";
        NgayCV = "";
        Nguoiki = "";
        Ghichu = "";
        Trichyeu = "";
    }
    public String getSoCV() {
        return SoCV;
    }
    public void setSoCV(String soCV) {
        SoCV = soCV;
    }
    public String getNgayCV() {
        return NgayCV;
    }
    public void setNgayCV(String ngayCV) {
        NgayCV = ngayCV;
    }
    public String getNguoiki() {
        return Nguoiki;
    }
    public void setNguoiki(String nguoiki) {
        Nguoiki = nguoiki;
    }
    public String getGhichu() {
        return Ghichu;
    }
    public void setGhichu(String ghichu) {
        Ghichu = ghichu;
    }
    public String getTrichyeu() {
        return Trichyeu;
    }
    public void setTrichyeu(String trichyeu) {
        Trichyeu = trichyeu;
    }

    public void nhap() {
        
        System.out.print("so cong van: "); this.SoCV = sc.nextLine();
        System.out.print("ngay cong van: "); this.NgayCV = sc.nextLine();
        System.out.print("nguoi ki: "); this.Nguoiki = sc.nextLine();
        System.out.println("ghi chu: "); this.Ghichu = sc.nextLine();
        System.out.println("trich yeu: "); this.Trichyeu = sc.nextLine();
    }

    @Override
    public String toString() {
        return "congvan [Ghichu=" + Ghichu + ", NgayCV=" + NgayCV + ", Nguoiki=" + Nguoiki + ", SoCV=" + SoCV
                + ", Trichyeu=" + Trichyeu + "]";
    }
    
}
