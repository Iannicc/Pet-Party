<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd"><html>

<head>
  <title>Pet Social Media - Login</title>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/html/login.css" type="text/css"/>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Puppies+Play&display=swap" rel="stylesheet">
</head>
<body>
  <div class="container">
    <form class="login-form" method="POST" action="LoginServlet">
	<h2>Pet
	<span style="padding-right:0px; padding-top: 0px; display:inline-block;">
	<img class="manImg" src="<%= request.getContextPath() %>/html/paw.png" />

	</span>
	Party</h2>
      <div class="form-group">
        <label for="username">Username</label>
        <input type="text" id="username" name="username" required>
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password"  required>
      </div>
      <div class="button-container">
  	<button type="submit">Login</button>
    </form>
  	
  	<div class="register-link">
    	Non hai un account? <a href="html/Registrazione.html">Registrati</a>
	    </br>
		Sei un <a href="html/RegistrazionePro.html">professionista</a>? 
 	 </div>
	</div>
  </div>
</body>
</html>
