/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package satıcı;


import satıcı.satıcıİşlemler;
import satıcı.satıcıİşlemler;
import anaEkran.AdminPaneli;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pc
 */
public class satıcıekranı extends javax.swing.JFrame {

    /**
     * Creates new form satıcıekranı
     */
    DefaultTableModel model;
    satıcıİşlemler islemler =  new satıcıİşlemler();
    
    public satıcıekranı() {
        
        initComponents();
        model = (DefaultTableModel) SatıcıTablo.getModel();
        calisanGoruntule();
    }

    

    
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        SatıcıTablo.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SatıcıSoyad = new javax.swing.JTextField();
        Satıcıİsim = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SatıcıDüzenle = new javax.swing.JButton();
        SatıcıSil = new javax.swing.JButton();
        SatıcıParola = new javax.swing.JTextField();
        Temizle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        SatıcıEkle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SatıcıTablo = new javax.swing.JTable();
        SatıcıCinsiyet = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        gerituşu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("SATICI LİSTESİ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("SOYAD");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("PAROLA");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("İSİM");

        SatıcıSoyad.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SatıcıSoyad.setForeground(new java.awt.Color(255, 102, 0));

        Satıcıİsim.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Satıcıİsim.setForeground(new java.awt.Color(255, 102, 0));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("CİNSİYET");

        SatıcıDüzenle.setBackground(new java.awt.Color(255, 102, 0));
        SatıcıDüzenle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SatıcıDüzenle.setForeground(new java.awt.Color(255, 255, 255));
        SatıcıDüzenle.setText("Düzenle");
        SatıcıDüzenle.setBorder(null);
        SatıcıDüzenle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SatıcıDüzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatıcıDüzenleActionPerformed(evt);
            }
        });

        SatıcıSil.setBackground(new java.awt.Color(255, 102, 0));
        SatıcıSil.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SatıcıSil.setForeground(new java.awt.Color(255, 255, 255));
        SatıcıSil.setText("Sil");
        SatıcıSil.setBorder(null);
        SatıcıSil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SatıcıSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatıcıSilActionPerformed(evt);
            }
        });

        SatıcıParola.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SatıcıParola.setForeground(new java.awt.Color(255, 102, 0));

        Temizle.setBackground(new java.awt.Color(255, 102, 0));
        Temizle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Temizle.setForeground(new java.awt.Color(255, 255, 255));
        Temizle.setText("Temizle");
        Temizle.setBorder(null);
        Temizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemizleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("SATICILAR YÖNETİMİ");

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        SatıcıEkle.setBackground(new java.awt.Color(255, 102, 0));
        SatıcıEkle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SatıcıEkle.setForeground(new java.awt.Color(255, 255, 255));
        SatıcıEkle.setText("Ekle");
        SatıcıEkle.setBorder(null);
        SatıcıEkle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SatıcıEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatıcıEkleActionPerformed(evt);
            }
        });

        SatıcıTablo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SatıcıTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "İsim", "Soyad", "Parola", "Cinsiyet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SatıcıTablo.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SatıcıTablo.setRowHeight(25);
        SatıcıTablo.setSelectionBackground(new java.awt.Color(255, 102, 0));
        SatıcıTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SatıcıTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SatıcıTablo);
        if (SatıcıTablo.getColumnModel().getColumnCount() > 0) {
            SatıcıTablo.getColumnModel().getColumn(0).setResizable(false);
            SatıcıTablo.getColumnModel().getColumn(1).setResizable(false);
            SatıcıTablo.getColumnModel().getColumn(2).setResizable(false);
            SatıcıTablo.getColumnModel().getColumn(3).setResizable(false);
            SatıcıTablo.getColumnModel().getColumn(4).setResizable(false);
        }

        SatıcıCinsiyet.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SatıcıCinsiyet.setForeground(new java.awt.Color(255, 102, 0));
        SatıcıCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın" }));
        SatıcıCinsiyet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(SatıcıEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(SatıcıDüzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(SatıcıSil, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Satıcıİsim, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SatıcıSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SatıcıParola, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SatıcıCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(376, 376, 376))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Satıcıİsim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SatıcıParola, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SatıcıCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SatıcıDüzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SatıcıSil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SatıcıEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(SatıcıSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        gerituşu.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Downloads\\forward-arrow - Kopya.png")); // NOI18N
        gerituşu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerituşuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerituşu)
                .addGap(873, 873, 873)
                .addComponent(jLabel9)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gerituşu)))
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SatıcıDüzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatıcıDüzenleActionPerformed
        // TODO add your handling code here:
        String ad  =  Satıcıİsim.getText();
        String soyad = SatıcıSoyad.getText();
        String parola =SatıcıParola.getText();
        

        int selectedrow = SatıcıTablo.getSelectedRow();

        if (selectedrow == -1) {

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this,"Satıcı Tablosu şu anda boş. ");
            }
            else {
                JOptionPane.showMessageDialog(this,"Lütfen güncellenecek bir satıcı seçin.");
            }
        }
        else {

            int id = (int)model.getValueAt(selectedrow,0);
            String cinsiyet=SatıcıCinsiyet.getSelectedItem().toString();
            islemler.satıcıGuncelle(id,ad,soyad,parola,cinsiyet);

            calisanGoruntule();

            JOptionPane.showMessageDialog(this,"Satıcı başarıyla güncellendi...");
        }
    }//GEN-LAST:event_SatıcıDüzenleActionPerformed

    private void SatıcıSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatıcıSilActionPerformed
        // TODO add your handling code here:

        int selectedrow = SatıcıTablo.getSelectedRow();

        if (selectedrow == -1) {
            if (model.getRowCount() == 0 ) {
                JOptionPane.showMessageDialog(this,"Satıcı tablosu şu anda boş...");
            }
            else {
                JOptionPane.showMessageDialog(this,"Lütfen silinecek bir satıcı seçin...");
            }

        }
        else {
            int id = (int)model.getValueAt(selectedrow,0);

            islemler.satıcıSil(id);

            calisanGoruntule();

            JOptionPane.showMessageDialog(this,"Çalışan başarıyla silindi...");

        }
    }//GEN-LAST:event_SatıcıSilActionPerformed

    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void SatıcıEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatıcıEkleActionPerformed
        // TODO add your handling code here:
        
         if((Satıcıİsim.getText().isEmpty())||(SatıcıSoyad.getText().isEmpty())||(SatıcıParola.getText().isEmpty())){
            
            JOptionPane.showMessageDialog(this,"Kayıt İşlemi Başarısız...");
        
        }else{
        
        String ad  =  Satıcıİsim.getText();
        String soyad = SatıcıSoyad.getText();
        String parola =SatıcıParola.getText();
        String cinsiyet =SatıcıCinsiyet.getSelectedItem().toString();

        islemler.satıcıEkle(ad,soyad,parola,cinsiyet);

        calisanGoruntule();

        JOptionPane.showMessageDialog(this,"Yeni Satıcı Başarıyla Eklendi...");
         }
    }//GEN-LAST:event_SatıcıEkleActionPerformed

    private void SatıcıTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SatıcıTabloMouseClicked
        int selectedrow =SatıcıTablo.getSelectedRow();
        
        Satıcıİsim.setText(model.getValueAt(selectedrow,1).toString());
        SatıcıSoyad.setText(model.getValueAt(selectedrow,2).toString());
        SatıcıParola.setText(model.getValueAt(selectedrow,3).toString());
        
    }//GEN-LAST:event_SatıcıTabloMouseClicked

    private void TemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemizleActionPerformed
        Satıcıİsim.setText("");
        SatıcıSoyad.setText("");
        SatıcıParola.setText("");
        
        
        
    }//GEN-LAST:event_TemizleActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void gerituşuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerituşuMouseClicked
        // TODO add your handling code here:
        new AdminPaneli().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_gerituşuMouseClicked

    /**
     * @param args the command line arguments
     */
    
     public void calisanGoruntule() {
        
        model.setRowCount(0);
        
        ArrayList<satıcıbilgi> satıcı = new ArrayList<satıcıbilgi>();
        
        
        satıcı = islemler.calisanlariGetir();
        
        if (satıcı != null ) {
            
            for (satıcıbilgi calisan : satıcı) {
                Object[] eklenecek = {calisan.getId(),calisan.getAd(),calisan.getSoyad(),calisan.getParola(),calisan.getCinsiyet()};
                
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
            java.util.logging.Logger.getLogger(satıcıekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(satıcıekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(satıcıekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(satıcıekranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new satıcıekranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SatıcıCinsiyet;
    private javax.swing.JButton SatıcıDüzenle;
    private javax.swing.JButton SatıcıEkle;
    private javax.swing.JTextField SatıcıParola;
    private javax.swing.JButton SatıcıSil;
    private javax.swing.JTextField SatıcıSoyad;
    private javax.swing.JTable SatıcıTablo;
    private javax.swing.JTextField Satıcıİsim;
    private javax.swing.JButton Temizle;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JLabel gerituşu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
