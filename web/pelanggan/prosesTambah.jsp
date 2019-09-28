
<%@page import="com.ukrim.model.Pelanggan"%>
<%
//1.Ambil semua parameter
    String idPelanggan = request.getParameter("idPelanggan");
    String nama = request.getParameter("nama");
    String jenisKelamin = request.getParameter("jenisKelamin");
    String alamat = request.getParameter("alamat");
//2.Ciptakan objek dari mahasiswa dan set semua atributnya
    Pelanggan kr = new Pelanggan();
    kr.setIdPelanggan(idPelanggan);
    kr.setNama(nama);
    kr.setJenisKelamin(jenisKelamin);
    kr.setAlamat(alamat);
//3.Masukkan ke dalam MahasiswaList menggunakan method tambahData
    kr.tambahData();
//4.Kembalikan ke halaman utama
    response.sendRedirect("../index.jsp?action=listPelanggan");

%>