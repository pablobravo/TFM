/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.dsl.generador.generador.Apariencia;
import org.xtext.dsl.generador.generador.Desplegable;
import org.xtext.dsl.generador.generador.Direccion;
import org.xtext.dsl.generador.generador.GeneradorPackage;
import org.xtext.dsl.generador.generador.Parafarmacia;
import org.xtext.dsl.generador.generador.Permanente;
import org.xtext.dsl.generador.generador.Producto;
import org.xtext.dsl.generador.generador.Registro;
import org.xtext.dsl.generador.generador.Tipo;
import org.xtext.dsl.generador.services.GeneradorGrammarAccess;

@SuppressWarnings("all")
public class GeneradorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GeneradorGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GeneradorPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GeneradorPackage.APARIENCIA:
				sequence_Apariencia(context, (Apariencia) semanticObject); 
				return; 
			case GeneradorPackage.DESPLEGABLE:
				sequence_Desplegable(context, (Desplegable) semanticObject); 
				return; 
			case GeneradorPackage.DIRECCION:
				sequence_Direccion(context, (Direccion) semanticObject); 
				return; 
			case GeneradorPackage.PARAFARMACIA:
				sequence_Parafarmacia(context, (Parafarmacia) semanticObject); 
				return; 
			case GeneradorPackage.PERMANENTE:
				sequence_Permanente(context, (Permanente) semanticObject); 
				return; 
			case GeneradorPackage.PRODUCTO:
				sequence_Producto(context, (Producto) semanticObject); 
				return; 
			case GeneradorPackage.REGISTRO:
				sequence_Registro(context, (Registro) semanticObject); 
				return; 
			case GeneradorPackage.TIPO:
				sequence_Tipo(context, (Tipo) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Apariencia returns Apariencia
	 *
	 * Constraint:
	 *     (
	 *         principal=Color 
	 *         principalClaro=Color 
	 *         secundario=Color 
	 *         fondo=Color 
	 *         fondoProductos=Color 
	 *         precios=Color 
	 *         texto=Color 
	 *         tituloColor=Color 
	 *         normal=Medida 
	 *         grande=Medida 
	 *         titulo=Medida 
	 *         menu=Medida 
	 *         lateral=Medida
	 *     )
	 */
	protected void sequence_Apariencia(ISerializationContext context, Apariencia semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__PRINCIPAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__PRINCIPAL));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__PRINCIPAL_CLARO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__PRINCIPAL_CLARO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__SECUNDARIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__SECUNDARIO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__FONDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__FONDO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__FONDO_PRODUCTOS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__FONDO_PRODUCTOS));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__PRECIOS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__PRECIOS));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__TEXTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__TEXTO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__TITULO_COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__TITULO_COLOR));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__NORMAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__NORMAL));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__GRANDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__GRANDE));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__TITULO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__TITULO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__MENU) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__MENU));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.APARIENCIA__LATERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.APARIENCIA__LATERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAparienciaAccess().getPrincipalColorParserRuleCall_5_0(), semanticObject.getPrincipal());
		feeder.accept(grammarAccess.getAparienciaAccess().getPrincipalClaroColorParserRuleCall_9_0(), semanticObject.getPrincipalClaro());
		feeder.accept(grammarAccess.getAparienciaAccess().getSecundarioColorParserRuleCall_13_0(), semanticObject.getSecundario());
		feeder.accept(grammarAccess.getAparienciaAccess().getFondoColorParserRuleCall_17_0(), semanticObject.getFondo());
		feeder.accept(grammarAccess.getAparienciaAccess().getFondoProductosColorParserRuleCall_21_0(), semanticObject.getFondoProductos());
		feeder.accept(grammarAccess.getAparienciaAccess().getPreciosColorParserRuleCall_25_0(), semanticObject.getPrecios());
		feeder.accept(grammarAccess.getAparienciaAccess().getTextoColorParserRuleCall_29_0(), semanticObject.getTexto());
		feeder.accept(grammarAccess.getAparienciaAccess().getTituloColorColorParserRuleCall_33_0(), semanticObject.getTituloColor());
		feeder.accept(grammarAccess.getAparienciaAccess().getNormalMedidaParserRuleCall_40_0(), semanticObject.getNormal());
		feeder.accept(grammarAccess.getAparienciaAccess().getGrandeMedidaParserRuleCall_44_0(), semanticObject.getGrande());
		feeder.accept(grammarAccess.getAparienciaAccess().getTituloMedidaParserRuleCall_48_0(), semanticObject.getTitulo());
		feeder.accept(grammarAccess.getAparienciaAccess().getMenuMedidaParserRuleCall_52_0(), semanticObject.getMenu());
		feeder.accept(grammarAccess.getAparienciaAccess().getLateralMedidaParserRuleCall_57_0(), semanticObject.getLateral());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Desplegable returns Desplegable
	 *
	 * Constraint:
	 *     color=Color
	 */
	protected void sequence_Desplegable(ISerializationContext context, Desplegable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.DESPLEGABLE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.DESPLEGABLE__COLOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDesplegableAccess().getColorColorParserRuleCall_2_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Direccion returns Direccion
	 *
	 * Constraint:
	 *     (calle=STRING ciudad=STRING pais=STRING)
	 */
	protected void sequence_Direccion(ISerializationContext context, Direccion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.DIRECCION__CALLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.DIRECCION__CALLE));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.DIRECCION__CIUDAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.DIRECCION__CIUDAD));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.DIRECCION__PAIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.DIRECCION__PAIS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDireccionAccess().getCalleSTRINGTerminalRuleCall_3_0(), semanticObject.getCalle());
		feeder.accept(grammarAccess.getDireccionAccess().getCiudadSTRINGTerminalRuleCall_5_0(), semanticObject.getCiudad());
		feeder.accept(grammarAccess.getDireccionAccess().getPaisSTRINGTerminalRuleCall_7_0(), semanticObject.getPais());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parafarmacia returns Parafarmacia
	 *
	 * Constraint:
	 *     (
	 *         titulo=STRING 
	 *         fuente=STRING 
	 *         nombre=STRING 
	 *         direccion=Direccion 
	 *         cif=STRING 
	 *         registro=Registro 
	 *         correo=Correo 
	 *         telefono=INT 
	 *         tipo=Tipo 
	 *         apariencia=Apariencia 
	 *         categorias+=Categoria* 
	 *         numProductosPorFila=INT 
	 *         productos+=Producto* 
	 *         nombreUsuario=STRING 
	 *         email=Correo 
	 *         password=STRING
	 *     )
	 */
	protected void sequence_Parafarmacia(ISerializationContext context, Parafarmacia semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Permanente returns Permanente
	 *
	 * Constraint:
	 *     (color=Color altura=Medida)
	 */
	protected void sequence_Permanente(ISerializationContext context, Permanente semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.PERMANENTE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.PERMANENTE__COLOR));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.PERMANENTE__ALTURA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.PERMANENTE__ALTURA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPermanenteAccess().getColorColorParserRuleCall_2_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getPermanenteAccess().getAlturaMedidaParserRuleCall_4_0(), semanticObject.getAltura());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Producto returns Producto
	 *
	 * Constraint:
	 *     (nombreProducto=STRING descripcion=STRING precio=Precio cantidad=INT categoria=Categoria)
	 */
	protected void sequence_Producto(ISerializationContext context, Producto semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.PRODUCTO__NOMBRE_PRODUCTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.PRODUCTO__NOMBRE_PRODUCTO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.PRODUCTO__DESCRIPCION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.PRODUCTO__DESCRIPCION));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.PRODUCTO__PRECIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.PRODUCTO__PRECIO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.PRODUCTO__CANTIDAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.PRODUCTO__CANTIDAD));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.PRODUCTO__CATEGORIA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.PRODUCTO__CATEGORIA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProductoAccess().getNombreProductoSTRINGTerminalRuleCall_3_0(), semanticObject.getNombreProducto());
		feeder.accept(grammarAccess.getProductoAccess().getDescripcionSTRINGTerminalRuleCall_5_0(), semanticObject.getDescripcion());
		feeder.accept(grammarAccess.getProductoAccess().getPrecioPrecioParserRuleCall_7_0(), semanticObject.getPrecio());
		feeder.accept(grammarAccess.getProductoAccess().getCantidadINTTerminalRuleCall_9_0(), semanticObject.getCantidad());
		feeder.accept(grammarAccess.getProductoAccess().getCategoriaCategoriaParserRuleCall_11_0(), semanticObject.getCategoria());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Registro returns Registro
	 *
	 * Constraint:
	 *     (tomo=INT folio=INT seccion=INT hoja=INT)
	 */
	protected void sequence_Registro(ISerializationContext context, Registro semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.REGISTRO__TOMO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.REGISTRO__TOMO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.REGISTRO__FOLIO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.REGISTRO__FOLIO));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.REGISTRO__SECCION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.REGISTRO__SECCION));
			if (transientValues.isValueTransient(semanticObject, GeneradorPackage.Literals.REGISTRO__HOJA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GeneradorPackage.Literals.REGISTRO__HOJA));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRegistroAccess().getTomoINTTerminalRuleCall_3_0(), semanticObject.getTomo());
		feeder.accept(grammarAccess.getRegistroAccess().getFolioINTTerminalRuleCall_5_0(), semanticObject.getFolio());
		feeder.accept(grammarAccess.getRegistroAccess().getSeccionINTTerminalRuleCall_7_0(), semanticObject.getSeccion());
		feeder.accept(grammarAccess.getRegistroAccess().getHojaINTTerminalRuleCall_9_0(), semanticObject.getHoja());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Tipo returns Tipo
	 *
	 * Constraint:
	 *     (desplegable=Desplegable | permanente=Permanente)
	 */
	protected void sequence_Tipo(ISerializationContext context, Tipo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
