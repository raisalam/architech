 
 
 <%@page import="com.api.vos.UserVO"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<%
String contextPath =request.getContextPath();
UserVO userVO = (UserVO) session.getAttribute("partnerVO");
%>
 
 <div id="header">
            <div class="inner-width">
            <aside class="logo"><a href="<s:url action="showLogin" namespace="/partner"/>"><img src="<%=contextPath %>/images/logo.png" alt="logo"/></a></aside>
            <aside class="welcome-guest">
                <ul>
                    <%
                    if(userVO != null && userVO.getUserFirstName()!=null)
                    {
                    %>
                    <li>Welcome <%=userVO.getUserFirstName()%></li>                
                    <li class="last"><a href="<s:url action="signout" namespace="/user"/>">Sign out</a></li>
                    
                    <%}
                    else
                    {%>
                    <li class="last"> Welcome Guest</li>                    
                   <%} %>
                </ul>
            </aside>
            <div class="clear"></div>
            </div>
</div>
