package com.ukrim.model;

import com.ukrim.conn.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User {
    private String username;
    private String password;

    public static User getByUsernameAndPassword(String username, String password){
        User u = null;
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
        String sql = "select * from user where username=? and password=md5(?)";
        PreparedStatement ps = null;
        ResultSet r = null;
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            r = ps.executeQuery();
            if(r.next()){
                u = new User();
                u.username = r.getString("username");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
