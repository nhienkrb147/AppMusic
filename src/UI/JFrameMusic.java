/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.SongDAO;
import Entity.Song;
import PanelMenu.JPanelExplor;
import PanelMenu.JPanelPlayList;
import PanelMenu.JPanelTopChart;
import PanelMenu.JPanelQlyAccount;
import PanelMenu.JPanelQlyNhac;
import PanelMenu.JPanelTrangChu;
import Utils_Pro.Auth;
import Utils_Pro.XImage;
import Utils_Pro.XMusic;
import static Utils_Pro.XMusic.read;
import jaco.mp3.player.MP3Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.geom.RoundRectangle2D;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.Timer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

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
        loadImg();
    }

    void init() {

        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
        showPanel(new JPanelTrangChu());

        if (!Auth.isManager()) {
            btnManagerMusic.setVisible(false);
            btnManagerUser.setVisible(false);
        }

    }

    public void showPanel(JPanel panel) {
        chiPanel = panel;
        pnMain.removeAll();
        pnMain.add(chiPanel);
        pnMain.repaint();
        pnMain.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDiscover = new rojeru_san.complementos.RSButtonHover();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnTopCharts = new rojeru_san.complementos.RSButtonHover();
        btnPlaylist = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        lblAvatar = new Utils_Pro.ImageAvatar();
        btnManagerMusic = new rojeru_san.complementos.RSButtonHover();
        btnManagerUser = new rojeru_san.complementos.RSButtonHover();
        JPanelThanhNhac = new javax.swing.JPanel();
        lblAnhNhac = new Utils_Pro.ImageAvatar();
        lblNameMusic = new javax.swing.JLabel();
        thanhNhac = new Utils_Pro.ThanhNhac();
        btnBackP = new javax.swing.JButton();
        btnnextP = new javax.swing.JButton();
        lblpause = new javax.swing.JLabel();
        lblresume = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnMain.setBackground(new java.awt.Color(29, 34, 56));
        pnMain.setName(""); // NOI18N
        pnMain.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(38, 45, 71));

        btnDiscover.setBackground(new java.awt.Color(38, 45, 71));
        btnDiscover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/IconSearch.png"))); // NOI18N
        btnDiscover.setText("    Explore");
        btnDiscover.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnDiscover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscoverActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(38, 45, 71));
        btnHome.setForeground(new java.awt.Color(204, 204, 204));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tainghe.png"))); // NOI18N
        btnHome.setText("    Home");
        btnHome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnTopCharts.setBackground(new java.awt.Color(38, 45, 71));
        btnTopCharts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bieudo.png"))); // NOI18N
        btnTopCharts.setText("Top Charts");
        btnTopCharts.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTopCharts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopChartsActionPerformed(evt);
            }
        });

        btnPlaylist.setBackground(new java.awt.Color(38, 45, 71));
        btnPlaylist.setForeground(new java.awt.Color(204, 204, 204));
        btnPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        btnPlaylist.setText("Playlist");
        btnPlaylist.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylistActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Browse");

        lblAvatar.setBorderSize(3);
        lblAvatar.setBorderSpace(3);
        lblAvatar.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))); // NOI18N
        lblAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAvatarMouseClicked(evt);
            }
        });

        btnManagerMusic.setBackground(new java.awt.Color(38, 45, 71));
        btnManagerMusic.setForeground(new java.awt.Color(204, 204, 204));
        btnManagerMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        btnManagerMusic.setText("Manager Music");
        btnManagerMusic.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnManagerMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerMusicActionPerformed(evt);
            }
        });

        btnManagerUser.setBackground(new java.awt.Color(38, 45, 71));
        btnManagerUser.setForeground(new java.awt.Color(204, 204, 204));
        btnManagerUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        btnManagerUser.setText("Manager User");
        btnManagerUser.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnManagerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnDiscover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnPlaylist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnManagerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnManagerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addComponent(btnTopCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDiscover, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTopCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnManagerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnManagerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        JPanelThanhNhac.setBackground(new java.awt.Color(37, 44, 70));
        JPanelThanhNhac.setEnabled(false);

        lblAnhNhac.setBorderSize(0);
        lblAnhNhac.setBorderSpace(0);
        lblAnhNhac.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))); // NOI18N

        lblNameMusic.setForeground(new java.awt.Color(255, 255, 255));
        lblNameMusic.setText("Ten bai nhac");

        thanhNhac.setValue(0);

        btnBackP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backP.png"))); // NOI18N
        btnBackP.setContentAreaFilled(false);
        btnBackP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBackPMouseReleased(evt);
            }
        });

        btnnextP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/NextP.png"))); // NOI18N
        btnnextP.setContentAreaFilled(false);
        btnnextP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnextP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnextPMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnnextPMouseReleased(evt);
            }
        });
        btnnextP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextPActionPerformed(evt);
            }
        });

        lblpause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/play.png"))); // NOI18N
        lblpause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblpause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpauseMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblpauseMouseReleased(evt);
            }
        });
        lblpause.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblpausePropertyChange(evt);
            }
        });

        lblresume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/playing.png"))); // NOI18N
        lblresume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblresume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblresumeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblresumeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout JPanelThanhNhacLayout = new javax.swing.GroupLayout(JPanelThanhNhac);
        JPanelThanhNhac.setLayout(JPanelThanhNhacLayout);
        JPanelThanhNhacLayout.setHorizontalGroup(
            JPanelThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelThanhNhacLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(JPanelThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpause)
                    .addComponent(lblresume))
                .addGap(10, 10, 10)
                .addComponent(btnnextP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelThanhNhacLayout.setVerticalGroup(
            JPanelThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelThanhNhacLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JPanelThanhNhacLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JPanelThanhNhacLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JPanelThanhNhacLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(JPanelThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpause)
                    .addComponent(lblresume)))
            .addGroup(JPanelThanhNhacLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnnextP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JPanelThanhNhacLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(29, 34, 56));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover3.setBackground(new java.awt.Color(29, 34, 56));
        rSButtonHover3.setText("-");
        rSButtonHover3.setColorHover(new java.awt.Color(255, 0, 51));
        rSButtonHover3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 41, -1));

        rSButtonHover1.setBackground(new java.awt.Color(29, 34, 56));
        rSButtonHover1.setText("x");
        rSButtonHover1.setColorHover(new java.awt.Color(255, 0, 51));
        rSButtonHover1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 2, 48, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(JPanelThanhNhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(JPanelThanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        this.setExtendedState(JFrameMusic.ICONIFIED);
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void btnDiscoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscoverActionPerformed
        showPanel(new JPanelExplor());
    }//GEN-LAST:event_btnDiscoverActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        showPanel(new JPanelTrangChu());
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnTopChartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopChartsActionPerformed
        showPanel(new JPanelTopChart());
    }//GEN-LAST:event_btnTopChartsActionPerformed

    private void lblpauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpauseMouseClicked
        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
    }//GEN-LAST:event_lblpauseMouseClicked

    private void lblresumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresumeMouseClicked
        lblpause.setVisible(true);
        lblpause.setEnabled(true);
        lblresume.setVisible(false);
        lblresume.setEnabled(false);
    }//GEN-LAST:event_lblresumeMouseClicked

    private void btnManagerMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerMusicActionPerformed
        showPanel(new JPanelQlyNhac());
    }//GEN-LAST:event_btnManagerMusicActionPerformed

    private void btnPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaylistActionPerformed
        showPanel(new JPanelPlayList());
    }//GEN-LAST:event_btnPlaylistActionPerformed

    private void lblAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvatarMouseClicked
        new ProfileJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_lblAvatarMouseClicked

    private void btnManagerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerUserActionPerformed
        showPanel(new JPanelQlyAccount());
    }//GEN-LAST:event_btnManagerUserActionPerformed

    private void btnnextPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextPMouseClicked

    }//GEN-LAST:event_btnnextPMouseClicked

    private void lblpauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpauseMouseReleased
        resume();
    }//GEN-LAST:event_lblpauseMouseReleased

    private void lblresumeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresumeMouseReleased
        pause();
    }//GEN-LAST:event_lblresumeMouseReleased

    private void btnnextPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextPActionPerformed

    }//GEN-LAST:event_btnnextPActionPerformed

    private void btnBackPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackPMouseReleased
        previous();
    }//GEN-LAST:event_btnBackPMouseReleased

    private void btnnextPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextPMouseReleased
        next();
    }//GEN-LAST:event_btnnextPMouseReleased

    private void lblpausePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblpausePropertyChange

    }//GEN-LAST:event_lblpausePropertyChange

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
    public javax.swing.JPanel JPanelThanhNhac;
    private javax.swing.JButton btnBackP;
    private rojeru_san.complementos.RSButtonHover btnDiscover;
    private rojeru_san.complementos.RSButtonHover btnHome;
    private rojeru_san.complementos.RSButtonHover btnManagerMusic;
    private rojeru_san.complementos.RSButtonHover btnManagerUser;
    private rojeru_san.complementos.RSButtonHover btnPlaylist;
    private rojeru_san.complementos.RSButtonHover btnTopCharts;
    private javax.swing.JButton btnnextP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public Utils_Pro.ImageAvatar lblAnhNhac;
    private Utils_Pro.ImageAvatar lblAvatar;
    private javax.swing.JLabel lblNameMusic;
    public javax.swing.JLabel lblpause;
    public javax.swing.JLabel lblresume;
    private javax.swing.JPanel pnMain;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    public Utils_Pro.ThanhNhac thanhNhac;
    // End of variables declaration//GEN-END:variables

    SongDAO songDAO = new SongDAO();
    JPanelQlyNhac qln = new JPanelQlyNhac();
    public Player player;
    public long pause;
    int i = -1;
    public long total_length;
    FileInputStream fis;
    BufferedInputStream bis;
    File musicPath = null;

    public void playNhac(JTable tbl) throws FileNotFoundException, JavaLayerException, IOException {
        i = tbl.getSelectedRow();
        String mabh = (String) tbl.getValueAt(i, 0);
        Song s = songDAO.selectById(mabh);
        fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
        bis = new BufferedInputStream(fis);
        player = new javazoom.jl.player.Player(bis);
        musicPath = XMusic.readPath(s.getMusicpath());
        total_length = fis.available();
        new Thread() {
            @Override
            public void run() {
                try {
                    player.play();

                } catch (Exception e) {
                }
            }
        }.start();

        //lấy ảnh nhạc
        if (s.getAnh() != null) {
            lblAnhNhac.setToolTipText(Auth.user.getHinh());
            lblAnhNhac.setImage(XImage.read(s.getAnh()));
        }
        //tên bài nhạc
        lblNameMusic.setText(s.getTenbh());
        //Tốc độ nhạc
        duration(s);

    }

    //trả về đường dẫn nhạc cũ khi nhạc thay đổi
    public String layDiaChiCu(int i, JTable tbl) {
        i = tbl.getSelectedRow();
        String mabh = (String) tbl.getValueAt(i, 0);
        Song s = songDAO.selectById(mabh);
        return s.getMusicpath();
    }

    //Dừng nhạc ở đường dẫn
    public void Stop(String path) throws FileNotFoundException, JavaLayerException {
        fis = new FileInputStream(XMusic.readPath(path));
        bis = new BufferedInputStream(fis);
        Player players = new javazoom.jl.player.Player(bis);
        players.close();
    }

    //duration
    void duration(Song s) {
        //128kps birate cơ bản của file mp3
        try ( FileInputStream fis = new FileInputStream(XMusic.readPath(s.getMusicpath()))) {
            // lấy kích thước file
            long size = fis.getChannel().size();
            //công thức tính tốc độ truyền
            long bitrate = 128 * 1024;
            //tính ra tổng thời gian
            long duration = (size * 8) / bitrate;
            //chạy thanh processbar
            new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int value = thanhNhac.getValue();
                    thanhNhac.setMaximum((int) duration);
                    if (value <= thanhNhac.getMaximum()) {
                        thanhNhac.setValue(value + 1);
                    } else {

                    }
                    if (value == thanhNhac.getMaximum()) {

                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void loadImg() {
        if (Auth.user.getHinh() != null) {
            lblAvatar.setToolTipText(Auth.user.getHinh());
            lblAvatar.setImage(XImage.read(Auth.user.getHinh()));
        }
    }

    public void pause() {
        if (player != null) {
            try {
                pause = fis.available();
                player.close();
            } catch (Exception e) {
            }
        }
    }

    public void resume() {
        try {
            fis = new FileInputStream(musicPath);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
            fis.skip(total_length - pause);
            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();
        } catch (Exception e) {
        }
    }

    private void previous() {

    }

    private void next() {
        try {
            int s = i + 1;

        } catch (Exception e) {
        }
    }
}
