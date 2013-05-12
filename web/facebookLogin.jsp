<%-- 
    Document   : facebookLogin
    Created on : 2013-05-12, 14:41:05
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        
       
<%
    String fbURL = "http://www.facebook.com/dialog/oauth?client_id=myfacebookappid&redirect_uri=" + URLEncoder.encode("http://myappengineappid.appspot.com/signin_fb.do") + "&scope=email";
%>

<a href="<%= fbURL %>"><img src="/img/facebook.png" border="0" /></a>
    </body>
</html>
