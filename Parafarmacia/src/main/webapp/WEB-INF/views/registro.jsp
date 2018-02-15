<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
<title>Registro</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="wrapper">

		<jsp:include page="generic/menu.jsp" />
		<div class="main">
			<div class="subcabecera">
	            <p>
	                <a href='inicio'>Inicio</a> /
					<a href=''>Registro</a> 
	            </p>
	        </div>
			<div class="formacceso">
				<c:choose>
					<c:when test="${registrado != null}">
						<h2>¡Se ha registrado correctamente!</h2>
					</c:when>
	
					<c:otherwise>
						<h2>Registro</h2>
						<p>
							<c:out value="${error}"></c:out>
						</p>
						<form:form commandName="usuario">
							<form:errors path="" />
	
							<form:input class="inputtexto" type="email" path="email"
								name="email" placeholder="Email" required="true" />
							<form:input class="inputtexto" type="text" path="nombre"
								name="nombre" placeholder="Nombre y apellidos" required="true" />
	
							<form:input class="inputtexto" type="password" path="password"
								name="password" placeholder="Contraseña" required="true" />
							<form:input class="inputtexto" type="password" path="passwordrepeat"
								name="passwordrepet" placeholder="Repetir contraseña"
								required="true" />
	
							<form:input class="inputtexto" type="text" path="codpostal"
								name="codpostal" placeholder="Código postal" required="true" />
							<form:input class="inputtexto" type="text" path="direccion"
								name="direccion" placeholder="Dirección" required="true" />
							<form:input class="inputtexto" type="text" path="ciudad"
								name="ciudad" placeholder="Ciudad" required="true" />
							<form:input class="inputtexto" type="text" path="provincia"
								name="provincia" placeholder="Provincia" required="true" />
							<div class="checkterminos">
								<form:checkbox path="terminos" name="terminos" />
								<p class="registrateaqui">
									Acepto <a href="terminos"> términos y condiciones</a>
								</p>
							</div>
							<input class="boton" type="submit" value="Registrarse" />
						</form:form>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>
	
</body>
</html>