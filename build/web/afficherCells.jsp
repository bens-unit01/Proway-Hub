<%-- 
    Document   : afficherEtudiants
    Created on : 2010-02-28, 21:11:26
    Author     : Toshiba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <title> Page d'accueil </title>
	
		
 <%@include file="declaration.jspf"%> 	

</head>
<body>
<!-- section contenant le haut de la page-----------------DEBUT---------------------------------------->
	
        
 <%@include file="header.jsp"%> 


<!-- section contenant le haut de la page---------------------FIN------------------------------------>
<!-- section principale de la page ----------------------------DEBUT-------------------------------------------->
<div id="container" class="clearfix">
    <h2>${titre}</h2>  
    <div id="principale" class="clearfix">
			
                     
                            
                          <c:forEach var="mob" items="${liste}">
                            <div class="box2">
                                <table>
                                        <tr>
                                            <td rowspan="4">
                                                <img src="img/devices/p/p${mob.deviceId}.jpg" width="100" height="185" alt="p${mob.deviceId}"/>
                                            </td>
                                             <td>
                                                 <br/>
                                                 <a href="AfficherDetails.do?id=${mob.deviceId}" >
                                                 ${mob.brand}</a>
                                             </td>
                                        </tr>
                                        <tr>
                                            <td ><span style="font-size: 1.6em; font-weight: bold; text-align: center;">${mob.model}</span></td>
                                        </tr>
                                        <tr>
                                            <td><br/><span style="color: #ff0000">Notre prix :</span>
                                                 <br/><span class="bg4" style="margin-left: 20px;">${mob.price}</span>
                                                 <br>
                                                 <span style=" font-size: .85em;"><fmt:formatNumber type="number" maxIntegerDigits="3" value="${mob.price - 1.65}" />   
                                                     $ + 1.65 $ frais d'envoie </span>
                                             </td>
                                        </tr>   
                                        <tr>
                                            <td >
                                                Type:  ${mob.type}<br/>
                                                Couleur : ${mob.color}  
                                            <td>
                                        </tr>

                                 </table>
                                </div>
                            </c:forEach>  
			
			
			<br/>
			
			
			<br/>
			
	
			
	
	</div>  <!-- fin principal -->
</div>          <!-- fin container -->
<!-- section principale de la page  ---------------------------FIN--------------------------------------------->
<!-- pied de page -------------------->
        
 <%@include file="footer.jsp"%> 

</body>
</html>