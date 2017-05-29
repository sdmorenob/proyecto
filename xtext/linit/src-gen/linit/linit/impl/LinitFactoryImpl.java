/**
 * generated by Xtext 2.12.0
 */
package linit.linit.impl;

import linit.linit.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinitFactoryImpl extends EFactoryImpl implements LinitFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LinitFactory init()
  {
    try
    {
      LinitFactory theLinitFactory = (LinitFactory)EPackage.Registry.INSTANCE.getEFactory(LinitPackage.eNS_URI);
      if (theLinitFactory != null)
      {
        return theLinitFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LinitFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinitFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LinitPackage.PROGRAMA: return createprograma();
      case LinitPackage.DECLARACIONES: return createdeclaraciones();
      case LinitPackage.INSTRUCCIONES: return createinstrucciones();
      case LinitPackage.CONDICIONAL: return createcondicional();
      case LinitPackage.CICLO: return createciclo();
      case LinitPackage.LISTA_CONDICIONAL: return createlistaCondicional();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public programa createprograma()
  {
    programaImpl programa = new programaImpl();
    return programa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaraciones createdeclaraciones()
  {
    declaracionesImpl declaraciones = new declaracionesImpl();
    return declaraciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public instrucciones createinstrucciones()
  {
    instruccionesImpl instrucciones = new instruccionesImpl();
    return instrucciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public condicional createcondicional()
  {
    condicionalImpl condicional = new condicionalImpl();
    return condicional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ciclo createciclo()
  {
    cicloImpl ciclo = new cicloImpl();
    return ciclo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public listaCondicional createlistaCondicional()
  {
    listaCondicionalImpl listaCondicional = new listaCondicionalImpl();
    return listaCondicional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinitPackage getLinitPackage()
  {
    return (LinitPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LinitPackage getPackage()
  {
    return LinitPackage.eINSTANCE;
  }

} //LinitFactoryImpl