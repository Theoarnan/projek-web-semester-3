<%-- 
    Document   : konfirmasiHapus
    Created on : Sep 13, 2018, 8:17:34 AM
    Author     : harokidz
--%>

<%@page import="com.ukrim.util.Util"%>
<%@page import="com.ukrim.model.Pegawai"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hapus</title>
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
        <form action="prosesHapus.jsp" method="get">
        <h1>Anda Yakin Hapus data ini?</h1>
        <p>Id Pegawai : <%=kr.getIdPegawai() %></p>
        <p>Nama : <%=kr.getNama() %></p>
        <p>Jenis Kelamin : <%=Util.konversiGendre(kr.getJenisKelamin()) %></p>        
        <p>Tanggal Lahir : <%=Util.konversiTanggal(kr.getTanggalLahir())%></p>
        <p>Alamat : <%=kr.getAlamat() %></p>
                <input type="hidden" name="idPegawai" value="<%=kr.getIdPegawai() %>"/>
                <input type="button" value="Batal" onclick="top.location.href='index.jsp?'"/>
                <input type="submit" value="Hapus"/>
        </form>
    </body>
</html>
