/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.PlaylistDAO;
import DAO.SongDAO;
import Entity.PlayList;
import Entity.Song;
import Entity.User;
import PanelMenu.JPanelExplor;
import PanelMenu.JPanelPlaylist2;
import PanelMenu.JPanelTopChart;
import PanelMenu.JPanelQlyAccount;
import PanelMenu.JPanelQlyNhac;
import PanelMenu.JPanelTrangChu;
import Utils_Pro.Auth;
import Utils_Pro.MsgBox;
import Utils_Pro.XDate;
import Utils_Pro.XImage;
import Utils_Pro.XMusic;
import static Utils_Pro.XMusic.read;
import jaco.mp3.player.MP3Player;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Timer;

/**
 *
 * @author MSII
 */
public class JFrameMusic extends javax.swing.JFrame {

    private JPanel chiPanel;
    User user = new User();
    PlayList playList = new PlayList();
    PlaylistDAO playlistDAO = new PlaylistDAO();
    PlayList playList_matk = playlistDAO.selectById2(Auth.user.getMatk());
    int countClick = playList_matk.getCounts();

    public JFrameMusic() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
        init();

        loadImg();
        showPlaylist();
//        btnPlaylist1.setVisible(false);
//        btnPlaylist2.setVisible(false);

    }

    void init() {

        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblplay.setVisible(true);
        lblplay.setEnabled(true);
        showPanel(new JPanelTrangChu());

        if (!Auth.isManager()) {
            btnManagerMusic.setVisible(false);
            btnManagerUser.setVisible(false);
        }

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
        btnDiscover = new rojeru_san.complementos.RSButtonHover();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnTopCharts = new rojeru_san.complementos.RSButtonHover();
        btnCreatePlaylist = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        lblAvatar = new Utils_Pro.ImageAvatar();
        btnManagerMusic = new rojeru_san.complementos.RSButtonHover();
        btnManagerUser = new rojeru_san.complementos.RSButtonHover();
        btnPlaylist1 = new rojeru_san.complementos.RSButtonHover();
        btnPlaylist2 = new rojeru_san.complementos.RSButtonHover();
        jPanel3 = new javax.swing.JPanel();
        imageAvatar2 = new Utils_Pro.ImageAvatar();
        jLabel4 = new javax.swing.JLabel();
        thanhNhac = new Utils_Pro.ThanhNhac();
        btnBackP = new javax.swing.JButton();
        btnnextP = new javax.swing.JButton();
        lblpause = new javax.swing.JLabel();
        lblplay = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnMain.setBackground(new java.awt.Color(29, 34, 56));
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

        btnCreatePlaylist.setBackground(new java.awt.Color(38, 45, 71));
        btnCreatePlaylist.setForeground(new java.awt.Color(204, 204, 204));
        btnCreatePlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        btnCreatePlaylist.setText("Create Playlist");
        btnCreatePlaylist.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCreatePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePlaylistActionPerformed(evt);
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

        btnPlaylist1.setBackground(new java.awt.Color(38, 45, 71));
        btnPlaylist1.setForeground(new java.awt.Color(204, 204, 204));
        btnPlaylist1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        btnPlaylist1.setText("Playlist #1");
        btnPlaylist1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPlaylist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylist1ActionPerformed(evt);
            }
        });

        btnPlaylist2.setBackground(new java.awt.Color(38, 45, 71));
        btnPlaylist2.setForeground(new java.awt.Color(204, 204, 204));
        btnPlaylist2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        btnPlaylist2.setText("Playlist #2");
        btnPlaylist2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPlaylist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylist2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnDiscover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnCreatePlaylist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
            .addComponent(btnPlaylist1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnPlaylist2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addGap(0, 0, 0)
                .addComponent(btnManagerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnManagerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCreatePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlaylist2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

        thanhNhac.setValue(0);
        jPanel3.add(thanhNhac, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 460, -1));

        btnBackP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backP.png"))); // NOI18N
        btnBackP.setContentAreaFilled(false);
        btnBackP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnBackP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 28, 28));

        btnnextP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/NextP.png"))); // NOI18N
        btnnextP.setContentAreaFilled(false);
        btnnextP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnextP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnextPMouseClicked(evt);
            }
        });
        jPanel3.add(btnnextP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 28, 28));

        lblpause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/playing.png"))); // NOI18N
        lblpause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblpause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpauseMouseClicked(evt);
            }
        });
        jPanel3.add(lblpause, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        lblplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/play.png"))); // NOI18N
        lblplay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblplayMouseClicked(evt);
            }
        });
        jPanel3.add(lblplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 15, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1017, Short.MAX_VALUE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        lblplay.setVisible(true);
        lblplay.setEnabled(true);
        pauseMusic();
    }//GEN-LAST:event_lblpauseMouseClicked

    private void lblplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblplayMouseClicked
