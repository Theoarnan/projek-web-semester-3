<%@page import="com.ukrim.util.Util"%>
<%@page import="com.ukrim.model.Pelanggan"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="table-responsive">
<table class="table table-striped table-hover">
    <tr>
        <th>Id Pelanggan</th>
        <th>Nama</th>
        <th>Jenis Kelamin</th>
        <th>Alamat</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Pelanggan> kList = Pelanggan.getAll();
        if (kList.size() == 0) {
            out.println("<tr><td colspan='4'>Data Belum ada</td></tr>");
        } else {
            for (int i = 0; i < kList.size(); i++) {
                Pelanggan k = kList.get(i);
    %>
    <tr>
        <td><%=k.getIdPelanggan()%></td>
        <td><%=k.getNama()%></td>
        <td><%=Util.konversiGendre(k.getJenisKelamin())%></td>
        <td><%=k.getAlamat()%></td>

        <td>
            <a class="btn btn-warning btn-sm" href="index.jsp?action=formUbahPelanggan&idPelanggan=<%=k.getIdPelanggan()%>">
                Update
            </a>
            <a class="btn btn-danger btn-sm" data-toggle="modal" data-target="#modal<%=k.getIdPelanggan()%>" href="#">
                Delete
            </a>
        </td>
    </tr>
    <div class="modal fade" id="modal<%=k.getIdPelanggan()%>" tabindex="-1"
         role="dialog" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                 <div class="modal-header">
                    <h6 class="modal-title">Anda yakin hapus data ini?</h6>
                </div>

                <div class="modal-body">
                     <%=k.getIdPelanggan()%><br/>
                     <%=k.getNama()%><br/>
                     <%=Util.konversiGendre(k.getJenisKelamin())%><br/>
                     <%=k.getAlamat()%><br/>
                </div>
                <div class="modal-footer">
                    <input type='hidden' value='<%=k.getIdPelanggan()%>'/>
                    <button type="button" class="btn btn-primary" data-dismiss="modal">
                        Batal
                    </button>
                    <a href="pelanggan/prosesHapus.jsp?idPelanggan=<%=k.getIdPelanggan()%>"class="btn btn-danger">
                        Hapus
                    </a>
                </div>
            </div>
        </div>
    </div>  


<%
        }
    }
%>
</table>
</div>