<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header>
	<img id="logo" src="<c:url value="/resources/img/logo.png"/>"
		alt="Logo">
	<h1>BravoFarma</h1>
</header>

<nav class="menu">

	<div class="buscar">
		<form method="get" action="buscar">
			<input class="buscador" autocomplete="off" type="text" name="search"
				placeholder="Busca tu producto...">
			<button class="btbuscador" type="submit">
				<img src="<c:url value="./resources/img/lupa.png"/>" alt="Buscar">
			</button>
		</form>
	</div>
	<div class="usuario">
		<c:choose>
			<c:when test="${sesion != null}">
				<ul class="nav">
					<li class="menusecundario"><a href="" class="has-submenu">Cuenta</a>
						<ul class="submenu">
							<li class="menusecundario"><a href="cuenta">Modificar</a></li>
							<li class="menusecundario"><a href="mispedidos">Mis
									pedidos</a></li>
						</ul></li>
					<li class="menusecundario"><a href="cerrarsesion"><spring:message code="cerrarsesion" /></a></li>
				</ul>
			</c:when>
			<c:otherwise>
				<ul class="nav">
					<li class="menusecundario"><a href="acceso">Acceso</a></li>
					<li class="menusecundario"><a href="registro">Registro</a></li>
				</ul>
			</c:otherwise>
		</c:choose>
	</div>

	<ul class="nav">
		
		
		<c:choose>
			<c:when test="${carrito.productos.size() > 0}">
				<li class="menugeneralcarrito"><a class="elementomenu" id="carrito"
					href="carrito"><img
						src="<c:url value="./resources/img/carrito.png"/>" alt="carrito"></a>
				</li>
			</c:when>
			<c:otherwise>
				<li class="menugeneralcarrito"><a class="elementomenu" id="carrito"
					href=""><img src="<c:url value="./resources/img/carrito.png"/>"
						alt="carrito"></a></li>
			</c:otherwise>
		</c:choose>
		
		<li class="menugeneral"><a id="productos" href="productos"> Productos</a>
			<ul class="submenu">
			<li class="submenugeneral"><a id="salud" href="salud"><spring:message code="salud" /></a></li>
			<li class="submenugeneral"><a id="cosmetica" href="cosmetica"><spring:message code="cosmetica" /></a></li>					
			<li class="submenugeneral"><a id="higiene" href="higiene"><spring:message code="higiene" /></a></li>
			<li class="submenugeneral"><a id="dietetica" href="dietetica"><spring:message code="dietetica" /></a></li>
			<li class="submenugeneral"><a id="bebes" href="bebes"><spring:message code="bebes" /></a></li>
				
			</ul></li>
			
		<li class="menugeneral"><a id="inicio" href="inicio">Inicio</a></li>
	</ul>


	

</nav>
	<div class="menumovilsup"><span class="menumovil"></span></div>

	
	  <div class="toggle">
	    <i id="icon-toggle" class="fa fa-bars" aria-hidden="true"></i>
	  </div>
  
  		<ul class="menumovil">
			<li><a href="inicio">Inicio</a></li>
			<li><a href="productos">Productos</a></li>
			<li><a class="menumovilsecundaria" href="salud"><spring:message code="salud" /></a></li>
			<li><a class="menumovilsecundaria" href="cosmetica"><spring:message code="cosmetica" /></a></li>
			<li><a class="menumovilsecundaria" href="higiene"><spring:message code="higiene" /></a></li>
			<li><a class="menumovilsecundaria" href="dietetica"><spring:message code="dietetica" /></a></li>
			<li><a class="menumovilsecundaria" href="bebes"><spring:message code="bebes" /></a></li>
			<c:choose>
				<c:when test="${sesion != null}">

					<li><a href="cuenta">Modificar cuenta</a></li>
					<li><a href="mispedidos">Mis
							pedidos</a></li>
					<li><a href="cerrarsesion"><spring:message code="cerrarsesion" /></a></li>
					
				</c:when>
				<c:otherwise>
					
					<li><a href="acceso">Acceso</a></li>
					<li><a href="registro">Registro</a></li>
					
				</c:otherwise>
			</c:choose>
	      </ul>
 
    
    <c:choose>
		<c:when test="${carrito.productos.size() > 0}">
			<div class="carritomovil">
				<div class="buscar">
					<form method="get" action="buscar">
						<input class="buscador" autocomplete="off" type="text" name="search"
							placeholder="Busca tu producto...">
						<button class="btbuscador" type="submit">
							<img src="<c:url value="./resources/img/lupa.png"/>" alt="Buscar">
						</button>
					</form>
				</div>
				<a id="carritomovil"
				href="carrito"><img
					src="<c:url value="./resources/img/cartgreen.png"/>" alt="carrito"></a>
			</div>
		</c:when>
		<c:otherwise>
			<div class="carritomovil">
				<div class="buscar">
					<form method="get" action="buscar">
						<input class="buscador" autocomplete="off" type="text" name="search"
							placeholder="Busca tu producto...">
						<button class="btbuscador" type="submit">
							<img src="<c:url value="./resources/img/lupa.png"/>" alt="Buscar">
						</button>
					</form>
				</div>
				<a id="carritomovil"
				href=""><img src="<c:url value="./resources/img/cartgreen.png"/>"
					alt="carrito"></a>
					
					
			</div>
		</c:otherwise>
	</c:choose>
    
<script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="js/jquery/jquery-3.1.1.min.js">x3C/script>')</script>
<script>
$(document).ready(function(){
	  var icontogle =$('#icon-toggle');
	  $('.toggle').click(function(){
	    $('.menumovil').slideToggle();
	     if(icontogle.hasClass('fa-bars')){
	      
	       icontogle.removeClass('fa-bars')
	       icontogle.addClass('fa-times');
	     }else{
	       
	       icontogle.removeClass('fa-times')
	       icontogle.addClass('fa-bars');
	     }
	      
	  });
	})</script>

