window.onload = function() {
      var text = document.getElementById('text');

      setTimeout(function() {
        text.style.fontSize = '140px';
        text.style.transform = 'translateY(-180%)';


	   setTimeout(function() {
        $('.fadeButton').css({'opacity':'1'})
      }, 1700);

       
  
	test();

      }, 1000);

    
};

function test() {
    $(".pupp").each(function(index) {
        $(this).hide();
        $(this).delay(3000* index).fadeIn(2500);
    });
}

