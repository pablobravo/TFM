/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.generador.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.dsl.generador.generador.GeneradorPackage;
import org.xtext.dsl.generador.generador.Permanente;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permanente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.generador.generador.impl.PermanenteImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.dsl.generador.generador.impl.PermanenteImpl#getAltura <em>Altura</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermanenteImpl extends MinimalEObjectImpl.Container implements Permanente
{
  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final String COLOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected String color = COLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getAltura() <em>Altura</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAltura()
   * @generated
   * @ordered
   */
  protected static final String ALTURA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAltura() <em>Altura</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAltura()
   * @generated
   * @ordered
   */
  protected String altura = ALTURA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PermanenteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GeneradorPackage.Literals.PERMANENTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(String newColor)
  {
    String oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneradorPackage.PERMANENTE__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAltura()
  {
    return altura;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAltura(String newAltura)
  {
    String oldAltura = altura;
    altura = newAltura;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GeneradorPackage.PERMANENTE__ALTURA, oldAltura, altura));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GeneradorPackage.PERMANENTE__COLOR:
        return getColor();
      case GeneradorPackage.PERMANENTE__ALTURA:
        return getAltura();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GeneradorPackage.PERMANENTE__COLOR:
        setColor((String)newValue);
        return;
      case GeneradorPackage.PERMANENTE__ALTURA:
        setAltura((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GeneradorPackage.PERMANENTE__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case GeneradorPackage.PERMANENTE__ALTURA:
        setAltura(ALTURA_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GeneradorPackage.PERMANENTE__COLOR:
        return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
      case GeneradorPackage.PERMANENTE__ALTURA:
        return ALTURA_EDEFAULT == null ? altura != null : !ALTURA_EDEFAULT.equals(altura);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (color: ");
    result.append(color);
    result.append(", altura: ");
    result.append(altura);
    result.append(')');
    return result.toString();
  }

} //PermanenteImpl