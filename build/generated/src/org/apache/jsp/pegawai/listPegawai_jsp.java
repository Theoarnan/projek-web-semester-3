package org.apache.jsp.pegawai;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ukrim.util.Util;
import com.ukrim.model.Pegawai;
import java.util.ArrayList;

public final class listPegawai_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<div class=\"table-responsive\">\n");
      out.write("<table class=\"table table-striped table-hover\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Id Pegawai</th>\n");
      out.write("        <th>Nama</th>\n");
      out.write("        <th>Jenis Kelamin</th>\n");
      out.write("        <th>Tanggal Lahir</th>\n");
      out.write("        <th>Alamat</th>\n");
      out.write("        <th>Action</th>\n");
      out.write("    </tr>\n");
      out.write("    ");

        ArrayList<Pegawai> kList = Pegawai.getAll();
        if (kList.size() == 0) {
            out.println("<tr><td colspan='5'>Data Belum ada</td></tr>");
        } else {
            for (int i = 0; i < kList.size(); i++) {
                Pegawai k = kList.get(i);
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(k.getIdPegawai());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(k.getNama());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(Util.konversiGendre(k.getJenisKelamin()));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(Util.konversiTanggal(k.getTanggalLahir()));
      out.write("</td>\n");
      out.write("        <td>");
      out.print(k.getAlamat());
      out.write("</td>\n");
      out.write("\n");
      out.write("        <td>\n");
      out.write("            <a class=\"btn btn-warning btn-sm\" href=\"index.jsp?action=formUbah&idPegawai=");
      out.print(k.getIdPegawai());
      out.write("\">\n");
      out.write("                Update\n");
      out.write("            </a>\n");
      out.write("            <a class=\"btn btn-danger btn-sm\" data-toggle=\"modal\" data-target=\"#modal");
      out.print(k.getIdPegawai() );
      out.write("\" href=\"#\">\n");
      out.write("                Delete\n");
      out.write("            </a>\n");
      out.write("        </td>\n");
      out.write("    </tr>  \n");
      out.write("    <div class=\"modal fade\" id=\"modal");
      out.print(k.getIdPegawai() );
      out.write("\" tabindex=\"-1\"\n");
      out.write("         role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                 <div class=\"modal-header\">\n");
      out.write("                    <h6 class=\"modal-title\">Anda yakin hapus data ini?</h6>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                     ");
      out.print(k.getIdPegawai() );
      out.write("<br/>\n");
      out.write("                     ");
      out.print(k.getNama());
      out.write("<br/>\n");
      out.write("                     ");
      out.print(k.getAlamat());
      out.write("<br/>\n");
      out.write("                     ");
      out.print(Util.konversiGendre(k.getJenisKelamin()));
      out.write("<br/>\n");
      out.write("                     ");
      out.print(Util.konversiTanggal(k.getTanggalLahir()));
      out.write("<br/>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <input type='hidden' value='");
      out.print(k.getIdPegawai());
      out.write("'/>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">\n");
      out.write("                        Batal\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"pegawai/prosesHapus.jsp?idPegawai=");
      out.print(k.getIdPegawai());
      out.write("\"class=\"btn btn-danger\">\n");
      out.write("                        Hapus\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");

        }
    }

      out.write("\n");
      out.write("</table>\n");
      out.write("</div>");
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
