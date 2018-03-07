<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
<title>Acerca de</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="wrapper">

		<jsp:include page="generic/menu.jsp" />
		<div class="main">
		<div class="subcabecera">
	            <p>
	                <a href='inicio'>Inicio</a> / 
	                <a href='acercade'>Acerca de</a>
	            </p>
	        </div>
			<div class="politicas">
				<h2>Acerca de</h2>
				<p>Existe un fichero de tratamiento de datos de caracter
					personal para uso promocional interno el cual está inscrito en la
					Agencia Española de Protección de datos. Nunca se proporcionarán o
					venderán estos datos a terceros. El responsable del fichero es
					Pablo. Si desea ser eliminado de nuestra base de datos
					o bien modificar los mismos puede solcitarlo en esta dirección
					postal:</p>
				<p>calle estación, Colloto, España</p>
				<p>O bien en la siguiente dirección de correo electrónico:
					pablo@gmail.com</p>
			</div>
		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>

</body>
</html>
