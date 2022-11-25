/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelMenu;

import UI.JFrameMusic;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rojeru_san.complementos.RSButtonHover;

/**
 *
 * @author NAM PC
 */
public class JPanelPlayList extends javax.swing.JPanel {

    int count = 0;

    private JPanel chiPanel;

    public JPanelPlayList() {
        initComponents();
        lbladd.setVisible(true);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        lbl7.setVisible(false);
        lbl8.setVisible(false);
        lbl9.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new CustomTable.TableDark();
        txtSeach = new swing.TextFieldAnimation();
        pnMain = new javax.swing.JPanel();
        lbladd = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setBackground(new java.awt.Color(29, 34, 56));
        setPreferredSize(new java.awt.Dimension(800, 520));

        pnMain.setBackground(new java.awt.Color(29, 34, 56));

        lbladd.setForeground(new java.awt.Color(255, 255, 255));
        lbladd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist2.png"))); // NOI18N
        lbladd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        lbladd.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbladdAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lbladd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladdMouseClicked(evt);
            }
        });

        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });

        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addPlaylist3.png"))); // NOI18N
        lbl9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladd)
                    .addComponent(lbl5))
                .addGap(28, 28, 28)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl6)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl2)
                    .addComponent(lbl7))
                .addGap(40, 40, 40)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl8)
                    .addComponent(lbl3))
                .addGap(42, 42, 42)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl6)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbladd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl2)
                            .addComponent(lbl3)
                            .addComponent(lbl4))
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMainLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lbl5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl9, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        if (evt.getClickCount() == 2) {                      
            JOptionPane.showMessageDialog(this, "hiện playlist2");
        }
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbladdAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbladdAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_lbladdAncestorAdded

    private void lbladdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladdMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            count += 1;
            if (count == 1) {
                lbl1.setVisible(true);
            } else if (count == 2) {
                lbl2.setVisible(true);
            } else if (count == 3) {
                lbl3.setVisible(true);
            } else if (count == 4) {
                lbl4.setVisible(true);
            } else if (count == 5) {
                lbl5.setVisible(true);
            } else if (count == 6) {
                lbl6.setVisible(true);
            } else if (count == 7) {
                lbl7.setVisible(true);
            } else if (count == 8) {
                lbl8.setVisible(true);
            } else if (count == 9) {
                lbl9.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Không thể tạo thêm Playlist !!!");
            }
        }
    }//GEN-LAST:event_lbladdMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbladd;
    private javax.swing.JPanel pnMain;
    private CustomTable.TableDark tbl;
    private swing.TextFieldAnimation txtSeach;
    // End of variables declaration//GEN-END:variables
}
