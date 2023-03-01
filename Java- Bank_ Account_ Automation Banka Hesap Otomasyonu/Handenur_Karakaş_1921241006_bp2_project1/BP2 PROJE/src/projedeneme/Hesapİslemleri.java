/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projedeneme;

/**
 *
 * @author hande
 */
public class Hesapİslemleri extends javax.swing.JFrame {

    public Hesapİslemleri() {
        initComponents();

        lbl_müsteriTcBilgisi.setText("" + Müsteri.loginMusteri.tcNo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_paraCek = new javax.swing.JButton();
        btn_ParaYatir = new javax.swing.JButton();
        btn_HavaleYap = new javax.swing.JButton();
        btn_BakiyeSorgula = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_müsteriTcBilgisi = new javax.swing.JLabel();
        btn_cikisHesapİslemleri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(165, 171, 173));

        btn_paraCek.setBackground(new java.awt.Color(0, 104, 129));
        btn_paraCek.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_paraCek.setForeground(new java.awt.Color(255, 255, 255));
        btn_paraCek.setText("Para Çek");
        btn_paraCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paraCekActionPerformed(evt);
            }
        });

        btn_ParaYatir.setBackground(new java.awt.Color(0, 104, 129));
        btn_ParaYatir.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_ParaYatir.setForeground(new java.awt.Color(255, 255, 255));
        btn_ParaYatir.setText("Para Yatır");
        btn_ParaYatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ParaYatirActionPerformed(evt);
            }
        });

        btn_HavaleYap.setBackground(new java.awt.Color(0, 104, 129));
        btn_HavaleYap.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_HavaleYap.setForeground(new java.awt.Color(255, 255, 255));
        btn_HavaleYap.setText("Havale Yap");
        btn_HavaleYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HavaleYapActionPerformed(evt);
            }
        });

        btn_BakiyeSorgula.setBackground(new java.awt.Color(0, 104, 129));
        btn_BakiyeSorgula.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_BakiyeSorgula.setForeground(new java.awt.Color(255, 255, 255));
        btn_BakiyeSorgula.setText("Bakiye Sorgula");
        btn_BakiyeSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BakiyeSorgulaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 104, 129));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(165, 171, 173));
        jLabel1.setText("F S M   V A K I F   B A N K");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 55, 68));
        jLabel2.setText("HESAP İŞLEMLERİ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\İndirilenler\\Adsız tasarım (5).png")); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 104, 129));
        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MÜŞTERİ TC NO:");

        lbl_müsteriTcBilgisi.setBackground(new java.awt.Color(0, 104, 129));
        lbl_müsteriTcBilgisi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_müsteriTcBilgisi.setForeground(new java.awt.Color(231, 55, 68));
        lbl_müsteriTcBilgisi.setText("-");

        btn_cikisHesapİslemleri.setBackground(new java.awt.Color(0, 104, 129));
        btn_cikisHesapİslemleri.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btn_cikisHesapİslemleri.setForeground(new java.awt.Color(255, 255, 255));
        btn_cikisHesapİslemleri.setText("Çıkış");
        btn_cikisHesapİslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisHesapİslemleriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ParaYatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_paraCek, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_HavaleYap, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BakiyeSorgula))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btn_cikisHesapİslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(lbl_müsteriTcBilgisi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_müsteriTcBilgisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_paraCek, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_HavaleYap, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ParaYatir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BakiyeSorgula))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cikisHesapİslemleri)
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BakiyeSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BakiyeSorgulaActionPerformed
        // Müsteri m1= Müsteri.BakiyeGetir(hesapBakiyesi);
        //new BakiyeSorgula(m1.tcNo).setVisible(true);

        new BakiyeSorgula().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BakiyeSorgulaActionPerformed

    private void btn_ParaYatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ParaYatirActionPerformed

        //  Müsteri m1= new Müsteri(int hesapBakiyesi);
        new ParaYatir().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ParaYatirActionPerformed

    private void btn_paraCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paraCekActionPerformed
        new ParaCek().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_paraCekActionPerformed

    private void btn_cikisHesapİslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisHesapİslemleriActionPerformed
        new Giris().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cikisHesapİslemleriActionPerformed

    private void btn_HavaleYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HavaleYapActionPerformed
        new Havale().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_HavaleYapActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hesapİslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BakiyeSorgula;
    private javax.swing.JButton btn_HavaleYap;
    private javax.swing.JButton btn_ParaYatir;
    private javax.swing.JButton btn_cikisHesapİslemleri;
    private javax.swing.JButton btn_paraCek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_müsteriTcBilgisi;
    // End of variables declaration//GEN-END:variables
}
