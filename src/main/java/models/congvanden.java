package models;

import java.util.Scanner;

public class congvanden extends congvan{
    private String SttCV, Ngayden, Nguoivaoso;
    Scanner scV = new Scanner(System.in);
    public congvanden(String soCV, String ngayCV, String nguoiki, String ghichu, String trichyeu, String sttCV,
            String ngayden, String nguoivaoso) {
        super(soCV, ngayCV, nguoiki, ghichu, trichyeu);
        SttCV = sttCV;
        Ngayden = ngayden;
        Nguoivaoso = nguoivaoso;
    }

    public congvanden() {
        super();
        SttCV = "";
        Ngayden = "";
        Nguoivaoso = "";
    }

    public String getSttCV() {
        return SttCV;
    }

    public void setSttCV(String sttCV) {
        SttCV = sttCV;
    }

    public String getNgayden() {
        return Ngayden;
    }

    public void setNgayden(String ngayden) {
        Ngayden = ngayden;
    }

    public String getNguoivaoso() {
        return Nguoivaoso;
    }

    public void setNguoivaoso(String nguoivaoso) {
        Nguoivaoso = nguoivaoso;
    }
    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        
        System.out.print("so thu tu cong van: "); this.SttCV=scV.nextLine();
        System.out.print("ngay den: "); this.Ngayden = scV.nextLine();
        System.out.print("nguoi vao so: "); this.Nguoivaoso = scV.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+"congvanden [Ngayden=" + Ngayden + ", Nguoivaoso=" + Nguoivaoso + ", SttCV=" + SttCV + "]";
    }

    
    
}
