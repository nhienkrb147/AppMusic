/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.PlayList;
import Utils_Pro.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NAM PC
 */
public class PlaylistDAO extends MusicDAO<PlayList, String> {

    @Override
    public void insert(PlayList entity) {
        String sql = "INSERT INTO PLAYLIST (matk, tieude, counts, hinh, descriptions, ngaytao) VALUES(?,?,?,?,?,?)";
        XJdbc.update(sql, entity.getMatk(),
                entity.getTieude(),
                entity.getCounts(),
                entity.getHinh(),
                entity.getDescriptions(),
                entity.getNgaytao());
    }

    @Override
    public void update(PlayList entity) {
        String sql = "UPDATE PLAYLIST SET tieude =?, hinh =?, descriptions =? WHERE maplaylist =?";
        XJdbc.update(sql, entity.getTieude(),
                entity.getHinh(),
                entity.getDescriptions(),
                entity.getMaplaylist());
    }

    public void updateCount(PlayList entity) {
        String sql = "UPDATE PLAYLIST SET counts =? WHERE maplaylist =?";
        XJdbc.update(sql, entity.getCounts(),
                entity.getMaplaylist());
    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM PLAYLIST WHERE maplaylist =?";
        XJdbc.update(sql, key);
    }

    @Override
    public List<PlayList> selectAll() {
        String sql = "SELECT * FROM PLAYLIST";
        return this.selectBySql(sql);
    }

    @Override
    public PlayList selectById(String key) {
        String sql = "SELECT * FROM PLAYLIST WHERE maplaylist = ?";
        List<PlayList> list = this.selectBySql(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<PlayList> select_count() {
        String sql = "SELECT * FROM PLAYLIST";
        return this.selectBySql(sql);
    }

    public List<PlayList> selectById_matk(Integer key) {
        String sql = "SELECT * FROM PLAYLIST WHERE matk = ?";
        return this.selectBySql(sql, key);      
    }

    public PlayList selectById2(Integer key) {
        String sql = "SELECT * FROM PLAYLIST WHERE matk = ?";
        List<PlayList> list = this.selectBySql(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<PlayList> selectBySql(String sql, Object... args) {
        List<PlayList> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                PlayList entity = new PlayList();
                entity.setMaplaylist(rs.getInt("maplaylist"));
                entity.setMatk(rs.getInt("matk"));
                entity.setTieude(rs.getString("tieude"));
                entity.setCounts(rs.getInt("counts"));
                entity.setHinh(rs.getString("hinh"));
                entity.setDescriptions(rs.getString("descriptions"));
                entity.setNgaytao(rs.getDate("ngaytao"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
