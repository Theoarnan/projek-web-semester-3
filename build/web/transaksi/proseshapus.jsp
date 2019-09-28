<%@page import="com.ukrim.model.Transaksi"%>
<%
    String noTransaksi = request.getParameter("noTransaksi");
    Transaksi kr = Transaksi.getByPrimaryKey(noTransaksi);
    if (kr == null) {
        out.println("Data yang anda cari tidak ada");
        out.println("<br/><a href='../index.jsp'>Kembali</a>");
        return;
    }
    kr.prosesHapus();
    response.sendRedirect("../index.jsp?action=listTransaksi");
%>