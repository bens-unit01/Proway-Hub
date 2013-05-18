<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

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
			
			
            <a href="facebookLogin.jsp">Facebook login</a><br/>
            <a href="#">liste etudiants</a><br/>
            <a href="#">liste messages </a><br/>
            <a href="#">liste commentaires </a><br/>
			
	
		
	</div>
</div>
<!-- section principale de la page  ---------------------------FIN--------------------------------------------->
<!-- pied de page -------------------->
 <%@include file="footer.jsp"%> 
 
</body>
</html>








