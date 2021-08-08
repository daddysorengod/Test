/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VanDao2k
 */
public class connection {
 public Connection getConnection() throws SQLException {
     Connection conn = null;
      try {
          // TODO code application logic here
          Class.forName("com.mysql.cj.jdbc.Driver");
         String DB_URL = "jdbc:mysql://localhost:3306/qlcv";
          String user = "root";
          String password = "";
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlcv","root","");
          System.out.println("Kêt Nối Với Database Thành Công");
      } catch (ClassNotFoundException ex) {
          System.out.println("Lỗi Kết Nối");
          ex.printStackTrace();
      }
     return conn;
    }
}
