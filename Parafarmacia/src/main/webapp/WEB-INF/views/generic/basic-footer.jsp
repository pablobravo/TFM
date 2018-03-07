<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
	if("<c:out value='${carrito.totalproductos}'></c:out>">0){
		document.getElementById("carrito").innerHTML  = "<img src='<c:url value='./resources/img/carrito.png'/>' alt='carrito'> "+"<span id='numproductos'><c:out value='${carrito.totalproductos}'></c:out></span>"; 
		document.getElementById("carritomovil").innerHTML  = "<img src='<c:url value='./resources/img/cartgreen.png'/>' alt='carrito'> "+"<span id='numproductos'><c:out value='${carrito.totalproductos}'></c:out></span>"; 

	}
	else{
		document.getElementById("carrito").innerHTML  = '<img src="<c:url value="./resources/img/carrito.png"/>" alt="carrito">';
		document.getElementById("carritomovil").innerHTML  = '<img src="<c:url value="./resources/img/cartgreen.png"/>" alt="carrito">';
	}
</script>
<footer>
	<div class="primero">
		<div class="contacto">
			<p><span>Contacto</span></p><hr>
			<p> 900800700 </p>
			<p> Lun - Vie 9.00 a 20.00</p>
			<p> bravo@bravofarma.com</p>
		</div>
		<div> 
			<p><span>Sobre BravoFarma</span></p><hr>
			<p><a href="privacidad">Política de privacidad</a></p>
		 	<p><a href="acercade">Acerca de</a> </p>
		 	<p><a href="terminos">Términos y condiciones</a> </p>
		</div>
	</div>
	<div class="segundo">	
		 
		<p>
			<spring:message code="desarrollada" />
			<strong>Pablo Bravo Mediavilla</strong>
		</p>
		<p>© 2018 BravoFarma, Todos los derechos reservados.</p>

		<p>Todos los productos incluyen IVA.</p>
		<div class="validaciones">
	 		<a href="http://validator.w3.org/check/referer" hreflang="en-us">
				<img src="<c:url value="/resources/img/valid-html5-button.png"/>"
				alt="HTML5 válido!" height="31" width="88">
			</a> 
			<a href="http://jigsaw.w3.org/css-validator/check/referer"> <img
				style="border: 0; width: 88px; height: 31px"
				src="http://jigsaw.w3.org/css-validator/images/vcss"
				alt="CSS Válido!" />
			</a> 
			<a href="http://jigsaw.w3.org/css-validator/check/referer"> <img
				style="border: 0; width: 88px; height: 31px"
				src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
				alt="CSS Válido!" />
			</a>
		</div>
	</div>
</footer>