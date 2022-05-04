circle.jsp
<%@ page language="java" %>

<%
    String circle = request.getParameter("circle");
    Double radius = Double.parseDouble(circle);
    Double area = radius *3.14;
%>

<html>
<head>
    <title>circle</title>
</head>
<body>
radius: <%= radius %>
area: <%= area %>
</body>
</html>