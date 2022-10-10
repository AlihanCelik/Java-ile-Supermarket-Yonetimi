/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package müşteri;

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
public class Müşteriİşlemler {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<MüşteriBilgi> MüşteriGetir() {
        
        ArrayList<MüşteriBilgi> cikti = new ArrayList<MüşteriBilgi>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From müşteri";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("ID");
                String ad = rs.getString("Müşteriİsim");
                String soyad = rs.getString("MüşteriSoyisim");
                String eposta = rs.getString("MüşteriEPosta");
                String parola  = rs.getString("MüşteriParola");
                String cinsiyet=rs.getString("MüşteriCinsiyet");
                
                cikti.add(new MüşteriBilgi(id, ad, soyad,eposta,parola,cinsiyet));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
           
            return null;
            
        }
    
    /**
     *
     */
    }
    public void MüşteriEkle(String ad,String soyad,String eposta,String parola,String cinsiyet) {
        
        String sorgu = "Insert Into müşteri (Müşteriİsim,MüşteriSoyisim,MüşteriEPosta,MüşteriParola,MüşteriCinsiyet) VALUES(?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, eposta);
            preparedStatement.setString(4, parola);
            preparedStatement.setString(5, cinsiyet);
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
    }    
    public Müşteriİşlemler() {
        
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
