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
public class PlayList {
    private int maplaylist;
    private int matk;
    private String tieude;
    private Date ngaytao;

    public int getMaplaylist() {
        return maplaylist;
    }

    public void setMaplaylist(int maplaylist) {
        this.maplaylist = maplaylist;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public PlayList() {
    }

    public PlayList(int maplaylist, int matk, String tieude, Date ngaytao) {
        this.maplaylist = maplaylist;
        this.matk = matk;
        this.tieude = tieude;
        this.ngaytao = ngaytao;
    }
    
}
