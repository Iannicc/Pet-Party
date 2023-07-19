function gotoAnimale(usernamePadrone,animalBlock) {
	var nomeAnimale=animalBlock.innerHTML;
	var argument = "username="+usernamePadrone+"&animale="+nomeAnimale;
	window.location.href = 'animale.jsp?' + argument;
}
