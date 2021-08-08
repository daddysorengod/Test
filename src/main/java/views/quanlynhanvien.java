/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.employeeController;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputListener;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.Driver;
import java.awt.event.ActionEvent;

import models.employee;

/**
 *
 * @author so1HugVuog
 */
public class quanlynhanvien extends javax.swing.JFrame {

    /**
     * Creates new form quanlynhanvien
     */
    List<employee> listnv = new ArrayList<>();
    DefaultTableModel tableModel;
    public quanlynhanvien() {
        initComponents();   
        tableModel = (DefaultTableModel) tblnhanvien.getModel();
        showEmployee();
        tblnhanvien.addMouseListener(new MouseInputListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                int index = tblnhanvien.getSelectedRow();
                if (index >= 0) {
                    employee epl =  listnv.get(index);
                    txthoten.setText(epl.getHoten());
                    cbvitri.setSelectedItem(epl.getPosition());
                    txttaikhoan.setText(epl.getUsername());
                    pfmatkhau.setText(epl.getPassword());
                    txtemail.setText(epl.getEmail());
                    txtsdt.setText(epl.getPhonenumber());
                    txtnamsinh.setText(epl.getNamsinh());
                    txtdiachi.setText(epl.getDiachi());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
    
    }
    
    private void showEmployee(){
        listnv = employeeController.findAll();
        tableModel.setRowCount(0);
        
            for (employee epl : listnv) {
                tableModel.addRow(new Object[]{
                    tableModel.getRowCount() + 1, epl.getHoten(), 
                    epl.getUsername(), epl.getPosition(), epl.getEmail(),
                    epl.getPhonenumber(), epl.getNamsinh(), epl.getDiachi()
                });
            }
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        txttaikhoan = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtnamsinh = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btncapnhat = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        pfmatkhau = new javax.swing.JPasswordField();
        cbvitri = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnhanvien = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("quản lý nhân viên"));

        txttimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("họ tên");

        jLabel2.setText("tài khoản");

        jLabel3.setText("email");

        jLabel4.setText("năm sinh");

        jLabel5.setText("vị trí");

        jLabel6.setText("mật khẩu");

        jLabel7.setText("sđt");

        jLabel8.setText("địa chỉ");

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane2.setViewportView(txtdiachi);

        btncapnhat.setText("cập nhật");
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });

        btnxoa.setText("xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnreset.setText("reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnthem.setText("them");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btncapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbvitri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "quan ly", "nhan vien" }));
        cbvitri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbvitriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(159, 159, 159)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pfmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbvitri, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbvitri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "họ tên", "tài khoản", "vị trí", "email", "sđt", "năm sinh", "địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblnhanvien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:

        int selectIndex = tblnhanvien.getSelectedRow();
        // System.out.println("1:"+selectIndex);
        if (selectIndex >= 0) {
            employee epl = listnv.get(selectIndex);
            // System.out.println("2:"+epl.getId());
            int option = JOptionPane.showConfirmDialog(this, "ban co muon xoa?");
            
            if (option==0) {
                employeeController.xoa(epl.getId());
                showEmployee();
            }
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txthoten.setText("");
        cbvitri.setSelectedIndex(1);
        txttaikhoan.setText("");
        pfmatkhau.setText("");
        txtemail.setText("");
        txtsdt.setText("");
        txtnamsinh.setText("");
        txtdiachi.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed
        // TODO add your handling code here:
        int index = tblnhanvien.getSelectedRow();
        if (index>=0) {
            employee epl = listnv.get(index);
            System.out.println(epl);
            System.out.println(epl.getId());
            System.out.println("=====================================================");
            epl.setHoten(txthoten.getText());
            epl.setPosition(cbvitri.getSelectedItem().toString());
            epl.setUsername(txttaikhoan.getText());
            epl.setPassword(pfmatkhau.getText());
            epl.setEmail(txtemail.getText());
            epl.setPhonenumber(txtsdt.getText());
            epl.setNamsinh(txtnamsinh.getText());
            epl.setDiachi(txtdiachi.getText());

            System.out.println(epl);
            System.out.println(epl.getId());
            System.out.println("=====================================================");
            int option = JOptionPane.showConfirmDialog(this, "ban co chac muon sua?");
            if (option==0) {
                System.out.println(epl);
                System.out.println(epl.getId());
                employeeController.capnhat(epl);
                showEmployee();
            }
            
        }

    }//GEN-LAST:event_btncapnhatActionPerformed
public static int dataid;
 public static menuQuanly ViewQuanly = new menuQuanly(dataid);
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        ViewQuanly.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
            String ht = txthoten.getText();
            String vt = cbvitri.getSelectedItem().toString();
            String tk = txttaikhoan.getText();
            String mk = pfmatkhau.getText();
            String em = txtemail.getText();
            String st = txtsdt.getText();
            String ns = txtnamsinh.getText();
            String dc = txtdiachi.getText();

            employee epl = new employee(tk,mk,em,st,ht,vt,ns,dc);
            System.out.println(epl);
            employeeController.them(epl);
            // System.out.print("da them nhan vien");
            showEmployee();
    }//GEN-LAST:event_btnthemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String key = txttimkiem.getText();
        if (key!=null) {
            listnv = employeeController.timkiemten(key);
            tableModel.setRowCount(0);

            for (employee epl : listnv) {
                tableModel.addRow(new Object[]{
                    tableModel.getRowCount() + 1, epl.getHoten(), 
                    epl.getUsername(), epl.getPosition(), epl.getEmail(),
                    epl.getPhonenumber(), epl.getNamsinh(), epl.getDiachi()
                });
            }
        } else {
            showEmployee();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbvitriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbvitriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbvitriActionPerformed

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
            java.util.logging.Logger.getLogger(quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanlynhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhat;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbvitri;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField pfmatkhau;
    private javax.swing.JTable tblnhanvien;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtnamsinh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttaikhoan;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
