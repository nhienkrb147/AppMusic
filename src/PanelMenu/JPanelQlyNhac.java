/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelMenu;

import UI.AddMusicJDiaglog;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import swing.EventCallBack;
import swing.EventTextField;

/**
 *
 * @author MSII
 */
public class JPanelQlyNhac extends javax.swing.JPanel {

    /**
     * Creates new form ads
     */
    public JPanelQlyNhac() {
        initComponents();
        Test();
        search();
         DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        for(int i =0 ; i<= 10;i++){
            model.addRow(new Object[]{i,"nhien","fffff","n001"});
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
      void search(){
             txtSearch.addEvent(new EventTextField() {
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

        jPanel2 = new javax.swing.JPanel();
        lblNameApp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new CustomTable.TableDark();
        txtSearch = new swing.TextFieldAnimation();
        btnThem = new rojeru_san.complementos.RSButtonHover();
        btnXoa = new rojeru_san.complementos.RSButtonHover();
        btSua = new rojeru_san.complementos.RSButtonHover();

        jPanel2.setBackground(new java.awt.Color(29, 34, 56));

        lblNameApp.setFont(new java.awt.Font("Brush Script MT", 1, 45)); // NOI18N
        lblNameApp.setForeground(new java.awt.Color(204, 204, 204));
        lblNameApp.setText("Manager Music");

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
        jScrollPane1.setViewportView(tbl);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");

        btSua.setText("Sửa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lblNameApp, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameApp)
                .addGap(34, 34, 34)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new AddMusicJDiaglog(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btSua;
    private rojeru_san.complementos.RSButtonHover btnThem;
    private rojeru_san.complementos.RSButtonHover btnXoa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameApp;
    private CustomTable.TableDark tbl;
    private swing.TextFieldAnimation txtSearch;
    // End of variables declaration//GEN-END:variables
}
