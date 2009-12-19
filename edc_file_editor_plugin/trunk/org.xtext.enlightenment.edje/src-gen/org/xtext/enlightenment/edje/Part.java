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
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.Part#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Part#getMinx <em>Minx</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Part#getMiny <em>Miny</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Part#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Part#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.enlightenment.edje.EdjePackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.enlightenment.edje.EdjePackage#getPart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Part#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Minx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minx</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minx</em>' attribute.
   * @see #setMinx(int)
   * @see org.xtext.enlightenment.edje.EdjePackage#getPart_Minx()
   * @model
   * @generated
   */
  int getMinx();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Part#getMinx <em>Minx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minx</em>' attribute.
   * @see #getMinx()
   * @generated
   */
  void setMinx(int value);

  /**
   * Returns the value of the '<em><b>Miny</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Miny</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Miny</em>' attribute.
   * @see #setMiny(int)
   * @see org.xtext.enlightenment.edje.EdjePackage#getPart_Miny()
   * @model
   * @generated
   */
  int getMiny();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Part#getMiny <em>Miny</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Miny</em>' attribute.
   * @see #getMiny()
   * @generated
   */
  void setMiny(int value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.enlightenment.edje.EdjePackage#getPart_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Part#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.enlightenment.edje.Description}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descriptions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptions</em>' containment reference list.
   * @see org.xtext.enlightenment.edje.EdjePackage#getPart_Descriptions()
   * @model containment="true"
   * @generated
   */
  EList<Description> getDescriptions();

} // Part
