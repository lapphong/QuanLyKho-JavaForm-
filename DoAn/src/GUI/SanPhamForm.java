/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.LoaiSPBUS;
import BUS.NCCBUS;
import BUS.SanPhamBUS;
import DTO.LoaiSP;
import DTO.NCC;
import DTO.SanPham;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author DELL
 */
public class SanPhamForm extends javax.swing.JDialog {
    DefaultTableModel model;
    SanPhamBUS bus;
    /**
     * Creates new form LoaiSPForm
     */
    private HomeForm home;
    public SanPhamForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home=(HomeForm) parent;
        bus=new SanPhamBUS();
        bus.DocSP();
        model =(DefaultTableModel)tbl.getModel();
        bus.showTable(model);
        loadMaLoai();
        loadMaNCC();
    }

    public void loadMaLoai(){
        DefaultComboBoxModel mdsp=new DefaultComboBoxModel();
        LoaiSPBUS bus=new LoaiSPBUS();
        bus.DocLoaiSP();
        for(LoaiSP sp: LoaiSPBUS.lssp)
            mdsp.addElement(sp.getMaloai());
        cmbMaLoaii.setModel(mdsp);
    }
    
    public void loadMaNCC(){
        DefaultComboBoxModel mdsp=new DefaultComboBoxModel();
        NCCBUS bus=new NCCBUS();
        bus.DocNCC();
        for(NCC sp: NCCBUS.lsk)
            mdsp.addElement(sp.getMaNCC());
        cmbmaNCC.setModel(mdsp);
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
        lbTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtTenSP = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTroLai = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnLoadDL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        cmbMaLoai = new javax.swing.JLabel();
        cmbMaLoaii = new javax.swing.JComboBox<>();
        cmbmaNCC = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 51, 51));
        lbTitle.setText("Sản Phẩm");
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mã Sản Phẩm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên Sản Phẩm");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Mã NCC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Mã loại");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Tìm kiếm");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 30));
        jPanel1.add(txtMaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 290, 30));
        jPanel1.add(txtTenSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 290, 30));

        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseClicked(evt);
            }
        });
        jPanel1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 290, 30));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 110, 30));

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 110, 30));

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modify.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 110, 30));

        btnTroLai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTroLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back.png"))); // NOI18N
        btnTroLai.setText("Trở lại");
        btnTroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroLaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnTroLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 30));

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Find.png"))); // NOI18N
        btnTimKiem.setText("Tìm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel1.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 110, 30));

        btnLoadDL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLoadDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Undo.png"))); // NOI18N
        btnLoadDL.setText("Load DL");
        btnLoadDL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDLActionPerformed(evt);
            }
        });
        jPanel1.add(btnLoadDL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, 30));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Mã NCC", "Mã Loai"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 560, 190));
        jPanel1.add(cmbMaLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));

        cmbMaLoaii.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMaLoaii, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 290, 30));

        cmbmaNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbmaNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroLaiActionPerformed
        this.dispose();
        home.setVisible(true);
    }//GEN-LAST:event_btnTroLaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        SanPham s=new SanPham();
        SanPhamBUS bus=new SanPhamBUS();
        boolean check=true;
        String b=txtMaSP.getText();
        if(!bus.KiemTraTrungMaSP(b)){
            check=false;
            JOptionPane.showMessageDialog(rootPane, "Trùng Mã SP rầu !!! Vui lòng nhập lại");
            txtMaSP.requestFocus();
        }
        s.setMaSP(b);
        s.setTenSP(txtTenSP.getText());
        s.setMaNCC(cmbmaNCC.getSelectedItem().toString());
        s.setMaLoai(cmbMaLoaii.getSelectedItem().toString());
        
        if(check==true){
            try {
                if(bus.ThemSP(s)==true){
                    bus.showResult(model);
                    JOptionPane.showMessageDialog(rootPane, "Thêm SP thành công!");
                    
                    txtMaSP.setText("");
                    txtTenSP.setText("");
                    txtMaSP.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(SanPham.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Thêm không thành cong ! Chắc là sai 1 chỗ gì đó rầu");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row=tbl.getSelectedRow();
        boolean check=true;
        if(row == -1){
            JOptionPane.showMessageDialog(rootPane, "Chọn dòng để sủa");
            check=false;
        }
        if(check==true){
            SanPham std = bus.lssp.get(row);
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa ?", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    bus.xoavitrids(row);
                    bus.XoaSP(std);
                    txtMaSP.setText("");
                    txtMaSP.setEnabled(true);
                    txtTenSP.setText("");
                    txtMaSP.requestFocus();
                } catch (SQLException ex) {
                    Logger.getLogger(SanPham.class.getName()).log(Level.SEVERE, null, ex);
                }
                model.removeRow(row);
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Lần sau nghĩ kỹ r hãy ấn nha mạy !!!");
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        SanPham s=new SanPham();
        int row=tbl.getSelectedRow();
        boolean check=true;
        if(row == -1){
            JOptionPane.showMessageDialog(rootPane, "Chọn dòng để sủa");
            check=false;
        }
        
        if(check==true){
            boolean check1=true;
            s.setMaSP(txtMaSP.getText());
            s.setTenSP(txtTenSP.getText());
            s.setMaNCC(cmbmaNCC.getSelectedItem().toString());
            s.setMaLoai(cmbMaLoaii.getSelectedItem().toString());
            
            if(check1==true){
                try {
                    if(bus.SuaSP(s)==true){
                        model.setRowCount(0);
                        bus.DocSP();
                        bus.showTable(model);
                        txtMaSP.setText("");
                        txtMaSP.setEnabled(true);
                        txtTenSP.setText("");
                        txtMaSP.requestFocus();
                    }
                }catch(SQLException ex){
                    Logger.getLogger(SanPham.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, "Edit thất bại");
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String b=txtTimKiem.getText();
        boolean check=false;
        for(int i=0;i<bus.lssp.size();i++){
            if(bus.lssp.get(i).getMaSP().toLowerCase().equals(b.toLowerCase())){
                check=true;
                model.setRowCount(0);
                model.addRow(new Object[]{
                    bus.lssp.get(i).getMaSP(), bus.lssp.get(i).getTenSP(),bus.lssp.get(i).getMaNCC(),bus.lssp.get(i).getMaLoai()
                });
                break;
            }
            else if(bus.lssp.get(i).getTenSP().toLowerCase().equals(b.toLowerCase())){
                check=true;
                model.setRowCount(0);
                model.addRow(new Object[]{
                    bus.lssp.get(i).getMaSP(), bus.lssp.get(i).getTenSP(),bus.lssp.get(i).getMaNCC(),bus.lssp.get(i).getMaLoai()
                });
                break;
            }
        }
        if(check==false){
            JOptionPane.showMessageDialog(rootPane, "Không có MãSP hay TênSP trong bảng nhóe !");
            model.setRowCount(0);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        int row=tbl.getSelectedRow();
        txtMaSP.setText(tbl.getModel().getValueAt(row, 0).toString());
        txtMaSP.setEnabled(false);
        txtTenSP.setText(tbl.getModel().getValueAt(row, 1).toString());
        cmbmaNCC.setSelectedItem(tbl.getModel().getValueAt(row, 2).toString());
        cmbMaLoaii.setSelectedItem(tbl.getModel().getValueAt(row, 3).toString());
    }//GEN-LAST:event_tblMouseClicked

    private void btnLoadDLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDLActionPerformed
        model.setRowCount(0);
        bus.showTable(model);
        txtTimKiem.setText("");
    }//GEN-LAST:event_btnLoadDLActionPerformed

    private void txtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseClicked

        txtMaSP.setText("");
        txtTenSP.setText("");
        txtMaSP.setEnabled(true);
    }//GEN-LAST:event_txtTimKiemMouseClicked

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
            java.util.logging.Logger.getLogger(SanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SanPhamForm dialog = new SanPhamForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadDL;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTroLai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel cmbMaLoai;
    private javax.swing.JComboBox<String> cmbMaLoaii;
    private javax.swing.JComboBox<String> cmbmaNCC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}