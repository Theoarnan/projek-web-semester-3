<%@page import="com.ukrim.util.Util"%>
<%@page import="com.ukrim.model.Pegawai"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="table-responsive">
<table class="table table-striped table-hover">
    <tr>
        <th>Id Pegawai</th>
        <th>Nama</th>
        <th>Jenis Kelamin</th>
        <th>Tanggal Lahir</th>
        <th>Alamat</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<Pegawai> kList = Pegawai.getAll();
        if (kList.size() == 0) {
            out.println("<tr><td colspan='5'>Data Belum ada</td></tr>");
        } else {
            for (int i = 0; i < kList.size(); i++) {
                Pegawai k = kList.get(i);
    %>
    <tr>
        <td><%=k.getIdPegawai()%></td>
        <td><%=k.getNama()%></td>
        <td><%=Util.konversiGendre(k.getJenisKelamin())%></td>
        <td><%=Util.konversiTanggal(k.getTanggalLahir())%></td>
        <td><%=k.getAlamat()%></td>

        <td>
            <a class="btn btn-warning btn-sm" href="index.jsp?action=formUbah&idPegawai=<%=k.getIdPegawai()%>">
                Update
            </a>
            <a class="btn btn-danger btn-sm" data-toggle="modal" data-target="#modal<%=k.getIdPegawai() %>" href="#">
                Delete
            </a>
        </td>
    </tr>  
    <div class="modal fade" id="modal<%=k.getIdPegawai() %>" tabindex="-1"
         role="dialog" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                 <div class="modal-header">
                    <h6 class="modal-title">Anda yakin hapus data ini?</h6>
                </div>

                <div class="modal-body">
                     <%=k.getIdPegawai() %><br/>
                     <%=k.getNama()%><br/>
                     <%=k.getAlamat()%><br/>
                     <%=Util.konversiGendre(k.getJenisKelamin())%><br/>
                     <%=Util.konversiTanggal(k.getTanggalLahir())%><br/>
                </div>
                <div class="modal-footer">
                    <input type='hidden' value='<%=k.getIdPegawai()%>'/>
                    <button type="button" class="btn btn-primary" data-dismiss="modal">
                        Batal
                    </button>
                    <a href="pegawai/prosesHapus.jsp?idPegawai=<%=k.getIdPegawai()%>"class="btn btn-danger">
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