

function appelAjaxExemple() 
{ 
    
//alert("appelAjaxExemple --");	
ajaxCallRemotePage('ajaxAction.do'); 
}
function envoyerMessage() 
{ 
    
//alert("appelAjaxExemple --");	
ajaxCallRemotePage('sendMessage.do'); 
}



function ajaxCallRemotePage(url) 
{ 
    var userId = document.getElementById("userId").value;
 //alert("ajaxCallRemotePage --");	 
if (window.XMLHttpRequest) 
{ 
// Non-IE browsers       	
req = new XMLHttpRequest();        	
req.onreadystatechange = processStateChange;         
req.open("POST", url, true);         
//req.setRequestHeader("If-Modified-Since", "Sat, 1 Jan 2000 00:00:00 GMT"); 
req.setRequestHeader("Content-type","application/x-www-form-urlencoded");

//alert("cote client "+userId);
req.send("userId="+userId); 	
} 	
else if (window.ActiveXObject) 
{ 
// IE       	
req = new ActiveXObject("Microsoft.XMLHTTP");        	
req.onreadystatechange = processStateChange;        	
req.open("POST", url, true);        	
req.setRequestHeader("Content-type","application/x-www-form-urlencoded");
req.send("userId="+userId); 	
} 	
else { 		
return; // Navigateur non compatible 	
}  
}

function processStateChange() 
{     
if (req.readyState == 4) 
{ // Complete       
if (req.status == 200) 
{ // OK response        
  // Pour le debug        
  alert("ok:"+req.responseText);  

document.getElementById("reponse").innerHTML =req.responseText;
   } else {         
     // Pour le debug          
     alert("Problem: " + req.statusText);     
     alert("status: " + req.status);   
   }  
} }