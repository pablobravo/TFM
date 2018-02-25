package org.xtext.dsl.parafarmacia.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.xtext.dsl.parafarmacia.parafarmacia.Cuerpo;
import org.xtext.dsl.parafarmacia.parafarmacia.Pagina;
import org.xtext.dsl.parafarmacia.parafarmacia.Parafarmacia;
import org.xtext.dsl.parafarmacia.parafarmacia.Producto;
import org.xtext.dsl.parafarmacia.parafarmacia.impl.ParafarmaciaPackageImpl;


public class ParafarmaciaOutlineTransformer extends DefaultOutlineTreeProvider {

	@Override
	protected void createNode(IOutlineNode parentNode, EObject modelElement) {
		if (modelElement instanceof Parafarmacia) {
			createEObjectNode(parentNode, modelElement);

		}
		else if (modelElement instanceof Pagina) {
			createEObjectNode(parentNode, modelElement);
		}
		else if (modelElement instanceof Cuerpo) {
			createEObjectNode(parentNode, modelElement);
			Cuerpo i = (Cuerpo)modelElement;
			EAttribute aCuerpo = ParafarmaciaPackageImpl.eINSTANCE.getCuerpo_Texto();
			if(i.getTexto()!=null) {
				aCuerpo.setDefaultValue(i.getTexto());
				createEObjectNode(parentNode, aCuerpo);
			}
		}
		else if (modelElement instanceof Producto) {
			createEObjectNode(parentNode, modelElement); 
			
			int posicion = parentNode.getChildren().size()-1; 
			IOutlineNode nodoActual = parentNode.getChildren().get(posicion); 

			Producto i = (Producto)modelElement;
			
			EAttribute aNombre = ParafarmaciaPackageImpl.eINSTANCE.getProducto_Nombre();
			aNombre.setDefaultValue(i.getNombre());
			createEObjectNode(nodoActual, aNombre);
			
			EAttribute aPrecio = ParafarmaciaPackageImpl.eINSTANCE.getProducto_Precio();
			aPrecio.setDefaultValue(i.getPrecio());
			createEObjectNode(nodoActual, aPrecio);
			
			
			EAttribute aReceta = ParafarmaciaPackageImpl.eINSTANCE.getProducto_Conreceta();
			if(i.isConreceta()) {
				aReceta.setDefaultValue(i.isConreceta());
				createEObjectNode(nodoActual, aReceta);
			}
			
			
			
		}
	}
	
}
