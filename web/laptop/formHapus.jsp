<%-- 
    Document   : formHapus
    Created on : Oct 14, 2018, 7:40:00 AM
    Author     : TOSHIBA
--%>

<%@page import="com.ukrim.model.Laptop"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       <%
            String kodeLaptop = request.getParameter("kodeLaptop");
            Laptop kr = Laptop.getByPrimaryKey(kodeLaptop);
            if (kr == null) {
                out.println("Data yang anda cari tidak ada");
                out.println("<br/><a href='index.jsp'>Kembali</a>");
                return;
            }
        %>
        <form action="laptop/proseshapus.jsp" method="post">
        <h1>Anda Yakin Hapus data ini?</h1>
        <p>Type Laptop : <%=kr.getKodeLaptop()%></p>
        <p>Nama : <%=kr.getNama()%></p>
        <p>Harga : <%=kr.getHarga()%></p>
        <p>Jenis : <%=kr.getJenis()%></p>
        <p>Stok : <%=kr.getStok()%></p>

            <input type="hidden" name="type" value="<%=kr.getKodeLaptop()%>"/>
            <input type="button" value="Batal" onclick="top.location.href='index.jsp?'"/>
            <input type="submit" value="Hapus"/>
        </form>
    </body>
</html>