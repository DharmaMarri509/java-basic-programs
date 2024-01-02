
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style>
	.main{
            background-color: aqua;
           	height: 500px;
           	width: 600px;
          	padding-left: 250px;
          	margin-left: 250px;
          	margin-top: 100px;
            
          
        }
</style>
</head>
<body text="blue" bgcolor="black">
 	<div class="main">
 		<h1>Registration Form</h1>
 		==========================
 		<form action="StudentRegister" method="post">
 		<table>
 			<tr>
 				<td>Name: </td><td><input type="text" name="name" ></td>
 			</tr>
 			 <br>
 			<tr>
 				<td>Password: </td><td><input type="password" name="password" ></td>
 			</tr> 
 			<br>
 			<tr>
 				<td>E-Mail: </td><td><input type="email" name="email" ></td>
 			</tr>
 			 <br>
 			<tr>
 				<td>Gender: </td><td><input type="radio" name="gender" value="male" >Male
 							<input type="radio" name="gender" value="female" >Female</td>
 			</tr>
 			 <br>
 			<tr>
 				<td>Phone: </td><td><input type="text" name="phone" ></td>
 			</tr> 
 			<br>
 			<tr>
 				<td><button type="submit" value="Register">Register</button><td>
 			</tr>
 		</table>
 		</form>
 		<button><a href="StudentRegister">Show Students</a></button>
 	</div>
</body>
</html>