/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.generator

import org.eclipse.emf.ecore.resource.Resource
import ws.parafarmacia.webservice.ParafarmaciaWSService
import ws.parafarmacia.webservice.IParafarmaciaWS
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.generador.generador.Parafarmacia
import ws.parafarmacia.webservice.Producto

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GeneradorProductosBD {
	
	ParafarmaciaWSService servicio;
	IParafarmaciaWS parafarmacia;
	Producto producto;
	
	Resource resource;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
	}
	
	def compilar() {
		for(r: resource.allContents.toIterable.filter(typeof(Parafarmacia))){
			r.doGenerate;
		}
		
	}

	def doGenerate(Parafarmacia p) {
		
		servicio = new ParafarmaciaWSService();
		parafarmacia = servicio.getParafarmaciaWSPort();
		parafarmacia.removeAllProductos();
		for(pr: p.productos){
			producto = new Producto();
			producto.setNombre(pr.nombreProducto);
			producto.setDescripcion(pr.descripcion);
			producto.setPrecio(Double.parseDouble(pr.precio));
			producto.setCantidad(pr.cantidad);
			if(pr.categoria.equals("Salud")){
				producto.setCategoria("SALUD");
			}
			else if(pr.categoria.equals("Cosmetica")){
				producto.setCategoria("COSMÉTICA");
				}
			else if(pr.categoria.equals("Higiene")){
				producto.setCategoria("HIGIENE");
				}
			else if(pr.categoria.equals("Dietetica")){
				producto.setCategoria("DIETÉTICA");
				}
			else{
				producto.setCategoria("BEBES");
			}
			parafarmacia.newProducto(producto);
		}
			
	}
}
