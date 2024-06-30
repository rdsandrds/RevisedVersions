<%@page import="com.dspl.io.dao.PersistDao"%>
<%@page import="com.dspl.io.entity.Hobbies"%>
<%@page import="com.dspl.io.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Records</title>
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
}
h1 {
    margin-bottom: 20px;
    text-align: center;
    font-size: 2em;
    color: #333;
    text-transform: uppercase;
}
table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 20px;
    background: linear-gradient(to right, #ff7e5f, #feb47b, #86a8e7, #7f7fd5);
    color: white;
}
th, td {
    padding: 12px 15px;
    text-align: center;
}
th {
    background-color: rgba(0, 0, 0, 0.1);
}
tr:nth-child(even) {
    background-color: rgba(255, 255, 255, 0.1);
}
tr:hover {
    background-color: rgba(0, 0, 0, 0.1);
}
.register {
    font-size: 20px;
    padding: 10px 20px;
    background-color: #333;
    color: white;
    border-radius: 20px;
    border: 3px solid #333;
    cursor: pointer;
    text-decoration: none;
    display: inline-block;
    transition: background-color 0.3s, color 0.3s;
}
.register:hover {
    background-color: transparent;
    color: #333;
    border: 3px solid #333;
}
button {
    font-size: 16px;
    padding: 8px 12px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s, color 0.3s;
    margin-top: 5px;
    background-color: #333;
    color: white;
}
button:hover {
    background-color: white;
    color: black;
}
a {
    color: inherit;
    text-decoration: none;
}

/* Responsive Styles */
@media (max-width: 1024px) {
    .container {
        width: 90%;
    }
    table {
        font-size: 0.9em;
    }
}

@media (max-width: 768px) {
    .container {
        width: 95%;
        padding: 10px;
    }
    h1 {
        font-size: 1.5em;
    }
    th, td {
        padding: 8px 10px;
    }
    button {
        font-size: 14px;
        padding: 6px 8px;
    }
    .register {
        font-size: 18px;
        padding: 8px 15px;
    }
}

@media (max-width: 480px) {
    .container {
        width: 100%;
        padding: 5px;
    }
    h1 {
        font-size: 1.2em;
    }
    th, td {
        padding: 6px 8px;
    }
    button {
        font-size: 12px;
        padding: 5px 7px;
    }
    .register {
        font-size: 16px;
        padding: 6px 10px;
    }
    table {
        font-size: 0.8em;
    }
}

</style>
</head>
<body>
	<%
	List<Employee> employees = PersistDao.fetchAll();
	%>
	<div class="container">
		<h1>
			<ins>Employee Records</ins>
		</h1>
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Gender</th>
				<th>Designation</th>
				<th>DOB</th>
				<th>Hobbies</th>
				<th>Address</th>
				<th>Actions</th>
			</tr>
			<%
			if (employees != null) {
				for (Employee e : employees) {
			%>
			<tr>
				<td><%=e.getName()%></td>
				<td><%=e.getGender()%></td>
				<td><%=e.getDesignation()%></td>
				<td><%=e.getDate()%></td>
				<td>
					<%
					for (Hobbies hobby : e.getHobbies()) {
					%>
					<p><%=hobby.getName()%></p> <%
 }
 %>
				</td>
				<td><%=e.getAddress()%></td>
				<td><a href="update.jsp?id=<%=e.getId()%>"><button>Update</button></a>
					<a href="delete?id=<%=e.getId()%>"><button>Delete</button></a></td>
			</tr>
			<%
			}
			}
			%>
		</table>
		<a href="index.jsp"><button class="register">Register
				Employee</button></a>
	</div>
</body>
</html>