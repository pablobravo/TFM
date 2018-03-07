<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<!doctype html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<meta name="MobileOptimized" content="width" />
		<meta name="HandheldFriendly" content="true" />
		<meta content="Pablo Bravo Mediavilla" name="author" />
		<link rel="shortcut icon" href="<c:url value="/resources/img/logo.ico"/>" />
		<title>BravoFarma</title>
		<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper">	
			
			<jsp:include page="generic/menu.jsp"/>
			<div class="main">
				
					<div id="slider">
						<figure>
							<img src='<c:url value='./resources/slider/baner1.jpg'/>' alt='banner 1'>
							<img src='<c:url value='./resources/slider/baner2.jpg'/>' alt='banner 2'>
							<img src='<c:url value='./resources/slider/baner3.jpg'/>' alt='banner 3'>
						</figure>
					</div>
					
					<div class="categoria"><a href="salud"><spring:message code="salud" /><img src='<c:url value='./resources/categorias/categoria3.jpg'/>' alt='<spring:message code="salud" />'></a></div>
					<div class="categoria"><a href="cosmetica"><spring:message code="cosmetica" /><img src='<c:url value='./resources/categorias/categoria1.jpg'/>' alt='<spring:message code="cosmetica" />'></a></div>
					<div class="categoria"><a href="higiene"><spring:message code="higiene" /><img src='<c:url value='./resources/categorias/categoria2.jpg'/>' alt='<spring:message code="higiene" />'></a></div>
					<div class="categoria"><a href="dietetica"><spring:message code="dietetica" /><img src='<c:url value='./resources/categorias/categoria5.jpg'/>' alt='<spring:message code="dietetica" />'></a></div>
					<div class="categoria"><a href="bebes"><spring:message code="bebes" /><img src='<c:url value='./resources/categorias/categoria4.jpg'/>' alt='<spring:message code="bebes" />'></a></div>
			</div>
			
			
			<jsp:include page="generic/footer.jsp"/>
		</div>
		<script>
			document.getElementById("inicio").className += " active"; 
		</script>
	</body>
</html>		
