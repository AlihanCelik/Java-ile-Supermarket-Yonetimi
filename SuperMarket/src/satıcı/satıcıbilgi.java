/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satıcı;

public class satıcıbilgi{
    private int id;
    private String ad;
    private String parola;
    private String cinsiyet;
    private String soyad;
    

    public satıcıbilgi(int id, String ad,String soyad, String parola, String cinsiyet) {
        this.id = id;
        this.ad = ad;
        this.soyad=soyad;
        this.parola=parola;
        this.cinsiyet=cinsiyet;
       
    }

    public satıcıbilgi(int id, String ad, int miktar, double fiyat, String kategori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola=parola;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

        
}
