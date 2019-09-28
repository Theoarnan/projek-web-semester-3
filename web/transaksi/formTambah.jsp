<%@page import="java.util.ArrayList"%>
<%@page import="com.ukrim.model.Transaksi"%>
<form method="get" action="transaksi/prosesTambah.jsp">
    <div class ="form-group">
        <label>No. Transaksi</label>
        <input type="text" name="noTransaksi" class="form-control" required/>
    </div>
    <div class ="form-group">
        <label>Tanggal</label>
        <input type="date" name="tanggal" class="form-control" required/>
    </div>
    <div class ="form-group">
        <label>Id Pegawai</label>
        <input type="text" name="pegawaiIdPegawai" class="form-control" required/>
    </div>    
    <div class ="form-group">
        <label>Id Pelanggan</label>
        <input type="text" name="pelangganIdPelanggan" class="form-control" required/>
    </div>
    <input type="submit" value="Simpan" class="btn-primary"/>
</form>