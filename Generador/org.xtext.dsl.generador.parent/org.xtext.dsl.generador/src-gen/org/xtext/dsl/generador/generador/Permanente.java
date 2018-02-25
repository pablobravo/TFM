/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.generador;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permanente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.generador.generador.Permanente#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.dsl.generador.generador.Permanente#getAltura <em>Altura</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.generador.generador.GeneradorPackage#getPermanente()
 * @model
 * @generated
 */
public interface Permanente extends EObject
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(String)
   * @see org.xtext.dsl.generador.generador.GeneradorPackage#getPermanente_Color()
   * @model
   * @generated
   */
  String getColor();

  /**
   * Sets the value of the '{@link org.xtext.dsl.generador.generador.Permanente#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
  void setColor(String value);

  /**
   * Returns the value of the '<em><b>Altura</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Altura</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Altura</em>' attribute.
   * @see #setAltura(String)
   * @see org.xtext.dsl.generador.generador.GeneradorPackage#getPermanente_Altura()
   * @model
   * @generated
   */
  String getAltura();

  /**
   * Sets the value of the '{@link org.xtext.dsl.generador.generador.Permanente#getAltura <em>Altura</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Altura</em>' attribute.
   * @see #getAltura()
   * @generated
   */
  void setAltura(String value);

} // Permanente