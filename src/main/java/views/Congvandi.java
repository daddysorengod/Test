/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VanDao2k
 */
public class Congvandi extends javax.swing.JFrame {

   DefaultTableModel tbn =  new DefaultTableModel();
    public Congvandi() {
        initComponents();
         loadcommoBoxBoPhan();
      loadcommoBoxLoaicongvan();
      loadData();
    }

    public void loadcommoBoxBoPhan(){
    try {
        connection a = new connection();
        Connection conn = a.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select tenbophan from bophan  ");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            cbbophan.addItem(rs.getString("tenbophan"));
            
            
        }
    } catch (Exception e) {
        System.out.println(e.toString());
    }
}public void loadcommoBoxLoaicongvan(){
    try {
        connection a = new connection();
        Connection conn = a.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select loaicongvan from loaicongvan group by loaicongvan");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            cbloaicongvan.addItem(rs.getString("loaicongvan"));
            
        }
    } catch (Exception e) {
        System.out.println(e.toString());
    }
}


public void loadData(){
    try {
        connection a = new connection();
        Connection conn = a.getConnection();
        int number;
        Vector row,column;
        column = new Vector();
        Statement st = conn.createStatement();
   
        ResultSet rs =st.executeQuery("select * from congvandi");
        ResultSetMetaData metaData =rs.getMetaData();
        number = metaData.getColumnCount();
       for(int i = 1;i <=number;i++){
           column.add(metaData.getColumnName(i));
          
       }
       tbn.setColumnIdentifiers(column);
       
       while(rs.next()){
           row = new Vector();
           for(int i = 1 ; i <=number;i++){
              row.addElement(rs.getString(i));
           }
           tbn.addRow(row);
           jTable1.setModel(tbn);
       }
       
   jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
          if(jTable1.getSelectedRow()>=0){
              txtcongvandi.setText(jTable1.getValueAt(jTable1.getSelectedRow(),0)+"");
                 txttencongvandi.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1)+"");
                 txttrichyeu.setText(jTable1.getValueAt(jTable1.getSelectedRow(),2)+"");                
              try {
                    DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
                  Date date =   new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(jTable1.getSelectedRow(),3)+"");
                 dategui.setDate(date);
              } catch (ParseException ex) {
                  Logger.getLogger(Congvanden.class.getName()).log(Level.SEVERE, null, ex);
              }
                     
              try {
                    DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
                  Date date =   new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(jTable1.getSelectedRow(),4)+"");
                 Dateky.setDate(date);
              } catch (ParseException ex) {
                  Logger.getLogger(Congvanden.class.getName()).log(Level.SEVERE, null, ex);
              }
     
              
                 txtnguoiky.setText(jTable1.getValueAt(jTable1.getSelectedRow(),5)+"");
                 cbloaicongvan.setSelectedItem(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),6)+"");
                 cbbophan.setSelectedItem(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),7)+"");
          }
            }
        });
    } catch (Exception ex) {
        System.out.println(ex.toString());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttencongvandi = new javax.swing.JTextField();
        txttrichyeu = new javax.swing.JTextField();
        txtcongvandi = new javax.swing.JTextField();
        dategui = new com.toedter.calendar.JDateChooser();
        Dateky = new com.toedter.calendar.JDateChooser();
        cbloaicongvan = new javax.swing.JComboBox<>();
        cbbophan = new javax.swing.JComboBox<>();
        txtnguoiky = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Số Công Văn Đi");

        jLabel2.setText("Trích Yếu");

        jLabel3.setText("Ngày Gửi");

        jLabel4.setText("Tên Công Văn Đi");

        jLabel5.setText("Ngày Ký");

        jLabel6.setText("Bộ Phận");

        jLabel7.setText("Người Ký ");

        jLabel8.setText("Loại Công Văn");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "đạo ngu", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("<");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttrichyeu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcongvandi, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttencongvandi, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem)
                                    .addComponent(dategui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Dateky, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbbophan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbloaicongvan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnguoiky))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnsua)
                                .addGap(73, 73, 73)
                                .addComponent(btnxoa))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Dateky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbloaicongvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbophan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(txtnguoiky)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcongvandi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttencongvandi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txttrichyeu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(dategui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
    
         try {
            connection a = new connection();
        Connection conn = a.getConnection();
        if(txtcongvandi.getText().equals("") || txttencongvandi.getText().toString().equals("")||
                txttrichyeu.getText().toString().equals("")|| dategui.getDate().equals("")||
                Dateky.getDate().equals("")|| txtnguoiky.getText().equals("")|| cbloaicongvan.getSelectedItem().equals("")||
                cbbophan.getSelectedItem().equals(""))
        {
            JOptionPane.showMessageDialog(this, "dien day du thong tin!!!");
        } else {
            PreparedStatement ps = conn.prepareStatement("insert into congvandi value(?,?,?,?,?,?,?,?)");
            ps.setString(1,txtcongvandi.getText().toString());
              ps.setString(2,txttencongvandi.getText().toString());
               ps.setString(3,txttrichyeu.getText().toString());
             SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
             String datenhan = sdf.format(dategui.getDate());
              String dateky = sdf.format(Dateky.getDate());
               ps.setString(4,datenhan);
                ps.setString(5,dateky);
                 ps.setString(6,txtnguoiky.getText().toString());
             ps.setString(7,cbloaicongvan.getSelectedItem().toString());
              ps.setString(8,cbbophan.getSelectedItem().toString());
                 ps.executeUpdate();

                      JOptionPane.showMessageDialog(this,"Thêm Thành Công");
                 tbn.setColumnCount(0);
                      loadData();
        }
        } catch (Exception e) {
            System.out.println(e.toString());
        }                 
        
        
        
        
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
       try{
        connection a = new connection();
        Connection conn = a.getConnection();
      PreparedStatement ps = conn.prepareStatement("Update congvandi set tencongvandi = ?,trichyeu = ?,ngaygui = ?,ngayky = ?,nguoiky=?,maloaicongvan=?,maloaibophan=? where socongvandi = ?");
      ps.setString(8,txtcongvandi.getText());
        ps.setString(1,txttencongvandi.getText());
          ps.setString(2,txttrichyeu.getText());
          SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
       String datenhan = sdf.format(dategui.getDate());
        String dateky = sdf.format(Dateky.getDate());
         ps.setString(3,datenhan);
          ps.setString(4,dateky);
              ps.setString(5,txtnguoiky.getText());
               ps.setString(6,cbloaicongvan.getSelectedItem().toString());
                ps.setString(7,cbbophan.getSelectedItem().toString());
            ps.executeUpdate();
       
                JOptionPane.showMessageDialog(this,"Sửa Thành Công ");
           tbn.setColumnCount(0);
                loadData();
           
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
    try {
               connection a = new connection();
        Connection conn = a.getConnection();
      PreparedStatement ps = conn.prepareStatement("delete from congvandi where socongvandi = ?");
      ps.setString(1,jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
      if(JOptionPane.showConfirmDialog(this,"Bạn có muốn hủy gửi công văn này ? "," Xác Nhận",
             JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ){
          ps.executeUpdate();
          tbn.setRowCount(0);
            loadData();
      }
    
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnxoaActionPerformed
    public static menuCV ViewMenuCV = new menuCV();
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        ViewMenuCV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Congvandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Congvandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Congvandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Congvandi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Congvandi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Dateky;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbophan;
    private javax.swing.JComboBox<String> cbloaicongvan;
    private com.toedter.calendar.JDateChooser dategui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcongvandi;
    private javax.swing.JTextField txtnguoiky;
    private javax.swing.JTextField txttencongvandi;
    private javax.swing.JTextField txttrichyeu;
    // End of variables declaration//GEN-END:variables
}
