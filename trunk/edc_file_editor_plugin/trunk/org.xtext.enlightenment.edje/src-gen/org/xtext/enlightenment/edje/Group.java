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
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.Group#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Group#getMinx <em>Minx</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Group#getMiny <em>Miny</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Group#getPart <em>Part</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Group#getProgram <em>Program</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.Group#getLua_script <em>Lua script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.enlightenment.edje.EdjePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject
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
   * @see org.xtext.enlightenment.edje.EdjePackage#getGroup_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Group#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.enlightenment.edje.EdjePackage#getGroup_Minx()
   * @model
   * @generated
   */
  int getMinx();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Group#getMinx <em>Minx</em>}' attribute.
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
   * @see org.xtext.enlightenment.edje.EdjePackage#getGroup_Miny()
   * @model
   * @generated
   */
  int getMiny();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Group#getMiny <em>Miny</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Miny</em>' attribute.
   * @see #getMiny()
   * @generated
   */
  void setMiny(int value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.enlightenment.edje.Part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' containment reference list.
   * @see org.xtext.enlightenment.edje.EdjePackage#getGroup_Part()
   * @model containment="true"
   * @generated
   */
  EList<Part> getPart();

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
   * @see org.xtext.enlightenment.edje.EdjePackage#getGroup_Program()
   * @model containment="true"
   * @generated
   */
  EList<Program> getProgram();

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
   * @see org.xtext.enlightenment.edje.EdjePackage#getGroup_Lua_script()
   * @model containment="true"
   * @generated
   */
  LUA_Script getLua_script();

  /**
   * Sets the value of the '{@link org.xtext.enlightenment.edje.Group#getLua_script <em>Lua script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lua script</em>' containment reference.
   * @see #getLua_script()
   * @generated
   */
  void setLua_script(LUA_Script value);

} // Group
