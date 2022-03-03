/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Dao.TaiLieuDao;
import Model.TaiLieu;
import java.util.List;
import Model.Bao;
import Model.Sach;
import Model.TapChi;

/**
 *
 * @author Toàn
 */
public class TaiLieuService {
    private TaiLieuDao taiLieuDao;
    
    public TaiLieuService(){
        taiLieuDao= new TaiLieuDao();
    }
    public List<TaiLieu> getAllTaiLieu(){
       return taiLieuDao.getAllTaiLieu();
    }
    public List<String> getTheLoai(){
       return taiLieuDao.getTheLoai();
    }
    public List<TaiLieu> getAllTaiLieu(String tenTaiLieu){
       return taiLieuDao.getAllTaiLieuTheoTen(tenTaiLieu);
    }
    public int getDate(int thang){
        int ngay;
        if(thang==2){
            return 28;
        }else if( thang==4 || thang==6 || thang==9 || thang==11 ){
            return 30;
        }else{
            return 31;
        }
    }
    
    public int addTaiLieu(String theLoai,String NXB, int soLg, String tenTg, int soTrang, int soPhatHanh,
            int thang,int ngay){
        return taiLieuDao.addTaiLieu(theLoai,NXB,soLg,tenTg,soTrang,soPhatHanh,thang,ngay);
    }
    
    public int deleteTaiLieu(int i){
        return  taiLieuDao.deleteTaiLieu(i);
    }
    
    public TaiLieu getTaiLieu(int i){
        return taiLieuDao.getTaiLieu(i);
    }
    
    public Sach getSach(int i){
       
        return taiLieuDao.getSach(i);
    }
    public Bao getBao(int i){
        return taiLieuDao.getBao(i);
    }
    public TapChi getTapChi(int i){
        return taiLieuDao.getTapChi(i);
    }
    
    public int editTaiLieu(Sach sach){
        System.out.println("1");
        return taiLieuDao.editTaiLieu(sach);
    }
    public int editTaiLieu(TapChi tapChi){
        System.out.println("1");
        return taiLieuDao.editTaiLieu(tapChi);
    }
    public int editTaiLieu(Bao bao){
        System.out.println("1");
        return taiLieuDao.editTaiLieu(bao);
    }
}
