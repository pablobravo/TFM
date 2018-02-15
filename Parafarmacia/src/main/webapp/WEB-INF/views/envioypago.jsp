<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<title>Envío y pago</title>
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
	                <a href='carrito'>Carrito</a> / 
	                <a href=''>Envío y pago</a>
	            </p>
	        </div>
			<h2 class="tituloresumen">Resumen de la compra</h2>
			<div class="pedido">


				<div class="productos">
					<h3>Productos</h3>
					<c:forEach items="${carrito.productos}" var="p">

						<div class='content grid'>
							<div class='imgproducto'>
								<img
									src="<c:url value="/resources/product/${fn:replace(p.key.nombre,' ', '')}.JPG"/>"
									alt="<c:out value="${p.key.nombre}"></c:out>">
								<p class='nombreproducto'>
									<c:out value="${fn:substring(p.key.nombre, 0, 1)}"></c:out>
									<c:out
										value="${fn:toLowerCase(fn:substring(p.key.nombre, 1, 1000))}"></c:out>
								</p>
							</div>
							<div class='totalunidades'>
								<p class="cantidad">${p.value}unidades</p>
							</div>
							<div class='subtotal'>
								<p>
									<fmt:formatNumber value="${p.value * p.key.precio}" maxFractionDigits="2"/>
									&euro;
								</p>
							</div>
						</div>

					</c:forEach>
					<hr>
					<p>
						<span class="total">Total a pagar: <c:out
								value="${fn:substring(carrito.preciototal+3, 0, 5)}"></c:out>&euro;
						</span> (Gastos de envío incluidos)
					</p>
					<p class="info">Una vez finalizada la compra el pedido quedará
						realizado y se procederá a empaquetar y enviar a la dirección
						solicitada por el usuario</p>
				</div>
				<div class="datosenvio">
					<div>
						<h3>
							Datos de envío <a href="cuenta"><img
								src="<c:url value="./resources/img/edit.png"/>" alt="Editar"></a>
						</h3>

						<p>
							Código postal:
							<c:out value="${sesion.codpostal}"></c:out>
						</p>
						<p>
							Dirección:
							<c:out value="${sesion.direccion}"></c:out>
						</p>
						<p>
							Ciudad:
							<c:out value="${sesion.ciudad}"></c:out>
						</p>
						<p>
							Provincia:
							<c:out value="${sesion.provincia}"></c:out>
						</p>
					</div>
				</div>
				<a class="boton" href="finalizar"> Finalizar</a>
			</div>


		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>
	<script>
		document.getElementById("carrito").className += " active";
	
	</script>
</body>
</html>