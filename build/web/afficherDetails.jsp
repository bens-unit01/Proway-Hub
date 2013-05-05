<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@include file="declaration.jspf"%> 
    </head>
    <body>
     <%@include file="header.jsp"%> 


<div id="container" class="clearfix">
    <div id="principale">
        <table>
            <thead>
                <tr> <th colspan="2">${mob.brand}  ${mob.model} </th> </tr>
            </thead>
            <tbody>
                <tr>
                    
                    <td rowspan="2"> <img src="img/devices/${mob.deviceId}.jpg" width="222" height="340" alt="${mob.deviceId}"/> </td>
                    <td><br/><br/><h3>Description du cellulaire</h3>${mob.description}</td>
                </tr>
                <tr>
                    <td>Prix: <b>${mob.price}</b> <br/> Type: ${mob.type} <br/> Couleur: ${mob.color}
                     <br/> Quantité: ${mob.qte}
                     </td>
                </tr>
                
            </tbody>
        </table>
      </div>   
  </div> 
                
 <!-- pied de page -------------------->
        
 <%@include file="footer.jsp"%> 
      </body>
</html>
