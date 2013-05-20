

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
    
 //alert("ajaxCallRemotePage --");	
var iy = document.getElementById("idMessage");
//var iy = document.getElementById("id3");
alert(iy.value); 
//var queryString = "id="+iy.value.toString();
if (window.XMLHttpRequest) 
{ 
// Non-IE browsers       	
req = new XMLHttpRequest();        	
req.onreadystatechange = processStateChange;         
req.open("POST", url, true);         
req.setRequestHeader("If-Modified-Since", "Sat, 1 Jan 2000 00:00:00 GMT"); 
 //req.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
req.send(null); 	
} 	
else if (window.ActiveXObject) 
{ 
// IE       	
req = new ActiveXObject("Microsoft.XMLHTTP");        	
req.onreadystatechange = processStateChange;        	
req.open("POST", url, true);        	
req.setRequestHeader("If-Modified-Since", "Sat, 1 Jan 2000 00:00:00 GMT"); 		
req.send(); 	
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
   } else {         
     // Pour le debug          
     alert("Problem: " + req.statusText);     
     alert("status: " + req.status);   
   }  
} }