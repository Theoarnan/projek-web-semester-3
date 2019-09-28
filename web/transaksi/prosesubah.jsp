        <%@page import="com.ukrim.model.Transaksi"%>
<%
        String noTransaksi = request.getParameter("noTransaksi");
        String tanggal = request.getParameter("tanggal");
        String pegawaiIdPegawai = request.getParameter("pegawaiIdPegawai");
        String pelangganIdPelanggan = request.getParameter("pelangganIdPelanggan");
    Transaksi kr = Transaksi.getByPrimaryKey(noTransaksi);
    if (kr == null) {
        out.println("Data yang anda cari tidak ada");
        out.println("<br/><a href='../index.jsp'>Kembali</a>");
        return;
    }
//1.Ambil semua parameter
//2.Ciptakan objek dari mahasiswa dan set semua atributnya
    
    
    
    kr.setNoTransaksi(noTransaksi);
    kr.setTanggal(tanggal);
    kr.setPegawaiIdPegawai(pegawaiIdPegawai);
    kr.setPelangganIdPelanggan(pelangganIdPelanggan);
//3.Masukkan ke dalam MahasiswaList menggunakan method tambahData

    kr.prosesUbah();
//4.Kembalikan ke halaman utama
    response.sendRedirect("../index.jsp?action=listTransaksi");
%>