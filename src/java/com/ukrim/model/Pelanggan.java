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
public class Pelanggan {

    private String idPelanggan;
    private String nama;
    private String jenisKelamin;
    private String alamat;

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static ArrayList<Pelanggan> getAll() {
        ArrayList<Pelanggan> hasil = new ArrayList<>();
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        ResultSet r = null;
        String sql = "select * from pelanggan";
        try {
            ps = c.prepareStatement(sql);
            r = ps.executeQuery();
            while (r.next()) {
                //1.Ciptakan objek pelanggan
                Pelanggan pj = new Pelanggan();
                pj.idPelanggan = r.getString("id_pelanggan");
                pj.nama = r.getString("nama");
                pj.jenisKelamin = r.getString("jenis_kelamin");
                pj.alamat = r.getString("alamat");
                hasil.add(pj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            k.tutupKoneksi(ps, r, c);
        }
        return hasil;
    }

    public static Pelanggan getByPrimaryKey(String idPelanggan) {
        Pelanggan pj = null;
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        ResultSet r = null;
        String sql = "select * from pelanggan where id_pelanggan=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, idPelanggan);
            r = ps.executeQuery();
            if (r.next()) {
                pj = new Pelanggan();
                pj.idPelanggan = r.getString("id_pelanggan");
                pj.nama = r.getString("nama");
                pj.jenisKelamin = r.getString("jenis_kelamin");
                pj.alamat = r.getString("alamat");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            k.tutupKoneksi(ps, r, c);
        }

        return pj;
    }

    public void tambahData() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "insert into pelanggan(id_pelanggan,nama,jenis_kelamin,alamat)" +"values (?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.idPelanggan);
            ps.setString(2, this.nama);
            ps.setString(3, this.jenisKelamin);
            ps.setString(4, this.alamat);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
    public void ubahData() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "update pelanggan set nama=?,jenis_kelamin=?,alamat=? where id_pelanggan=?";
        PreparedStatement ps = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.nama);
            ps.setString(2, this.jenisKelamin);
            ps.setString(3, this.alamat);
            ps.setString(4, this.idPelanggan);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void hapusData() {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        String sql = "delete from pelanggan where id_pelanggan=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.idPelanggan);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
