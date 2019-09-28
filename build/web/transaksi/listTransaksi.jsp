<%@page import="java.util.ArrayList"%>
<%@page import="com.ukrim.model.Transaksi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="table-responsive">
<table class="table table-striped">
    <tr>
        <th> No. Transaksi </th>
        <th> Tanggal </th>
        <th> Id Pegawai </th>
        <th> Id Pelanggan </th>
        <th> Action </th>
    </tr>
    <%
        ArrayList<Transaksi> mList = Transaksi.getAll();
        if (mList.size() == 0) {
            out.println("<tr><td colspan='4'>Data Belum ada</td></tr>");
        } else {
            for (int i = 0; i < mList.size(); i++) {
                Transaksi m = mList.get(i);
    %>
    
    <tr>
        <td> <%=m.getNoTransaksi()%></td>
        <td> <%=m.getTanggal()%></td>
        <td> <%=m.getPegawaiIdPegawai()%></td>
        <td> <%=m.getPelangganIdPelanggan()%></td>
        <td>
            <a class="btn btn-warning btn-sm" href="index.jsp?action=formUbahTransaksi&noTransaksi=<%=m.getNoTransaksi()%>">
                Update
            </a>
                <a class="btn btn-danger btn-sm" data-toggle="modal" data-target="#modal<%=m.getNoTransaksi()%>" href="#">
                Delete
            </a>
        </td>
    </tr>
    <div class="modal fade" id="modal<%=m.getNoTransaksi() %>" tabindex="-1"
         role="dialog" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                 <div class="modal-header">
                    <h6 class="modal-title">Anda yakin hapus data ini?</h6>
                </div>

                <div class="modal-body">
                     <%=m.getNoTransaksi()%><br/>
                     <%=m.getTanggal()%><br/>
                     <%=m.getPegawaiIdPegawai()%><br/>
                     <%=m.getPelangganIdPelanggan()%><br/>
                </div>
                <div class="modal-footer">
                    <input type='hidden' value='<%=m.getNoTransaksi()%>'/>
                    <button type="button" class="btn btn-primary" data-dismiss="modal">
                        Batal
                    </button>
                    <a href="transaksi/proseshapus.jsp?noTransaksi=<%=m.getNoTransaksi()%>"class="btn btn-danger">
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