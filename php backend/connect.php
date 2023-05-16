<?php
	ini_set("display_errors","");
	error_reporting(E_ALL);
	$course = $_POST['course'];
	$instructor = $_POST['instructor'];
	$crating = $_POST['crating'];
	$irating = $_POST['irating'];
	$activity = $_POST['activity'];
	$motivate = $_POST['motivate'];
	$support = $_POST['support'];
	$gender = $_POST['gender'];
	$email = $_POST['email'];
	$number = $_POST['number'];

	// Database connection
	$conn = new mysqli('localhost','root','','database');
	if($conn->connect_error){
		echo "$conn->connect_error";
		die("Connection Failed : ". $conn->connect_error);
	} else {
		$stmt = $conn->prepare("INSERT INTO `form` (`course`, `instructor`, `crating`, `irating`, `activity`, `motivate`, `support`, `gender`, `email`, `number`) VALUES (?, ?, ?, ?, ?,?,?,?,?,?)");
		$stmt->bind_param("ssiisssssi", $course, $instructor, $crating, $irating, $activity, $motivate, $support, $gender, $email, $number );
		$exeval = $stmt->execute();
		echo $exeval;
		echo "Registration successfully...";
		$stmt->close();
		$conn->close();
	}
?>