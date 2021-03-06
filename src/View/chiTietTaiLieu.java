/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Bao;
import Model.Sach;
import Model.TaiLieu;
import Model.TapChi;
import Service.TaiLieuService;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Toàn
 */
public class chiTietTaiLieu extends javax.swing.JFrame {

    /**
     * Creates new form chiTietTaiLieu
     */
    private TaiLieuService taiLieuService;
    private TaiLieu taiLieu;
    private Sach sach;
    private TapChi tapChi;
    private Bao bao;

    public chiTietTaiLieu(int i) {
        initComponents();

        taiLieuService = new TaiLieuService();
        taiLieu = taiLieuService.getTaiLieu(i);
        editEndBT.setVisible(false);
        setLoaiTaiLieu();
        editSoPhatHanh.setModel(new SpinnerNumberModel(1, 1, 100, 1));
        editLoai.setSelectedItem(taiLieu.getLoaiTaiLieu());
        editNXB.setText(taiLieu.getTenNhaXuatBan());
        editSoLg.setValue(taiLieu.getSoBanPhatHanh());
        setNgayPhatHanh(Integer.valueOf(editThang.getSelectedItem().toString()));
        setNgayPhatHanh();
        if (taiLieu.getLoaiTaiLieu().equals("Sách")) {
            sach = taiLieuService.getSach(i);

            setSach(sach);

        } else if (taiLieu.getLoaiTaiLieu().equals("Tạp Chí")) {
            tapChi = taiLieuService.getTapChi(i);
            setTapChi(tapChi);

        } else {

            bao = taiLieuService.getBao(i);
            setBao(bao);
        }
    }

    private void setNgayPhatHanh() {

        editNgay.removeAllItems();
        for (int i = 1; i <= 31; i++) {
            editNgay.addItem(String.valueOf(i));
        }
    }

    private void setNgayPhatHanh(int a) {

        editNgay.removeAllItems();
        for (int i = 1; i <= taiLieuService.getDate(a); i++) {
            editNgay.addItem(String.valueOf(i));
        }
    }

    private void setLoaiTaiLieu() {
        for (String theLoai : taiLieuService.getTheLoai()) {
            editLoai.addItem(theLoai);
        }
    }

    public void setSach(Sach sach) {
        editSoPhatHanh.setVisible(false);
        editSoPhatHanhField.setVisible(false);
        editThang.setVisible(false);
        edithangField.setVisible(false);

        editNgay.setVisible(false);
        editNgayField.setVisible(false);

        editTenTacGia.setText(sach.getTenTacGia());
        editSoTrang.setValue(sach.getSoTrang());

    }

    public void setTapChi(TapChi tapChi) {
        editTenTacGia.setVisible(false);
        editTenTacGiafield.setVisible(false);
        editSoTrang.setVisible(false);
        editSoTrangField.setVisible(false);

        editNgay.setVisible(false);
        editNgayField.setVisible(false);

        editSoPhatHanh.setValue(tapChi.getSoPhatHanh());

        editThang.setSelectedItem(String.valueOf(tapChi.getThangPhatHanh()));

    }

    public void setBao(Bao bao) {
        editTenTacGia.setVisible(false);
        editTenTacGiafield.setVisible(false);
        editSoTrang.setVisible(false);
        editSoTrangField.setVisible(false);

        editSoPhatHanh.setVisible(false);
        editSoPhatHanhField.setVisible(false);

        editThang.setSelectedItem(String.valueOf(bao.getThangPhatHanh()));
        editNgay.setSelectedItem(String.valueOf(bao.getNgayPhatHanh()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        backBT = new javax.swing.JButton();
        editLoaiFiled = new javax.swing.JLabel();
        editNXBFiled = new javax.swing.JLabel();
        editSoLgFiled = new javax.swing.JLabel();
        editTenTacGiafield = new javax.swing.JLabel();
        editSoTrangField = new javax.swing.JLabel();
        editSoPhatHanhField = new javax.swing.JLabel();
        edithangField = new javax.swing.JLabel();
        editNgayField = new javax.swing.JLabel();
        editLoai = new javax.swing.JComboBox<>();
        editNXB = new javax.swing.JTextField();
        editSoLg = new javax.swing.JSpinner();
        editTenTacGia = new javax.swing.JTextField();
        editSoTrang = new javax.swing.JSpinner();
        editSoPhatHanh = new javax.swing.JSpinner();
        editThang = new javax.swing.JComboBox<>();
        editNgay = new javax.swing.JComboBox<>();
        editBT = new javax.swing.JButton();
        editEndBT = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chi Tiết Tài Liệu");

        backBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBT.setText("TRỜ VỀ");
        backBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTActionPerformed(evt);
            }
        });

