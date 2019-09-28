        <%@page import="com.ukrim.model.Laptop"%>
<%
        String kodeLaptop = request.getParameter("kodeLaptop");
        String nama = request.getParameter("nama");
        String jenis = request.getParameter("jenis");
        String harga = request.getParameter("harga");
        String stok = request.getParameter("stok");
    Laptop kr = Laptop.getByPrimaryKey(kodeLaptop);
    if (kr == null) {
        out.println("Data yang anda cari tidak ada");
        out.println("<br/><a href='../index.jsp'>Kembali</a>");
        return;
    }
//1.Ambil semua parameter
//2.Ciptakan objek dari mahasiswa dan set semua atributnya
    
    
    
    kr.setKodeLaptop(kodeLaptop);
    kr.setNama(nama);
    kr.setJenis(jenis);
    kr.setHarga(harga);
    kr.setStok(stok);
//3.Masukkan ke dalam MahasiswaList menggunakan method tambahData

    kr.prosesUbah();
//4.Kembalikan ke halaman utama
    response.sendRedirect("../index.jsp?action=listLaptop");
%>