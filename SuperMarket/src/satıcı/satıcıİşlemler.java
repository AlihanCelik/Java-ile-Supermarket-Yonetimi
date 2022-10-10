/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satıcı;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import satıcı.Database;
import satıcı.satıcıbilgi;


/**
 *
 * @author pc
 */
public class satıcıİşlemler {
    




    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<satıcıbilgi> calisanlariGetir() {
        
        ArrayList<satıcıbilgi> cikti = new ArrayList<satıcıbilgi>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From sellertb";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("SatıcıID");
                String ad = rs.getString("Satıcıİsim");
                String soyad = rs.getString("SatıcıSoyad");
                String parola = rs.getString("SatıcıParola");
                String cinsiyet  = rs.getString("SatıcıCinsiyet");
                
                cikti.add(new satıcıbilgi(id, ad, soyad, parola, cinsiyet));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
           
            return null;
            
        }
        
        
        
        
    }
    public void satıcıGuncelle(int id,String yeni_ad,String yeni_soyad,String yeni_parola,String yeni_cinsiyet) {
        String sorgu =  "Update sellertb set Satıcıİsim = ? ,SatıcıSoyad = ?, SatıcıParola = ? , SatıcıCinsiyet= ?   where SatıcıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeni_ad);
            preparedStatement.setString(2,yeni_soyad);
            
            preparedStatement.setString(3,yeni_parola);
            preparedStatement.setString(4,yeni_cinsiyet);
            
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    public void satıcıSil(int id) {
        
        String sorgu = "Delete from sellertb where SatıcıID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("hata...");
        }
        
        
        
        
        
    }
    public void satıcıEkle(String ad,String soyad,String parola,String cinsiyet) {
        
        String sorgu = "Insert Into sellertb (Satıcıİsim,SatıcıSoyad,SatıcıParola,SatıcıCinsiyet) VALUES(?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, parola);
            preparedStatement.setString(4, cinsiyet);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
        
        
        
        
        
        
    }
    
        
        
        
        
        
        
        
    
    public satıcıİşlemler() {
        
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


