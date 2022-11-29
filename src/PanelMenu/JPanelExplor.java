/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelMenu;

import DAO.SongDAO;
import Entity.Song;
import UI.AddMusicJDiaglog;
import Utils_Pro.MsgBox;
import java.io.File;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import swing.EventCallBack;
import swing.EventTextField;

/**
 *
 * @author MSII
 */
public class JPanelExplor extends javax.swing.JPanel {

   private String  TL;
    public JPanelExplor() {
        initComponents();
       cosTomTable();
        search();
        init();

    }

    public void cosTomTable() {
        tblExplor.fixTable(jScrollPane1);
        tblExplor.setColumnAlignment(0, JLabel.CENTER);
        tblExplor.setCellAlignment(0, JLabel.CENTER);
        tblExplor.setColumnAlignment(2, JLabel.CENTER);
        tblExplor.setCellAlignment(2, JLabel.CENTER);
        tblExplor.setColumnAlignment(4, JLabel.RIGHT);
        tblExplor.setCellAlignment(4, JLabel.RIGHT);
        tblExplor.setColumnWidth(0, 50);
        tblExplor.setColumnWidth(2, 100);

    }

    void search() {
        txtSearch.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
               String key;
                try {
                    for (int i = 1; i <= 50; i++) {

                        Thread.sleep(10);
                    }
                    fillTableExplor(TL);
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

        MnSieuTo = new javax.swing.JPopupMenu();
        MnPlay = new javax.swing.JMenuItem();
        MnAddPlayList = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Tabs = new CustomTable.TablePanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelRound2 = new Utils_Pro.PanelRound();
        V_Pop = new javax.swing.JLabel();
        panelRound3 = new Utils_Pro.PanelRound();
        RB = new javax.swing.JLabel();
        panelRound4 = new Utils_Pro.PanelRound();
        UsUk = new javax.swing.JLabel();
        panelRound5 = new Utils_Pro.PanelRound();
        Rap = new javax.swing.JLabel();
        panelRound6 = new Utils_Pro.PanelRound();
        Gaming = new javax.swing.JLabel();
        panelRound7 = new Utils_Pro.PanelRound();
        HipHop = new javax.swing.JLabel();
        panelRound8 = new Utils_Pro.PanelRound();
        Jazz = new javax.swing.JLabel();
        panelRound9 = new Utils_Pro.PanelRound();
        Sleep = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExplor = new CustomTable.TableDark();
        txtSearch = new swing.TextFieldAnimation();

        MnSieuTo.setBackground(new java.awt.Color(0, 153, 255));
        MnSieuTo.setPreferredSize(new java.awt.Dimension(150, 52));

        MnPlay.setBackground(new java.awt.Color(0, 153, 204));
        MnPlay.setForeground(new java.awt.Color(204, 204, 204));
        MnPlay.setText("Play");
        MnSieuTo.add(MnPlay);

        MnAddPlayList.setText("AddPlayList");

        jMenuItem1.setText("jMenuItem1");
        MnAddPlayList.add(jMenuItem1);

        MnSieuTo.add(MnAddPlayList);

        setBackground(new java.awt.Color(29, 34, 56));

        jPanel1.setBackground(new java.awt.Color(29, 34, 56));

        Tabs.setBackground(new java.awt.Color(204, 204, 204));
        Tabs.setForeground(new java.awt.Color(255, 255, 255));
        Tabs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(29, 34, 56));

        jPanel7.setBackground(new java.awt.Color(29, 34, 56));

        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        V_Pop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_VPop.png"))); // NOI18N
        V_Pop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_Pop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                V_PopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(V_Pop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(V_Pop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);

        RB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Praty.png"))); // NOI18N
        RB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);

        UsUk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_USUK.png"))); // NOI18N
        UsUk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsUk.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                UsUkAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        UsUk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsUkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsUk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsUk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        Rap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_RapHip.png"))); // NOI18N
        Rap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound6.setRoundBottomLeft(30);
        panelRound6.setRoundBottomRight(30);
        panelRound6.setRoundTopLeft(30);
        panelRound6.setRoundTopRight(30);

        Gaming.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Game.png"))); // NOI18N
        Gaming.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gaming.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GamingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Gaming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Gaming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound7.setRoundBottomLeft(30);
        panelRound7.setRoundBottomRight(30);
        panelRound7.setRoundTopLeft(30);
        panelRound7.setRoundTopRight(30);

        HipHop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_RapHop.png"))); // NOI18N
        HipHop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HipHop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HipHopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HipHop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HipHop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound8.setRoundBottomLeft(30);
        panelRound8.setRoundBottomRight(30);
        panelRound8.setRoundTopLeft(30);
        panelRound8.setRoundTopRight(30);

        Jazz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Jazz.png"))); // NOI18N
        Jazz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jazz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JazzMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jazz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jazz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound9.setRoundBottomLeft(30);
        panelRound9.setRoundBottomRight(30);
        panelRound9.setRoundTopLeft(30);
        panelRound9.setRoundTopRight(30);

        Sleep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Sleep.png"))); // NOI18N
        Sleep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sleep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SleepMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sleep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sleep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tabs.addTab("Thể Loại", jPanel6);

        jPanel8.setBackground(new java.awt.Color(29, 34, 56));

        jPanel9.setBackground(new java.awt.Color(29, 34, 56));

        tblExplor.setBackground(new java.awt.Color(29, 34, 56));
        tblExplor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên", "Mật Khẩu", "Email", "Ngày Sinh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExplor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExplorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExplor);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Tabs.addTab("Nhạc", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void V_PopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_PopMouseClicked
        TL = "V-pop";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_V_PopMouseClicked

    private void UsUkAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_UsUkAncestorAdded
          
    }//GEN-LAST:event_UsUkAncestorAdded

