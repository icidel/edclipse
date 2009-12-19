/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.enlightenment.edje.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.enlightenment.edje.Collections;
import org.xtext.enlightenment.edje.EdjePackage;
import org.xtext.enlightenment.edje.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ModelImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ModelImpl#getCollections <em>Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<String> includes;

  /**
   * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollections()
   * @generated
   * @ordered
   */
  protected EList<Collections> collections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return EdjePackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIncludes()
  {
    if (includes == null)
    {
      includes = new EDataTypeEList<String>(String.class, this, EdjePackage.MODEL__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Collections> getCollections()
  {
    if (collections == null)
    {
      collections = new EObjectContainmentEList<Collections>(Collections.class, this, EdjePackage.MODEL__COLLECTIONS);
    }
    return collections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EdjePackage.MODEL__COLLECTIONS:
        return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EdjePackage.MODEL__INCLUDES:
        return getIncludes();
      case EdjePackage.MODEL__COLLECTIONS:
        return getCollections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdjePackage.MODEL__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends String>)newValue);
        return;
      case EdjePackage.MODEL__COLLECTIONS:
        getCollections().clear();
        getCollections().addAll((Collection<? extends Collections>)newValue);
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
      case EdjePackage.MODEL__INCLUDES:
        getIncludes().clear();
        return;
      case EdjePackage.MODEL__COLLECTIONS:
        getCollections().clear();
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
      case EdjePackage.MODEL__INCLUDES:
        return includes != null && !includes.isEmpty();
      case EdjePackage.MODEL__COLLECTIONS:
        return collections != null && !collections.isEmpty();
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
    result.append(" (includes: ");
    result.append(includes);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
