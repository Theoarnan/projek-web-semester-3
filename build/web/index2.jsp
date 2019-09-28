<%-- 
    Document   : index
    Created on : Nov 24, 2018, 7:11:21 PM
    Author     : Carel Tambagistra
--%>

<%@page import="com.ukrim.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Data Pegawai</title>
        <link href="lib/css/bootstrap.css" rel="stylesheet"/>
    </head>
    <body>
        <%
        HttpSession sess = request.getSession();
        User user = (User)sess.getAttribute("user");
        if(user == null){
            response.sendRedirect("login.jsp");
            return;
        }
        %>
        <div class="container-fluid">
            <!-- Content here -->
            <h1>Toko Komputer</h1>
            <div class="row">
                <!--setting menu-->
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-header text-white bg-dark ">
                            Menu
                        </div>
                        <div class="card-body">
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item">
                                    <a href="index.jsp">
                                        Data Pegawai
                                    </a>
                                </li>
                                <li class="list-group-item">
                                    <a href="index.jsp?action=formTambahPegawai">
                                        Tambah Pegawai
                                    </a>
                                </li>
                                <li class="list-group-item">
                                    <a href="index.jsp?action=listPelanggan">
                                        Data Pelanggan
                                    </a>
                                </li>
                                <li class="list-group-item">
                                    <a href="index.jsp?action=formTambahPelanggan">
                                        Tambah Pelanggan
                                    </a>
                                </li>
                                <li class="list-group-item">
                                    <a href="index.jsp?action=listLaptop">
                                        List Laptop
                                    </a>
                                </li>
                                <li class="list-group-item">
                                    <a href="index.jsp?action=formTambahLaptop">
                                        Tambah Laptop
                                    </a>                                
                                </li>
                                <li class="list-group-item">
                                    <a href="index.jsp?action=listTransaksi">
                                        Transaksi
                                    </a>                                
                                </li>
                                <li class="list-group-item">
                                    <a href="index.jsp?action=formTambahTransaksi">
                                        Tambah Transaksi
                                    </a>                                
                                </li>
                                <li class="list-group-item">
                                    <a href="logout.jsp">
                                        Log Out
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!--setting content-->
                <div class="col-md-8">
                    <div class="card">
                        <div class="card-header text-white bg-success ">
                            Data
                        </div>
                        <div class="card-body">
                            <%
                                String action = request.getParameter("action");
                                String halaman = "pegawai/listPegawai.jsp";
                                if (action != null) {
                                    if (action.equalsIgnoreCase("formTambahPegawai")) {
                                        halaman = "pegawai/formTambah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formUbah")) {
                                        halaman = "pegawai/formUbah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("listPelanggan")) {
                                        halaman = "pelanggan/listPelanggan.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formTambahPelanggan")) {
                                        halaman = "pelanggan/formTambah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formUbahPelanggan")) {
                                        halaman = "pelanggan/formUbah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formHapusPelanggan")) {
                                        halaman = "pelanggan/formHapus.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("listLaptop")) {
                                        halaman = "laptop/listLaptop.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formTambahLaptop")) {
                                        halaman = "laptop/formTambah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formUbahLaptop")) {
                                        halaman = "laptop/formUbah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formHapusLaptop")) {
                                        halaman = "laptop/formHapus.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("listTransaksi")) {
                                        halaman = "transaksi/listTransaksi.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formTambahTransaksi")) {
                                        halaman = "transaksi/formTambah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formUbahTransaksi")) {
                                        halaman = "transaksi/formUbah.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formHapusTransaksi")) {
                                        halaman = "transaksi/formHapus.jsp";
                                    }
                                }
                            %>
                            <jsp:include page="<%=halaman%>"/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="lib/jquery.js"></script>
        <script src="lib/js/bootstrap.js"></script>
    </body>
</html>