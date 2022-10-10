/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminupdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ürün.ürünbilgi;

/**
 *
 * @author pc
 */
public class adminişlemleri {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<adminbilgiler> ürünleriGetir() {
        
        ArrayList<adminbilgiler> cikti = new ArrayList<adminbilgiler>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From admin";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("AdminID");
                String ad = rs.getString("Adminİsim");
                String parola  = rs.getString("AdminParola");
                
                cikti.add(new adminbilgiler(id, ad, parola));
                
                
            }
            return cikti;
            } catch (SQLException ex) {
           
            return null;
            
        }
    
        
        
        
        
    }
    public void adminEkle(String ad,String parola) {
        
        String sorgu = "Insert Into admin (Adminİsim,AdminParola) VALUES(?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, parola);
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
        
        
        
        
        
        
    }
    public boolean girisYap(String ad,String parola) {
        
        String sorgu =  "Select * From admin where Adminİsim = ? and AdminParola = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,ad);
            preparedStatement.setString(2,parola);
            
            ResultSet rs =  preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            System.out.println("Hata...");
            return false;
        }
       
    }
    public void adminGuncelle(String ad,String yeni_parola) {
        String sorgu =  "Update admin set  AdminParola = ?   where Adminİsim = ? ";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeni_parola);
            preparedStatement.setString(2,ad);
            
            
            
            
            
            
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    public adminişlemleri() {
        
        String url = "jdbc:mysql://" + satıcı.Database.host + ":" + satıcı.Database.port + "/" + satıcı.Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
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
