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
<title>Mis pedidos</title>
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
	                <a href=''>Mis pedidos</a> 
	            </p>
	        </div>
			<h2 class="tituloresumen">Mis pedidos</h2>
			<div class="pedido">


				<div class="mispedidos">
					<c:forEach items="${pedidosusuario}" var="p">

						<div class='infopedido'>
							<div>
								<p>Pedido realizado</p>
								<p>${p[0].fecha}</p>
							</div>
							
							<div>
								<p>Enviar a</p>
								<p><a href="cuenta">${sesion.nombre}</a></p>
							</div>
							<div class="todo">
								<p>Pedido Nº ${p[0].id}${p[0].idUsuario}${p[0].idProducto}</p>
								<p>Estado: ${p[0].estado}</p>
							</div>
							
						</div>
						<div class="pedidoproducto">
							<c:forEach items="${p}" var="pedidoproducto">
								<c:forEach items="${productos}" var="producto">
									<c:choose>
										<c:when test="${producto.id == pedidoproducto.idProducto}">
											<div class='imgproducto'>
												<p><c:out value="${pedidoproducto.unidades}"></c:out> X</p>
												<img class="imageproducto"
													src="<c:url value="/resources/product/${fn:toUpperCase(fn:replace(producto.nombre,' ', ''))}.JPG"/>"
													alt="<c:out value="${producto.nombre}"></c:out>">
												<p class='nombreproducto'>
													<c:out value="${fn:substring(producto.nombre, 0, 1)}"></c:out>
													<c:out
														value="${fn:toLowerCase(fn:substring(producto.nombre, 1, 1000))}"></c:out>
												</p>
												<p class="total">Subtotal: 
												EUR ${pedidoproducto.unidades * producto.precio}</p>
											</div>
										</c:when>
										<c:otherwise>
	
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:forEach>
						</div>	
						
						
					</c:forEach>

				</div>

			</div>


		</div>
		<jsp:include page="generic/footer.jsp" />
	</div>
	
</body>
</html>