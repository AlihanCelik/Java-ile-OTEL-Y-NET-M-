/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MüşteriYönetimi;
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
public class müşteriİşlemler {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<müşteriBilgi> MüşteriGetir() {
        
        ArrayList<müşteriBilgi> cikti = new ArrayList<müşteriBilgi>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From müşteri";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("ID");
                String ad = rs.getString("Müşteriİsim");
                String soyad = rs.getString("MüşteriSoyisim");
                String telno  = rs.getString("MüşteriTelNo");
                String eposta = rs.getString("MüşteriEPosta");
                
                String cinsiyet=rs.getString("MüşteriCinsiyet");
                
                cikti.add(new müşteriBilgi(id, ad, soyad,eposta,telno,cinsiyet));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
           
            return null;
            
        }
    
    /**
     *
     */
    }
    public void MüşteriEkle(String ad,String soyad,String telno,String eposta,String cinsiyet) {
        
        String sorgu = "Insert Into müşteri (Müşteriİsim,MüşteriSoyisim,MüşteriTelNo,MüşteriEPosta,MüşteriCinsiyet) VALUES(?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, telno);
            preparedStatement.setString(4, eposta);
            preparedStatement.setString(5, cinsiyet);
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
        
    /**
     *
     * @param id
     * @param yeni_ad
     * @param yeni_soyad
     * @param yeni_eposta
     * @param yeni_telno
     * @param yeni_cinsiyet
     */
    }
    public void MüşteriGuncelle(int id,String yeni_ad,String yeni_soyad,String yeni_telno,String yeni_eposta, String yeni_cinsiyet) {
        String sorgu =  "Update müşteri set Müşteriİsim = ? ,MüşteriSoyisim = ?,MüşteriTelNo = ?,MüşteriEPosta =?  , MüşteriCinsiyet= ?   where ID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeni_ad);
            preparedStatement.setString(2,yeni_soyad);
            
            preparedStatement.setString(3,yeni_telno);
            preparedStatement.setString(4,yeni_eposta);
            preparedStatement.setString(5,yeni_cinsiyet);
            
            preparedStatement.setInt(6, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    public void MüşteriSil(int id) {
        
        String sorgu = "Delete from müşteri where ID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("hata...");
        }
        
        
        
        
        
    }
       
    public müşteriİşlemler() {
        
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
