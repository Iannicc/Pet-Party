


function gotoProfilo(usernameblock) {
	username=usernameblock.innerHTML;
	var argument = "username="+username;
	window.location.href = 'web/profilo.jsp?' + argument;
}
