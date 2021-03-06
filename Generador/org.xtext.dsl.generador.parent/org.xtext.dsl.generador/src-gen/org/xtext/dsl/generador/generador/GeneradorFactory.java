/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.generador;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.generador.generador.GeneradorPackage
 * @generated
 */
public interface GeneradorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GeneradorFactory eINSTANCE = org.xtext.dsl.generador.generador.impl.GeneradorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Parafarmacia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parafarmacia</em>'.
   * @generated
   */
  Parafarmacia createParafarmacia();

  /**
   * Returns a new object of class '<em>Apariencia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apariencia</em>'.
   * @generated
   */
  Apariencia createApariencia();

  /**
   * Returns a new object of class '<em>Producto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Producto</em>'.
   * @generated
   */
  Producto createProducto();

  /**
   * Returns a new object of class '<em>Tipo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tipo</em>'.
   * @generated
   */
  Tipo createTipo();

  /**
   * Returns a new object of class '<em>Desplegable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desplegable</em>'.
   * @generated
   */
  Desplegable createDesplegable();

  /**
   * Returns a new object of class '<em>Permanente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Permanente</em>'.
   * @generated
   */
  Permanente createPermanente();

  /**
   * Returns a new object of class '<em>Registro</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Registro</em>'.
   * @generated
   */
  Registro createRegistro();

  /**
   * Returns a new object of class '<em>Direccion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direccion</em>'.
   * @generated
   */
  Direccion createDireccion();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GeneradorPackage getGeneradorPackage();

} //GeneradorFactory
