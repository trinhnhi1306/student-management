/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Student;

/**
 *
 * @author HP
 */
public class MainFrame extends javax.swing.JFrame {
    
    private List<Student> list;
    private DefaultTableModel model;

    /**
     * Creates new form MainForm
     */
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        list = new ArrayList<>();
        initData();
        model = (DefaultTableModel) jTable_Student.getModel();
        fillToTable();
    }
    
    public void initData() {
        list.add(new Student("Nguyễn Văn A", 7, "Công nghệ thông tin"));
        list.add(new Student("Nguyễn Văn B", 8, "Công nghệ thông tin"));
        list.add(new Student("Nguyễn Văn C", 9, "Công nghệ thông tin"));
        list.add(new Student("Nguyễn Văn D", 10, "Công nghệ thông tin"));
    }
    
    public void addStudent() {
        
    }
    
    public void removeStudent() {
        
    }
    
    public void updateStudent() {
        int index = jTable_Student.getSelectedRow();
        Student sv = list.get(index);
        
        sv.name = jTextField_HooVaTen.getText();
        sv.marks =Double.parseDouble(jTextField_Diem.getText());
        sv.major = jComboBox_Nganh.getSelectedItem().toString();
    }
    
    public void fillToTable() {
        model.setRowCount(0);
        
        for (Student sv : list) {
            Object[] row = new Object[]{sv.name, sv.marks, sv.major, sv.getGrade(), sv.isBonus()};
            model.addRow(row);
        }
    }
    
    public void showDetail() {
        int index = jTable_Student.getSelectedRow();
        Student sv = list.get(index);
        
        jTextField_HooVaTen.setText(sv.name);
        jTextField_Diem.setText(String.valueOf(sv.marks));
        jComboBox_Nganh.setSelectedItem(sv.major);
        jTextField_HocLuc.setText(sv.getGrade());
        jCheckBox_Thuong.setSelected(sv.isBonus());
    }
    
    public void orderByName() {
        
    }

    public void orderByMarks() {
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_HooVaTen = new javax.swing.JTextField();
        jTextField_Diem = new javax.swing.JTextField();
        jComboBox_Nganh = new javax.swing.JComboBox<>();
        jTextField_HocLuc = new javax.swing.JTextField();
        jButton_Them = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jButton_CapNhat = new javax.swing.JButton();
        jButton_NhapMoi = new javax.swing.JButton();
        jCheckBox_Thuong = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Student = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý sinh viên");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(new java.awt.GridLayout(4, 1, 0, 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("HỌ VÀ TÊN");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ĐIỂM");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("NGÀNH");
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("HỌC LỰC");
        jPanel2.add(jLabel5);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jTextField_HooVaTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_Diem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jComboBox_Nganh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_Nganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ứng dụng phần mềm", "Công nghệ thông tin", "Công nghệ phần mềm", "Quản trị kinh doanh", "Kế toán", "An toàn thông tin" }));

        jTextField_HocLuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_Them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Them.setText("THÊM");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_Xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Xoa.setText("XOÁ");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });

        jButton_CapNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_CapNhat.setText("CẬP NHẬT");
        jButton_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CapNhatActionPerformed(evt);
            }
        });

        jButton_NhapMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_NhapMoi.setText("NHẬP MỚI");
        jButton_NhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NhapMoiActionPerformed(evt);
            }
        });

        jCheckBox_Thuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_Thuong.setText("Có phần thưởng?");

        jTable_Student.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HỌ VÀ TÊN", "ĐIỂM", "NGÀNH", "HỌC LỰC", "THƯỞNG"
            }
        ));
        jTable_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_StudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Student);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_HooVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Diem, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_HocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Them)
                                .addGap(42, 42, 42)
                                .addComponent(jButton_Xoa)
                                .addGap(52, 52, 52)
                                .addComponent(jButton_CapNhat)
                                .addGap(28, 28, 28)
                                .addComponent(jButton_NhapMoi))
                            .addComponent(jCheckBox_Thuong)
                            .addComponent(jComboBox_Nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_HooVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Diem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_HocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Thuong)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Them)
                    .addComponent(jButton_NhapMoi)
                    .addComponent(jButton_CapNhat)
                    .addComponent(jButton_Xoa))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        // TODO add your handling code here:
        addStudent();
        fillToTable();
    }//GEN-LAST:event_jButton_ThemActionPerformed

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        // TODO add your handling code here:
        removeStudent();
        fillToTable();
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jButton_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CapNhatActionPerformed
        // TODO add your handling code here:
        updateStudent();
        fillToTable();
    }//GEN-LAST:event_jButton_CapNhatActionPerformed

    private void jButton_NhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NhapMoiActionPerformed
        // TODO add your handling code here:
        jTextField_HooVaTen.setText("");
        jTextField_Diem.setText("");
        jComboBox_Nganh.setSelectedItem(null);
        jTextField_HocLuc.setText("");
        jCheckBox_Thuong.setSelected(false);
    }//GEN-LAST:event_jButton_NhapMoiActionPerformed

    private void jTable_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_StudentMouseClicked
        // TODO add your handling code here:
        showDetail();
    }//GEN-LAST:event_jTable_StudentMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CapNhat;
    private javax.swing.JButton jButton_NhapMoi;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JCheckBox jCheckBox_Thuong;
    private javax.swing.JComboBox<String> jComboBox_Nganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Student;
    private javax.swing.JTextField jTextField_Diem;
    private javax.swing.JTextField jTextField_HocLuc;
    private javax.swing.JTextField jTextField_HooVaTen;
    // End of variables declaration//GEN-END:variables
}
