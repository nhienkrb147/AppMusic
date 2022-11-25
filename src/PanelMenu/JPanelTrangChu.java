/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelMenu;

import PanelSlideShow.Slide1;
import PanelSlideShow.Slide2;
import PanelSlideShow.Slide3;
import jaco.mp3.player.MP3Player;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSII
 */
public class JPanelTrangChu extends javax.swing.JPanel {

    /**
     * Creates new form Pn
     */
    public JPanelTrangChu() {

        initComponents();
        slideshow1.initSlideshow(new Slide1(), new Slide2(), new Slide3());
        Test();
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        for (int i = 0; i <= 10; i++) {
            model.addRow(new Object[]{i, "nhien", "fffff", "n001"});
        }

 
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

    public void initPlay() {
        try {
            new MP3Player(new File("")).play();
            Thread.sleep(10000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        imageSlider1 = new PnSlider.ImageSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        slideshow1 = new ClassSlideShow.Slideshow();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new CustomTable.TableDark();
        lblBack = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblvideo = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setPreferredSize(new java.awt.Dimension(805, 527));

        jPanel1.setBackground(new java.awt.Color(29, 34, 56));

        imageSlider1.setBackground(new java.awt.Color(29, 34, 56));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("New Songs");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Played");

        tbl.setBackground(new java.awt.Color(29, 34, 56));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        lblNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        lblvideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Songs/aka.gif"))); // NOI18N
        lblvideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblvideoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNext)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imageSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(imageSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        slideshow1.back();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        slideshow1.next();
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblvideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblvideoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblvideoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private PnSlider.ImageSlider imageSlider1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblvideo;
    private ClassSlideShow.Slideshow slideshow1;
    private CustomTable.TableDark tbl;
    // End of variables declaration//GEN-END:variables
}
