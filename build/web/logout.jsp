<%
HttpSession sess = request.getSession();
sess.getAttribute("user");
response.sendRedirect("login.jsp");
%>