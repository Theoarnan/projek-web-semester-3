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
 * @author harokidz
 */
public class Pegawai {

    private String idPegawai;
    private String nama;
    private String jenisKelamin;
    private String tanggalLahir;
    private String alamat;

    public Pegawai(String idPegawai, String nama, String jenisKelamin, String tanggalLahir, String alamat) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static ArrayList<Pegawai> getAll() {
        ArrayList<Pegawai> hasil = new ArrayList<>();
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        ResultSet r = null;
        String sql = "select * from pegawai";
        try {
            ps = c.prepareStatement(sql);
            r = ps.executeQuery();
            while (r.next()) {
                //1.Ciptakan objek Pegawai
                Pegawai kr = new Pegawai();
                kr.idPegawai = r.getString("id_pegawai");
                kr.nama = r.getString("nama");
                kr.jenisKelamin = r.getString("jenis_kelamin");
                kr.tanggalLahir = r.getString("tanggal_lahir");
                kr.alamat = r.getString("alamat");
                hasil.add(kr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            k.tutupKoneksi(ps, r, c);
        }
        return hasil;
    }

    //get By Primary key
    public static Pegawai getByPrimaryKey(String idPegawai) {
        Pegawai kr = null;
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        ResultSet r = null;
        String sql = "select * from pegawai where id_pegawai=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, idPegawai);
            r = ps.executeQuery();
            if (r.next()) {
                kr = new Pegawai();
                kr.idPegawai = r.getString("id_pegawai");
                kr.nama = r.getString("nama");
                kr.jenisKelamin = r.getString("jenis_kelamin");
                kr.tanggalLahir = r.getString("tanggal_lahir");
                kr.alamat = r.getString("alamat");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            k.tutupKoneksi(ps, r, c);
        }

        return kr;
    }

    public void tambahData() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "insert into pegawai (id_pegawai, nama, jenis_kelamin, tanggal_lahir, alamat)"
                + "values (?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.idPegawai);
            ps.setString(2, this.nama);
            ps.setString(3, this.jenisKelamin);
            ps.setString(4, this.tanggalLahir);
            ps.setString(5, this.alamat);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
    public void ubahData() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "update pegawai set nama=?,jenis_kelamin=?,tanggal_lahir=?,alamat=? where id_pegawai=?";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.nama);
            ps.setString(2, this.jenisKelamin);
            ps.setString(3, this.tanggalLahir);
            ps.setString(4, this.alamat);
            ps.setString(5, this.idPegawai);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void hapusData() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        String sql = "delete from pegawai where id_pegawai=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.idPegawai);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Pegawai() {
    }
    
}
