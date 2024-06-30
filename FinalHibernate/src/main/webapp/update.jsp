<%@page import="java.util.ArrayList"%>
<%@page import="com.dspl.io.dao.PersistDao"%>
<%@page import="com.dspl.io.entity.Hobbies"%>
<%@page import="com.dspl.io.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<meta charset="UTF-8">
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: 'Arial', sans-serif;
}

body {
	background: linear-gradient(to right, #ffecd2, #fcb69f);
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.container {
	width: 80%;
	margin: auto;
	padding: 20px;
	background: white;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	border-radius: 10px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

form {
	background: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 100%;
	max-width: 500px;
	background: linear-gradient(to right, #feb47b, #86a8e7);
}

h2 {
	text-align: center;
	color: #333;
	text-transform: uppercase;
	margin-bottom: 20px;
}

label {
	display: block;
	margin-bottom: 8px;
	font-weight: bold;
}

input[type="text"], input[type="date"], textarea {
	width: calc(100% - 20px);
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 14px;
}

select {
	width: calc(100% - 20px);
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 14px;
}

input[type="submit"] {
	width: 100%;
	background-color: #333;
	color: white;
	border: none;
	padding: 10px;
	cursor: pointer;
	font-size: 16px;
	border-radius: 5px;
	transition: background-color 0.3s, color 0.3s;
}

input[type="submit"]:hover {
	background-color: transparent;
	color: #333;
	border: 3px solid #333;
}

input[type="radio"], input[type="checkbox"] {
	margin-right: 5px;
}

input[type="file"] {
	width: calc(100% - 20px);
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 14px;
}

@media ( max-width : 1024px) {
	.container {
		width: 90%;
	}
	form {
		font-size: 0.9em;
	}
}

@media ( max-width : 768px) {
	.container {
		width: 95%;
		padding: 10px;
	}
	h2 {
		font-size: 1.5em;
	}
	label, input, textarea, select, input[type="submit"] {
		font-size: 14px;
	}
}

@media ( max-width : 480px) {
	.container {
		width: 100%;
		padding: 5px;
	}
	h2 {
		font-size: 1.2em;
	}
	label, input, textarea, select, input[type="submit"] {
		font-size: 12px;
	}
	form {
		font-size: 0.8em;
	}
}
</style>
<title>Employee Updation Page</title>
</head>
<body>

	<%
		int id = Integer.parseInt(request.getParameter("id"));

		Employee e = PersistDao.getEmployee(id);
		
		List<String> hobbies = new ArrayList<>();
		
		for(Hobbies hobby : e.getHobbies()){
			hobbies.add(hobby.getName());
		}
	%>

	<div class="container">
		<h2>
			<ins>Updation Form</ins>
		</h2>
		<form action="update" method="post">
			<input type="hidden" name="id" value="<%=e.getId()%>">;
			Name : <input type="text" id="name" name="name" value="<%=e.getName()%>" required><br><br>
			Gender : <input type="radio" id="male" name="gender" value="male" <%=e.getGender().equals("male") ? "checked" : "" %> > Male 
					 <input type="radio" id="female" name="gender" value="female" <%=e.getGender().equals("female") ? "checked" : "" %>>Female
					 <input type="radio" id="other" name="gender" value="other" <%=e.getGender().equals("other") ? "checked" : "" %>>Others<br><br>
			Hobbies: <input type="checkbox" id="reading" name="hobbies" value="Reading" <%=hobbies.contains("Reading") ? "checked" : "" %>>Reading 
					 <input type="checkbox" id="traveling" name="hobbies" value="Traveling" <%=hobbies.contains("Traveling") ? "checked" : "" %>>Traveling
					 <input type="checkbox" id="sports" name="hobbies" value="Sports" <%=hobbies.contains("Sports") ? "checked" : "" %>>Sports<br><br>
			Date of Birth: <input type="date" id="dob" name="dob" value="<%=e.getDate()%>" required><br><br>
			Designation:<select name="designation" required>
							<option value="">Select</option>
							<option value="intern" <%=e.getDesignation().equals("intern") ? "selected" : "" %>>Intern</option>
							<option value="java developer" <%=e.getDesignation().equals("java developer") ? "selected" : "" %>>Java Developer</option>
							<option value="software engineer" <%=e.getDesignation().equals("software engineer") ? "selected" : "" %>>Software Engineer</option>
							<option value="hr" <%=e.getDesignation().equals("hr") ? "selected" : "" %>>HR</option>
						</select><br><br>
			Address:<br><textarea id="address" name="address" rows="4" cols="50" required><%=e.getAddress()%></textarea><br><br>
			<input type="submit" value="Update">
		</form>
	</div>

</body>
</html>