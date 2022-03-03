/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Toàn
 */
public class Bao extends TaiLieu{
    private int ngayPhatHanh;
    private int thangPhatHanh;

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
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
    
   
    
}
