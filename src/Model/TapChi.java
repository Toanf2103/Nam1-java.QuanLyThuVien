/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Toàn
 */
public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

   

    @Override
    public void setMaTaiLieu(int maTaiLieu) {
        super.setMaTaiLieu(maTaiLieu); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSoBanPhatHanh(int soBanPhatHanh) {
        super.setSoBanPhatHanh(soBanPhatHanh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        super.setTenNhaXuatBan(tenNhaXuatBan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaTaiLieu() {
        return super.getMaTaiLieu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSoBanPhatHanh() {
        return super.getSoBanPhatHanh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTenNhaXuatBan() {
        return super.getTenNhaXuatBan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLoaiTaiLieu() {
        return super.getLoaiTaiLieu(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLoaiTaiLieu(String loaiTaiLieu) {
        super.setLoaiTaiLieu(loaiTaiLieu); //To change body of generated methods, choose Tools | Templates.
    }

    
}
