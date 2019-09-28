package com.ukrim.model;

import com.ukrim.conn.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Item {
    private String noItem;
    private String jumlah;
    private String transaksiNoTransaksi;
    private String laptopKodeLaptop;
    private Transaksi transaksi;
    private Laptop laptop;

    public Item(){
        
    }
    public Item(String noItem, String jumlah, String transaksiNoTransaksi, String laptopKodeLaptop){
        this.noItem = noItem;
        this.jumlah = jumlah;
        this.transaksiNoTransaksi = transaksiNoTransaksi;
        this.laptopKodeLaptop = laptopKodeLaptop;
    }
    
    public String getNoItem() {
        return noItem;
    }

    public void setNoItem(String noItem) {
        this.noItem = noItem;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getTransaksiNoTransaksi() {
        return transaksiNoTransaksi;
    }

    public void setTransaksiNoTransaksi(String transaksiNoTransaksi) {
        this.transaksiNoTransaksi = transaksiNoTransaksi;
    }

    public String getLaptopKodeLaptop() {
        return laptopKodeLaptop;
    }

    public void setLaptopKodeLaptop(String laptopKodeLaptop) {
        this.laptopKodeLaptop = laptopKodeLaptop;
    }

        public static ArrayList<Item> getAll(){
    ArrayList<Item> hasil = new ArrayList<>();
    Koneksi k = new Koneksi();
    Connection c = k.getKoneksi();
    PreparedStatement ps =  null;
    ResultSet r =null;
    String sql = "select * from item";
        try {
            ps = c.prepareStatement(sql);
            r = ps.executeQuery();
            while(r.next()){
                Item m = new Item();
                m.noItem = r.getString("no_item");
                m.jumlah = r.getString("jumlah");
                m.transaksiNoTransaksi = r.getString("transaksi_no_transaksi");
                m.transaksi = Transaksi.getByPrimaryKey(m.transaksiNoTransaksi);
                m.laptopKodeLaptop = r.getString("laptop_kode_laptop");
                m.laptop = Laptop.getByPrimaryKey(m.laptopKodeLaptop);
                hasil.add(m);                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            k.tutupKoneksi(ps, r, c);
        }
    return hasil;
    }
        
    public static ArrayList<Item> getByTransaksiNoTransaksi(String transaksiNoTransaksi){
        ArrayList<Item> hasil = new ArrayList();
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "select * from item where transaksi_no_transaksi=?";
        PreparedStatement ps = null;
        ResultSet r = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, transaksiNoTransaksi);
            r = ps.executeQuery();
            while(r.next()){
                Item pk = new Item();
                pk.noItem = r.getString("no_item");
                pk.jumlah = r.getString("jumlah");
                pk.transaksiNoTransaksi = r.getString("transaksi_no_transaksi");
                pk.transaksi = Transaksi.getByPrimaryKey(pk.transaksiNoTransaksi);
                pk.laptopKodeLaptop = r.getString("laptop_kode_laptop");
                pk.laptop = Laptop.getByPrimaryKey(pk.laptopKodeLaptop);
                hasil.add(pk);
            }
            
            }catch (Exception e) {
            e.printStackTrace();
}
        return hasil;
    }
    public static ArrayList<Item> getByLaptopKodeLaptop(String laptopKodeLaptop){
        ArrayList<Item> hasil = new ArrayList();
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "select * from item where laptop_kode_laptop=?";
        PreparedStatement ps = null;
        ResultSet r = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, laptopKodeLaptop);
            r = ps.executeQuery();
            while(r.next()){
                Item pk = new Item();
                pk.noItem = r.getString("no_item");
                pk.jumlah = r.getString("jumlah");
                pk.transaksiNoTransaksi = r.getString("transaksi_no_transaksi");
                pk.transaksi = Transaksi.getByPrimaryKey(pk.transaksiNoTransaksi);
                pk.laptopKodeLaptop = r.getString("laptop_kode_laptop");
                pk.laptop = Laptop.getByPrimaryKey(pk.laptopKodeLaptop);
                hasil.add(pk);
            }
            
            }catch (Exception e) {
            e.printStackTrace();
}
        return hasil;
    }
    public static Item getByPrimaryKey(String noItem){
    Item m = null;
    Koneksi k = new Koneksi();
    Connection c = k.getKoneksi();
    PreparedStatement ps =  null;
    ResultSet r = null;
    String sql = "select * from Item where no_item=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, noItem);
            r = ps.executeQuery();
            if(r.next()){
                m = new Item();
                m.noItem = r.getString("kode_laptop");
                m.jumlah = r.getString("nama");
                m.transaksiNoTransaksi = r.getString("jenis");
                m.transaksi = Transaksi.getByPrimaryKey(m.transaksiNoTransaksi);
                m.laptopKodeLaptop = r.getString("stok");
                m.laptop = Laptop.getByPrimaryKey(m.laptopKodeLaptop);
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
        String sql = "insert into item(no_item,jumlah,transaksi_no_transaksi,laptop_kode_laptop)"
                +"values (?,?,?,?)";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.noItem);
            ps.setString(2, this.jumlah);
            ps.setString(3, this.transaksiNoTransaksi);
            ps.setString(4, this.laptopKodeLaptop);
            ps.executeUpdate();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void prosesUbah(){
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        String sql = "update item set jumlah=?, transaksi_no_transaksi=?, laptop_kode_laptop=? where no_item=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.jumlah);
            ps.setString(2, this.transaksiNoTransaksi);
            ps.setString(3, this.laptopKodeLaptop);
            ps.setString(4, this.noItem);
            ps.executeUpdate();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void prosesHapus(){
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        PreparedStatement ps = null;
        String sql = "delete from item where no_item=?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, this.noItem);
            ps.executeUpdate();            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
