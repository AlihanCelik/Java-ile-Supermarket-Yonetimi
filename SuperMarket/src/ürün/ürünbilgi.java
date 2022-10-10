/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ürün;

/**
 *
 * @author pc
 */
public class ürünbilgi {
    
    private int id;
    private String ad;
    private int miktar;
    private double fiyat;
    private String kategori;
    

    public ürünbilgi(int id, String ad,int miktar , double fiyat, String kategori) {
        this.id = id;
        this.ad = ad;
        this.miktar=miktar;
        this.fiyat=fiyat;
        this.kategori=kategori;
       
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

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}

