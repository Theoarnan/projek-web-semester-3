<%@page import="com.ukrim.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
User user = User.getByUsernameAndPassword(username, password);
if(user == null) {
        response.sendRedirect("login.jsp");
    } else {
        HttpSession sess = request.getSession();
        sess.setAttribute("user", user);
        response.sendRedirect("index.jsp");
    }
%>