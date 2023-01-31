/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MüşteriYönetimi;

/**
 *
 * @author pc
 */
public class müşteriBilgi {
    private int id;
    private String ad;
    private String soyad;
    private String eposta;
    private String telno;
    private String cinsiyet;
    

    public müşteriBilgi(int id, String ad,String soyad,String eposta,String telno,String cinsiyet) {
        this.id = id;
        this.ad = ad;
        this.soyad=soyad;
        this.eposta=eposta;
        this.telno=telno;
        this.cinsiyet=cinsiyet;
       
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    
    
    
}
