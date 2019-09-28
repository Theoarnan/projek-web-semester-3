<%@page import="com.ukrim.model.Pelanggan"%>
<%
    String idPelanggan = request.getParameter("idPelanggan");
    Pelanggan pg = Pelanggan.getByPrimaryKey(idPelanggan);
    if (pg == null){
        out.println("Data yang cari tidak ada");
        out.println("<br/><a href='../index.jsp'>Kembali</a>");
        return;
    }
    
    String nama = request.getParameter("nama");
    String jenisKelamin = request.getParameter("jenisKelamin");
    String alamat = request.getParameter("alamat");
    pg.setIdPelanggan(idPelanggan);
    pg.setNama(nama);
    pg.setJenisKelamin(jenisKelamin);
    pg.setAlamat(alamat);
    pg.ubahData();
    response.sendRedirect("../index.jsp?action=listPelanggan");
%>