        editLoaiFiled.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editLoaiFiled.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editLoaiFiled.setText("Loại tài liệu :");

        editNXBFiled.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editNXBFiled.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editNXBFiled.setText("Tên NXB :");

        editSoLgFiled.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editSoLgFiled.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editSoLgFiled.setText("Số bản phát hành :");

        editTenTacGiafield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editTenTacGiafield.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editTenTacGiafield.setText("Tên Tác Già :");

        editSoTrangField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editSoTrangField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editSoTrangField.setText("Số trang :");

        editSoPhatHanhField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editSoPhatHanhField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editSoPhatHanhField.setText("Số phát hành :");

        edithangField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edithangField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edithangField.setText("Tháng phát hành :");

        editNgayField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editNgayField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        editNgayField.setText("Ngày phát hành :");

        editLoai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editLoai.setEnabled(false);
        editLoai.setName("1\n2\n3"); // NOI18N
        editLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLoaiActionPerformed(evt);
            }
        });

        editNXB.setEditable(false);
        editNXB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        editSoLg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editSoLg.setEnabled(false);

        editTenTacGia.setEditable(false);
        editTenTacGia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        editSoTrang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editSoTrang.setEnabled(false);

        editSoPhatHanh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editSoPhatHanh.setEnabled(false);

        editThang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        editThang.setEnabled(false);

        editNgay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        editNgay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editNgay.setEnabled(false);
        editNgay.setFocusable(false);

        editBT.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        editBT.setText("SỬA");
        editBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTActionPerformed(evt);
            }
        });

        editEndBT.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        editEndBT.setText("XONG");
        editEndBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEndBTActionPerformed(evt);
            }
        });

        jButton3.setText("Thoát");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editSoPhatHanhField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(editSoTrangField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editTenTacGiafield, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editLoaiFiled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editNXBFiled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editSoLgFiled, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edithangField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editNgayField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editSoLg, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editSoPhatHanh, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editThang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editNXB)
                            .addComponent(editTenTacGia)
                            .addComponent(editNgay, 0, 172, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editEndBT, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(editBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editLoaiFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNXBFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSoLgFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSoLg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editTenTacGiafield, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editTenTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSoTrangField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSoPhatHanhField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSoPhatHanh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edithangField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editThang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editNgayField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(editEndBT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTActionPerformed
        // TODO add your handling code here:
        new DsTaiLieu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBTActionPerformed

    private void editLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editLoaiActionPerformed

    private void editBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTActionPerformed
        // TODO add your handling code here:
        //Sửa đây
        editBT.setVisible(false);
        editEndBT.setVisible(true);

        editSoLg.setEnabled(true);
        editSoTrang.setEnabled(true);
        editSoPhatHanh.setEnabled(true);

        editNXB.setEditable(true);
        editTenTacGia.setEditable(true);
        editThang.setEnabled(true);
        editNgay.setEnabled(true);

        setNgayPhatHanh(Integer.valueOf(editThang.getSelectedItem().toString()));
    }//GEN-LAST:event_editBTActionPerformed

    private void editEndBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEndBTActionPerformed
        // TODO add your handling code here:

        int confirm = JOptionPane.showConfirmDialog(chiTietTaiLieu.this, " Bạn chắc chắn muốn Sửa ");
        if (confirm == JOptionPane.YES_OPTION) {
            int check;

            switch (taiLieu.getLoaiTaiLieu()) {
                case "Sách": {

                    check = editTaiLieu(sach);
                    break;
                }

                case "Tạp Chí": {
                    check = editTaiLieu(tapChi);
                    break;
                }

                case "Báo": {
                    check = editTaiLieu(bao);
                    break;
                }

                default:
                    check = 0;
                    break;
            }

            if (check == 0) {
                JOptionPane.showMessageDialog(this, "Sửa thất bại! Vui lòng thử lại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                new DsTaiLieu().setVisible(true);
                this.dispose();
            }
        }


    }//GEN-LAST:event_editEndBTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    private int editTaiLieu(Sach sach1) {
        Sach sachEdit = new Sach();

        sachEdit.setMaTaiLieu(taiLieu.getMaTaiLieu());
        sachEdit.setLoaiTaiLieu(taiLieu.getLoaiTaiLieu());

        sachEdit.setTenNhaXuatBan(editNXB.getText());
        sachEdit.setSoBanPhatHanh(Integer.valueOf(editSoLg.getValue().toString()));

        sachEdit.setSoTrang(Integer.valueOf(editSoTrang.getValue().toString()));
        sachEdit.setTenTacGia(editTenTacGia.getText());

        return taiLieuService.editTaiLieu(sachEdit);

    }

    private int editTaiLieu(TapChi tapChi1) {
        TapChi tapChiEdit = new TapChi();

        tapChiEdit.setMaTaiLieu(taiLieu.getMaTaiLieu());
        tapChiEdit.setLoaiTaiLieu(taiLieu.getLoaiTaiLieu());

        tapChiEdit.setTenNhaXuatBan(editNXB.getText());
        tapChiEdit.setSoBanPhatHanh(Integer.valueOf(editSoLg.getValue().toString()));

        tapChiEdit.setSoPhatHanh(Integer.valueOf(editSoPhatHanh.getValue().toString()));
        tapChiEdit.setThangPhatHanh(Integer.valueOf(editThang.getSelectedItem().toString()));
        return taiLieuService.editTaiLieu(tapChiEdit);
    }

    private int editTaiLieu(Bao bao1) {
        Bao baoEdit = new Bao();

        baoEdit.setMaTaiLieu(taiLieu.getMaTaiLieu());
        baoEdit.setLoaiTaiLieu(taiLieu.getLoaiTaiLieu());

        baoEdit.setTenNhaXuatBan(editNXB.getText());
        baoEdit.setSoBanPhatHanh(Integer.valueOf(editSoLg.getValue().toString()));

        baoEdit.setThangPhatHanh(Integer.valueOf(editThang.getSelectedItem().toString()));
        baoEdit.setNgayPhatHanh(Integer.valueOf(editNgay.getSelectedItem().toString()));

        return taiLieuService.editTaiLieu(baoEdit);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBT;
    private javax.swing.JButton editBT;
    private javax.swing.JButton editEndBT;
    private javax.swing.JComboBox<String> editLoai;
    private javax.swing.JLabel editLoaiFiled;
    private javax.swing.JTextField editNXB;
    private javax.swing.JLabel editNXBFiled;
    private javax.swing.JComboBox<String> editNgay;
    private javax.swing.JLabel editNgayField;
    private javax.swing.JSpinner editSoLg;
    private javax.swing.JLabel editSoLgFiled;
    private javax.swing.JSpinner editSoPhatHanh;
    private javax.swing.JLabel editSoPhatHanhField;
    private javax.swing.JSpinner editSoTrang;
    private javax.swing.JLabel editSoTrangField;
    private javax.swing.JTextField editTenTacGia;
    private javax.swing.JLabel editTenTacGiafield;
    private javax.swing.JComboBox<String> editThang;
    private javax.swing.JLabel edithangField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
