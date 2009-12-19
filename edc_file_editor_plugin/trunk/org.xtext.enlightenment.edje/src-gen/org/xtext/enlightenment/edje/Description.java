/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.enlightenment.edje;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.Description#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Description#getRed <em>Red</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Description#getGreen <em>Green</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Description#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Description#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.enlightenment.edje.EdjePackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject
{
  /**
   * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinates</em>' containment reference.
   * @see #setCoordinates(Coordinates)
   * @see org.xtext.enlightenment.edje.EdjePackage#getDescription_Coordinates()
   * @model containment="true"
   * @generated
   */
  Coordinates getCoordinates();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Description#getCoordinates <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinates</em>' containment reference.
   * @see #getCoordinates()
   * @generated
   */
  void setCoordinates(Coordinates value);

  /**
   * Returns the value of the '<em><b>Red</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Red</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Red</em>' attribute.
   * @see #setRed(int)
   * @see org.xtext.enlightenment.edje.EdjePackage#getDescription_Red()
   * @model
   * @generated
   */
  int getRed();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Description#getRed <em>Red</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Red</em>' attribute.
   * @see #getRed()
   * @generated
   */
  void setRed(int value);

  /**
   * Returns the value of the '<em><b>Green</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Green</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Green</em>' attribute.
   * @see #setGreen(int)
   * @see org.xtext.enlightenment.edje.EdjePackage#getDescription_Green()
   * @model
   * @generated
   */
  int getGreen();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Description#getGreen <em>Green</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Green</em>' attribute.
   * @see #getGreen()
   * @generated
   */
  void setGreen(int value);

  /**
   * Returns the value of the '<em><b>Blue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blue</em>' attribute.
   * @see #setBlue(int)
   * @see org.xtext.enlightenment.edje.EdjePackage#getDescription_Blue()
   * @model
   * @generated
   */
  int getBlue();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Description#getBlue <em>Blue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blue</em>' attribute.
   * @see #getBlue()
   * @generated
   */
  void setBlue(int value);

  /**
   * Returns the value of the '<em><b>Alpha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha</em>' attribute.
   * @see #setAlpha(int)
   * @see org.xtext.enlightenment.edje.EdjePackage#getDescription_Alpha()
   * @model
   * @generated
   */
  int getAlpha();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Description#getAlpha <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alpha</em>' attribute.
   * @see #getAlpha()
   * @generated
   */
  void setAlpha(int value);

} // Description