    private void UsUkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsUkMouseClicked
      TL = "USUK";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_UsUkMouseClicked

    private void RBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBMouseClicked
       TL = "R&B";
        fillTableExplor(TL );
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_RBMouseClicked

    private void RapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RapMouseClicked
      TL = "RAP";
        fillTableExplor(TL );
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_RapMouseClicked

    private void HipHopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HipHopMouseClicked
      TL = "HipHop";
        fillTableExplor(TL );
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_HipHopMouseClicked

    private void JazzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JazzMouseClicked
      TL = "jazz";
        fillTableExplor(TL );
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_JazzMouseClicked

    private void SleepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SleepMouseClicked
        TL = "sleep";
        fillTableExplor(TL );
        Tabs.setSelectedIndex(1);   
    }//GEN-LAST:event_SleepMouseClicked

    private void GamingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GamingMouseClicked
          TL = "Gaming";
        fillTableExplor(TL );
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_GamingMouseClicked

    private void tblExplorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExplorMouseClicked
       tblExplor.setComponentPopupMenu(MnSieuTo);
    }//GEN-LAST:event_tblExplorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gaming;
    private javax.swing.JLabel HipHop;
    private javax.swing.JLabel Jazz;
    private javax.swing.JMenu MnAddPlayList;
    private javax.swing.JMenuItem MnPlay;
    private javax.swing.JPopupMenu MnSieuTo;
    private javax.swing.JLabel RB;
    private javax.swing.JLabel Rap;
    private javax.swing.JLabel Sleep;
    private CustomTable.TablePanel Tabs;
    private javax.swing.JLabel UsUk;
    private javax.swing.JLabel V_Pop;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private Utils_Pro.PanelRound panelRound2;
    private Utils_Pro.PanelRound panelRound3;
    private Utils_Pro.PanelRound panelRound4;
    private Utils_Pro.PanelRound panelRound5;
    private Utils_Pro.PanelRound panelRound6;
    private Utils_Pro.PanelRound panelRound7;
    private Utils_Pro.PanelRound panelRound8;
    private Utils_Pro.PanelRound panelRound9;
    private CustomTable.TableDark tblExplor;
    private swing.TextFieldAnimation txtSearch;
    // End of variables declaration//GEN-END:variables

    SongDAO dao = new SongDAO();

    void init() {
        initTable();
        fillTableExplor(TL);

    }

    void initTable() {
        DefaultTableModel tblmodel = (DefaultTableModel) tblExplor.getModel();
        String[] cols = new String[]{"Mã bài hát", "Tên bài hát", "Thể loại", "Người sáng tác", "Người trình bày", "Ảnh", "Ngày tạo"};
        tblmodel.setColumnIdentifiers(cols);
    }

    void fillTableExplor(String keyWords) {
        DefaultTableModel tableModel = (DefaultTableModel) tblExplor.getModel();
        tableModel.setRowCount(0);
        String search = txtSearch.getText();
        try {
            List<Song> list = dao.selectByTheLoai(keyWords, search);

            for (Song s : list) {
                Object[] rows = {s.getMabh(), s.getTenbh(), s.getTheloai(), s.getNguoist(), s.getNguoitb(), s.getAnh(), s.getNgaytao()};
                tableModel.addRow(rows);
            }

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
        }

    }

}
