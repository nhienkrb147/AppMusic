/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import PanelMenu.Pn;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author MSII
 */
public class JFrameMusic extends javax.swing.JFrame {

    private JPanel chiPanel;

    public JFrameMusic() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
        init();
    }
    void init(){
           playing.setVisible(false);
        playing.setEnabled(false);
        play.setVisible(true);
        play.setEnabled(true);
    }
    void showPanel(JPanel panel) {
        chiPanel = panel;
        pnMain.removeAll();
        pnMain.add(chiPanel);
        pnMain.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSButtonHover4 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover6 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        rSButtonHover8 = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        imageAvatar1 = new Utils_Pro.ImageAvatar();
        jPanel3 = new javax.swing.JPanel();
        imageAvatar2 = new Utils_Pro.ImageAvatar();
        jLabel4 = new javax.swing.JLabel();
        thanhNhac = new Utils_Pro.ThanhNhac();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        playing = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnMain.setBackground(new java.awt.Color(29, 34, 56));
        pnMain.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(38, 45, 71));

        rSButtonHover4.setBackground(new java.awt.Color(38, 45, 71));
        rSButtonHover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tainghe.png"))); // NOI18N
        rSButtonHover4.setText("      Songs");
        rSButtonHover4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });

        rSButtonHover5.setBackground(new java.awt.Color(38, 45, 71));
        rSButtonHover5.setForeground(new java.awt.Color(204, 204, 204));
        rSButtonHover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/IconSearch.png"))); // NOI18N
        rSButtonHover5.setText("   Discover");
        rSButtonHover5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });

        rSButtonHover6.setBackground(new java.awt.Color(38, 45, 71));
        rSButtonHover6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bieudo.png"))); // NOI18N
        rSButtonHover6.setText("Top Charts");
        rSButtonHover6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });

        rSButtonHover7.setBackground(new java.awt.Color(38, 45, 71));
        rSButtonHover7.setForeground(new java.awt.Color(204, 204, 204));
        rSButtonHover7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        rSButtonHover7.setText("Playlist");
        rSButtonHover7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSButtonHover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Browse");

        rSButtonHover8.setBackground(new java.awt.Color(38, 45, 71));
        rSButtonHover8.setForeground(new java.awt.Color(204, 204, 204));
        rSButtonHover8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N
        rSButtonHover8.setText("Biography");
        rSButtonHover8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSButtonHover8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("My Music");

        imageAvatar1.setBorderSize(3);
        imageAvatar1.setBorderSpace(3);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSButtonHover5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonHover4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonHover6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonHover7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rSButtonHover8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonHover6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonHover8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rSButtonHover7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(37, 44, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageAvatar2.setBorderSize(0);
        imageAvatar2.setBorderSpace(0);
        imageAvatar2.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))); // NOI18N
        jPanel3.add(imageAvatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 34, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ten bai nhac");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 114, 20));
        jPanel3.add(thanhNhac, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 430, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 28, 28));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 28, 28));

        playing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/playing.png"))); // NOI18N
        playing.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playingMouseClicked(evt);
            }
        });
        jPanel3.add(playing, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/play.png"))); // NOI18N
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });
        jPanel3.add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(29, 34, 56));

        rSButtonHover3.setBackground(new java.awt.Color(29, 34, 56));
        rSButtonHover3.setText("-");
        rSButtonHover3.setColorHover(new java.awt.Color(255, 0, 51));
        rSButtonHover3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        rSButtonHover1.setBackground(new java.awt.Color(29, 34, 56));
        rSButtonHover1.setText("x");
        rSButtonHover1.setColorHover(new java.awt.Color(255, 0, 51));
        rSButtonHover1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(670, Short.MAX_VALUE)
                .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        this.setExtendedState(JFrameMusic.ICONIFIED);
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        showPanel(new Pn());
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void rSButtonHover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover7ActionPerformed

    private void rSButtonHover8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover8ActionPerformed

    private void playingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playingMouseClicked
        playing.setVisible(false);
        playing.setEnabled(false);
        play.setVisible(true);
        play.setEnabled(true);
    }//GEN-LAST:event_playingMouseClicked

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        playing.setVisible(true);
        playing.setEnabled(true);
        play.setVisible(false);
        play.setEnabled(false);
    }//GEN-LAST:event_playMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMusic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utils_Pro.ImageAvatar imageAvatar1;
    private Utils_Pro.ImageAvatar imageAvatar2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel play;
    private javax.swing.JLabel playing;
    private javax.swing.JPanel pnMain;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover4;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    private rojeru_san.complementos.RSButtonHover rSButtonHover6;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    private rojeru_san.complementos.RSButtonHover rSButtonHover8;
    private Utils_Pro.ThanhNhac thanhNhac;
    // End of variables declaration//GEN-END:variables

}
