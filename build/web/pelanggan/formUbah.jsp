<%-- 
    Document   : formTambah
    Created on : Aug 27, 2018, 2:17:23 PM
    Author     : Carel Tambagistra
--%>

<%@page import="com.ukrim.model.Pelanggan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ubah Data</title>
    </head>
    <body>
        <%
            String idPelanggan = request.getParameter("idPelanggan");
            Pelanggan kr = Pelanggan.getByPrimaryKey(idPelanggan);
            if (kr == null) {
                out.println("Data yang anda cari tidak ada");
                out.println("<br/><a href='index.jsp'>Kembali</a>");
                return;
            }
        %>
        <h1>Ubah Pegawai</h1>
        <form action="pelanggan/prosesUbah.jsp" method="post">
            <div class="form-group">
                <label>Id Pelanggan</label>
                <input class="form-control" type="text" value="<%=kr.getIdPelanggan() %>"  name="idPelanggan" readonly required/>
            </div>
            <div class="form-group">
                <label>Nama</label> <input class="form-control" type="text" value="<%=kr.getNama()%>"  name="nama" required/>
            </div>
            <div class="form-group">
                <label>Jenis Kelamin</label>
                <select name="jenisKelamin">
                    <option value="L">Laki-Laki</option>
                    <option value="P">Perempuan</option>
                </select>
            </div>
            <div class="form-group">
                <label>Alamat</label> <input class="form-control" type="text" value="<%=kr.getAlamat()%>"  name="alamat" required/>
            </div>
            <input type="submit" value="Simpan Data"/>
        </form>
    </body>
</html>
