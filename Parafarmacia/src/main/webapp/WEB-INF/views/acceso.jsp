<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="MobileOptimized" content="width" />
<meta name="HandheldFriendly" content="true" />
<meta content="Pablo Bravo Mediavilla" name="author" />
<link rel="shortcut icon"
	href="<c:url value="/resources/img/logo.ico"/>" />
<title>Acceso</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="wrapper">
		
		<jsp:include page="generic/menu.jsp" />
		<div class="main">
			<div class="subcabecera">
	            <p>
	                <a href='inicio'>Inicio</a> / 
	                <a href='acceso'>Iniciar sesión</a>
	            </p>
	        </div>
			<div class="formacceso">
				<h2>Acceso</h2>
				<p>
					<c:out value="${error}"></c:out>
				</p>
				<form:form commandName="usuario">
					<form:errors path="" />
					<form:input class="inputtexto" type="text" path="email"
						placeholder="Email" required="required" autofocus="autofocus" />

					<form:input class="inputtexto" type="password" path="password"
						placeholder="Contraseña" required="required" />

					<input class="boton" type="submit" value="Iniciar sesión" />
				</form:form>
				<p class="registrateaqui">
					¿Todavía no tienes una cuenta? <a href="registro">¡Regístrate
						aquí!</a>
				</p>
			</div>
		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>


</body>
</html>