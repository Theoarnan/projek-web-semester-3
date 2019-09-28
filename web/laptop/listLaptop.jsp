<%@page import="java.util.ArrayList"%>
<%@page import="com.ukrim.model.Laptop"%>
<table class="table table-striped">
    <tr>
        <th> Kode Laptop </th>
        <th> Nama Laptop </th>
        <th> Jenis Laptop </th>
        <th> Harga </th>
        <th> Stok </th>
        <th> Action </th>
    </tr>
    <%
        ArrayList<Laptop> lList = Laptop.getAll();
        if (lList.size() == 0) {
            out.println("<tr><td colspan='4'>Data Belum ada</td></tr>");
        } else {
            for (int i = 0; i < lList.size(); i++) {
                Laptop l = lList.get(i);
    %>
    
    <tr>
        <td> <%=l.getKodeLaptop()%></td>
        <td> <%=l.getNama()%></td>
        <td> <%=l.getJenis()%></td>
        <td> <%=l.getHarga()%></td>
        <td> <%=l.getStok()%></td>
        <td>
            <a class="btn btn-warning btn-sm" href="index.jsp?action=formUbahLaptop&kodeLaptop=<%=l.getKodeLaptop()%>">
                Update
            </a>
                <a class="btn btn-danger btn-sm" data-toggle="modal" data-target="#modal<%=l.getKodeLaptop()%>" href="#">
                Delete
            </a>
        </td>
    </tr>
    <div class="modal fade" id="modal<%=l.getKodeLaptop()%>" tabindex="-1"
         role="dialog" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                 <div class="modal-header">
                    <h6 class="modal-title">Anda yakin hapus data ini?</h6>
                </div>
                <div class="modal-body">
                     <%=l.getKodeLaptop()%><br/>
                     <%=l.getNama()%><br/>
                     <%=l.getJenis()%><br/>
                     <%=l.getHarga()%><br/>
                     <%=l.getStok()%><br/>
                </div>
                <div class="modal-footer">
                    <input type='hidden' value='<%=l.getKodeLaptop()%>'/>
                    <button type="button" class="btn btn-primary" data-dismiss="modal">
                        Batal
                    </button>
                    <a href="laptop/proseshapus.jsp?kodeLaptop=<%=l.getKodeLaptop()%>"class="btn btn-danger">
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