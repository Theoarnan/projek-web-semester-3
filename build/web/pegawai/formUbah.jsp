<%-- 
    Document   : formTambah
    Created on : Aug 27, 2018, 2:17:23 PM
    Author     : Carel Tambagistra
--%>

<%@page import="com.ukrim.model.Pegawai"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ubah Data</title>
    </head>
    <body>
        <%
            String idPegawai = request.getParameter("idPegawai");
            Pegawai kr = Pegawai.getByPrimaryKey(idPegawai);
            if (kr == null) {
                out.println("Data yang anda cari tidak ada");
                out.println("<br/><a href='index.jsp'>Kembali</a>");
                return;
            }
        %>
        <h1>Ubah Pegawai</h1>
        <form action="pegawai/prosesUbah.jsp" method="post">
            <div class="form-group">
                <label>Id Pegawai</label> <input class="form-control" type="text" value="<%=kr.getIdPegawai()%>"  name="idPegawai" readonly required/>
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
                <label>Tanggal Lahir</label> <input class="form-control" type="date" value="<%=kr.getTanggalLahir()%>"  name="tanggalLahir" required/>
            </div>
            <div class="form-group">
                <label>Alamat</label> <input class="form-control" type="text" value="<%=kr.getAlamat()%>"  name="alamat" required/>
            </div>
            <input type="submit" value="Simpan Data"/>
        </form>
    </body>
</html>
