/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author Toàn
 */
import Model.Bao;
import Model.Sach;
import Model.TaiLieu;
import Model.TapChi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class TaiLieuDao {

    //lấy tất cả trong thư viện
    public List<TaiLieu> getAllTaiLieu() {
        List<TaiLieu> taiLieus = new ArrayList<TaiLieu>();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM tailieu";

        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TaiLieu taiLieu = new TaiLieu();
                taiLieu.setMaTaiLieu(rs.getInt("maTaiLieu"));
                taiLieu.setTenNhaXuatBan(rs.getString("tenNXB"));
                taiLieu.setSoBanPhatHanh(rs.getInt("soBanPhatHanh"));
                taiLieu.setLoaiTaiLieu(rs.getString("loaiTaiLieu"));
                taiLieus.add(taiLieu);
            }
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return taiLieus;
    }

    //lấy tên thể loại
    public List<String> getTheLoai() {
        List<String> tenTheLoai = new ArrayList<String>();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT DISTINCT loaiTaiLieu FROM tailieu";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String theLoai2;
                theLoai2 = rs.getString("loaiTaiLieu");
                tenTheLoai.add(theLoai2);

            }
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tenTheLoai;
    }

    //lấy theo tên tài liệu
    public List<TaiLieu> getAllTaiLieuTheoTen(String tenTaiLieu) {
        List<TaiLieu> taiLieus = new ArrayList<TaiLieu>();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM tailieu WHERE loaiTaiLieu =?";

        PreparedStatement preparedStatement;

        try {

            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, tenTaiLieu);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                TaiLieu taiLieu = new TaiLieu();
                taiLieu.setMaTaiLieu(rs.getInt("maTaiLieu"));
                taiLieu.setTenNhaXuatBan(rs.getString("tenNXB"));
                taiLieu.setSoBanPhatHanh(rs.getInt("soBanPhatHanh"));
                taiLieu.setLoaiTaiLieu(rs.getString("loaiTaiLieu"));
                taiLieus.add(taiLieu);
            }
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return taiLieus;
    }

    //Thêm tài liệu
    public int addTaiLieu(String theLoai, String NXB, int soLg, String tenTg, int soTrang, int soPhatHanh,
            int thang, int ngay) {
        Connection connect = Connect.getJDBCConection();
        String sql = " INSERT INTO tailieu( loaiTaiLieu, tenNXB, soBanPhatHanh, tenTacGia, soTrang, soPhatHanh"
                + ",thangPhatHanh, ngayPhatHanh)"
                + " VALUE(?,?,?,?,?,?,?,?) ";

        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);

            preparedStatement.setString(1, theLoai);
            preparedStatement.setString(2, NXB);
            preparedStatement.setInt(3, soLg);
            preparedStatement.setString(4, tenTg);
            preparedStatement.setInt(5, soTrang);
            preparedStatement.setInt(6, soPhatHanh);
            preparedStatement.setInt(7, thang);
            preparedStatement.setInt(8, ngay);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            connect.close();
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //Xóa Tài Liệu
    public int deleteTaiLieu(int i) {
        Connection connect = Connect.getJDBCConection();

        String sql = "delete from tailieu where maTaiLieu =?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, i);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            connect.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    //Lấy 1 tài liệu
    public TaiLieu getTaiLieu(int maTaiLieu) {
        TaiLieu taiLieu=new TaiLieu();
        
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM tailieu WHERE maTaiLieu=?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, maTaiLieu);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                
                taiLieu.setMaTaiLieu(rs.getInt("maTaiLieu"));
                taiLieu.setLoaiTaiLieu(rs.getString("loaiTaiLieu"));
                taiLieu.setTenNhaXuatBan(rs.getString("tenNXB"));
                taiLieu.setSoBanPhatHanh(rs.getInt("soBanPhatHanh"));
            }
            
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return taiLieu;
    }

    //Lấy 1 sách
    public Sach getSach(int maTaiLieu) {
        Sach sach = new Sach();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM tailieu WHERE maTaiLieu=?";
        PreparedStatement preparedStatement;

        try {
            
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, maTaiLieu);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                sach.setSoTrang(rs.getInt("soTrang"));
                System.out.println(rs.getString("tenTacGia"));
                sach.setTenTacGia(rs.getString("tenTacGia"));
                
            }

            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sach;
    }

    //Lấy 1 tạp chí
    public TapChi getTapChi(int maTaiLieu) {
        TapChi tapChi = new TapChi();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM tailieu WHERE maTaiLieu=?";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, maTaiLieu);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tapChi.setSoPhatHanh(rs.getInt("soPhatHanh"));
                tapChi.setThangPhatHanh(rs.getInt("thangPhatHanh"));
            }

            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tapChi;
    }

    //Lấy 1 báo
    public Bao getBao(int maTaiLieu) {
        Bao bao = new Bao();
        Connection connect = Connect.getJDBCConection();
        String sql = "SELECT * FROM tailieu WHERE maTaiLieu=?";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, maTaiLieu);
            System.out.println("toan3333");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                bao.setNgayPhatHanh(rs.getInt("ngayPhatHanh"));
                bao.setThangPhatHanh(rs.getInt("thangPhatHanh"));
            }

            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bao;
    }
    public int editTaiLieu(Sach sach){
        
        Connection connect = Connect.getJDBCConection();
        String sql = " UPDATE tailieu SET tenNXB=?, soBanPhatHanh=?, tenTacGia=?, soTrang=? WHERE maTaiLieu=?";
        
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1,sach.getTenNhaXuatBan());
            preparedStatement.setInt(2,sach.getSoBanPhatHanh());
            
            preparedStatement.setString(3,sach.getTenTacGia());
            preparedStatement.setInt(4,sach.getSoTrang());
            preparedStatement.setInt(5,sach.getMaTaiLieu());
            
            int rs =preparedStatement.executeUpdate();
            System.out.println(rs);
             connect.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return 0;
    }
    public int editTaiLieu(TapChi tapChi){
        
        Connection connect = Connect.getJDBCConection();
        String sql = " UPDATE tailieu SET tenNXB=?, soBanPhatHanh=?, soPhatHanh=?, thangPhatHanh=? WHERE maTaiLieu=?";
        System.out.println("dasdsa");
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1,tapChi.getTenNhaXuatBan());
            preparedStatement.setInt(2,tapChi.getSoBanPhatHanh());
            
            preparedStatement.setInt(3,tapChi.getSoPhatHanh());
            preparedStatement.setInt(4,tapChi.getThangPhatHanh());
            preparedStatement.setInt(5,tapChi.getMaTaiLieu());
             
            int rs =preparedStatement.executeUpdate();
            System.out.println(rs);
             connect.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return 0;
    }
    public int editTaiLieu(Bao bao){
        
        Connection connect = Connect.getJDBCConection();
        String sql = " UPDATE tailieu SET tenNXB=?, soBanPhatHanh=?, ngayPhatHanh=?, thangPhatHanh=? WHERE maTaiLieu=?";
        
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1,bao.getTenNhaXuatBan());
            preparedStatement.setInt(2,bao.getSoBanPhatHanh());
            
           preparedStatement.setInt(3,bao.getNgayPhatHanh());
           preparedStatement.setInt(4,bao.getThangPhatHanh());
           
           preparedStatement.setInt(5,bao.getMaTaiLieu());
           
            int rs =preparedStatement.executeUpdate();
            System.out.println(rs);
             connect.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(TaiLieuDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        return 0;
    }
}
