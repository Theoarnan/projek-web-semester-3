<%-- 
    Document   : formUbah
    Created on : Oct 14, 2018, 7:31:07 AM
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
            Transaksi m = Transaksi.getByPrimaryKey(noTransaksi);
            if (m == null) {
                out.println("Data yang anda cari tidak ada");
                out.println("<br/><a href='index.jsp'>Kembali</a>");
                return;
            }
        %>
        <h1>Ubah Data Transaksi</h1>
        <form action="transaksi/prosesubah.jsp" method="post">
            <div class="form-group">
                <label>No. Transaksi</label> <input class="form-control" type="text" value="<%=m.getNoTransaksi()%>"  name="noTransaksi" readonly />
            </div>
            <div class="form-group">
                <label>Tanggal</label> <input class="form-control" type="date" value="<%=m.getTanggal()%>"  name="tanggal" required/>
            </div>
            <div class="form-group">
                <label>Id Pegawai</label> <input class="form-control" type="text" value="<%=m.getPegawaiIdPegawai()%>"  name="pegawaiIdPegawai" required/>
            </div>
            <div class="form-group">
                <label>Id Pelanggan</label> <input class="form-control" type="text" value="<%=m.getPelangganIdPelanggan()%>"  name="pelangganIdPelanggan" required/>
            </div>
            <input type="submit" value="Simpan Data"/>
        </form>       
           
    </body>
</html>
