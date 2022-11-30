/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelMenu;

import DAO.SongDAO;
import Entity.Song;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import PanelSlideShow.Slide1;
import PanelSlideShow.Slide2;
import PanelSlideShow.Slide3;
import Utils_Pro.XImage;
import Utils_Pro.XMusic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.JLabel;
import javax.swing.Timer;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import swing.EventCallBack;
import swing.EventTextField;

/**
 *
 * @author MSII
 */
public class JPanelTopChart extends javax.swing.JPanel {

    /**
     * Creates new form Pn
     */
    public JPanelTopChart() {
        initComponents();
        search();
        Test();
        init();
    }

    public void Test() {
        tbl.fixTable(jScrollPane1);
        tbl.setColumnAlignment(0, JLabel.CENTER);
        tbl.setCellAlignment(0, JLabel.CENTER);
        tbl.setColumnAlignment(2, JLabel.CENTER);
        tbl.setCellAlignment(2, JLabel.CENTER);
        tbl.setColumnAlignment(4, JLabel.RIGHT);
        tbl.setCellAlignment(4, JLabel.RIGHT);
        tbl.setColumnWidth(0, 50);
        tbl.setColumnWidth(2, 100);

    }

    void search() {
        txtSeach.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                //  Test
                try {
                    for (int i = 1; i <= 50; i++) {

                        Thread.sleep(10);
                    }
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new CustomTable.TableDark();
        txtSeach = new swing.TextFieldAnimation();
        LPThanhNhac = new javax.swing.JPanel();
        lblAnhNhac = new Utils_Pro.ImageAvatar();
        lblNameMusic = new javax.swing.JLabel();
        thanhNhac = new Utils_Pro.ThanhNhac();
        btnLoop = new javax.swing.JButton();
        btnShuffle = new javax.swing.JButton();
        lblpause = new javax.swing.JLabel();
        lblresume = new javax.swing.JLabel();
        lblNguoiHat = new javax.swing.JLabel();
        btnBackP = new javax.swing.JButton();
        btnnextP = new javax.swing.JButton();
        btnVolumeDown = new javax.swing.JButton();
        btnVolumeUp = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setPreferredSize(new java.awt.Dimension(805, 527));

        jPanel2.setBackground(new java.awt.Color(29, 34, 56));

        tbl.setBackground(new java.awt.Color(29, 34, 56));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nhac", "Tac gia", "Thoi luong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        txtSeach.setAnimationColor(new java.awt.Color(3, 174, 249));

        LPThanhNhac.setBackground(new java.awt.Color(37, 44, 70));
        LPThanhNhac.setEnabled(false);

        lblAnhNhac.setBorderSize(0);
        lblAnhNhac.setBorderSpace(0);
        lblAnhNhac.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))); // NOI18N

        lblNameMusic.setForeground(new java.awt.Color(255, 255, 255));
        lblNameMusic.setText("Ten bai nhac");

        thanhNhac.setValue(0);

        btnLoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/infiniti.png"))); // NOI18N
        btnLoop.setContentAreaFilled(false);
        btnLoop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoopMouseReleased(evt);
            }
        });

        btnShuffle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/random.png"))); // NOI18N
        btnShuffle.setContentAreaFilled(false);
        btnShuffle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShuffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShuffleMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnShuffleMouseReleased(evt);
            }
        });
        btnShuffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShuffleActionPerformed(evt);
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

        lblNguoiHat.setForeground(new java.awt.Color(204, 204, 204));
        lblNguoiHat.setText("Người hát");

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

        btnVolumeDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/volumedown.png"))); // NOI18N
        btnVolumeDown.setContentAreaFilled(false);
        btnVolumeDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolumeDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolumeDownMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVolumeDownMouseReleased(evt);
            }
        });
        btnVolumeDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeDownActionPerformed(evt);
            }
        });

        btnVolumeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/volumeup.png"))); // NOI18N
        btnVolumeUp.setContentAreaFilled(false);
        btnVolumeUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolumeUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolumeUpMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVolumeUpMouseReleased(evt);
            }
        });
        btnVolumeUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LPThanhNhacLayout = new javax.swing.GroupLayout(LPThanhNhac);
        LPThanhNhac.setLayout(LPThanhNhacLayout);
        LPThanhNhacLayout.setHorizontalGroup(
            LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNguoiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblresume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpause))
                        .addGap(7, 7, 7)
                        .addComponent(btnnextP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShuffle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolumeDown, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolumeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        LPThanhNhacLayout.setVerticalGroup(
            LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNguoiHat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LPThanhNhacLayout.createSequentialGroup()
                                        .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                                                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblresume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblpause)
                                                    .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnShuffle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnnextP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(8, 8, 8))
                                            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                                                .addComponent(btnLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LPThanhNhacLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolumeDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVolumeUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(LPThanhNhac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(LPThanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoopMouseReleased

    }//GEN-LAST:event_btnLoopMouseReleased

    private void btnShuffleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShuffleMouseClicked
        
    }//GEN-LAST:event_btnShuffleMouseClicked

    private void btnShuffleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShuffleMouseReleased

    }//GEN-LAST:event_btnShuffleMouseReleased

    private void btnShuffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShuffleActionPerformed

    }//GEN-LAST:event_btnShuffleActionPerformed

    private void lblpauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpauseMouseClicked
        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
    }//GEN-LAST:event_lblpauseMouseClicked

    private void lblpauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpauseMouseReleased
        resume();
    }//GEN-LAST:event_lblpauseMouseReleased

    private void lblpausePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblpausePropertyChange

    }//GEN-LAST:event_lblpausePropertyChange

    private void lblresumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresumeMouseClicked
        lblpause.setVisible(true);
        lblpause.setEnabled(true);
        lblresume.setVisible(false);
        lblresume.setEnabled(false);
    }//GEN-LAST:event_lblresumeMouseClicked

    private void lblresumeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresumeMouseReleased
        pause();
    }//GEN-LAST:event_lblresumeMouseReleased

    private void btnBackPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackPMouseReleased
        try {
            previous();
        } catch (JavaLayerException ex) {
            Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackPMouseReleased

    private void btnnextPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnextPMouseClicked

    private void btnnextPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextPMouseReleased
        next();
    }//GEN-LAST:event_btnnextPMouseReleased

    private void btnnextPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnextPActionPerformed

    private void btnVolumeDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeDownMouseClicked
        VolumeDown(0.1);
    }//GEN-LAST:event_btnVolumeDownMouseClicked

    private void btnVolumeDownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeDownMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeDownMouseReleased

    private void btnVolumeDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeDownActionPerformed

    private void btnVolumeUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeUpMouseClicked
        VolumeUp(0.1);
    }//GEN-LAST:event_btnVolumeUpMouseClicked

    private void btnVolumeUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeUpMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeUpMouseReleased

    private void btnVolumeUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel LPThanhNhac;
    private javax.swing.JButton btnBackP;
    private javax.swing.JButton btnLoop;
    private javax.swing.JButton btnShuffle;
    private javax.swing.JButton btnVolumeDown;
    private javax.swing.JButton btnVolumeUp;
    private javax.swing.JButton btnnextP;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public Utils_Pro.ImageAvatar lblAnhNhac;
    public javax.swing.JLabel lblNameMusic;
    private javax.swing.JLabel lblNguoiHat;
    public javax.swing.JLabel lblpause;
    public javax.swing.JLabel lblresume;
    private CustomTable.TableDark tbl;
    public Utils_Pro.ThanhNhac thanhNhac;
    private swing.TextFieldAnimation txtSeach;
    // End of variables declaration//GEN-END:variables
    void init() {
        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
    }
    int i = -1;
    SongDAO dao = new SongDAO();
    public int dung;
    public Player player;
    public long pause;
    public long total_length;
    public FileInputStream fis;
    public BufferedInputStream bis;
    File musicPath = null;
    int play = 0;

    void playNhac() throws FileNotFoundException, JavaLayerException, IOException {
        if (play == 0) {
            i = tbl.getSelectedRow();
            String mabh = (String) tbl.getValueAt(i, 0);
            Song s = dao.selectById(mabh);
            fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
            bis = new BufferedInputStream(fis);
            player = new javazoom.jl.player.Player(bis);
            musicPath = XMusic.readPath(s.getMusicpath());
            total_length = fis.available();
            //lấy ảnh nhạc
            if (s.getAnh() != null) {
                lblAnhNhac.setImage(XImage.read(s.getAnh()));
            }
            //tên bài nhạc
            lblNameMusic.setText(s.getTenbh());
            lblNguoiHat.setText(s.getNguoitb());
            //Tốc độ nhạc
            duration(s);
            play = 1;
            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();
        } else {
            player.close();
            play = 0;
            playNhac();
        }
    }

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
                    } if (value == thanhNhac.getMaximum()) {
                        next();
                    }
                }
            }).start();
        } catch (Exception e) {
            e.printStackTrace();
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

    private void previous() throws JavaLayerException {
        thanhNhac.setValue(0);
        if (play == 0) {
            try {
                int s1 = tbl.getSelectedRow() - 1;
                String mabh = (String) tbl.getValueAt(s1, 0);
                Song s = dao.selectById(mabh);
                fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
                bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                play = 1;
                //lấy ảnh nhạc
                if (s.getAnh() != null) {
                    lblAnhNhac.setImage(XImage.read(s.getAnh()));
                }
                //tên bài nhạc
                lblNguoiHat.setText(s.getNguoitb());
                lblNameMusic.setText(s.getTenbh());
                //Tốc độ nhạc
                tbl.setRowSelectionInterval(s1, s1);
            } catch (Exception e) {
                System.out.println("Problem playing file");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();

        } else {
            player.close();
            play = 0;
            previous();
        }
    }

    private void next() {
        thanhNhac.setValue(0);
        if (play == 0) {
            try {
                int s1 = tbl.getSelectedRow() + 1;
                String mabh = (String) tbl.getValueAt(s1, 0);
                Song s = dao.selectById(mabh);
                fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
                bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                play = 1;
                //lấy ảnh nhạc
                if (s.getAnh() != null) {
                    lblAnhNhac.setImage(XImage.read(s.getAnh()));
                }
                //tên bài nhạc
                lblNguoiHat.setText(s.getNguoitb());
                lblNameMusic.setText(s.getTenbh());
                //Tốc độ nhạc
                tbl.setRowSelectionInterval(s1, s1);
            } catch (Exception e) {
                System.out.println("Problem playing file");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();

        } else {
            player.close();
            play = 0;
            next();
        }
    }

    private void VolumeDown(Double valueToPlusMinus) {
        // lấy Mixer Information từ hệ thống âm thanh
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        // Dùng vòng lặp để liệt kê tất cả mixers
        for (Mixer.Info mixerInfo : mixers) {
            // lấy Mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            // Bây giờ nhận dòng Target Line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            // Ở đây một lần nữa sử dụng vòng lặp for để liệt kê các dòng
            for (Line.Info lineInfo : lineInfos) {
                // Tạo line rỗng
                Line line = null;
                // Make a boolean as opened
                boolean opened = true;
                // Now use try exception for opening a line
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    // Now Check If Line Is not Opened
                    if (!opened) {
                        // Open Line
                        line.open();
                    }
                    // Make a float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    // Get Current Volume Now
                    float currentVolume = volControl.getValue();
                    // Make a temp double variable and store valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    // Make a float and calculate the addition or subtraction in volume
                    float changedCalc = (float) ((float) currentVolume - (double) volumeToCut);
                    // Now Set This Changed Value Into Volume Line.
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    // Close Line If it opened
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    private void VolumeUp(Double valueToPlusMinus) {
        // Get Mixer Information From AudioSystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        // Now use a for loop to list all mixers
        for (Mixer.Info mixerInfo : mixers) {
            // Get Mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            // Now Get Target Line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            // Here again use for loop to list lines
            for (Line.Info lineInfo : lineInfos) {
                // Make a null line
                Line line = null;
                // Make a boolean as opened
                boolean opened = true;
                // Now use try exception for opening a line
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    // Now Check If Line Is not Opened
                    if (!opened) {
                        // Open Line
                        line.open();
                    }
                    // Make a float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    // Get Current Volume Now
                    float currentVolume = volControl.getValue();
                    // Make a temp double variable and store valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    // Make a float and calculate the addition or subtraction in volume
                    float changedCalc = (float) ((float) currentVolume + (double) volumeToCut);
                    // Now Set This Changed Value Into Volume Line.
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    // Close Line If it opened
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }
}
