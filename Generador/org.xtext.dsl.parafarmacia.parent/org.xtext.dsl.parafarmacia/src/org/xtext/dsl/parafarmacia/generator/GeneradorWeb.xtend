package org.xtext.dsl.parafarmacia.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.parafarmacia.parafarmacia.Parafarmacia
import org.xtext.dsl.parafarmacia.parafarmacia.Apariencia
import org.xtext.dsl.parafarmacia.parafarmacia.Pagina

class GeneradorWeb {
	Resource resource;
	IFileSystemAccess fsa;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		for(r: resource.allContents.toIterable.filter(typeof(Parafarmacia))){
			r.compilarTexto;
		}
	}
	
	def compilarTexto(Parafarmacia p) '''
		«fsa.generateFile("css/style.css", compilarEstilos(p.apariencia))»
		«FOR pag:p.paginas»
			«fsa.generateFile(pag.name+".html", compilarPagina(p, pag))»
		«ENDFOR»
	'''
	
	//INICIO PARTE WEB PARA INGREDIENTES
	def compilarEstilos(Apariencia ap) '''
		p{
			font-size: «ap.sizeFuenteCuerpo»px;
			color: «ap.colorTexto»;
		}
		h1{
			font-size: «ap.sizeFuenteH1»px;
			padding:10px;
		}
		h2{
			font-size: «ap.sizeFuenteH2»px;
			padding:10px
		}
		div.titulo{
			background-color:«ap.colorFondo1»;
			margin:0;
			padding:0;
		}
		ul.menu{
		    list-style-type: none;
		    margin: 0;
		    padding: 0;
		    overflow: hidden;
		    background-color: #333333;
		}
		
		ul.menu li {
		    float: left;
		}
		
		ul.menu li a {
		    display: block;
		    color: white;
		    text-align: center;
		    padding: 16px;
		    text-decoration: none;
		}
		
		ul.menu li a:hover {
		    background-color: #111111;
		}
		
		ul.producto{
		    list-style-type: none;
		    margin: 0;
		    padding: 0;
		}
		
		ul.producto li {
		    float: left;
		    width: 30%;
		    height: 200px;
		    background-color:«ap.colorFondo2» ;
		    padding: 5px;
		    margin:5px
		}

	'''
	
	def compilarPagina(Parafarmacia p, Pagina pag) '''
		<!DOCTYPE html>
		<html lang="es">
			<head>
				<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
				<title>«pag.titulo»</title>
				<link rel="stylesheet" type="text/css" href="css/style.css" />
			</head>
			 
			<body>
				<div class="titulo">
					<h1>«p.titulo»</h1>
					<h2>«p.descripcion»</h2>
				</div>
				<ul class="menu">
					«FOR pg:p.paginas»
						<li><a href="«pg.name».html">«pg.name»</a></li>
					«ENDFOR»
				</ul>
				<h3>«pag.titulo»</h3>
				«IF pag.cuerpo.productos.length>0»
					<ul class="producto">
					«FOR prod:pag.cuerpo.productos»
						<li><h4>«prod.nombre» «prod.precio»€</h4><p>«prod.descripcion»</p></li>
					«ENDFOR»
					</ul>
				«ELSE»
					<p>«pag.cuerpo.texto»</p>
				«ENDIF»
			</body>
		</html>
		
	'''
	//FIN PARTE WEB PARA INGREDIENTES
	
}