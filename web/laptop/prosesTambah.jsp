<%@page import="com.ukrim.model.Laptop"%>
<%
    String kodeLaptop = request.getParameter("kodeLaptop");
    String nama = request.getParameter("nama");
    String jenis = request.getParameter("jenis");
    String harga = request.getParameter("harga");
    String stok = request.getParameter("stok");
    Laptop m = new Laptop(kodeLaptop, nama, jenis, harga, stok);
    m.prosesTambah();
    response.sendRedirect("../index.jsp?action=listLaptop");
%>