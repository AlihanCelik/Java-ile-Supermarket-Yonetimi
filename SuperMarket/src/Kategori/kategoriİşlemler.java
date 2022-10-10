
package Kategori;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import satıcı.satıcıbilgi;

public class kategoriİşlemler {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<kategoribilgi> calisanlariGetir() {
        
        ArrayList<kategoribilgi> cikti = new ArrayList<kategoribilgi>();
        
        try {
            statement =  con.createStatement();
            String sorgu =  "Select * From kategori";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("KategoriID");
                String isim = rs.getString("Kategoriİsim");
                String çeşit = rs.getString("KategoriÇeşit");
               
                
                cikti.add(new kategoribilgi(id,isim,çeşit));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
           
            return null;
            
        }
        
        
        
        
    }
    public void kategoriGuncelle(int id,String yeni_ad,String yeni_çeşit) {
        String sorgu =  "Update kategori set Kategoriİsim = ? ,KategoriÇeşit = ?  where KategoriID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1,yeni_ad);
            preparedStatement.setString(2,yeni_çeşit);
            
            
            
            preparedStatement.setInt(3, id);
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    public void kategoriSil(int id) {
        
        String sorgu = "Delete from kategori where KategoriID = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("hata...");
        }
        
        
        
        
        
    }
    public void kategoriEkle(String ad,String çeşit) {
        
        String sorgu = "Insert Into Kategori (Kategoriİsim,KategoriÇeşit) VALUES(?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, çeşit);
            ;
            
            preparedStatement.executeUpdate();
            
            
            
        } catch (SQLException ex) {
           
        }
        
        
        
        
        
        
    }
    
        
        
        
        
        
        
        
    
    public kategoriİşlemler() {
        
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
