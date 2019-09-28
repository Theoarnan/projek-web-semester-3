<%-- 
    Document   : formHapus
    Created on : Oct 14, 2018, 7:40:00 AM
    Author     : TOSHIBA
--%>

<%@page import="com.ukrim.model.Transaksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <%
            String noTransaksi = request.getParameter("noTransaksi");
            Transaksi kr = Transaksi.getByPrimaryKey(noTransaksi);
            if (kr == null) {
                out.println("Data yang anda cari tidak ada");
                out.println("<br/><a href='index.jsp'>Kembali</a>");
                return;
            }
        %>
        <form action="proseshapus.jsp" method="post">
        <h1>Anda Yakin Hapus data ini?</h1>
        <p>No. Transaksi : <%=kr.getNoTransaksi()%></p>
        <p>Tanggal : <%=kr.getTanggal()%></p>
        <p>Id Pegawai : <%=kr.getPegawaiIdPegawai()%></p>
        <p>Id Pelanggan : <%=kr.getPelangganIdPelanggan()%></p>

            <input type="hidden" name="type" value="<%=kr.getNoTransaksi()%>"/>
            <input type="button" value="Batal" onclick="top.location.href='index.jsp?'"/>
            <input type="submit" value="Hapus"/>
        </form>
    </body>
</html>