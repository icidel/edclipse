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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.enlightenment.edje.EdjePackage;
import org.xtext.enlightenment.edje.Program;
import org.xtext.enlightenment.edje.Programs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ProgramsImpl#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramsImpl extends MinimalEObjectImpl.Container implements Programs
{
  /**
   * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProgram()
   * @generated
   * @ordered
   */
  protected EList<Program> program;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramsImpl()
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
    return EdjePackage.Literals.PROGRAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Program> getProgram()
  {
    if (program == null)
    {
      program = new EObjectContainmentEList<Program>(Program.class, this, EdjePackage.PROGRAMS__PROGRAM);
    }
    return program;
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
      case EdjePackage.PROGRAMS__PROGRAM:
        return ((InternalEList<?>)getProgram()).basicRemove(otherEnd, msgs);
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
      case EdjePackage.PROGRAMS__PROGRAM:
        return getProgram();
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
      case EdjePackage.PROGRAMS__PROGRAM:
        getProgram().clear();
        getProgram().addAll((Collection<? extends Program>)newValue);
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
      case EdjePackage.PROGRAMS__PROGRAM:
        getProgram().clear();
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
      case EdjePackage.PROGRAMS__PROGRAM:
        return program != null && !program.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramsImpl
