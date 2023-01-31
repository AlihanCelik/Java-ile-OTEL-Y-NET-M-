/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OdaYönetimi;

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
public class odaİşlemler {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<odaBilgiler> odaGetir() {
        
        ArrayList<odaBilgiler> cikti = new ArrayList<odaBilgiler>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From odayönetimi";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("ID");
                String numara = rs.getString("OdaNumara");
                String tip = rs.getString("OdaTipi");
                String telno = rs.getString("TelNo");
                String rezervemi  = rs.getString("Rezervermi");
                
                
                cikti.add(new odaBilgiler(id,numara,tip,telno,rezervemi));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
           
            return null;
            
        }
    
    /**
     *
     */
    }
    public void odaEkle(String numara,String tipi,String telno,String rezervemi) {
        
        String sorgu = "Insert Into odayönetimi (OdaNumara,OdaTipi,TelNo,Rezervermi) VALUES(?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, numara);
            preparedStatement.setString(2, tipi);
            preparedStatement.setString(3, telno);
            preparedStatement.setString(4, rezervemi);
            
            
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
        
    
    }
    public void odaGuncelle(int id ,String yeni_numara,String yeni_odatipi,String yeni_telno,String yeni_rezervemi) {
        String sorgu =  "Update odayönetimi set OdaNumara= ? ,OdaTipi = ? ,TelNo = ? ,Rezervermi = ? where ID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeni_numara);
            preparedStatement.setString(2,yeni_odatipi);
            preparedStatement.setString(3,yeni_telno);
            
            preparedStatement.setString(4,yeni_rezervemi);
            
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    public void odaSil(int id) {
        
        String sorgu = "Delete from odayönetimi where ID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("hata...");
        }
        
        
        
        
        
    }
       
    public odaİşlemler() {
        
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

