<%-- 
    Document   : newMessage
    Created on : 2013-05-19, 15:59:28
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="Scripts/scr-ajax_sendMessage.js"></script> 
      
    </head>
    <body>
        
        <h1>Nouveau message</h1>
        <form action="#">
            Id utilisateur :<input type="text" id="userId"/><br/>
            Id Message :<input type="text" id="messageId"/><br/>
            <textarea id="content" rows="4" cols="50" ></textarea><br/>
            <input type="button" value="Envoyer" onclick="envoyerMessage()"/>
        </form>
        <h3>Resultat:</h3>
        <div id="reponse"></div>
        
    </body>
</html>
