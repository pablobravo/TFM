package org.xtext.dsl.generador.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.generador.generador.Parafarmacia
import static java.nio.file.StandardCopyOption.*
import java.nio.file.Files
import java.io.File

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GeneradorJSP {

	Resource resource;
	IFileSystemAccess fsa;
	final String path = "C:\\Users\\UO223531\\git\\parafarmacia\\";
	
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		var sbinicio = new StringBuilder();
		var sbacercade = new StringBuilder();
		var sbprivacidad = new StringBuilder();
		var sbterminos = new StringBuilder();
		var sbfooter = new StringBuilder();
		var sbmenu = new StringBuilder();
		
		for(i: resource.allContents.toIterable.filter(typeof(Parafarmacia))){
			sbinicio.append(i.compilarInicio);
			sbacercade.append(i.compilarAcercaDe)
			sbprivacidad.append(i.compilarPrivacidad)
			sbterminos.append(i.compilarTerminos)
			sbfooter.append(i.compilarFooter)
			sbmenu.append(i.compilarMenu)
		}
		fsa.generateFile('jsp/inicio.jsp', sbinicio.toString);
		fsa.generateFile('jsp/acercade.jsp', sbacercade.toString);
		fsa.generateFile('jsp/privacidad.jsp', sbprivacidad.toString);
		fsa.generateFile('jsp/terminos.jsp', sbterminos.toString);
		fsa.generateFile('jsp/generic/menu.jsp', sbmenu.toString);
		fsa.generateFile('jsp/generic/footer.jsp', sbfooter.toString);
		
		Files.copy(new File(path+'runtime-EclipseXtext\\my.parafarmacia\\src-gen\\jsp\\inicio.jsp').toPath(), new File(path+'Parafarmacia\\src\\main\\webapp\\WEB-INF\\views\\inicio.jsp').toPath(), REPLACE_EXISTING);
		Files.copy(new File(path+'runtime-EclipseXtext\\my.parafarmacia\\src-gen\\jsp\\acercade.jsp').toPath(), new File(path+'Parafarmacia\\src\\main\\webapp\\WEB-INF\\views\\acercade.jsp').toPath(), REPLACE_EXISTING);
		Files.copy(new File(path+'runtime-EclipseXtext\\my.parafarmacia\\src-gen\\jsp\\privacidad.jsp').toPath(), new File(path+'Parafarmacia\\src\\main\\webapp\\WEB-INF\\views\\privacidad.jsp').toPath(), REPLACE_EXISTING);
		Files.copy(new File(path+'runtime-EclipseXtext\\my.parafarmacia\\src-gen\\jsp\\terminos.jsp').toPath(), new File(path+'Parafarmacia\\src\\main\\webapp\\WEB-INF\\views\\terminos.jsp').toPath(), REPLACE_EXISTING);
		Files.copy(new File(path+'runtime-EclipseXtext\\my.parafarmacia\\src-gen\\jsp\\generic\\menu.jsp').toPath(), new File(path+'Parafarmacia\\src\\main\\webapp\\WEB-INF\\views\\generic\\menu.jsp').toPath(), REPLACE_EXISTING);
		Files.copy(new File(path+'runtime-EclipseXtext\\my.parafarmacia\\src-gen\\jsp\\generic\\footer.jsp').toPath(), new File(path+'Parafarmacia\\src\\main\\webapp\\WEB-INF\\views\\generic\\footer.jsp').toPath(), REPLACE_EXISTING);
		
	}
	
	
	
	def compilarInicio(Parafarmacia p) '''
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
			<title>«p.titulo»</title>
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
						
						«FOR categoria:p.categorias»
							«IF categoria.equals("Cosmetica")»
								<div class="categoria"><a href="cosmetica"><spring:message code="cosmetica" /><img src='<c:url value='./resources/categorias/categoria1.jpg'/>' alt='<spring:message code="cosmetica" />'></a></div>
							«ELSEIF categoria.equals("Higiene")»
								<div class="categoria"><a href="higiene"><spring:message code="higiene" /><img src='<c:url value='./resources/categorias/categoria2.jpg'/>' alt='<spring:message code="higiene" />'></a></div>
							«ELSEIF categoria.equals("Salud")»
								<div class="categoria"><a href="salud"><spring:message code="salud" /><img src='<c:url value='./resources/categorias/categoria3.jpg'/>' alt='<spring:message code="salud" />'></a></div>
							«ELSEIF categoria.equals("Dietetica")»
								<div class="categoria"><a href="dietetica"><spring:message code="dietetica" /><img src='<c:url value='./resources/categorias/categoria5.jpg'/>' alt='<spring:message code="dietetica" />'></a></div>
							«ELSE»
								<div class="categoria"><a href="bebes"><spring:message code="bebes" /><img src='<c:url value='./resources/categorias/categoria4.jpg'/>' alt='<spring:message code="bebes" />'></a></div>
							«ENDIF»
						«ENDFOR»
				</div>
				
				
				<jsp:include page="generic/footer.jsp"/>
			</div>
			<script>
				document.getElementById("inicio").className += " active"; 
			</script>
		</body>
	</html>		
	'''

	
	def compilarAcercaDe(Parafarmacia parafarmacia)'''
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
						«parafarmacia.nombre». Si desea ser eliminado de nuestra base de datos
						o bien modificar los mismos puede solcitarlo en esta dirección
						postal:</p>
					<p>«parafarmacia.direccion.calle», «parafarmacia.direccion.ciudad», «parafarmacia.direccion.pais»</p>
					<p>O bien en la siguiente dirección de correo electrónico:
						«parafarmacia.correo»</p>
				</div>
			</div>
			<jsp:include page="generic/footer.jsp" />
		</div>
	
	</body>
	</html>
	'''
	
	
	def compilarPrivacidad(Parafarmacia parafarmacia)'''
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<!doctype html>
	<html lang="es">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta name="MobileOptimized" content="width" />
	<meta name="HandheldFriendly" content="true" />
	<meta content="Pablo Bravo Mediavilla" name="author" />
	<link rel="shortcut icon"
		href="<c:url value="/resources/img/logo.ico"/>" />
	<title>Política de privacidad</title>
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper">
	
			<jsp:include page="generic/menu.jsp" />
			<div class="main">
				<div class="subcabecera">
		            <p>
		                <a href='inicio'>Inicio</a> /
						<a href=''>Privacidad</a>                
		            </p>
		        </div>
				<div class="politicas">
					<h2>1. IDENTIFICACIÓN</h2>
					<p>Titular: «parafarmacia.nombre»</p>
					<p>Domicilio social: «parafarmacia.direccion.calle», «parafarmacia.direccion.ciudad», «parafarmacia.direccion.pais»</p>
					<p>CIF: BXXXXXXX</p>
					<p>Registro Público: Inscrita en el Registro Mercantil; en el tomo 
						«parafarmacia.registro.tomo», folio «parafarmacia.registro.folio», sección «parafarmacia.registro.seccion», hoja «parafarmacia.registro.hoja»
						</p>
					<p>Puedes contactar con nosotros mediante correo electrónico o
						telefónicamente en el «parafarmacia.telefono»</p>
	
					<h2>2. INFORMACIÓN Y CONSENTIMIENTO.</h2>
					<p>De conformidad con lo dispuesto en la Ley Orgánica 15/1999,
						de Protección de Datos de Carácter Personal (LOPD) el usuario
						presta su consentimiento informado, expreso, libre e inequívoco
						para que sus datos personales sean incluidos en un fichero
						propiedad de «parafarmacia.titulo», debidamente inscrito ante la
						Agencia Española de Protección de Datos, respecto del que se
						garantiza que han sido aplicadas las medidas de seguridad, tanto
						organizativas, como técnicas requeridas normativamente por el Real
						Decreto 1720/2007 (RLOPD).</p>
					<p>Todos los datos personales solicitados a los usuarios son
						obligatorios, no siendo posible su registro en la Web si no nos los
						facilita de forma completa y veraz. Sin perjuicio de ello, no será
						necesario facilitarnos datos personales para poder navegar por la
						Web.</p>
					<p>Los datos personales que tratamos a través de la plataforma,
						únicamente son utilizados para las siguientes finalidades:</p>
					<p>Gestionar su registro como usuario en la plataforma online
						www.parafarmaciaonline.hol.es propiedad de «parafarmacia.titulo». No
						obstante, en todo caso el usuario deberá verificar y validar su
						registro en la plataforma mediante la introducción de su correo y
						contraseña.</p>
					<p>Gestionar las contrataciones de productos y/o servicios que
						realice a través de la Web, así como la facturación y envío
						correspondiente.</p>
					<p>Realizar informes estadísticos anónimos respecto a los
						hábitos de acceso y la actividad desarrollada por los usuarios en
						la Web.</p>
					<p>Dar cumplimiento a las obligaciones legalmente establecidas.
					</p>
					<p>En la medida en que «parafarmacia.titulo» es una
						plataforma online (Marketplace), desde la que los diferentes
						establecimientos farmacéuticos adheridos comercializan sus
						productos parafarmacéuticos entre los consumidores finales, una vez
						se realice el pedido por parte del usuario, sus datos personales
						serán comunicado por parte de «parafarmacia.titulo» al establecimiento
						farmacéutico con el único fin de que éste pueda realizar la emisión
						de la factura correspondiente, gestionar la recogida del pedido o
						en su caso el envío del pedido a la dirección indicada por el
						usuario.</p>
					<p>Sin perjuicio de lo indicado con anterioridad, en ningún caso
						llevaremos a cabo ninguna de las siguientes acciones en relación a
						los datos personales que nos facilitéis:</p>
					<p>Cederlos a otras personas o entidades, sin vuestro
						consentimiento previo.</p>
					<p>Transferirlos a otros Estados, sin vuestro consentimiento
						previo.</p>
					<p>«parafarmacia.titulo» se reserva el derecho a modificar en
						cualquier momento la presente política de privacidad, siendo de
						aplicación en el plazo indicado en la misma.</p>
					<h2>3. COMUNICACIONES COMERCIALES Y PROMOCIONALES</h2>
					<p>Una de las finalidades para las que tratamos los datos
						personales proporcionados por parte de los usuarios, es para
						remitiros comunicaciones electrónicas con información relativa a
						ofertas, promociones y/o noticias relevantes para los usuarios.</p>
					<p>Siempre que realicemos alguna comunicación de este tipo será
						realizada única y exclusivamente a aquellos usuarios que hubieran
						autorizado expresamente y de forma previa la recepción de las
						mismas en el momento de su registro o con posterioridad. En caso de
						que deseé dejar de recibir comunicaciones comerciales o
						promocionales, puede solicitar la baja del servicio enviando un
						email a la dirección «parafarmacia.correo».</p>
					<h2>4. EJERCICIO DE DERECHOS.</h2>
					<p>De conformidad con lo dispuesto en la Ley Orgánica 15/1999 de
						Protección de Datos de Carácter Personal (LOPD) le informamos que
						puede ejercer sus derechos de acceso, rectificación, cancelación
						y/u oposición respecto al resto de sus datos personales
						solicitándolo por escrito a la «parafarmacia.direccion.calle», «parafarmacia.direccion.ciudad», «parafarmacia.direccion.pais», o a través de
						correo electrónico a la dirección «parafarmacia.correo»,
						adjuntando en todo caso un documento acreditativo de su identidad y
						concretando el derecho o derechos que desea ejercer.</p>
				</div>
			</div>
			<jsp:include page="generic/footer.jsp" />
		</div>
	
	</body>
	</html>
	'''

	def compilarTerminos(Parafarmacia parafarmacia)'''
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<!doctype html>
	<html lang="es">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta name="MobileOptimized" content="width" />
	<meta name="HandheldFriendly" content="true" />
	<meta content="Pablo Bravo Mediavilla" name="author" />
	<link rel="shortcut icon"
		href="<c:url value="/resources/img/logo.ico"/>" />
	<title>Términos y condiciones</title>
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	</head>
	<body>
		<div class="wrapper">
	
			<jsp:include page="generic/menu.jsp" />
			<div class="main">
				<div class="subcabecera">
		            <p>
		                <a href='inicio'>Inicio</a> /
						<a href=''>Términos y condiciones</a>
		            </p>
		        </div>
				<div class="politicas">
					<p>El acceso, navegación y utilización del sitio Web
						implica la aceptación expresa y sin
						reservas de todos los términos de las presentes condiciones de uso,
						teniendo la misma validez y eficacia que cualquier contrato
						celebrado por escrito y firmado.</p>
					<p>Su observancia y cumplimiento será exigible respecto de
						cualquier persona que acceda, navegue o utilice la Web. Si Ud. no
						está de acuerdo con los términos expuestos, no acceda, navegue o
						utilice ninguna página del sitio web.</p>
					<h2>1. DATOS DE LA COMPAÑÍA.</h2>
	
					<p>Titular: «parafarmacia.nombre»</p>
					<p>Domicilio social: «parafarmacia.direccion.calle», «parafarmacia.direccion.ciudad», «parafarmacia.direccion.pais»</p>
					<p>CIF: BXXXXXXXX</p>
					
					<h2>2. OBJETO Y ÁMBITO DE APLICACIÓN.</h2>
					<p>Las presentes condiciones de uso regulan el acceso,
						navegación y utilización de la Web,
						sin perjuicio que «parafarmacia.titulo» se reserva el derecho a
						modificar la presentación, configuración y contenido de la Web, así
						como las condiciones requeridas para su acceso y/o utilización. El
						acceso y utilización de los contenidos de la Web tras la entrada en
						vigor de sus modificaciones o cambios suponen la aceptación de los
						mismos.</p>
					<p>No obstante, el acceso a determinados contenidos y la
						utilización de determinados servicios puede encontrarse sometido a
						determinadas condiciones particulares, que serán en todo caso
						claramente mostradas y deberán ser aceptadas expresamente por parte
						de los usuarios. Estas condiciones particulares, podrán sustituir,
						completar o en su caso modificar las presentes condiciones de uso
						particulares.</p>
					<p>«parafarmacia.titulo» se reserva el derecho a modificar los
						términos y condiciones aquí estipuladas, total o parcialmente,
						publicando cualquier cambio en la misma forma en que aparecen estas
						condiciones de uso o a través de cualquier tipo de comunicación
						dirigida a los usuarios.</p>
					<p>3. ACCESO Y REGISTRO.</p>
					<p>El acceso a los contenidos de la web es completamente
						gratuito, sin perjuicio de que pueden existir apartados o servicios
						particulares que requiere para uso y disfrute el abono de alguna
						cantidad económica, que será en todo caso debidamente informada, y
						que en todo caso, el usuario deberá aceptar expresamente en caso de
						querer disfrutarlos.</p>
					<p>En caso de que no cuentes con usuario y contraseña de acceso
						a nuestra plataforma, deberás
						todos tus datos reales y veraces, dado que será la única forma que
						tendremos de poder procesar los posibles pedidos que realices en el
						futuro, así como gestionar correctamente nuestra relación
						comercial.</p>
	
					<p>Queda prohibido el acceso a la Web por parte de menores de
						edad. No obstante, en caso de acceso a la Web y registro por parte
						de un menor, se presumirá que el acceso se ha realizado con
						autorización previa y expresa de sus padres, tutores o
						representantes legales, sin perjuicio de que «parafarmacia.titulo» se
						reserva el derecho de realizar cuantas verificaciones considere
						oportunas.</p>
					<p>El acceso y navegación de la Web no requieren registro, sin
						embargo, para realizar cualquier compra o para recibir publicidad,
						información y ofertas periódicas de nuestras campañas promocionales
						y de nuestros productos, será necesario cumplimentar los
						formularios web habilitados al efecto. El registro en la Web es,
						salvo que se indique expresamente lo contrario, gratuito.</p>
					<p>Bajo ningún concepto «parafarmacia.titulo» se responsabilizará
						de la veracidad de los datos de registro facilitados por los
						usuarios finales, por lo que cada uno de estos son los responsables
						de las posibles consecuencias, errores y fallos que posteriormente
						puedan derivarse de la falta de veracidad de los datos.</p>
					<h2>3.1. REQUISITOS PARA REGISTRARSE COMO USUARIO.</h2>
					<p>Es requisito imprescindible para poder registrarse como
						usuario ser mayor de 18 años y proporcionar todos los datos
						requeridos y catalogados como obligatorios.</p>
					<p>Del mismo modo, el usuario registrado asume que la cuenta de
						usuario registrado es personal e intransferible, teniendo en cuenta
						que únicamente pueden registrarse personas físicas, quedando
						excluidas las personas jurídicas.</p>
					<p>Bajo ningún concepto está permitida la cesión de la cuenta de
						usuario registrado entre diferentes personas, quedando a
						disposición de «parafarmacia.titulo» la eliminación de la misma tan
						pronto sea detectada tal circunstancia, sin perjuicio de que se
						reserva las acciones legales que pudieran corresponder.</p>
					<h2>3.2. BAJA COMO USUARIO REGISTRADO</h2>
					<p>En cualquier momento, los usuarios pueden solicitar su baja
						de la Web, bastando para ello solicitarlo mediante comunicación
						escrita a legal@parafarmaciabravo.com, indicando su nombre de
						usuario y el servicio concreto del que se desee dar de baja.</p>
					<p>En cualquier caso, una vez efectuada la baja, el usuario
						podrá solicitar un nuevo registro como cliente, quedando reservada
						la facultad de «parafarmacia.titulo» de no admitir dicho registro en
						los casos concretos especificados en la cláusula denominada "Usos
						no autorizados" o en caso de conflicto o controversia suscitados
						entre las partes, por resolver o finalizado con reconocimiento de
						culpa o negligencia del cliente y/o perjuicio a «parafarmacia.titulo»
						, a sus colaboradores y asociados o a sus usuarios, clientes o
						potenciales clientes.</p>
					<h2>4. DERECHOS DE PROPIEDAD INTELECTUAL E INDUSTRIAL.</h2>
					<p>«parafarmacia.titulo» es titular o en su caso, cuenta las
						licencias correspondientes sobre los derechos de explotación de
						propiedad intelectual e industrial de la Web, así como de los
						derechos de propiedad intelectual e industrial sobre la
						información, materiales y contenidos de la Web.</p>
					<p>En ningún caso se entenderá que el acceso, navegación y
						utilización de la Web por parte del usuario implica una renuncia,
						transmisión, licencia o cesión total o parcial de dichos derechos
						por parte de «parafarmacia.titulo». El usuario dispone de un derecho
						de uso de los contenidos y/o servicios de la Web dentro de un
						ámbito estrictamente doméstico.</p>
					<p>Las referencias a marcas o nombres comerciales registrados, u
						otros signos distintivos, ya sean titularidad de «parafarmacia.titulo»
						o de terceras empresas, llevan implícitas la prohibición sobre su
						uso sin el consentimiento de «parafarmacia.titulo» o de sus legítimos
						titulares. En ningún momento, salvo manifestación expresa en
						contrario, el acceso, navegación o utilización de la Web y/o de sus
						contenidos, confiere al usuario derecho alguno sobre signos
						distintivos en él incluidos.</p>
					<p>Quedan reservados todos los derechos de propiedad intelectual
						e industrial sobre los contenidos y/o servicios de la Web y, en
						particular, queda prohibido modificar, copiar, reproducir,
						comunicar públicamente, transformar o distribuir, por cualquier
						medio y bajo cualquier forma, la totalidad o parte de los
						contenidos incluidos en la Web, para propósitos públicos o
						comerciales, si no se cuenta con la autorización previa, expresa y
						por escrito de «parafarmacia.titulo» o, en su caso, del titular de los
						derechos correspondientes.</p>
					<p>El usuario reconoce asumir la responsabilidad, dejando
						indemne a «parafarmacia.titulo» por cualquier comunicación que
						suministre personalmente o a su nombre, alcanzando dicha
						responsabilidad sin restricción alguna la exactitud, legalidad,
						originalidad y titularidad de la misma.</p>
					<h2>5. ENLACES</h2>
					<h2>5.1 ENLACES A OTRAS PÁGINAS WEB</h2>
					<p>En caso de que en la Web se mostraran enlaces a otras páginas
						web mediante diferentes botones, links, banners o contenidos
						embebidos, «parafarmacia.titulo» informa que éstos se encuentran
						directamente gestionados por terceros, no teniendo Parafarmacia
						Bravo ni medios humanos, ni técnicos para conocer de forma previa
						y/o controlar y/o aprobar toda la información, contenidos,
						productos o servicios facilitados por otros sitios web a los que se
						puedan establecer enlaces desde la Web.</p>
					<p>En consecuencia, «parafarmacia.titulo» no podrá asumir ningún
						tipo de responsabilidad por cualquier aspecto relativo a la página
						web a la que se pudiera establecer un enlace desde la Web, en
						concreto, a título enunciativo y no limitativo, sobre su
						funcionamiento, acceso, datos, información, archivos, calidad y
						fiabilidad de sus productos y servicios, sus propios enlaces y/o
						cualquiera de sus contenidos, en general.</p>
					<p>En este sentido, si los usuarios tuvieran conocimiento
						efectivo de que las actividades desarrolladas a través de estas
						páginas web de terceros son ilegales o contravienen la moral y/o el
						orden público, deberán comunicarlo inmediatamente a Parafarmacia
						Bravo a los efectos de que se proceda a deshabilitar el enlace de
						acceso a las mismas, acción que se llevará a cabo en el menor
						tiempo posible.</p>
					<p>En cualquier caso, el establecimiento de cualquier tipo de
						enlace desde la Web a otra página web ajena no implicará que exista
						algún tipo de relación, colaboración o dependencia entre
						«parafarmacia.titulo» y el responsable de la página web ajena.</p>
					<h2>5.2 ENLACES AL CANAL DE LA WEB EN OTRAS PLATAFORMAS Y REDES
						SOCIALES</h2>
					<p>«parafarmacia.titulo» pone a disposición de los usuarios, a
						través de diferentes herramientas y aplicaciones, medios de enlace
						que permiten a los usuarios acceder a los canales y páginas de la
						Web y el Blog en diferentes plataformas y redes sociales
						pertenecientes y/o gestionadas por terceros (p.ej. Facebook,
						Twitter, Pinterest, Google+, etc.). La instalación de estas
						aplicaciones en la Web y en el Blog tiene por único objeto
						facilitar a los usuarios el acceso a dichos canales en las
						diferentes plataformas y redes sociales.</p>
					<p>El establecimiento de estas aplicaciones no implica la
						existencia de relación alguna entre «parafarmacia.titulo» y el
						propietario, fabricante o distribuidor de la plataforma enlazada,
						como tampoco la aceptación y aprobación por parte de Parafarmacia
						Bravo de sus contenidos y/o servicios, siendo su propietario,
						fabricante o distribuidor el único responsable de los mismos.</p>
	
					<h2>6. CONDICIONES DE USO DE LA WEB</h2>
					<p>No está permitido y, por tanto, sus consecuencias serán de la
						exclusiva responsabilidad del usuario, el acceso o la utilización
						de la Web con fines ilegales o no autorizados, con o sin finalidad
						económica, y, más específicamente y sin que el siguiente listado
						tenga carácter absoluto, queda prohibido:</p>
					<p>Usar la Web en forma alguna que pueda provocar daños,
						interrupciones, ineficiencias o defectos en su funcionalidad o en
						el ordenador de un tercero;</p>
					<p>Usar la Web para la transmisión, la instalación o la
						publicación de cualquier virus, código malicioso u otros programas
						o archivos perjudiciales;</p>
					<p>Usar la Web para recoger datos de carácter personal de otros
						usuarios;</p>
					<p>Registrarse a través de la Web con una identidad falsa,
						suplantado a terceros o utilizando un perfil o realizando cualquier
						otra acción que pueda confundir a otros usuarios sobre la identidad
						del origen de un mensaje;</p>
					<p>Acceder sin autorización a cualquier sección de la Web, a
						otros sistemas o redes conectadas a la Plataforma, a ningún
						servidor de «parafarmacia.titulo» ni a los servicios ofrecidos a
						través de la Web, por medio de pirateo o falsificación, extracción
						de contraseñas o cualquier otro medio ilegítimo;</p>
					<p>Quebrantar, o intentar quebrantar, las medidas de seguridad o
						autenticación de la Web o de cualquier red conectada a la misma, o
						las medidas de seguridad o protección inherentes a los contenidos
						ofrecidos en la Web;</p>
					<p>Llevar a cabo alguna acción que provoque una saturación
						desproporcionada o innecesaria en la infraestructura de la Web o en
						los sistemas o redes de «parafarmacia.titulo» , así como en los
						sistemas y redes conectados a la Web;</p>
					<p>Impedir el normal desarrollo de un evento, concurso,
						promoción o cualquier otra actividad disponible a través de la Web
						o cualesquiera de sus funcionalidades, ya sea alterando o tratando
						de alterar, ilegalmente o de cualquier otra forma, el acceso,
						participación o funcionamiento de aquéllos, o falseando el
						resultado de los mismos y/o utilizando métodos de participación
						fraudulentos, mediante cualquier procedimiento, y/o a través de
						cualquier práctica que atente o vulnere en modo alguno las
						presentes Condiciones de uso.</p>
					<p>El incumplimiento de cualquiera de las anteriores
						obligaciones por el usuario, podrá llevar aparejada la adopción por
						«parafarmacia.titulo» de las medidas oportunas amparadas en Derecho y
						en el ejercicio de sus derechos u obligaciones, pudiendo llegar a
						la eliminación o bloqueo de la cuenta del usuario infractor, sin
						que medie posibilidad de indemnización alguna por los daños y
						perjuicios causados.</p>
					<p>Del mismo modo, la Web cuenta con áreas a través de las que
						los usuarios pueden participar, publicar contenidos propios y/o
						compartir contenidos, propios o publicados por «parafarmacia.titulo» .
						Dichas áreas pueden ser propias de «parafarmacia.titulo» y por tanto
						dependientes y controladas por ésta, o ajenas a «parafarmacia.titulo»
						, tratándose de redes sociales independientes y ajenas a nuestra
						organización, respecto a las que no podemos responsabilizarnos, ni
						del correcto funcionamiento, ni las condiciones y políticas
						dispuestas por sus responsables, siendo el propio usuario el que
						deberá consentir y asumir en todo momento el tratamiento que se
						realice de la información publicada en dichas plataformas.</p>
					<p>En todo caso, le informamos que cuando el usuario participe
						en cualquiera de estas zonas, el resto de usuarios de la Web podrá
						acceder y utilizar a todos los contenidos publicados por el
						usuario. «parafarmacia.titulo» no puede controlar qué uso realizarán
						otras personas de tus contenidos y, por tanto, «parafarmacia.titulo»
						no se hace responsable de ello. «parafarmacia.titulo» le recomienda
						que no publique datos de carácter personal o materiales protegidos
						por derechos de propiedad intelectual e industrial o cualesquiera
						otros derechos.</p>
					<p>Con el fin de que la Plataforma sea un entorno seguro y para
						proteger a nuestros usuarios, queda terminantemente prohibido
						publicar contenidos:</p>
					<p>Que puedan ser considerados como una vulneración en cualquier
						forma de los derechos fundamentales al honor, a la intimidad
						personal y familiar o a la propia imagen de terceros y, muy
						especialmente, de los menores de edad.</p>
	
					<h2>7. RESPONSABILIDADES Y GARANTÍAS</h2>
					<p>«parafarmacia.titulo» no puede garantizar la fiabilidad,
						utilidad o veracidad de absolutamente toda la información y/o de
						los servicios de la Web, ni tampoco de la utilidad o veracidad de
						la documentación puesta a disposición a través de la misma.</p>
					<p>En consecuencia, «parafarmacia.titulo» no garantiza ni se hace
						responsable de: (i) la continuidad de los contenidos de la Web;
						(ii) la ausencia de errores en dichos contenidos; (iii) la ausencia
						de virus y/o demás componentes dañinos en la Web o en el servidor
						que lo suministra; (iv) la invulnerabilidad de la Web y/o la
						imposibilidad de vulnerar las medidas de seguridad que se adopten
						en la misma; (v) la falta de utilidad o rendimiento de los
						contenidos de la Web; y (vi) los daños o perjuicios que cause, a sí
						mismo o a un tercero, cualquier persona que infringiera las
						condiciones, normas e instrucciones que «parafarmacia.titulo»
						establece en la Web o a través de la vulneración de los sistemas de
						seguridad de la Web.</p>
					<p>No obstante, «parafarmacia.titulo» declara que ha adoptado todas
						las medidas necesarias, dentro de sus posibilidades y del estado de
						la técnica, para garantizar el funcionamiento de la Web y reducir
						al mínimo los errores del sistema, tanto desde el punto de vista
						técnico, como de los contenidos publicados en la Web.</p>
					<p>Si el usuario tuviera conocimiento de la existencia de algún
						contenido ilícito, ilegal, contrario a las leyes o que pudiera
						suponer una infracción de derechos de propiedad intelectual o
						industrial, de la normativa aplicable en material de protección de
						datos personales y/o cualquier otro derecho, deberá notificarlo
						inmediatamente a «parafarmacia.titulo» para que ésta pueda proceder a
						la adopción de las medidas oportunas.</p>
					<p>«parafarmacia.titulo» no garantiza la licitud, fiabilidad y
						utilidad de los contenidos suministrados por terceros a través de
						la Web.</p>
					<p>«parafarmacia.titulo» no tiene finalidad de promover y/o
						publicitar la venta, el consumo y/o el uso de medicamentos,
						preparados con fines medicinales y/o productos sanitarios, ni de
						influir en la toma de decisión de los usuarios con respecto a un
						determinado tratamiento, ni en la prospección comercial en favor de
						ningún fabricante de medicamentos y/o productos sanitarios.</p>
					<p>«parafarmacia.titulo» no será responsable sobre la veracidad,
						integridad o actualización de las informaciones publicadas en la
						Web provenientes de fuentes ajenas al mismo (noticias externas,
						informes de profesionales externos, etc.), así como tampoco de las
						contenidas en otros portales web mediante enlace desde la Web.</p>
					<p>«parafarmacia.titulo» no asumirá responsabilidad en cuanto a
						hipotéticos perjuicios que pudieran originarse por el uso de las
						citadas informaciones. En ningún caso, los mencionados contenidos,
						opiniones, comentarios y/o enlaces serán considerados como
						recomendación, patrocinio, promoción o publicidad por parte de
						«parafarmacia.titulo» sobre medicamentos y/o productos sanitarios, ni
						de los laboratorios o fabricantes que los elaboran.</p>
					<p>En todo caso, «parafarmacia.titulo» se reserva el derecho a
						suspender, modificar, restringir o interrumpir, temporal o
						permanentemente, el acceso, navegación, uso, alojamiento y/o
						descarga del contenido y/o uso de servicios de la Web, con o sin
						previa notificación, a los usuarios que contravengan cualquiera de
						las disposiciones detalladas en las presentes condiciones de uso,
						sin que medie posibilidad del usuario de exigir indemnización
						alguna por esta causa.</p>
					<h2>8. POLÍTICA DE PRIVACIDAD Y COOKIES</h2>
					<p>De conformidad con lo dispuesto por la Ley Orgánica 15/1999,
						de 13 de diciembre, de Protección de Datos de Carácter Personal,
						todos los datos de carácter personal facilitados durante la
						utilización del sitio web serán tratados de conformidad con los
						dispuesto en la Política de Privacidad
						que todo usuario
						debe aceptar expresamente para poder utilizar y registrarse en la
						Web.</p>
					<p>Todo usuario que acepte las presentes condiciones de uso,
						aceptan de forma informada, expresa e inequívoca nuestra Política
						de Privacidad, asistiéndole en este sentido los derechos de acceso,
						rectificación, cancelación y oposición respecto a sus datos de
						carácter personal, pudiendo ejercerlos según se informa en la
						mencionada Política de Privacidad.</p>
					<h2>9. LEY APLICABLE Y JURISDICCIÓN COMPETENTE</h2>
					<p>Para toda cuestión litigiosa relacionada con este sitio web,
						y siempre que la legislación de consumidores así lo permita, nos
						someteremos a los Juzgados y Tribunales de Barcelona capital, así
						como a la legislación nacional española vigente en el momento del
						litigio.</p>
					<p>Asimismo, como entidad adherida a Confianza Online y en los
						términos de su Código Ético, en caso de controversias relativas a
						la contratación y publicidad online, protección de datos,
						protección de menores y accesibilidad, el usuario podrá´ acudir al
						sistema de resolución extrajudicial de controversias de Confianza
						Online, a través del Jurado de la Publicidad y en la Junta Arbitral
						Nacional de Consumo.</p>
					<p>Para presentar reclamaciones en el uso de nuestros servicios
						el cliente puede dirigirse por correo a la dirección electrónica o
						física indicada en el apartado "Identificación", comprometiéndonos
						a buscar en todo momento una solución amistosa del conflicto.</p>
					<p>Última actualización: 2 de enero de 2018</p>
					<p>2018 «parafarmacia.titulo», S.L. Todos los derechos reservados</p>
	
				</div>
			</div>
			<jsp:include page="generic/footer.jsp" />
		</div>
	
	</body>
	</html>
	'''
	def compilarFooter(Parafarmacia parafarmacia)'''
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
				<p> «parafarmacia.telefono» </p>
				<p> Lun - Vie 9.00 a 20.00</p>
				<p> «parafarmacia.correo»</p>
			</div>
			<div> 
				<p><span>Sobre «parafarmacia.titulo»</span></p><hr>
				<p><a href="privacidad"><spring:message code="politica" /></a></p>
			 	<p><a href="acercade"><spring:message code="acercade" /></a> </p>
			 	<p><a href="terminos"><spring:message code="terminos" /></a> </p>
			</div>
		</div>
		<div class="segundo">	
			 
			<p>
				<spring:message code="desarrollada" />
				<strong>Pablo Bravo Mediavilla</strong>
			</p>
			<p><spring:message code="c" /> «parafarmacia.titulo», <spring:message code="derechos" /></p>
	
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
	'''
	def compilarMenu(Parafarmacia parafarmacia)'''
	<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<header>
		<img id="logo" src="<c:url value="/resources/img/logo.png"/>"
			alt="Logo">
		<h1>«parafarmacia.titulo»</h1>
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
				«FOR categoria:parafarmacia.categorias»
					«IF categoria.equals("Cosmetica")»
						<li class="submenugeneral"><a id="cosmetica" href="cosmetica"><spring:message code="cosmetica" /></a></li>					
					«ELSEIF categoria.equals("Higiene")»
						<li class="submenugeneral"><a id="higiene" href="higiene"><spring:message code="higiene" /></a></li>
					«ELSEIF categoria.equals("Salud")»
						<li class="submenugeneral"><a id="salud" href="salud"><spring:message code="salud" /></a></li>
					«ELSEIF categoria.equals("Dietetica")»
						<li class="submenugeneral"><a id="dietetica" href="dietetica"><spring:message code="dietetica" /></a></li>
					«ELSE»
						<li class="submenugeneral"><a id="bebes" href="bebes"><spring:message code="bebes" /></a></li>
					«ENDIF»
				«ENDFOR»
					
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
				«FOR categoria:parafarmacia.categorias»
					«IF categoria.equals("Cosmetica")»
						<li><a class="menumovilsecundaria" href="cosmetica"><spring:message code="cosmetica" /></a></li>
					«ELSEIF categoria.equals("Higiene")»
						<li><a class="menumovilsecundaria" href="higiene"><spring:message code="higiene" /></a></li>
					«ELSEIF categoria.equals("Salud")»
						<li><a class="menumovilsecundaria" href="salud"><spring:message code="salud" /></a></li>
					«ELSEIF categoria.equals("Dietetica")»
						<li><a class="menumovilsecundaria" href="dietetica"><spring:message code="dietetica" /></a></li>
					«ELSE»
						<li><a class="menumovilsecundaria" href="bebes"><spring:message code="bebes" /></a></li>
					«ENDIF»
				«ENDFOR»
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
	
	'''
	
}
