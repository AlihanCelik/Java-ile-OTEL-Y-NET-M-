/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personelyönetimi;

/**
 *
 * @author pc
 */
public class personelBilgiler {
    private int id;
    private String adsoyad;
    private String parola;
    private String telno;
    private String maaş;
    private String cinsiyet;

    
    
    

    public personelBilgiler(int id, String adsoyad,String parola,String telno,String maaş,String cinsiyet) {
        this.id = id;
        this.adsoyad = adsoyad;
        this.parola=parola;
        this.telno=telno;
        this.maaş=maaş;
        this.cinsiyet=cinsiyet;
       
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getMaaş() {
        return maaş;
    }

    public void setMaaş(String maaş) {
        this.maaş = maaş;
    }
    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    
}
