<%@page import="com.ukrim.model.Transaksi"%>
<%
    String noTransaksi = request.getParameter("noTransaksi");
    String tanggal = request.getParameter("tanggal");
    String pegawaiIdPegawai = request.getParameter("pegawaiIdPegawai");
    String pelangganIdPelanggan = request.getParameter("pelangganIdPelanggan");
    /*String pegawai = request.getParameter("pegawai");
    String pelanggan = request.getParameter("pelanggan");*/
    Transaksi m = new Transaksi(noTransaksi, tanggal, pegawaiIdPegawai, pelangganIdPelanggan);
    m.prosesTambah();
    response.sendRedirect("../index.jsp?action=listTransaksi");
%>