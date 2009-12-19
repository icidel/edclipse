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
 * A representation of the model object '<em><b>Collections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.Collections#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.enlightenment.edje.EdjePackage#getCollections()
 * @model
 * @generated
 */
public interface Collections extends EObject
{
  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.enlightenment.edje.Group}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.xtext.enlightenment.edje.EdjePackage#getCollections_Groups()
   * @model containment="true"
   * @generated
   */
  EList<Group> getGroups();

} // Collections
