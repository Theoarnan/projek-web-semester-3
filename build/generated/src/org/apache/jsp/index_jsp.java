package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ukrim.model.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Enterprise</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"lay/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Add custom CSS here -->\n");
      out.write("    <link href=\"lay/css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"lay/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <!-- Page Specific CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("      ");

        HttpSession sess = request.getSession();
        User user = (User)sess.getAttribute("user");
        if(user == null){
            response.sendRedirect("login.jsp");
            return;
        }
        
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("      <!-- Sidebar -->\n");
      out.write("      <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("            logo\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-caret-square-o-down\"></i> Pegawai <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"index.jsp?action=listPegawai\">Data Pegawai</a></li>\n");
      out.write("                <li><a href=\"index.jsp?action=formTambahPegawai\">Tambah Data</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-caret-square-o-down\"></i> Pelanggan <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"index.jsp?action=listPelanggan\">Data Pelanggan</a></li>\n");
      out.write("                <li><a href=\"index.jsp?action=formTambahPelanggan\">Tambah Data</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-caret-square-o-down\"></i> Laptop <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"index.jsp?action=listLaptop\">Data Laptop</a></li>\n");
      out.write("                <li><a href=\"index.jsp?action=formTambahLaptop\">Tambah Data</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-caret-square-o-down\"></i> Transaksi <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"index.jsp?action=listTransaksi\">Data Transaksi</a></li>\n");
      out.write("                <li><a href=\"index.jsp?action=formTambahTransaksi\">Tambah Data</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right navbar-user\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <li class=\"dropdown user-dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> Carel Tambagistra <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile </a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> Inbox <span class=\"badge\">7</span></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings </a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"logout.jsp\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-12\">\n");
      out.write("              <h1>Enterprise <small>Computer's Shop</small></h1><br/>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, halaman, out, false);
      out.write("\n");
      out.write("                        </div>\n");
      out.write("            <!--<div class=\"alert alert-success alert-dismissable\">\n");
      out.write("              <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\n");
      out.write("              Welcome to SB Admin by <a class=\"alert-link\" href=\"http://startbootstrap.com\">Start Bootstrap</a>! Feel free to use this template for your admin needs! We are using a few different plugins to handle the dynamic tables and charts, so make sure you check out the necessary documentation links provided.\n");
      out.write("            </div>-->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- JavaScript -->\n");
      out.write("    <script src=\"lay/js/jquery-1.10.2.js\"></script>\n");
      out.write("    <script src=\"lay/js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page Specific Plugins -->\n");
      out.write("    <script src=\"http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("    <script src=\"http://cdn.oesmith.co.uk/morris-0.4.3.min.js\"></script>\n");
      out.write("    <script src=\"lay/js/morris/chart-data-morris.js\"></script>\n");
      out.write("    <script src=\"lay/js/tablesorter/jquery.tablesorter.js\"></script>\n");
      out.write("    <script src=\"lay/js/tablesorter/tables.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
