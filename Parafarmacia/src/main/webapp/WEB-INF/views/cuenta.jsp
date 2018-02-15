<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta name="MobileOptimized" content="width" />
<meta name="HandheldFriendly" content="true" />
<meta content="Pablo Bravo Mediavilla" name="author" />
<link rel="shortcut icon"
	href="<c:url value="/resources/img/logo.ico"/>" />
<title>Cuenta</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="wrapper">

		<jsp:include page="generic/menu.jsp" />
		<div class="main">
			<div class="subcabecera">
	            <p>
	                <a href='inicio'>Inicio</a> / 
	                <a href='cuenta'>Cuenta</a> / 
	            </p>
	        </div>
			<div class="formacceso">
				<h2>Actualizar datos</h2>
				<h3><c:out value="${actualizado}"></c:out></h3>
				<p>
					<c:out value="${error}"></c:out>
					
				</p>
				<form:form commandName="usuario">
					<form:errors path="" />

					<form:input class="inputtexto" type="text" path="email"
						value="${sesion.email}" required="required" autofocus="autofocus" />
					<form:input class="inputtexto" type="text" path="nombre"
						value="${sesion.nombre}" required="required" />

					<form:input class="inputtexto" type="password" path="password"
						value="${sesion.password}" required="required" />
					<form:input class="inputtexto" type="password"
						path="passwordrepeat" value="${sesion.password}"
						required="required" />

					<form:input class="inputtexto" type="text" path="codpostal"
						value="${sesion.codpostal}" required="required" />
					<form:input class="inputtexto" type="text" path="direccion"
						value="${sesion.direccion}" required="required" />
					<form:input class="inputtexto" type="text" path="ciudad"
						value="${sesion.ciudad}" required="required" />
					<form:input class="inputtexto" type="text" path="provincia"
						value="${sesion.provincia}" required="required" />


					<input class="boton" type="submit" value="Actualizar" />
				</form:form>
			</div>
		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>
	<script>
		document.getElementById("inicio").className += " active";
		
	</script>
</body>
</html>