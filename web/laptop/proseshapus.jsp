<%@page import="com.ukrim.model.Laptop"%>
<%
    String kodeLaptop = request.getParameter("kodeLaptop");
    Laptop kr = Laptop.getByPrimaryKey(kodeLaptop);
    if (kr == null) {
        out.println("Data yang anda cari tidak ada");
        out.println("<br/><a href='../index.jsp'>Kembali</a>");
        return;
    }
    kr.prosesHapus();
    response.sendRedirect("../index.jsp?action=listLaptop");
%>