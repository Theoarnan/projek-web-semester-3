<%@page import="com.ukrim.model.Pegawai"%>
<%
//1.Ambil semua parameter
    String idPegawai = request.getParameter("idPegawai");
    String nama = request.getParameter("nama");
    String jenisKelamin = request.getParameter("jenisKelamin");
    String tanggalLahir = request.getParameter("tanggalLahir");
    String alamat = request.getParameter("alamat");
//2.Ciptakan objek dari mahasiswa dan set semua atributnya
    Pegawai kr = new Pegawai(idPegawai, nama, jenisKelamin, tanggalLahir, alamat);
/*    kr.setIdPegawai(idPegawai);
    kr.setNama(nama);
    kr.setJenisKelamin(jenisKelamin);
    kr.setTanggalLahir(tanggalLahir);
    kr.setAlamat(alamat);*/
//3.Masukkan ke dalam MahasiswaList menggunakan method tambahData
    kr.tambahData();
//4.Kembalikan ke halaman utama
    response.sendRedirect("../index.jsp");

%>
