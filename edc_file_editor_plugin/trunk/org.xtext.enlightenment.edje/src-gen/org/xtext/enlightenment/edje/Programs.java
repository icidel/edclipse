/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.enlightenment.edje;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.Programs#getProgram <em>Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.enlightenment.edje.EdjePackage#getPrograms()
 * @model
 * @generated
 */
public interface Programs extends EObject
{
  /**
   * Returns the value of the '<em><b>Program</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.enlightenment.edje.Program}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' containment reference list.
   * @see org.xtext.enlightenment.edje.EdjePackage#getPrograms_Program()
   * @model containment="true"
   * @generated
   */
  EList<Program> getProgram();

} // Programs
