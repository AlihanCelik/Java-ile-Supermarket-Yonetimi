/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kategori;

/**
 *
 * @author pc
 */
public class kategoribilgi {
    private int id;
    private String isim;
    private String çeşit;
    
    

    public kategoribilgi(int id, String isim,String çeşit) {
        this.id = id;
        this.isim = isim;
        this.çeşit=çeşit;
        
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getÇeşit() {
        return çeşit;
    }

    public void setÇeşit(String çeşit) {
        this.çeşit = çeşit;
    }
    
    
}
