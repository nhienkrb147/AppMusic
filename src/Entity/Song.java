/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Song {
    private String mabh;
    private String tenbh;
    private String theloai;
    private Date khoangthoigian;
    private String nguoist;
    private String nguoitb;
    private String anh;
    private Date ngaytao;

    public String getMabh() {
        return mabh;
    }

    public void setMabh(String mabh) {
        this.mabh = mabh;
    }

    public String getTenbh() {
        return tenbh;
    }

    public void setTenbh(String tenbh) {
        this.tenbh = tenbh;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public Date getKhoangthoigian() {
        return khoangthoigian;
    }

    public void setKhoangthoigian(Date khoangthoigian) {
        this.khoangthoigian = khoangthoigian;
    }

    public String getNguoist() {
        return nguoist;
    }

    public void setNguoist(String nguoist) {
        this.nguoist = nguoist;
    }

    public String getNguoitb() {
        return nguoitb;
    }

    public void setNguoitb(String nguoitb) {
        this.nguoitb = nguoitb;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Song() {
    }

    public Song(String mabh, String tenbh, String theloai, Date khoangthoigian, String nguoist, String nguoitb, String anh, Date ngaytao) {
        this.mabh = mabh;
        this.tenbh = tenbh;
        this.theloai = theloai;
        this.khoangthoigian = khoangthoigian;
        this.nguoist = nguoist;
        this.nguoitb = nguoitb;
        this.anh = anh;
        this.ngaytao = ngaytao;
    }
    
}
