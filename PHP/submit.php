<!DOCTYPE html>
<html>
<head>
	<title>Simple Online Test - Results</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Simple Online Test - Results</h1>
		</div>
		<?php
		$answers = array("a", "a");
		$userAnswers = array($_POST["q1"], $_POST["q2"]);
		$score = 0;
		for ($i=0; $i < count($answers); $i++) { 
			if ($answers[$i] === $userAnswers[$i]) {
				$score++;
			}
		}
		?>
		<div class="results">
			<h2>Your Score: <?php echo $score; ?> / <?php echo count($answers); ?></h2>
			<p>Question 1: <?php echo ($userAnswers[0] === $answers[0]) ? "Correct" : "Incorrect"; ?></p>
