/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package anaEkran;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;
import java.sql.Statement;




import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


import ürün.ürünbilgi;
import ürün.ürünişlemler;


/**
 *
 * @author pc
 */
public class Alışveriş extends javax.swing.JFrame {
    DefaultTableModel model;
    ürünişlemler islemler =  new ürünişlemler();
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet Rs=null;
    
   
    
    /**
     * Creates new form Alışveriş
     */
    public Alışveriş() {
        initComponents();
        model = (DefaultTableModel) ÜrünTablo.getModel();
        ürünGoruntule();
        Filtreleme();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ürünİsim = new javax.swing.JTextField();
        Ekle = new javax.swing.JButton();
        temizle = new javax.swing.JButton();
        ÜrünID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ÜrünMiktar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ÜrünTablo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Fatura = new javax.swing.JTextArea();
        yazdır = new javax.swing.JButton();
        GenelToplamlbl = new javax.swing.JLabel();
        Filtre = new javax.swing.JComboBox<>();
        FiltreTemizle = new javax.swing.JButton();
        Filter = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        gerituşu1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Ürünler");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("ÜRÜN İSİM");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("FATURA ID");

        Ürünİsim.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Ürünİsim.setForeground(new java.awt.Color(255, 102, 0));

        Ekle.setBackground(new java.awt.Color(255, 102, 0));
        Ekle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Ekle.setForeground(new java.awt.Color(255, 255, 255));
        Ekle.setText("Sepete Ekle");
        Ekle.setBorder(null);
        Ekle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleActionPerformed(evt);
            }
        });

        temizle.setBackground(new java.awt.Color(255, 102, 0));
        temizle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        temizle.setForeground(new java.awt.Color(255, 255, 255));
        temizle.setText("Temizle");
        temizle.setBorder(null);
        temizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        ÜrünID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ÜrünID.setForeground(new java.awt.Color(255, 102, 0));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("ALIŞVERİŞ");

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("MİKTAR");

        ÜrünMiktar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ÜrünMiktar.setForeground(new java.awt.Color(255, 102, 0));

        ÜrünTablo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ÜrünTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İsim", "Miktar", "Fiyat", "Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ÜrünTablo.setIntercellSpacing(new java.awt.Dimension(0, 0));
        ÜrünTablo.setRowHeight(25);
        ÜrünTablo.setSelectionBackground(new java.awt.Color(255, 102, 0));
        ÜrünTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ÜrünTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ÜrünTablo);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Filtrele");

        Fatura.setColumns(20);
        Fatura.setRows(5);
        jScrollPane2.setViewportView(Fatura);

        yazdır.setBackground(new java.awt.Color(255, 102, 0));
        yazdır.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        yazdır.setForeground(new java.awt.Color(255, 255, 255));
        yazdır.setText("Yazdır");
        yazdır.setBorder(null);
        yazdır.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yazdır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazdırActionPerformed(evt);
            }
        });

        GenelToplamlbl.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        GenelToplamlbl.setForeground(new java.awt.Color(255, 102, 0));
        GenelToplamlbl.setText("Genel Toplam:");

        Filtre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Filtre.setForeground(new java.awt.Color(255, 102, 0));
        Filtre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sebze", "Meyve" }));
        Filtre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filtre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltreİtemStateChanged(evt);
            }
        });

        FiltreTemizle.setBackground(new java.awt.Color(255, 102, 0));
        FiltreTemizle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        FiltreTemizle.setForeground(new java.awt.Color(255, 255, 255));
        FiltreTemizle.setText("Temizle");
        FiltreTemizle.setBorder(null);
        FiltreTemizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FiltreTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltreTemizleActionPerformed(evt);
            }
        });

        Filter.setBackground(new java.awt.Color(255, 102, 0));
        Filter.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Filter.setForeground(new java.awt.Color(255, 255, 255));
        Filter.setText("Filtrele");
        Filter.setBorder(null);
        Filter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(390, 390, 390))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(665, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yazdır, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenelToplamlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ÜrünID, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(Ürünİsim)
                            .addComponent(ÜrünMiktar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(arama_cubugu)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Filtre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FiltreTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Filtre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(FiltreTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenelToplamlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(yazdır, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ÜrünID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ürünİsim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ÜrünMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        gerituşu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Downloads\\forward-arrow - Kopya.png")); // NOI18N
        gerituşu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerituşu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerituşu1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerituşu1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gerituşu1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void bağlantı(){
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
    int ÜrünId,yeni_miktar;
    public void ürünGuncelleme() {
        bağlantı();
        
        String sorgu =  "Update ürünler set  ÜrünMiktar = "+yeni_miktar+"    where ÜrünID = "+ÜrünId;
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.executeUpdate();
            
            
            
            
            
            
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("hata..");
        
        
        
        
        }
    }
    
    int i=0;
    private void EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleActionPerformed
        // TODO add your handling code here:
        
        if(ÜrünMiktar.getText().isEmpty()|| Ürünİsim.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Eksik Bilgi...");
        }else if(ana_miktar<=Integer.valueOf(ÜrünMiktar.getText())){
            JOptionPane.showMessageDialog(this,"Yeterli Stok Yok");
        }
        else{
            i++;
            yeni_miktar = ana_miktar -(Integer.valueOf(ÜrünMiktar.getText()));
            ÜrünTop = Ücret * (Integer.valueOf(ÜrünMiktar.getText()));
            geneltoplam=ÜrünTop+geneltoplam;
            if(i==1){
                Fatura.setText(Fatura.getText()+"*********************************Fatura*********************************\n"+"Num           Ürün           Ücret           Miktar           Toplam\n"+i+"             "+Ürünİsim.getText()+"         "+Ücret+"           "+ÜrünMiktar.getText()+"                    "+ÜrünTop+"\n");
            
            }else{
                Fatura.setText(Fatura.getText()+i+"             "+Ürünİsim.getText()+"         "+Ücret+"           "+ÜrünMiktar.getText()+"                    "+ÜrünTop+"\n");
            }
            
            ürünGuncelleme();
            
            
        }
        ürünGoruntule();
        ÜrünID.setText("");
        Ürünİsim.setText("");
        ÜrünMiktar.setText("");
    }//GEN-LAST:event_EkleActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        // TODO add your handling code here:
        ÜrünID.setText("");
        Ürünİsim.setText("");
        ÜrünMiktar.setText("");

    }//GEN-LAST:event_temizleActionPerformed
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        ÜrünTablo.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
        
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();
        dinamikAra(ara);

    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void gerituşu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerituşu1MouseClicked
        // TODO add your handling code here:
        new giriş().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gerituşu1MouseClicked
    double Ücret,ÜrünTop=0.0,geneltoplam=0.0;
    int ana_miktar;
    
    
    
    private void ÜrünTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ÜrünTabloMouseClicked
        // TODO add your handling code here:
        int selectedrow =ÜrünTablo.getSelectedRow();
        ÜrünId= Integer.valueOf(model.getValueAt(selectedrow,0).toString());
        Ürünİsim.setText(model.getValueAt(selectedrow,1).toString());
        ana_miktar=Integer.valueOf(model.getValueAt(selectedrow,2 ).toString());
        Ücret=Double.valueOf(model.getValueAt(selectedrow,3).toString());
        
        
        
        
       

        
    }//GEN-LAST:event_ÜrünTabloMouseClicked

    private void yazdırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazdırActionPerformed
        GenelToplamlbl.setText("Genel Toplam: "+geneltoplam);
    }//GEN-LAST:event_yazdırActionPerformed
    public void Filtreleme(){
     try {
         
            bağlantı();
            statement =  con.createStatement();
            String sorgu =  "Select * From user1.kategori";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                
                String isim = rs.getString("Kategoriİsim");
                Filtre.addItem(isim);
                
               
                
                
                
                
            }
            
            
            
            
        } catch (SQLException ex) {
           
            
            
        }   
    }
    private void FiltreTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltreTemizleActionPerformed
        try{
            //con=DriverManager.getConnection("jdbc:mysql://" + satıcı.Database.host + ":" + satıcı.Database.port + "/" + satıcı.Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8");
            bağlantı();
            statement=con.createStatement();
            Rs=statement.executeQuery("Select * from user1.ürünler");
            ÜrünTablo.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            System.out.println("hata...");
        }
    }//GEN-LAST:event_FiltreTemizleActionPerformed

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        // TODO add your handling code here:
        try{
            //con=DriverManager.getConnection("jdbc:mysql://" + satıcı.Database.host + ":" + satıcı.Database.port + "/" + satıcı.Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8");
            bağlantı();
            statement=con.createStatement();
            Rs=statement.executeQuery("Select * from user1.kategori Where Kategoriİsim ='"+Filtre.getSelectedItem().toString()+"'");
            ÜrünTablo.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e){
            System.out.println("hata...");
        }
    }//GEN-LAST:event_FilterActionPerformed

    private void FiltreİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltreİtemStateChanged

    }//GEN-LAST:event_FiltreİtemStateChanged

                                         

    
     public void ürünGoruntule() {
        
        model.setRowCount(0);
        
        ArrayList<ürünbilgi> ürün = new ArrayList<ürünbilgi>();
        
        
        ürün = islemler.ürünleriGetir();
        
        if (ürün != null ) {
            
            for (ürünbilgi calisan : ürün) {
                Object[] eklenecek = {calisan.getId(),calisan.getAd(),calisan.getMiktar(),calisan.getFiyat(),calisan.getKategori()};
                
                model.addRow(eklenecek);
                
                
                
            }
            
        }
        
     }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alışveriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alışveriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alışveriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alışveriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alışveriş().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ekle;
    private javax.swing.JTextArea Fatura;
    private javax.swing.JButton Filter;
    private javax.swing.JComboBox<String> Filtre;
    private javax.swing.JButton FiltreTemizle;
    private javax.swing.JLabel GenelToplamlbl;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JLabel gerituşu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton temizle;
    private javax.swing.JButton yazdır;
    private javax.swing.JTextField ÜrünID;
    private javax.swing.JTextField ÜrünMiktar;
    private javax.swing.JTable ÜrünTablo;
    private javax.swing.JTextField Ürünİsim;
    // End of variables declaration//GEN-END:variables
}
