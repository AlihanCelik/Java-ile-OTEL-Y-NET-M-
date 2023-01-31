/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personelyönetimi;

import AnaEkranlar.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class personelİşlemler {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<personelBilgiler> personelGetir() {
        
        ArrayList<personelBilgiler> cikti = new ArrayList<personelBilgiler>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From personel";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("ID");
                String adsoyad = rs.getString("İsimSoyad");
                String  parola= rs.getString("Parola");
                String telno  = rs.getString("TelefonNo");
                String maaş = rs.getString("Maaş");
                
                String cinsiyet=rs.getString("Cinsiyet");
                
                cikti.add(new personelBilgiler(id,adsoyad, parola,telno,maaş,cinsiyet));
                
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
           
            return null;
            
        }
    
    /**
     *
     */
    }
    public void personelEkle(String adsoyad,String parola,String telno,String maaşı,String cinsiyet) {
        
        String sorgu = "Insert Into personel (İsimSoyad,Parola,TelefonNo,Maaş,Cinsiyet) VALUES(?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, adsoyad);
            preparedStatement.setString(2, parola);
            preparedStatement.setString(3, telno);
            preparedStatement.setString(4, maaşı);
            preparedStatement.setString(5, cinsiyet);
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
        
    
    }
    public void personelGuncelle(int id,String yeni_ad_soyad,String yeni_parola,String yeni_telno,String yeni_maaşı, String yeni_cinsiyet) {
        String sorgu =  "Update personel set İsimSoyad = ? ,Parola = ?,TelefonNo = ?,Maaş =?  , Cinsiyet= ?   where ID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeni_ad_soyad);
            preparedStatement.setString(2,yeni_parola);
            
            preparedStatement.setString(3,yeni_telno);
            preparedStatement.setString(4,yeni_maaşı);
            preparedStatement.setString(5,yeni_cinsiyet);
            
            preparedStatement.setInt(6, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    public void personelSil(int id) {
        
        String sorgu = "Delete from personel where ID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("hata...");
        }
        
        
        
        
        
    }
       
    public personelİşlemler() {
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
        
    }
}
