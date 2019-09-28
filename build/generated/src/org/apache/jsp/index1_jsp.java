package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Dashboard - SB Admin</title>\n");
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
      out.write("          <a class=\"navbar-brand\" href=\"index2.html\">SB Admin</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("            <li class=\"active\"><a href=\"index2.html\"><i class=\"fa fa-dashboard\"></i> Dashboard</a></li>\n");
      out.write("            <li><a href=\"charts.html\"><i class=\"fa fa-bar-chart-o\"></i> Charts</a></li>\n");
      out.write("            <li><a href=\"tables.html\"><i class=\"fa fa-table\"></i> Tables</a></li>\n");
      out.write("            <li><a href=\"forms.html\"><i class=\"fa fa-edit\"></i> Forms</a></li>\n");
      out.write("            <li><a href=\"typography.html\"><i class=\"fa fa-font\"></i> Typography</a></li>\n");
      out.write("            <li><a href=\"bootstrap-elements.html\"><i class=\"fa fa-desktop\"></i> Bootstrap Elements</a></li>\n");
      out.write("            <li><a href=\"bootstrap-grid.html\"><i class=\"fa fa-wrench\"></i> Bootstrap Grid</a></li>\n");
      out.write("            <li><a href=\"blank-page.html\"><i class=\"fa fa-file\"></i> Blank Page</a></li>\n");
      out.write("            \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-caret-square-o-down\"></i> Pegawai <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\">Data Pegawai</a></li>\n");
      out.write("                <li><a href=\"#\">Tambah Data</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right navbar-user\">\n");
      out.write("            <li class=\"dropdown messages-dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">7</span> <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li class=\"dropdown-header\">7 New Messages</li>\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                    <span class=\"avatar\"><img src=\"http://placehold.it/50x50\"></span>\n");
      out.write("                    <span class=\"name\">John Smith:</span>\n");
      out.write("                    <span class=\"message\">Hey there, I wanted to ask you something...</span>\n");
      out.write("                    <span class=\"time\"><i class=\"fa fa-clock-o\"></i> 4:34 PM</span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                    <span class=\"avatar\"><img src=\"http://placehold.it/50x50\"></span>\n");
      out.write("                    <span class=\"name\">John Smith:</span>\n");
      out.write("                    <span class=\"message\">Hey there, I wanted to ask you something...</span>\n");
      out.write("                    <span class=\"time\"><i class=\"fa fa-clock-o\"></i> 4:34 PM</span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                  <a href=\"#\">\n");
      out.write("                    <span class=\"avatar\"><img src=\"http://placehold.it/50x50\"></span>\n");
      out.write("                    <span class=\"name\">John Smith:</span>\n");
      out.write("                    <span class=\"message\">Hey there, I wanted to ask you something...</span>\n");
      out.write("                    <span class=\"time\"><i class=\"fa fa-clock-o\"></i> 4:34 PM</span>\n");
      out.write("                  </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\">View Inbox <span class=\"badge\">7</span></a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown alerts-dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-bell\"></i> Alerts <span class=\"badge\">3</span> <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\">Default <span class=\"label label-default\">Default</span></a></li>\n");
      out.write("                <li><a href=\"#\">Primary <span class=\"label label-primary\">Primary</span></a></li>\n");
      out.write("                <li><a href=\"#\">Success <span class=\"label label-success\">Success</span></a></li>\n");
      out.write("                <li><a href=\"#\">Info <span class=\"label label-info\">Info</span></a></li>\n");
      out.write("                <li><a href=\"#\">Warning <span class=\"label label-warning\">Warning</span></a></li>\n");
      out.write("                <li><a href=\"#\">Danger <span class=\"label label-danger\">Danger</span></a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\">View All</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown user-dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> John Smith <b class=\"caret\"></b></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> Inbox <span class=\"badge\">7</span></a></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div><!-- /.navbar-collapse -->\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-12\">\n");
      out.write("            <h1>Enterprise <small>Computer's Shop</small></h1>\n");
      out.write("isi konten\n");
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
