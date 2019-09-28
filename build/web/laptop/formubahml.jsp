<%-- 
    Document   : formUbah
    Created on : Oct 14, 2018, 7:31:07 AM
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
            Laptop m = Laptop.getByPrimaryKey(kodeLaptop);
            if (m == null) {
                out.println("Data yang anda cari tidak ada");
                out.println("<br/><a href='index.jsp'>Kembali</a>");
                return;
            }
        %>
        <h1>Ubah Data Laptop</h1>
        <form action="laptop/prosesubah.jsp" method="post">
            <div class="form-group">
                <label>Kode Laptop</label> <input class="form-control" type="text" value="<%=m.getKodeLaptop()%>"  name="kodeLaptop" readonly />
            </div>
            <div class="form-group">
                <label>Nama Laptop</label> <input class="form-control" type="text" value="<%=m.getNama()%>"  name="nama" required/>
            </div>
            <div class="form-group">
                <label>Harga</label> <input class="form-control" type="text" value="<%=m.getHarga()%>"  name="harga" required/>
            </div>
            <div class="form-group">
                <label>Jenis Laptop</label> <input class="form-control" type="text" value="<%=m.getJenis()%>"  name="jenis" required/>
            </div>
            <div class="form-group">
                <label>Stok</label> <input class="form-control" type="text" value="<%=m.getStok()%>"  name="stok" readonly />
            </div>
            <input type="submit" value="Simpan Data"/>
        </form>       
           
    </body>
</html>
