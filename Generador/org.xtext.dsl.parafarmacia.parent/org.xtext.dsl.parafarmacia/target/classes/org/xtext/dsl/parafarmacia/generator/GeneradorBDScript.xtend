package org.xtext.dsl.parafarmacia.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.parafarmacia.parafarmacia.Producto

class GeneradorBDScript {
	Resource resource;
	IFileSystemAccess fsa;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		var sb = new StringBuilder();
		for(i: resource.allContents.toIterable.filter(typeof(Producto))){
			sb.append(i.compilarTexto);
		}
		fsa.generateFile('productos.txt', sb.toString);
	}
	
	def compilarTexto(Producto p) '''
		INSERT INTO PRODUCTO VALUES ('«p.nombre»','«p.name»','«p.precio»',«IF p.conreceta»True«ELSE»False«ENDIF»,'«p.descripcion»');

	'''
}