package com.ghtd.view;

import com.ghtd.controller.AddDonHangControllerKhachHang;

/**
 *
 * @author Asus
 */
public class OrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderJPanel
     */
    public OrderJPanel() {
        initComponents();
        AddDonHangControllerKhachHang addDonHangController = new AddDonHangControllerKhachHang(canNang, datDonButton, diaChiGui, diaChiNhan, giaTien, loaiSanPham, tenSanPham, CCCD, tenNguoiNhan, soDienThoai);
        addDonHangController.addDonHang();
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
        datDonButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        diaChiGui = new javax.swing.JTextField();
        lbDiaChiGui = new javax.swing.JLabel();
        lbLoaiSP = new javax.swing.JLabel();
        loaiSanPham = new javax.swing.JTextField();
        tenSanPham = new javax.swing.JTextField();
        lbTenSP = new javax.swing.JLabel();
        lbDiaChiNhan = new javax.swing.JLabel();
        diaChiNhan = new javax.swing.JTextField();
        giaTien = new javax.swing.JTextField();
        lbGiaTien = new javax.swing.JLabel();
        canNang = new javax.swing.JTextField();
        lbCanNang = new javax.swing.JLabel();
        lbYeuCauDacBiet = new javax.swing.JLabel();
        lbYeuCauDacBiet1 = new javax.swing.JLabel();
        tenNguoiNhan = new javax.swing.JTextField();
        lbYeuCauDacBiet2 = new javax.swing.JLabel();
        soDienThoai = new javax.swing.JTextField();
        lbYeuCauDacBiet3 = new javax.swing.JLabel();
        CCCD = new javax.swing.JTextField();
        jScrollPaneText = new javax.swing.JScrollPane();
        yeuCauDacBiet = new javax.swing.JTextArea();

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(956, 670));

        datDonButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        datDonButton.setText("Đặt đơn");
        datDonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datDonButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Form đặt đơn giao");

        diaChiGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaChiGuiActionPerformed(evt);
            }
        });

        lbDiaChiGui.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbDiaChiGui.setText("Địa chỉ gửi");

        lbLoaiSP.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbLoaiSP.setText("Loại sản phẩm");

        loaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaiSanPhamActionPerformed(evt);
            }
        });

        tenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenSanPhamActionPerformed(evt);
            }
        });

        lbTenSP.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbTenSP.setText("Tên sản phẩm");

        lbDiaChiNhan.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbDiaChiNhan.setText("Địa chỉ nhận");

        diaChiNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaChiNhanActionPerformed(evt);
            }
        });

        giaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaTienActionPerformed(evt);
            }
        });

        lbGiaTien.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbGiaTien.setText("Giá tiền");

        canNang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canNangActionPerformed(evt);
            }
        });

        lbCanNang.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbCanNang.setText("Cân nặng");

        lbYeuCauDacBiet.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbYeuCauDacBiet.setText("Yêu cầu đặc biệt");

        lbYeuCauDacBiet1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbYeuCauDacBiet1.setText("Tên người nhận");

        tenNguoiNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenNguoiNhanActionPerformed(evt);
            }
        });

        lbYeuCauDacBiet2.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbYeuCauDacBiet2.setText("Số điện thoại");

        soDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soDienThoaiActionPerformed(evt);
            }
        });

        lbYeuCauDacBiet3.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        lbYeuCauDacBiet3.setText("CCCD người nhận");

        CCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCCDActionPerformed(evt);
            }
        });

        yeuCauDacBiet.setColumns(20);
        yeuCauDacBiet.setRows(5);
        jScrollPaneText.setViewportView(yeuCauDacBiet);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(datDonButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbYeuCauDacBiet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneText))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbDiaChiGui)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(diaChiGui, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbLoaiSP)
                                        .addGap(32, 32, 32)
                                        .addComponent(loaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbTenSP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tenNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbDiaChiNhan)
                                        .addGap(43, 43, 43)
                                        .addComponent(diaChiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbGiaTien)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(giaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbCanNang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(canNang, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbYeuCauDacBiet1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbYeuCauDacBiet3))
                                    .addComponent(lbYeuCauDacBiet2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaChiGui, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiaChiGui)
                    .addComponent(diaChiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiaChiNhan))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLoaiSP)
                    .addComponent(giaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGiaTien))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenSP)
                    .addComponent(canNang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCanNang))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbYeuCauDacBiet)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPaneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbYeuCauDacBiet1)
                    .addComponent(tenNguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbYeuCauDacBiet3)
                    .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbYeuCauDacBiet2)
                    .addComponent(soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(datDonButton)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void datDonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datDonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datDonButtonActionPerformed

    private void diaChiGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaChiGuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaChiGuiActionPerformed

    private void loaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaiSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loaiSanPhamActionPerformed

    private void tenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenSanPhamActionPerformed

    private void diaChiNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaChiNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaChiNhanActionPerformed

    private void giaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giaTienActionPerformed

    private void canNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canNangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canNangActionPerformed

    private void tenNguoiNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenNguoiNhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenNguoiNhanActionPerformed

    private void soDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soDienThoaiActionPerformed

    private void CCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCCDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCD;
    private javax.swing.JTextField canNang;
    private javax.swing.JButton datDonButton;
    private javax.swing.JTextField diaChiGui;
    private javax.swing.JTextField diaChiNhan;
    private javax.swing.JTextField giaTien;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneText;
    private javax.swing.JLabel lbCanNang;
    private javax.swing.JLabel lbDiaChiGui;
    private javax.swing.JLabel lbDiaChiNhan;
    private javax.swing.JLabel lbGiaTien;
    private javax.swing.JLabel lbLoaiSP;
    private javax.swing.JLabel lbTenSP;
    private javax.swing.JLabel lbYeuCauDacBiet;
    private javax.swing.JLabel lbYeuCauDacBiet1;
    private javax.swing.JLabel lbYeuCauDacBiet2;
    private javax.swing.JLabel lbYeuCauDacBiet3;
    private javax.swing.JTextField loaiSanPham;
    private javax.swing.JTextField soDienThoai;
    private javax.swing.JTextField tenNguoiNhan;
    private javax.swing.JTextField tenSanPham;
    private javax.swing.JTextArea yeuCauDacBiet;
    // End of variables declaration//GEN-END:variables
}
