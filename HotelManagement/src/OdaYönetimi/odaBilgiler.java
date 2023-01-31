/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OdaYönetimi;

/**
 *
 * @author pc
 */
public class odaBilgiler {
    private int id;
    private String numara;
    private String tel;
    private String odatipi;
    private String rezeremi;
    
     

    public odaBilgiler(int id,String numara,String odatipi,String tel,String rezervemi) {
        this.id=id;
        this.numara=numara;
        this.tel= tel;
        this.odatipi= odatipi;
        this.rezeremi=rezervemi;
        
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOdatipi() {
        return odatipi;
    }

    public void setOdatipi(String odatipi) {
        this.odatipi = odatipi;
    }

    public String getRezeremi() {
        return rezeremi;
    }

    public void setRezeremi(String rezeremi) {
        this.rezeremi = rezeremi;
    }

   

    

}
