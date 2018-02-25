/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.generador.generador.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.dsl.generador.generador.Apariencia;
import org.xtext.dsl.generador.generador.Desplegable;
import org.xtext.dsl.generador.generador.Direccion;
import org.xtext.dsl.generador.generador.GeneradorFactory;
import org.xtext.dsl.generador.generador.GeneradorPackage;
import org.xtext.dsl.generador.generador.Parafarmacia;
import org.xtext.dsl.generador.generador.Permanente;
import org.xtext.dsl.generador.generador.Producto;
import org.xtext.dsl.generador.generador.Registro;
import org.xtext.dsl.generador.generador.Tipo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneradorPackageImpl extends EPackageImpl implements GeneradorPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parafarmaciaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aparienciaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tipoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desplegableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass permanenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass registroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass direccionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.dsl.generador.generador.GeneradorPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GeneradorPackageImpl()
  {
    super(eNS_URI, GeneradorFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GeneradorPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GeneradorPackage init()
  {
    if (isInited) return (GeneradorPackage)EPackage.Registry.INSTANCE.getEPackage(GeneradorPackage.eNS_URI);

    // Obtain or create and register package
    GeneradorPackageImpl theGeneradorPackage = (GeneradorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneradorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneradorPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGeneradorPackage.createPackageContents();

    // Initialize created meta-data
    theGeneradorPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGeneradorPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GeneradorPackage.eNS_URI, theGeneradorPackage);
    return theGeneradorPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParafarmacia()
  {
    return parafarmaciaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Titulo()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Fuente()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Nombre()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParafarmacia_Direccion()
  {
    return (EReference)parafarmaciaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Cif()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParafarmacia_Registro()
  {
    return (EReference)parafarmaciaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Correo()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Telefono()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParafarmacia_Tipo()
  {
    return (EReference)parafarmaciaEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParafarmacia_Apariencia()
  {
    return (EReference)parafarmaciaEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Categorias()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_NumProductosPorFila()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParafarmacia_Productos()
  {
    return (EReference)parafarmaciaEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_NombreUsuario()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Email()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParafarmacia_Password()
  {
    return (EAttribute)parafarmaciaEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApariencia()
  {
    return aparienciaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Principal()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_PrincipalClaro()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Secundario()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Fondo()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_FondoProductos()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Precios()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Texto()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_TituloColor()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Normal()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Grande()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Titulo()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Menu()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApariencia_Lateral()
  {
    return (EAttribute)aparienciaEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProducto()
  {
    return productoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProducto_NombreProducto()
  {
    return (EAttribute)productoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProducto_Descripcion()
  {
    return (EAttribute)productoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProducto_Precio()
  {
    return (EAttribute)productoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProducto_Cantidad()
  {
    return (EAttribute)productoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProducto_Categoria()
  {
    return (EAttribute)productoEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTipo()
  {
    return tipoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTipo_Desplegable()
  {
    return (EReference)tipoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTipo_Permanente()
  {
    return (EReference)tipoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesplegable()
  {
    return desplegableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesplegable_Color()
  {
    return (EAttribute)desplegableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPermanente()
  {
    return permanenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPermanente_Color()
  {
    return (EAttribute)permanenteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPermanente_Altura()
  {
    return (EAttribute)permanenteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegistro()
  {
    return registroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegistro_Tomo()
  {
    return (EAttribute)registroEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegistro_Folio()
  {
    return (EAttribute)registroEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegistro_Seccion()
  {
    return (EAttribute)registroEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegistro_Hoja()
  {
    return (EAttribute)registroEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDireccion()
  {
    return direccionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDireccion_Calle()
  {
    return (EAttribute)direccionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDireccion_Ciudad()
  {
    return (EAttribute)direccionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDireccion_Pais()
  {
    return (EAttribute)direccionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneradorFactory getGeneradorFactory()
  {
    return (GeneradorFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    parafarmaciaEClass = createEClass(PARAFARMACIA);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__TITULO);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__FUENTE);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__NOMBRE);
    createEReference(parafarmaciaEClass, PARAFARMACIA__DIRECCION);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__CIF);
    createEReference(parafarmaciaEClass, PARAFARMACIA__REGISTRO);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__CORREO);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__TELEFONO);
    createEReference(parafarmaciaEClass, PARAFARMACIA__TIPO);
    createEReference(parafarmaciaEClass, PARAFARMACIA__APARIENCIA);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__CATEGORIAS);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__NUM_PRODUCTOS_POR_FILA);
    createEReference(parafarmaciaEClass, PARAFARMACIA__PRODUCTOS);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__NOMBRE_USUARIO);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__EMAIL);
    createEAttribute(parafarmaciaEClass, PARAFARMACIA__PASSWORD);

    aparienciaEClass = createEClass(APARIENCIA);
    createEAttribute(aparienciaEClass, APARIENCIA__PRINCIPAL);
    createEAttribute(aparienciaEClass, APARIENCIA__PRINCIPAL_CLARO);
    createEAttribute(aparienciaEClass, APARIENCIA__SECUNDARIO);
    createEAttribute(aparienciaEClass, APARIENCIA__FONDO);
    createEAttribute(aparienciaEClass, APARIENCIA__FONDO_PRODUCTOS);
    createEAttribute(aparienciaEClass, APARIENCIA__PRECIOS);
    createEAttribute(aparienciaEClass, APARIENCIA__TEXTO);
    createEAttribute(aparienciaEClass, APARIENCIA__TITULO_COLOR);
    createEAttribute(aparienciaEClass, APARIENCIA__NORMAL);
    createEAttribute(aparienciaEClass, APARIENCIA__GRANDE);
    createEAttribute(aparienciaEClass, APARIENCIA__TITULO);
    createEAttribute(aparienciaEClass, APARIENCIA__MENU);
    createEAttribute(aparienciaEClass, APARIENCIA__LATERAL);

    productoEClass = createEClass(PRODUCTO);
    createEAttribute(productoEClass, PRODUCTO__NOMBRE_PRODUCTO);
    createEAttribute(productoEClass, PRODUCTO__DESCRIPCION);
    createEAttribute(productoEClass, PRODUCTO__PRECIO);
    createEAttribute(productoEClass, PRODUCTO__CANTIDAD);
    createEAttribute(productoEClass, PRODUCTO__CATEGORIA);

    tipoEClass = createEClass(TIPO);
    createEReference(tipoEClass, TIPO__DESPLEGABLE);
    createEReference(tipoEClass, TIPO__PERMANENTE);

    desplegableEClass = createEClass(DESPLEGABLE);
    createEAttribute(desplegableEClass, DESPLEGABLE__COLOR);

    permanenteEClass = createEClass(PERMANENTE);
    createEAttribute(permanenteEClass, PERMANENTE__COLOR);
    createEAttribute(permanenteEClass, PERMANENTE__ALTURA);

    registroEClass = createEClass(REGISTRO);
    createEAttribute(registroEClass, REGISTRO__TOMO);
    createEAttribute(registroEClass, REGISTRO__FOLIO);
    createEAttribute(registroEClass, REGISTRO__SECCION);
    createEAttribute(registroEClass, REGISTRO__HOJA);

    direccionEClass = createEClass(DIRECCION);
    createEAttribute(direccionEClass, DIRECCION__CALLE);
    createEAttribute(direccionEClass, DIRECCION__CIUDAD);
    createEAttribute(direccionEClass, DIRECCION__PAIS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(parafarmaciaEClass, Parafarmacia.class, "Parafarmacia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParafarmacia_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Fuente(), ecorePackage.getEString(), "fuente", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParafarmacia_Direccion(), this.getDireccion(), null, "direccion", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Cif(), ecorePackage.getEString(), "cif", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParafarmacia_Registro(), this.getRegistro(), null, "registro", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Correo(), ecorePackage.getEString(), "correo", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Telefono(), ecorePackage.getEInt(), "telefono", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParafarmacia_Tipo(), this.getTipo(), null, "tipo", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParafarmacia_Apariencia(), this.getApariencia(), null, "apariencia", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Categorias(), ecorePackage.getEString(), "categorias", null, 0, -1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_NumProductosPorFila(), ecorePackage.getEInt(), "numProductosPorFila", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParafarmacia_Productos(), this.getProducto(), null, "productos", null, 0, -1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_NombreUsuario(), ecorePackage.getEString(), "nombreUsuario", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Email(), ecorePackage.getEString(), "email", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParafarmacia_Password(), ecorePackage.getEString(), "password", null, 0, 1, Parafarmacia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aparienciaEClass, Apariencia.class, "Apariencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApariencia_Principal(), ecorePackage.getEString(), "principal", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_PrincipalClaro(), ecorePackage.getEString(), "principalClaro", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Secundario(), ecorePackage.getEString(), "secundario", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Fondo(), ecorePackage.getEString(), "fondo", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_FondoProductos(), ecorePackage.getEString(), "fondoProductos", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Precios(), ecorePackage.getEString(), "precios", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Texto(), ecorePackage.getEString(), "texto", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_TituloColor(), ecorePackage.getEString(), "tituloColor", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Normal(), ecorePackage.getEString(), "normal", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Grande(), ecorePackage.getEString(), "grande", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Menu(), ecorePackage.getEString(), "menu", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApariencia_Lateral(), ecorePackage.getEString(), "lateral", null, 0, 1, Apariencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productoEClass, Producto.class, "Producto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProducto_NombreProducto(), ecorePackage.getEString(), "nombreProducto", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProducto_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProducto_Precio(), ecorePackage.getEString(), "precio", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProducto_Cantidad(), ecorePackage.getEInt(), "cantidad", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProducto_Categoria(), ecorePackage.getEString(), "categoria", null, 0, 1, Producto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tipoEClass, Tipo.class, "Tipo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTipo_Desplegable(), this.getDesplegable(), null, "desplegable", null, 0, 1, Tipo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTipo_Permanente(), this.getPermanente(), null, "permanente", null, 0, 1, Tipo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(desplegableEClass, Desplegable.class, "Desplegable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesplegable_Color(), ecorePackage.getEString(), "color", null, 0, 1, Desplegable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(permanenteEClass, Permanente.class, "Permanente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPermanente_Color(), ecorePackage.getEString(), "color", null, 0, 1, Permanente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPermanente_Altura(), ecorePackage.getEString(), "altura", null, 0, 1, Permanente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(registroEClass, Registro.class, "Registro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegistro_Tomo(), ecorePackage.getEInt(), "tomo", null, 0, 1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegistro_Folio(), ecorePackage.getEInt(), "folio", null, 0, 1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegistro_Seccion(), ecorePackage.getEInt(), "seccion", null, 0, 1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegistro_Hoja(), ecorePackage.getEInt(), "hoja", null, 0, 1, Registro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(direccionEClass, Direccion.class, "Direccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDireccion_Calle(), ecorePackage.getEString(), "calle", null, 0, 1, Direccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDireccion_Ciudad(), ecorePackage.getEString(), "ciudad", null, 0, 1, Direccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDireccion_Pais(), ecorePackage.getEString(), "pais", null, 0, 1, Direccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GeneradorPackageImpl
