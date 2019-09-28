
<%@page import="com.ukrim.model.Pegawai"%>
<%
    String idPegawai = request.getParameter("idPegawai");
    Pegawai kr = Pegawai.getByPrimaryKey(idPegawai);
    if (kr == null) {
        out.println("Data yang anda cari tidak ada");
        out.println("<br/><a href='../index.jsp'>Kembali</a>");
        return;
    }
//1.Ambil semua parameter
    String nama = request.getParameter("nama");
    String jenisKelamin = request.getParameter("jenisKelamin");
    String tanggalLahir = request.getParameter("tanggalLahir");
    String alamat = request.getParameter("alamat");
//2.Ciptakan objek dari mahasiswa dan set semua atributnya
    kr.setIdPegawai(idPegawai);
    kr.setNama(nama);
    kr.setJenisKelamin(jenisKelamin);
    kr.setTanggalLahir(tanggalLahir);
    kr.setAlamat(alamat);
//3.Masukkan ke dalam MahasiswaList menggunakan method tambahData
    kr.ubahData();
//4.Kembalikan ke halaman utama
    response.sendRedirect("../index.jsp");
%>