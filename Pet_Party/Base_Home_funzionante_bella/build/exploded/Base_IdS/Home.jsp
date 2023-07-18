<html>
	<head>
	  	<title>Pet Party</title>
		  <script type="text/javascript" src="${pageContext.request.contextPath}/html/home.js"></script>

		  <link rel="stylesheet" href="<%= request.getContextPath() %>/html/home.css" type="text/css"/>
		  <link rel="preconnect" href="https://fonts.googleapis.com">
		  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	      <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		  <link href="https://fonts.googleapis.com/css2?family=Puppies+Play&display=swap" rel="stylesheet">
	  
	</head>


	<body>

		<img class="pupp" src="<%= request.getContextPath() %>/html/pup.png" />
		
		
		  <h2 id="text">Pet
		
			<span style="padding-right:0px; padding-top: 0px; 		display:inline-block;">
		
			<img class="manImg" src="<%= request.getContextPath() %>/html/paw.png"></img>
		
			</span>
		
		  Party</h2>
		  <button onclick="location.href='<%= request.getContextPath() %>/html/Registrazione.html'" id="regb" class="fadeButton"> Registrati </button>  
		
		  <button onclick="location.href='<%= request.getContextPath() %>/Login.jsp'" id="loginb" class="fadeButton"> Login </button>  


	</body>
</html>

