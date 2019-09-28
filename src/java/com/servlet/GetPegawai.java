/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.ukrim.model.Pegawai;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author harokidz
 */
@WebServlet(name = "GetPegawai", urlPatterns = {"/getservlet"})
public class GetPegawai extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	    /* TODO output your page here. You may use following sample code. */
//	    out.println("<!DOCTYPE html>");
//	    out.println("<html>");
//	    out.println("<head>");
//	    out.println("<title>Servlet GetPegawai</title>");	    
//	    out.println("</head>");
//	    out.println("<body>");
//	    out.println("<h1>Servlet GetPegawai at " + request.getContextPath() + "</h1>");
//	    out.println("</body>");
//	    out.println("</html>");
	}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
//	processRequest(request, response);
	response.setContentType("application/json");
	response.setHeader("Cache-Control", "no-store, no-cache");
	PrintWriter out = response.getWriter();
	String idPegawai = request.getParameter("idPegawai");
	Pegawai kr = Pegawai.getByPrimaryKey(idPegawai);
	JSONObject object = new JSONObject();
	if (kr != null) {
	    object.put("idPegawai", kr.getIdPegawai());
	    object.put("nama", kr.getNama());
	    object.put("jenisKelamin", kr.getJenisKelamin());
	    object.put("tanggalLahir", kr.getTanggalLahir());
	    object.put("alamat", kr.getAlamat());
	    
	}else{
	    object.put("error", "Tidak ada Data");
	}
	out.println(object.toString());
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
	return "Short description";
    }// </editor-fold>

}
