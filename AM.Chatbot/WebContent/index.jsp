<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="pt-br" dir="ltr">
<head>
<%@ include file="header.jsp"%>
<title>Drawer Studius - Login</title>
</head>
<body>
	<div class="container-fluid w-100">
		<div class="row">
			<div class="container-fluid news-5">
				<form id="logar" action="loginServlet" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">login</label> <input type="email"
							class="form-control mt-2" id="email" name="email"
							aria-describedby="emailHelp" placeholder="Enter ID">
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" class="form-control mt-2"
							id="password" name="password" placeholder="Password">
					</div>
					<button type="submit" class="btn w-100">Submit</button>
				</form>
			</div>
		</div>
	</div>
<%@ include file="footer.jsp" %>
</body>
</html>
