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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.Model#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Model#getCollections <em>Collections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.enlightenment.edje.EdjePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' attribute list.
   * @see org.xtext.enlightenment.edje.EdjePackage#getModel_Includes()
   * @model unique="false"
   * @generated
   */
  EList<String> getIncludes();

  /**
   * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.enlightenment.edje.Collections}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collections</em>' containment reference list.
   * @see org.xtext.enlightenment.edje.EdjePackage#getModel_Collections()
   * @model containment="true"
   * @generated
   */
  EList<Collections> getCollections();

} // Model
