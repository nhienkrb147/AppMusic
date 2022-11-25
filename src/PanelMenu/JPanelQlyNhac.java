/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelMenu;

import DAO.SongDAO;
import Entity.Song;
import UI.AddMusicJDiaglog;
import UI.JFrameMusic;
import Utils_Pro.MsgBox;
import Utils_Pro.XImage;
import java.awt.HeadlessException;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;
import javax.swing.JComponent;
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
        init();

    }

    public void Test() {
        tblQLN.fixTable(jScrollPane1);
        tblQLN.setColumnAlignment(0, JLabel.CENTER);
        tblQLN.setCellAlignment(0, JLabel.CENTER);
        tblQLN.setColumnAlignment(2, JLabel.CENTER);
        tblQLN.setCellAlignment(2, JLabel.CENTER);
        tblQLN.setColumnAlignment(4, JLabel.RIGHT);
        tblQLN.setCellAlignment(4, JLabel.RIGHT);
        tblQLN.setColumnWidth(0, 50);
        tblQLN.setColumnWidth(2, 100);

    }

    void search() {
        txtSearch.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                //  Test
                try {
                    for (int i = 1; i <= 50; i++) {
                        
                        Thread.sleep(10);
                    }
                    fillTable();
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
        tblQLN = new CustomTable.TableDark();
        txtSearch = new swing.TextFieldAnimation();
        btnThem = new rojeru_san.complementos.RSButtonHover();
        btnXoa = new rojeru_san.complementos.RSButtonHover();
        btSua = new rojeru_san.complementos.RSButtonHover();
        btnLoad = new rojerusan.RSMaterialButtonCircle();
        btnThem1 = new rojeru_san.complementos.RSButtonHover();

        jPanel2.setBackground(new java.awt.Color(29, 34, 56));

        lblNameApp.setFont(new java.awt.Font("Brush Script MT", 1, 45)); // NOI18N
        lblNameApp.setForeground(new java.awt.Color(204, 204, 204));
        lblNameApp.setText("Manager Music");

        tblQLN.setBackground(new java.awt.Color(29, 34, 56));
        tblQLN.setModel(new javax.swing.table.DefaultTableModel(
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
        tblQLN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQLN);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btnLoad.setText(".");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnThem1.setText("Thêm thể loại");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(lblNameApp, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 282, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameApp)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        them();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        update();
    }//GEN-LAST:event_btSuaActionPerformed

    private void tblQLNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLNMouseClicked
        tblQLN.setDefaultEditor(Object.class, null);
        i = tblQLN.getSelectedRow();
    }//GEN-LAST:event_tblQLNMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
       this.fillTable();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rojeru_san.complementos.RSButtonHover btSua;
    public rojerusan.RSMaterialButtonCircle btnLoad;
    public rojeru_san.complementos.RSButtonHover btnThem;
    public rojeru_san.complementos.RSButtonHover btnThem1;
    private rojeru_san.complementos.RSButtonHover btnXoa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNameApp;
    public CustomTable.TableDark tblQLN;
    private swing.TextFieldAnimation txtSearch;
    // End of variables declaration//GEN-END:variables
    SongDAO dao = new SongDAO();
    AddMusicJDiaglog addMusic = new AddMusicJDiaglog();
    int i = -1;

    void init() {
        initTable();
        fillTable();
        search();
    }

    void initTable() {
        DefaultTableModel tblmodel = (DefaultTableModel) tblQLN.getModel();
        String[] cols = new String[]{"Mã bài hát", "Tên bài hát", "Thể loại", "Người sáng tác", "Người trình bày", "Đường dẫn nhạc", "Ảnh", "Ngày tạo"};
        tblmodel.setColumnIdentifiers(cols);
    }
    public void fillTable() {
        DefaultTableModel tblModel = (DefaultTableModel) tblQLN.getModel();
        tblModel.setRowCount(0);
        String keyWords = txtSearch.getText();
        try {
            List<Song> list = dao.selectByKeyword(keyWords); //Đọc dữ liệu từ csdl
            for (Song s : list) {
                Object[] rows = {s.getMabh(), s.getTenbh(), s.getTheloai(), s.getNguoist(), s.getNguoitb(), s.getMusicpath(), s.getAnh(), s.getNgaytao()};
                tblModel.addRow(rows);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    public void them() {
        addMusic.count = -1;
        addMusic.clearForm();
        addMusic.txtMaBH.setEditable(true);
        addMusic.setVisible(true);       
    }

    public void update() {    
        if(i!=-1){
            edit();
            addMusic.count++;
            addMusic.txtMaBH.setEditable(false);
            addMusic.setVisible(true);
        }else{
            MsgBox.alert(this, "Vui lòng chọn hàng");
        }     
    }

    void delete() {
        String mabh = (String) tblQLN.getValueAt(this.i, 0);
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa bài hát này?")) {
            try {
                dao.delete(mabh);
                this.fillTable();
                i=-1;
                MsgBox.alert(this, "Xóa thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại");
            }
        }
    }

    void edit() {
        String mabh = (String) tblQLN.getValueAt(this.i, 0);
        Song s = dao.selectById(mabh);
        addMusic.setForm(s);
    }
}
