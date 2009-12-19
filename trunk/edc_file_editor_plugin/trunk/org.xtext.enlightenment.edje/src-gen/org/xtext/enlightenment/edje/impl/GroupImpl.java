/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.enlightenment.edje.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.enlightenment.edje.EdjePackage;
import org.xtext.enlightenment.edje.Group;
import org.xtext.enlightenment.edje.LUA_Script;
import org.xtext.enlightenment.edje.Part;
import org.xtext.enlightenment.edje.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.GroupImpl#getMinx <em>Minx</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.GroupImpl#getMiny <em>Miny</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.GroupImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.GroupImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.GroupImpl#getLua_script <em>Lua script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMinx() <em>Minx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinx()
   * @generated
   * @ordered
   */
  protected static final int MINX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinx() <em>Minx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinx()
   * @generated
   * @ordered
   */
  protected int minx = MINX_EDEFAULT;

  /**
   * The default value of the '{@link #getMiny() <em>Miny</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiny()
   * @generated
   * @ordered
   */
  protected static final int MINY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMiny() <em>Miny</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiny()
   * @generated
   * @ordered
   */
  protected int miny = MINY_EDEFAULT;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected EList<Part> part;

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
   * The cached value of the '{@link #getLua_script() <em>Lua script</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLua_script()
   * @generated
   * @ordered
   */
  protected LUA_Script lua_script;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupImpl()
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
    return EdjePackage.Literals.GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinx()
  {
    return minx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinx(int newMinx)
  {
    int oldMinx = minx;
    minx = newMinx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.GROUP__MINX, oldMinx, minx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMiny()
  {
    return miny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiny(int newMiny)
  {
    int oldMiny = miny;
    miny = newMiny;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.GROUP__MINY, oldMiny, miny));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Part> getPart()
  {
    if (part == null)
    {
      part = new EObjectContainmentEList<Part>(Part.class, this, EdjePackage.GROUP__PART);
    }
    return part;
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
      program = new EObjectContainmentEList<Program>(Program.class, this, EdjePackage.GROUP__PROGRAM);
    }
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LUA_Script getLua_script()
  {
    return lua_script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLua_script(LUA_Script newLua_script, NotificationChain msgs)
  {
    LUA_Script oldLua_script = lua_script;
    lua_script = newLua_script;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdjePackage.GROUP__LUA_SCRIPT, oldLua_script, newLua_script);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLua_script(LUA_Script newLua_script)
  {
    if (newLua_script != lua_script)
    {
      NotificationChain msgs = null;
      if (lua_script != null)
        msgs = ((InternalEObject)lua_script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdjePackage.GROUP__LUA_SCRIPT, null, msgs);
      if (newLua_script != null)
        msgs = ((InternalEObject)newLua_script).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdjePackage.GROUP__LUA_SCRIPT, null, msgs);
      msgs = basicSetLua_script(newLua_script, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.GROUP__LUA_SCRIPT, newLua_script, newLua_script));
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
      case EdjePackage.GROUP__PART:
        return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
      case EdjePackage.GROUP__PROGRAM:
        return ((InternalEList<?>)getProgram()).basicRemove(otherEnd, msgs);
      case EdjePackage.GROUP__LUA_SCRIPT:
        return basicSetLua_script(null, msgs);
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
      case EdjePackage.GROUP__NAME:
        return getName();
      case EdjePackage.GROUP__MINX:
        return getMinx();
      case EdjePackage.GROUP__MINY:
        return getMiny();
      case EdjePackage.GROUP__PART:
        return getPart();
      case EdjePackage.GROUP__PROGRAM:
        return getProgram();
      case EdjePackage.GROUP__LUA_SCRIPT:
        return getLua_script();
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
      case EdjePackage.GROUP__NAME:
        setName((String)newValue);
        return;
      case EdjePackage.GROUP__MINX:
        setMinx((Integer)newValue);
        return;
      case EdjePackage.GROUP__MINY:
        setMiny((Integer)newValue);
        return;
      case EdjePackage.GROUP__PART:
        getPart().clear();
        getPart().addAll((Collection<? extends Part>)newValue);
        return;
      case EdjePackage.GROUP__PROGRAM:
        getProgram().clear();
        getProgram().addAll((Collection<? extends Program>)newValue);
        return;
      case EdjePackage.GROUP__LUA_SCRIPT:
        setLua_script((LUA_Script)newValue);
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
      case EdjePackage.GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EdjePackage.GROUP__MINX:
        setMinx(MINX_EDEFAULT);
        return;
      case EdjePackage.GROUP__MINY:
        setMiny(MINY_EDEFAULT);
        return;
      case EdjePackage.GROUP__PART:
        getPart().clear();
        return;
      case EdjePackage.GROUP__PROGRAM:
        getProgram().clear();
        return;
      case EdjePackage.GROUP__LUA_SCRIPT:
        setLua_script((LUA_Script)null);
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
      case EdjePackage.GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EdjePackage.GROUP__MINX:
        return minx != MINX_EDEFAULT;
      case EdjePackage.GROUP__MINY:
        return miny != MINY_EDEFAULT;
      case EdjePackage.GROUP__PART:
        return part != null && !part.isEmpty();
      case EdjePackage.GROUP__PROGRAM:
        return program != null && !program.isEmpty();
      case EdjePackage.GROUP__LUA_SCRIPT:
        return lua_script != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", minx: ");
    result.append(minx);
    result.append(", miny: ");
    result.append(miny);
    result.append(')');
    return result.toString();
  }

} //GroupImpl
