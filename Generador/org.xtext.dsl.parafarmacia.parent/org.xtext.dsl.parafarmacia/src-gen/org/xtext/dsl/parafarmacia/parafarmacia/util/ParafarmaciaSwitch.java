/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.parafarmacia.parafarmacia.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.dsl.parafarmacia.parafarmacia.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.parafarmacia.parafarmacia.ParafarmaciaPackage
 * @generated
 */
public class ParafarmaciaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ParafarmaciaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParafarmaciaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ParafarmaciaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ParafarmaciaPackage.PARAFARMACIA:
      {
        Parafarmacia parafarmacia = (Parafarmacia)theEObject;
        T result = caseParafarmacia(parafarmacia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParafarmaciaPackage.APARIENCIA:
      {
        Apariencia apariencia = (Apariencia)theEObject;
        T result = caseApariencia(apariencia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParafarmaciaPackage.PAGINA:
      {
        Pagina pagina = (Pagina)theEObject;
        T result = casePagina(pagina);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParafarmaciaPackage.CUERPO:
      {
        Cuerpo cuerpo = (Cuerpo)theEObject;
        T result = caseCuerpo(cuerpo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ParafarmaciaPackage.PRODUCTO:
      {
        Producto producto = (Producto)theEObject;
        T result = caseProducto(producto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parafarmacia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parafarmacia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParafarmacia(Parafarmacia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Apariencia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Apariencia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApariencia(Apariencia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pagina</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pagina</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePagina(Pagina object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cuerpo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cuerpo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCuerpo(Cuerpo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Producto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Producto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProducto(Producto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ParafarmaciaSwitch
