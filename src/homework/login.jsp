login.jsp<%@ page language="java" %>

<%
    String name = request.getParameter("userName");
    String pwd = request.getParameter("userPwd");
    if(name.equals("")||pwd.equals(""))
    {
        response.sendRedirect("main.jsp");
    }
    else
    {
        out.println("success");
    }
%>