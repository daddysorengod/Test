/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.BooleanControl;

import models.employee;

/**
 *
 * @author so1HugVuog
 */
public class employeeController {
    // lay ra toan bo employee -----> done
    public static List<employee> findAll() {
        List<employee> eplList = new ArrayList<>();
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            if (conn!=null) {
                System.out.println("ket noi thanh cong");
                String sql = "select * from nhanvien";
                PreparedStatement preparedStatement = conn.prepareCall(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    employee epl = new employee(rs.getInt("id"),rs.getString("taikhoan"), 
                        rs.getString("matkhau"), rs.getString("email"), rs.getString("sdt"), 
                        rs.getString("hoten"), rs.getString("chucvu"), 
                        rs.getString("namsinh"), rs.getString("diachi"));
                    eplList.add(epl);
                } 
            }
            conn.close();
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return eplList;
    }

    // check quanly

    public static boolean checktype(int id) {
        boolean ok = true;
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            if (conn!=null) {
                System.out.println("ket noi thanh cong");
                String sql = "select * from nhanvien where id=?";
                PreparedStatement preparedStatement = conn.prepareCall(sql);
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    if (rs.getString("chucvu").equals("quan ly")){
                        ok = true;
                    } else {
                        ok = false;
                    }
                }
            }
            conn.close();
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }    
        return ok;
    }
    
    // show 1 employee ----> done
    public static employee show(int id) {
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        employee epl = new employee();
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            if (conn!=null) {
                System.out.println("ket noi thanh cong");
                String sql = "select * from nhanvien where id=?";
                PreparedStatement preparedStatement = conn.prepareCall(sql);
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    epl = new employee(rs.getInt("id"),rs.getString("taikhoan"), 
                        rs.getString("matkhau"), rs.getString("email"), rs.getString("sdt"), 
                        rs.getString("hoten"), rs.getString("chucvu"), 
                        rs.getString("namsinh"), rs.getString("diachi"));
                } 
            }
            conn.close();
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return epl;
   }
    // them vao employee  -----> done
    public static void them(employee epl) {
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            if (conn!=null) {
                String sql = "insert into nhanvien (taikhoan,matkhau,hoten,sdt,chucvu,namsinh,diachi,email) values(?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStatement = conn.prepareCall(sql);
                preparedStatement.setString(1, epl.getUsername());
                preparedStatement.setString(2, epl.getPassword());
                preparedStatement.setString(3, epl.getHoten());
                preparedStatement.setString(4, epl.getPhonenumber());
                preparedStatement.setString(5, epl.getPosition());
                preparedStatement.setString(6, epl.getNamsinh());
                preparedStatement.setString(7, epl.getDiachi());
                preparedStatement.setString(8, epl.getEmail());
                preparedStatement.executeUpdate();
            }
            conn.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    // kiem tra email va taikhoan ---->done
    public static boolean checktk(String tk) {
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        boolean ok = false;
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            String sql = "select * from nhanvien where taikhoan=?";
            PreparedStatement preparedStatement = conn.prepareCall(sql);
            preparedStatement.setString(1, tk);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                ok=false;
            } else ok = true;
        } catch (Exception e) {
            //TODO: handle exception
        }
        return ok;
    }
    

    public static boolean checkemail(String email) {
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        boolean ok = false;
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            String sql = "select * from nhanvien where  email=?";
            PreparedStatement preparedStatement = conn.prepareCall(sql);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                ok=false;
            } else ok = true;
        } catch (Exception e) {
            //TODO: handle exception
        }
        return ok;
    }


    
    // capnhat employee ----> done
    public static void capnhat(employee epl) {
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            String sql = "update nhanvien set taikhoan=?, matkhau=?, hoten=?, sdt=?, chucvu=?, namsinh=?, diachi=?, email=? where id=?";
            PreparedStatement preparedStatement = conn.prepareCall(sql);
            preparedStatement.setString(1, epl.getUsername());
            preparedStatement.setString(2, epl.getPassword());
            preparedStatement.setString(3, epl.getHoten());
            preparedStatement.setString(4, epl.getPhonenumber());
            preparedStatement.setString(5, epl.getPosition());
            preparedStatement.setString(6, epl.getNamsinh());
            preparedStatement.setString(7, epl.getDiachi());
            preparedStatement.setString(8, epl.getEmail());
            preparedStatement.setInt(9, epl.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    //xoa employee -----> done
    public static void xoa(int id) {
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        try {
            Connection conn = DriverManager.getConnection(DBurl, username, password);
            String sql = "delete from nhanvien where id=?";
            PreparedStatement preparedStatement = conn.prepareCall(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }


    // tim kiem  employee ---> done
    public static List<employee> timkiemten(String ten) {
        List<employee> list = new ArrayList<>();
        String DBurl = "jdbc:mysql://localhost/qlcv";
        String username = "root";
        String password ="";
        try {
            Connection connection = DriverManager.getConnection(DBurl, username, password);
            String sql = "select * from nhanvien where hoten like ?";
            PreparedStatement preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, "%"+ten+"%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                employee epl = new employee(rs.getInt("id"),rs.getString("taikhoan"), 
                        rs.getString("matkhau"), rs.getString("email"), rs.getString("sdt"), 
                        rs.getString("hoten"), rs.getString("chucvu"), 
                        rs.getString("namsinh"), rs.getString("diachi"));
                    list.add(epl);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return list;
    }

    

}

