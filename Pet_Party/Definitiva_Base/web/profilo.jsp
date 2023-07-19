
   <%@ page language="java" 
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="it.unibo.tw.web.beans.UserBean"
   %>
   <%@page import="it.unibo.tw.web.beans.UtenteStandard" %>
   <%@page import="it.unibo.tw.web.beans.ProfiloUtente" %>
   <%@page import="it.unibo.tw.web.beans.Profilo" %>
   
   <%@page import="it.unibo.tw.web.beans.ProfiloProfessionista" %>
   <%@page import="it.unibo.tw.web.beans.Professionista" %>
   <%@page import="it.unibo.tw.web.beans.Animale" %>
   
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
   <%
String username = request.getParameter("username");
%>
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
         <title>   Profilo di <%=username%>   </title>
      </head>
     
    
</html>