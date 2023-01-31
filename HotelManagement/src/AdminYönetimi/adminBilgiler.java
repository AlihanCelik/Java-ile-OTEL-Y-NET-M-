/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminYönetimi;

/**
 *
 * @author pc
 */
public class adminBilgiler {
     private int id;
    private String ad;

    private String parola;
    

    public adminBilgiler(int id, String ad, String parola) {
        this.id = id;
        this.ad = ad;
        this.parola=parola;
        
       
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

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    
}
