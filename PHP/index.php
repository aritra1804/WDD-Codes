<!DOCTYPE html>
<html>
<head>
	<title>Simple Online Test</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Simple Online Test</h1>
		</div>
		<form method="post" action="submit.php">    
			<div class="question">
				<h2>Question 1</h2>
				<p>What is the capital of France?</p>
				<label><input type="radio" name="q1" value="a"> A. Paris</label><br>
				<label><input type="radio" name="q1" value="b"> B. Madrid</label><br>
				<label><input type="radio" name="q1" value="c"> C. Berlin</label><br>
				<label><input type="radio" name="q1" value="d"> D. Rome</label><br>
			</div>
			<div class="question">
				<h2>Question 2</h2>
				<p>What is the largest planet in our solar system?</p>
				<label><input type="radio" name="q2" value="a"> A. Jupiter</label><br>
				<label><input type="radio" name="q2" value="b"> B. Mars</label><br>
				<label><input type="radio" name="q2" value="c"> C. Earth</label><br>
				<label><input type="radio" name="q2" value="d"> D. Neptune</label><br>
			</div>
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>