//        playMusic();
        lblpause.setVisible(true);
        lblpause.setEnabled(true);
        lblplay.setVisible(false);
        lblplay.setEnabled(false);
    }//GEN-LAST:event_lblplayMouseClicked

    private void btnManagerMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerMusicActionPerformed
        showPanel(new JPanelQlyNhac());
    }//GEN-LAST:event_btnManagerMusicActionPerformed

    private void btnCreatePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePlaylistActionPerformed

//        countClick = playList.getCounts();
        countClick += 1;
        System.out.println(countClick);

        if (countClick == 0) {
//            btnPlaylist1.requestFocus();
//            btnPlaylist1.setVisible(true);
//            insert();
        } else if (countClick == 1) {
//            btnPlaylist2.requestFocus();
//            btnPlaylist2.setVisible(true);
//            insert();
        } else if (countClick == 2) {
            MsgBox.alert(this, "chỉ được phép tạo 2 playlist");
            countClick -= 1;
        }

    }//GEN-LAST:event_btnCreatePlaylistActionPerformed

    private void lblAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvatarMouseClicked
        new ProfileJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_lblAvatarMouseClicked

    private void btnManagerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerUserActionPerformed
        showPanel(new JPanelQlyAccount());
    }//GEN-LAST:event_btnManagerUserActionPerformed

    private void btnnextPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextPMouseClicked

    }//GEN-LAST:event_btnnextPMouseClicked

    private void btnPlaylist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaylist1ActionPerformed
        // TODO add your handling code here:
        if (countClick == 1 || countClick == (countClick -= 1)) {
            showPanel(new JPanelPlaylist2());
        }
    }//GEN-LAST:event_btnPlaylist1ActionPerformed

    private void btnPlaylist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaylist2ActionPerformed
        // TODO add your handling code here:
        if (countClick == 2 || countClick == (countClick += 1)) {
            showPanel(new JPanelPlaylist2());
        }
    }//GEN-LAST:event_btnPlaylist2ActionPerformed

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
    private javax.swing.JButton btnBackP;
    private rojeru_san.complementos.RSButtonHover btnCreatePlaylist;
    private rojeru_san.complementos.RSButtonHover btnDiscover;
    private rojeru_san.complementos.RSButtonHover btnHome;
    private rojeru_san.complementos.RSButtonHover btnManagerMusic;
    private rojeru_san.complementos.RSButtonHover btnManagerUser;
    private rojeru_san.complementos.RSButtonHover btnPlaylist1;
    private rojeru_san.complementos.RSButtonHover btnPlaylist2;
    private rojeru_san.complementos.RSButtonHover btnTopCharts;
    private javax.swing.JButton btnnextP;
    private Utils_Pro.ImageAvatar imageAvatar2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private Utils_Pro.ImageAvatar lblAvatar;
    private javax.swing.JLabel lblpause;
    private javax.swing.JLabel lblplay;
    private javax.swing.JPanel pnMain;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private Utils_Pro.ThanhNhac thanhNhac;
    // End of variables declaration//GEN-END:variables

    SongDAO songDAO = new SongDAO();
    JPanelQlyNhac qln = new JPanelQlyNhac();

    public void playMusic(int i, JTable tbl) {
        i = tbl.getSelectedRow();
        String mabh = (String) tbl.getValueAt(i, 0);
        Song s = songDAO.selectById(mabh);
        MP3Player mp3 = read(s.getMusicpath());
        mp3.play();
//        duration();
    }

    void pauseMusic() {
        MP3Player mp3 = read("matmoc.mp3");
        mp3.stop();

    }

    void duration() {
        //128kps birate cơ bản của file mp3
        try ( FileInputStream fis = new FileInputStream(XMusic.readPath("matmoc.mp3"))) {
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

    PlayList getForm() {
        PlayList playList = new PlayList();
        playList.setMatk(Auth.user.getMatk());
        playList.setTieude("Playlist #" + countClick);
        playList.setCounts(countClick);
        playList.setHinh("null");
        playList.setDescriptions("");
        playList.setNgaytao(new Date());
        return playList;
    }

    void insert() {
        PlayList playList = getForm();
        try {
            playlistDAO.insert(playList);
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void showPlaylist() {
        try {
//            System.out.println(playList_matk.getMatk());
//            System.out.println(playList_matk.getCounts());
            System.out.println(countClick);
            List<PlayList> list = playlistDAO.selectById_matk(Auth.user.getMatk());

            if (Auth.user.getMatk() == playList_matk.getMatk()) {
                for (PlayList pl : list) {
                    System.out.println(pl.getCounts());
                    if (pl.getCounts() == 1) {
                        btnPlaylist1.setVisible(true);
                    } else {
                        btnPlaylist1.setVisible(false);
                    }

                    if (pl.getCounts() == 2) {
                        btnPlaylist2.setVisible(true);
                    } else {
                        btnPlaylist2.setVisible(false);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
