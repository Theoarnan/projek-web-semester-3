<%@page import="java.util.ArrayList"%>
<%@page import="com.ukrim.model.Pegawai"%>
<form method="get" action="laptop/prosesTambah.jsp">
    <div class ="form-group">
        <label>Kode Laptop</label>
        <input type="text" name="kodeLaptop" class="form-control" required/>
    </div>
    <div class ="form-group">
        <label>Nama Laptop</label>
        <input type="text" name="nama" class="form-control" required/>
    </div>
    <div class ="form-group">
        <label>Harga</label>
        <input type="text" name="harga" class="form-control" required/>
    </div>    
    <div class ="form-group">
        <label>Jenis Laptop</label>
        <input type="text" name="jenis" class="form-control" required/>
    </div>
    <div class ="form-group">
        <label>Stok Laptop</label>
        <input type="text" name="stok" class="form-control" required/>
    </div>
    <input type="submit" value="Simpan" class="btn-primary"/>
</form>