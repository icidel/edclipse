/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.enlightenment.edje;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.Program#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Program#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Program#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Program#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Program#getLua_script <em>Lua script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.enlightenment.edje.EdjePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
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
   * @see org.xtext.enlightenment.edje.EdjePackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Signal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' attribute.
   * @see #setSignal(String)
   * @see org.xtext.enlightenment.edje.EdjePackage#getProgram_Signal()
   * @model
   * @generated
   */
  String getSignal();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Program#getSignal <em>Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' attribute.
   * @see #getSignal()
   * @generated
   */
  void setSignal(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see org.xtext.enlightenment.edje.EdjePackage#getProgram_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Program#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see org.xtext.enlightenment.edje.EdjePackage#getProgram_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Program#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Lua script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lua script</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lua script</em>' containment reference.
   * @see #setLua_script(LUA_Script)
   * @see org.xtext.enlightenment.edje.EdjePackage#getProgram_Lua_script()
   * @model containment="true"
   * @generated
   */
  LUA_Script getLua_script();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Program#getLua_script <em>Lua script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lua script</em>' containment reference.
   * @see #getLua_script()
   * @generated
   */
  void setLua_script(LUA_Script value);

} // Program
