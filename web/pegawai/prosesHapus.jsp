<%@page import="com.ukrim.model.Pegawai"%>
<%
    String idPegawai = request.getParameter("idPegawai");
    Pegawai kr = Pegawai.getByPrimaryKey(idPegawai);
    if (kr == null) {
        out.println("Data yang anda cari tidak ada");
        out.println("<br/><a href='../index.jsp'>Kembali</a>");
        return;
    }
    kr.hapusData();
    response.sendRedirect("../index.jsp?action=listPegawai");
%>