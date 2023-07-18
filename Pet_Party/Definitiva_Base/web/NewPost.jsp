
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
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
         <title>   Create a new post   </title>
      </head>
	
      <body>

         <center>
           	<form method="POST" action="PostServlet">
           	<div class="form-group">
        		<label for="media">Media</label>
        		<input type="file" id="media" name="media" required>
      		</div>
     		 <div class="form-group">
        		<label for="descrizione">descrizione</label>
        		<input type="text" id="descrizione" name="descrizione">
      		</div>
      		<h4>Animali presenti nel post</h4>
      		<%
      		UtenteStandard u = (UtenteStandard) session.getAttribute("currentSessionUser");
      		for(Animale a: u.getProfilo().getAnimali())
      		{
      			%>
      			<div class="form-group">
        		<label for="password"><%a.getNome(); %></label>
        		<input type="checkbox" name="checkbox" value=<%a.getNome(); %>>
      			</div>
      			<%
      		}
      		%>
      		<div class="button-container">
  			<button type="submit">Pubblica</button>
           	</form>
         </center>

      </body>
	
   </html>

