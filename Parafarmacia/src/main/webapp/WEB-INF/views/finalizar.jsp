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
<title>Finalizar</title>
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
	                <a href='envioypago'>Envío y pago</a> /
	                <a href=''>Finalizar</a>
	            </p>
	        </div>
			<h2 class="tituloresumen">¡Enhorabuena, su compra se ha
				realizado con éxito!</h2>
			<div class="pedido">


				<div class="productos">
					<c:forEach items="${pedido.productos}" var="p">

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
						<span class="total">Precio total: <c:out
								value="${fn:substring(pedido.preciototal+3, 0, 5)}"></c:out>&euro;
						</span>
					</p>
				</div>

			</div>


		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>

</body>
</html>