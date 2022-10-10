/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ürün;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import satıcı.satıcıbilgi;

/**
 *
 * @author pc
 */
public class ürünişlemler {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<ürünbilgi> ürünleriGetir() {
        
        ArrayList<ürünbilgi> cikti = new ArrayList<ürünbilgi>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From ürünler";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("ÜrünID");
                String ad = rs.getString("Ürünİsim");
                int miktar = rs.getInt("ÜrünMiktar");
                double fiyat = rs.getDouble("ÜrünFiyat");
                String kategori  = rs.getString("ÜrünKategori");
                
                cikti.add(new ürünbilgi(id, ad, miktar, fiyat, kategori));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
           
            return null;
            
        }
        
        
        
        
    }
    public void ürünGuncelle(int id,String yeni_ad,int yeni_miktar,double yeni_fiyat,String yeni_kategori) {
        String sorgu =  "Update ürünler set  Ürünİsim = ? , ÜrünMiktar = ?, ÜrünFiyat = ? , ÜrünKategori = ?   where ÜrünID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeni_ad);
            preparedStatement.setInt(2,yeni_miktar);
            
            preparedStatement.setDouble(3,yeni_fiyat);
            preparedStatement.setString(4,yeni_kategori);
            
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    public void ürünSil(int id) {
        
        String sorgu = "Delete from ürünler where ÜrünID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("hata...");
        }
        
        
        
        
        
    }
    public void ürünEkle(String ad,int miktar,double fiyat,String kategori) {
        
        String sorgu = "Insert Into ürünler (Ürünİsim,ÜrünMiktar,ÜrünFiyat,ÜrünKategori) VALUES(?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setInt(2, miktar);
            preparedStatement.setDouble(3, fiyat);
            preparedStatement.setString(4, kategori);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
        
        
        
        
        
        
    }
    
        
        
        
        
        
        
        
    
    public ürünişlemler() {
        
        String url = "jdbc:mysql://" + satıcı.Database.host + ":" + satıcı.Database.port + "/" + satıcı.Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, satıcı.Database.kullanici_adi, satıcı.Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
        
    }

    
}
