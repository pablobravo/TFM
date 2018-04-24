<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<title>Carrito</title>
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
	                <a href=''>Carrito</a>
	            </p>
	        </div>
	        <div class="carritoorden">
				<div class="cart">
					<div class='content grid cabeceracart'>
						<div class='imgproducto'>
							<p>PRODUCTO</p>
						</div>
						<div class='preciounidad'>
							<p>PRECIO UNIDAD</p>
						</div>
						<div class='totalunidades'>
							<p>TOTAL UNIDADES</p>
						</div>
						<div class='subtotal'>
							<p>SUBTOTAL</p>
						</div>
					</div>
	
					<c:forEach items="${carrito.productos}" var="p">
	
						<div class='content grid cuerpocart' id="product${p.key.id}">
							<div class='imgproducto'>
								<img
									src="<c:url value="/resources/product/${fn:toUpperCase(fn:replace(p.key.nombre,' ', ''))}.JPG"/>"
									alt="<c:out value="${p.key.nombre}"></c:out>">
								<p class='nombreproducto'>
									<c:out value="${fn:substring(p.key.nombre, 0, 1)}"></c:out><c:out
										value="${fn:toLowerCase(fn:substring(p.key.nombre, 1, 1000))}"></c:out>
								</p>
							</div>
							<div class='preciounidad'>
								<p class="precio">
									<c:out value="${p.key.precio}"></c:out>
									€
								</p>
							</div>
							<div class='totalunidades'>
								<p class="cantidad">
									<span><a href="removecarrito?idproducto=${p.key.id}">-</a></span>${p.value}<span><a
										href="addcarrito?idproducto=${p.key.id}">+</a></span>
								</p>
							</div>
							<div class='subtotal'>
								<p>
								<fmt:formatNumber value="${p.value * p.key.precio}" maxFractionDigits="2"/>
									€
								</p>
							</div>
						</div>
	
					</c:forEach>
				</div>
				<div class="resume">
					<p>
						<span>Método de pago disponible:</span> contrareembolso
					</p>
					<p>
						<span>Gastos de envío:</span> 3 EUR
					</p>
					<p>
						<span>Subtotal:</span> ${carrito.preciototal} EUR
					</p>
					<p>
						<span class="total">Total a pagar: <c:out
								value="${carrito.preciototal+3}"></c:out>€
						</span>
					</p>
					<c:choose>
						<c:when test="${sesion != null}">
							<c:choose>
								<c:when test="${carrito.productos.size() > 0}">
									<a class="boton" href="envioypago"> Continuar: Envío y pago</a>
								</c:when>
								<c:otherwise>
									<a class="boton" href="inicio"> Añade productos al carrito</a>
								</c:otherwise>
							</c:choose>
	
						</c:when>
						<c:otherwise>
							<a class="boton" href="acceso"> Inicia sesión para continuar</a>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>
	<script>
		document.getElementById("carrito").className += " active";
	</script>
</body>
</html>