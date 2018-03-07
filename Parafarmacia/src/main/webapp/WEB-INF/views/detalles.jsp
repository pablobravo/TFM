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
<title>Detalles</title>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
	<div class="wrapper">

		<jsp:include page="generic/menu.jsp" />
		<div class="main">
			<div class="subcabecera">
	            <p>
	                <a href='inicio'>Inicio</a> / 
	                <a href='productos'>Productos</a> / 
	                <a href=''><c:out value="${fn:substring(producto.nombre, 0, 1)}"></c:out>
						<c:out
							value="${fn:toLowerCase(fn:substring(producto.nombre, 1, 1000))}"></c:out></a>
	            </p>
	        </div>
			<div class="descripcion">

				<div class="imgminiatura">
					<img id="imgminiatura1"
						src="<c:url value="/resources/product/${fn:replace(producto.nombre,' ', '')}.JPG"/>"
						alt="<c:out value="${producto.nombre}"></c:out>">
				</div>

				<div class="imggrande">
					<img id="imggrande1"
						src="<c:url value="/resources/product/${fn:replace(producto.nombre,' ', '')}.JPG"/>"
						alt="<c:out value="${producto.nombre}"></c:out>">
				</div>

				<div class='masinfo'>
					<h2>
						<c:out value="${fn:substring(producto.nombre, 0, 1)}"></c:out>
						<c:out
							value="${fn:toLowerCase(fn:substring(producto.nombre, 1, 1000))}"></c:out>
					</h2>
					<p class="precio">
						<c:out value="${producto.precio}"></c:out>
						€
					</p>
					<p class="descr">
						<c:out value="${producto.descripcion}"></c:out>
					</p>
					
					<c:choose>
						<c:when test="${producto.cantidad > 0}">
					
							<a class="boton" href="addcarrito?idproducto=${producto.id}"><img
								src='<c:url value='./resources/img/carrito.png'/>' alt='carrito'>
								 Añadir</a>
						</c:when>
						<c:otherwise>
							
							<a class="boton agotado" ><img
								src='<c:url value='./resources/img/carrito.png'/>' alt='carrito'>
								 Agotado</a>
						</c:otherwise>
					</c:choose>
					
				</div>

			</div>
		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>

</body>
</html>