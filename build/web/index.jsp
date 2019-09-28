
<%@page import="com.ukrim.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Enterprise</title>

    <!-- Bootstrap core CSS -->
    <link href="lay/css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="lay/css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="lay/font-awesome/css/font-awesome.min.css">
    <!-- Page Specific CSS -->
    <link rel="stylesheet" href="http://cdn.oesmith.co.uk/morris-0.4.3.min.css">
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

    <div id="wrapper">

      <!-- Sidebar -->
      <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            logo
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav side-nav">
            
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-caret-square-o-down"></i> Pegawai <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="index.jsp?action=listPegawai">Data Pegawai</a></li>
                <li><a href="index.jsp?action=formTambahPegawai">Tambah Data</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-caret-square-o-down"></i> Pelanggan <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="index.jsp?action=listPelanggan">Data Pelanggan</a></li>
                <li><a href="index.jsp?action=formTambahPelanggan">Tambah Data</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-caret-square-o-down"></i> Laptop <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="index.jsp?action=listLaptop">Data Laptop</a></li>
                <li><a href="index.jsp?action=formTambahLaptop">Tambah Data</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-caret-square-o-down"></i> Transaksi <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="index.jsp?action=listTransaksi">Data Transaksi</a></li>
                <li><a href="index.jsp?action=formTambahTransaksi">Tambah Data</a></li>
              </ul>
            </li>
            
          </ul>

          <ul class="nav navbar-nav navbar-right navbar-user">
            
            
            <li class="dropdown user-dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Carel Tambagistra <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="#"><i class="fa fa-user"></i> Profile </a></li>
                <li><a href="#"><i class="fa fa-envelope"></i> Inbox <span class="badge">7</span></a></li>
                <li><a href="#"><i class="fa fa-gear"></i> Settings </a></li>
                <li class="divider"></li>
                <li><a href="logout.jsp"><i class="fa fa-power-off"></i> Log Out</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </nav>

      <div id="page-wrapper">

        <div class="row">
          <div class="col-lg-12">
              <h1>Enterprise <small>Computer's Shop</small></h1><br/>
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
                                        halaman = "laptop/formubahml.jsp";
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
                                        halaman = "transaksi/formubahml.jsp";
                                    }
                                    else if (action.equalsIgnoreCase("formHapusTransaksi")) {
                                        halaman = "transaksi/formHapus.jsp";
                                    }
                                }
                            %>
                            <jsp:include page="<%=halaman%>"/>
                        </div>
            <!--<div class="alert alert-success alert-dismissable">
              <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
              Welcome to SB Admin by <a class="alert-link" href="http://startbootstrap.com">Start Bootstrap</a>! Feel free to use this template for your admin needs! We are using a few different plugins to handle the dynamic tables and charts, so make sure you check out the necessary documentation links provided.
            </div>-->
          </div>
        </div>
      </div>

    </div>

    <!-- JavaScript -->
    <script src="lay/js/jquery-1.10.2.js"></script>
    <script src="lay/js/bootstrap.js"></script>

    <!-- Page Specific Plugins -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>
    <script src="lay/js/morris/chart-data-morris.js"></script>
    <script src="lay/js/tablesorter/jquery.tablesorter.js"></script>
    <script src="lay/js/tablesorter/tables.js"></script>

  </body>
</html>
