<%-- 
    Document   : listeUtilisateurs
    Created on : 2013-05-19, 11:56:01
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@include file="declaration.jspf"%> 
    </head>
    <body>
        <h1>Liste des etudiants </h1>
        
          <table>

          <c:forEach var="etudiant" items="${liste}">
                            
                                        <tr>
                                            <td>
                                              ${etudiant.nom}
                                            </td>
                                             <td>
                                               
                                                 ${etudiant.prenom}
                                             </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2">${etudiant.email1}</td>
                                        </tr>
         </c:forEach>
          </table>
    </body>
</html>
