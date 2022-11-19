/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.Song;
import Utils_Pro.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SongDAO extends MusicDAO<Song, String> {

    String INSERT_SQL = "INSERT INTO SONG (mabh, tenbh, theloai, nguoist, nguoitb, anh, ngaytao) VALUES (?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SONG SET tenbh = ?, theloai = ?, nguoist = ?, nguoitb =?, anh = ?, ngaytao =? WHERE mabh = ?";
    String DELETE_SQL = "DELETE FROM SONG WHERE mabh = ?";
    String SELECT_ALL_SQL = "SELECT * FROM SONG";
    String SELECT_BY_ID_SQL = "SELECT * FROM SONG WHERE mabh = ?";

    @Override
    public void insert(Song entity) {
        XJdbc.update(INSERT_SQL, entity.getMabh(),entity.getTenbh(),entity.getTheloai(),entity.getKhoangthoigian(),
                    entity.getNguoist(),entity.getNguoitb(),entity.getAnh(),entity.getNgaytao());
    }

    @Override
    public void update(Song entity) {
        XJdbc.update(UPDATE_SQL,entity.getTenbh(),entity.getTheloai(),entity.getKhoangthoigian(),
                    entity.getNguoist(),entity.getNguoitb(),entity.getAnh(),entity.getNgaytao(),entity.getMabh());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(DELETE_SQL, key);
    }

    @Override
    public List<Song> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Song selectById(String key) {
        List<Song> list = this.selectBySql(SELECT_BY_ID_SQL,key);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Song> selectBySql(String sql, Object... args) {
        List<Song> list = new ArrayList<>();
        try {
            ResultSet rs=XJdbc.query(sql, args);
            while(rs.next()){
                Song entity= new Song();
                entity.setMabh(rs.getString("mabh"));
                entity.setTenbh(rs.getString("tenbh"));
                entity.setTheloai(rs.getString("theloai"));
                entity.setNguoist(rs.getString("nguoist"));
                entity.setNguoitb(rs.getString("nguoitb"));
                entity.setAnh(rs.getString("anh"));
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
