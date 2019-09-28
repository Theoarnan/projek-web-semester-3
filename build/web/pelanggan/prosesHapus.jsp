<%@page import="com.ukrim.model.Pelanggan"%>
<%
    String idPelanggan = request.getParameter("idPelanggan");
    Pelanggan kr = Pelanggan.getByPrimaryKey(idPelanggan);
    if (kr == null) {
        out.println("Data yang anda cari tidak ada");
        out.println("<br/><a href='index.jsp'>Kembali</a>");
        return;
    }
    kr.hapusData();
    response.sendRedirect("../index.jsp?action=listPelanggan");
%>