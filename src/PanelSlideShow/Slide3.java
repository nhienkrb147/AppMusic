/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PanelSlideShow;

import javax.swing.JOptionPane;

/**
 *
 * @author RAVEN
 */
public class Slide3 extends javax.swing.JPanel {

    /**
     * Creates new form Slide1
     */
    public Slide3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new ClassSlideShow_IMG.PictureBox();
        btnPlaySlide = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(29, 34, 56));

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/taylor.jpg"))); // NOI18N

        btnPlaySlide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/play.png"))); // NOI18N
        btnPlaySlide.setText("Play");
        btnPlaySlide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySlideActionPerformed(evt);
            }
        });
        pictureBox1.add(btnPlaySlide);
        btnPlaySlide.setBounds(690, 110, 60, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaySlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaySlideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlaySlideActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnPlaySlide;
    private ClassSlideShow_IMG.PictureBox pictureBox1;
    // End of variables declaration//GEN-END:variables
}
