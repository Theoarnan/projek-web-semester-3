/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ukrim.model;

import com.ukrim.conn.Koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author TOSHIBA
 */
public class Laptop {
    private String kodeLaptop;
    private String nama;
    private String jenis;
    private String harga;
    private String stok;

    public String getKodeLaptop() {
        return kodeLaptop;
    }

    public void setKodeLaptop(String kodeLaptop) {
        this.kodeLaptop = kodeLaptop;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public Laptop(){
        
    }
    
    public Laptop(String kodeLaptop, String nama, String jenis, String harga, String stok) {
        this.kodeLaptop = kodeLaptop;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
       }

    
    public static ArrayList<Laptop> getAll(){
    ArrayList<Laptop> hasil = new ArrayList<>();
    Koneksi k = new Koneksi();
    Connection c = k.getKoneksi();
    PreparedStatement ps =  null;
    ResultSet r =null;
    String sql = "select * from laptop";
        try {
            ps = c.prepareStatement(sql);
            r = ps.executeQuery();
            while(r.next()){
                Laptop m = new Laptop();
                m.kodeLaptop = r.getString("kode_laptop");
                m.nama = r.getString("nama");
                m.jenis = r.getString("jenis");
                m.harga = r.getString("harga");
                m.stok = r.getString("stok");
                hasil.add(m);                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            k.tutupKoneksi(ps, r, c);
        }
    return hasil;
    }
    public static Laptop getByPrimaryKey(String kodeLaptop){
    Laptop m = null;
    Koneksi k = new Koneksi();
    Connection c = k.getKoneksi();
    PreparedStatement ps =  null;
    ResultSet r = null;
    String sql = "select * from laptop where kode_laptop=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, kodeLaptop);
            r = ps.executeQuery();
            if(r.next()){
                m = new Laptop();
                m.kodeLaptop = r.getString("kode_laptop");
                m.nama = r.getString("nama");
                m.jenis = r.getString("jenis");
                m.harga = r.getString("harga");
                m.stok = r.getString("stok");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            k.tutupKoneksi(ps, r, c);
        }
    return m;
    }
    
    public void prosesTambah(){
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        String sql = "insert into laptop(kode_laptop,nama,jenis,harga,stok) "
                +"values (?,?,?,?,?)";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.kodeLaptop);
            ps.setString(2, this.nama);
            ps.setString(3, this.jenis);
            ps.setString(4, this.harga);
            ps.setString(5, this.stok);
            ps.executeUpdate();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void prosesUbah(){
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        String sql = "update laptop set nama=?, jenis=?, harga=?, stok=? where kode_laptop=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.nama);
            ps.setString(2, this.jenis);
            ps.setString(3, this.harga);
            ps.setString(4, this.stok);
            ps.setString(5, this.kodeLaptop);
            ps.executeUpdate();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void prosesHapus(){
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        String sql = "delete from laptop where kode_laptop=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.kodeLaptop);
            ps.executeUpdate();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
