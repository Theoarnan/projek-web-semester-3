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
public class Transaksi {
    private String noTransaksi;
    private String tanggal;
    private String pegawaiIdPegawai;
    private String pelangganIdPelanggan;
    private Pegawai pegawai;
    private Pelanggan pelanggan;
    
    

    
    public static ArrayList<Transaksi> getAll(){
        ArrayList<Transaksi> hasil = new ArrayList();
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "select * from transaksi";
        PreparedStatement ps = null;
        ResultSet r = null;
        try {
            ps = c.prepareStatement(sql);
            r = ps.executeQuery();
            while(r.next()){
                Transaksi pk = new Transaksi();
                pk.noTransaksi = r.getString("no_transaksi");
                pk.tanggal = r.getString("tanggal");
                pk.pegawaiIdPegawai = r.getString("pegawai_id_pegawai");
                pk.pelangganIdPelanggan = r.getString("pelanggan_id_pelanggan");
                pk.pegawai = Pegawai.getByPrimaryKey(pk.pegawaiIdPegawai);
                pk.pelanggan = Pelanggan.getByPrimaryKey(pk.pelangganIdPelanggan);
                hasil.add(pk);
            }
            
            }catch (Exception e) {
            e.printStackTrace();
}
        return hasil;
    }
    public static ArrayList<Transaksi> getByPegawaiIdPegawai(String pegawaiIdPegawai){
        ArrayList<Transaksi> hasil = new ArrayList();
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "select * from transaksi where pegawai_id_pegawai=?";
        PreparedStatement ps = null;
        ResultSet r = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, pegawaiIdPegawai);
            r = ps.executeQuery();
            while(r.next()){
                Transaksi pk = new Transaksi();
                pk.noTransaksi = r.getString("no_transaksi");
                pk.tanggal = r.getString("tanggal");
                pk.pegawaiIdPegawai = r.getString("pegawai_id_pegawai");
                pk.pelangganIdPelanggan = r.getString("pelanggan_id_pelanggan");
                pk.pegawai = Pegawai.getByPrimaryKey(pk.pegawaiIdPegawai);
                pk.pelanggan = Pelanggan.getByPrimaryKey(pk.pelangganIdPelanggan);
                hasil.add(pk);
            }
            
            }catch (Exception e) {
            e.printStackTrace();
}
        return hasil;
    }
    public static ArrayList<Transaksi> getByPelangganIdPelanggan(String pelangganIdPelanggan){
        ArrayList<Transaksi> hasil = new ArrayList();
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "select * from transaksi where pelangganIdPelanggan=?";
        PreparedStatement ps = null;
        ResultSet r = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, pelangganIdPelanggan);
            r = ps.executeQuery();
            while(r.next()){
                Transaksi pk = new Transaksi();
                pk.noTransaksi = r.getString("no_transaksi");
                pk.tanggal = r.getString("tanggal");
                pk.pegawaiIdPegawai = r.getString("pegawai_id_pegawai");
                pk.pelangganIdPelanggan = r.getString("pelanggan_id_pelanggan");
                pk.pegawai = Pegawai.getByPrimaryKey(pk.pegawaiIdPegawai);
                pk.pelanggan = Pelanggan.getByPrimaryKey(pk.pelangganIdPelanggan);
                hasil.add(pk);
            }
            
            }catch (Exception e) {
            e.printStackTrace();
}
        return hasil;
    }
    
    public static Transaksi getByPrimaryKey(String noTransaksi){
        Transaksi pk = null;
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "select * from transaksi where no_transaksi=?";
        PreparedStatement ps = null;
        ResultSet r = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, noTransaksi);
            r = ps.executeQuery();
            if(r.next()){
                pk = new Transaksi();
                pk.noTransaksi = r.getString("no_transaksi");
                pk.tanggal = r.getString("tanggal");
                pk.pegawaiIdPegawai = r.getString("pegawai_id_pegawai");
                pk.pelangganIdPelanggan = r.getString("pelanggan_id_pelanggan");
                pk.pegawai = Pegawai.getByPrimaryKey(pk.pegawaiIdPegawai);
                pk.pelanggan = Pelanggan.getByPrimaryKey(pk.pelangganIdPelanggan);   
            }
            }catch (Exception e) {
            e.printStackTrace();
}
        return pk;
    }
    
    public void prosesTambah(){
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "insert into transaksi(no_transaksi,tanggal,pegawai_id_pegawai,pelanggan_id_pelanggan)"
                +"values (?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.noTransaksi);
            ps.setString(2, this.tanggal);
            ps.setString(3, this.pegawaiIdPegawai);
            ps.setString(4, this.pelangganIdPelanggan);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            
        }
    }
    public void prosesHapus() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "delete from transaksi where no_transaksi=?";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.noTransaksi);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void prosesUbah() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "update transaksi set tanggal=?,pegawai_id_pegawai=?,pelanggan_id_pelanggan=? where no_transaksi=?";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.tanggal);
            ps.setString(2, this.pegawaiIdPegawai);
            ps.setString(3, this.pelangganIdPelanggan);
            ps.setString(4, this.noTransaksi);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteByPegawaiIdPegawai(String pegawaiIdPegawai){
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "delete from transaksi where pegawai_id_pegawai=?";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
	    ps.setString(1, pegawaiIdPegawai);
	    ps.executeUpdate();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    
    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPegawaiIdPegawai() {
        return pegawaiIdPegawai;
    }

    public void setPegawaiIdPegawai(String pegawaiIdPegawai) {
        this.pegawaiIdPegawai = pegawaiIdPegawai;
    }

    public String getPelangganIdPelanggan() {
        return pelangganIdPelanggan;
    }

    public void setPelangganIdPelanggan(String pelangganIdPelanggan) {
        this.pelangganIdPelanggan = pelangganIdPelanggan;
    }
    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Transaksi(String noTransaksi, String tanggal, String pegawaiIdPegawai, String pelangganIdPelanggan) {
        this.noTransaksi = noTransaksi;
        this.tanggal = tanggal;
        this.pegawaiIdPegawai = pegawaiIdPegawai;
        this.pelangganIdPelanggan = pelangganIdPelanggan;
    }
    
    public Transaksi(){
        
    }
}
