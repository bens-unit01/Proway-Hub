<%-- 
    Document   : rechercher
    Created on : 2013-03-27, 16:00:13
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
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
	<div id="principale">
			<div class="pos-1">
                            
                            <br/><br/><br/>
               <html:form  action="Rechercher.do">
                   Mot clé: <html:text property="keyword"/>  
                   <html:select property="choixIndex">
                        <html:option value="0">Couleur</html:option>
                        <html:option value="1">Marque</html:option>
                        <html:option value="2">Type</html:option>
                    </html:select>
                <html:submit value="Rechercher" />

                </html:form>
                  
                 <br/><br/><br/><br/>       
                        
		       </div>
        </div>
    </div>
<!-- section principale de la page  ---------------------------FIN--------------------------------------------->
<!-- pied de page -------------------->
 <%@include file="footer.jsp"%> 
 
</body>
</html>
