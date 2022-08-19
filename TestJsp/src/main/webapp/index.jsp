<!DOCTYPE html>
<html>
<head>
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>


<body>

<p>Click the button to open a new window called "MsgWindow" with some text.</p>

<button onclick="goToFacebook()" type="button" class="btn btn-primary">Primary</button>

<button onclick="myFunction()" type="button" class="btn btn-primary">Primary</button>

<script>
var facebookView;
var redirectView;

function goToFacebook(){
  var myWindow = window.open("https://www.facebook.com/", "", "");
  //myWindow.document.write("<p>This is 'MsgWindow'. I am 200px wide and 100px tall!</p>");
  // msgwindow.close();
}

function myFunction() {
	  var myWindow = window.open("https://www.facebook.com/", "", "");
	  //myWindow.document.write("<p>This is 'MsgWindow'. I am 200px wide and 100px tall!</p>");
	  // msgwindow.close();
	}

</script>


	
</body>
</html>


