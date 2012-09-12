<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
String contextPath =request.getContextPath();
%>

<html>
    <head>
        <title>MyWorld</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link type="text/css" rel="stylesheet"  href="<%=contextPath %>/css/style.css"/>		 
         
    
    
<SCRIPT type="text/javascript"> 
window.history.forward();  
function noBack() 
{ 
	window.history.forward();
}
</SCRIPT>
 <link rel="icon" href="<%=contextPath %>/favicon.ico" type="image/x-icon"/>
 <link rel="shortcut icon" type="image/x-icon" href="<%=contextPath %>/favicon.ico" />
</HEAD>
<BODY onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">
		<div id="page">
		
			<tiles:insertAttribute name="header" />		
	
			<tiles:insertAttribute	name="body" />
	
			<tiles:insertAttribute name="footer" />
		</div>
	
</body>
</html>
