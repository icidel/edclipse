/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.enlightenment.edje.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.enlightenment.edje.Action;
import org.xtext.enlightenment.edje.EdjePackage;
import org.xtext.enlightenment.edje.LUA_Script;
import org.xtext.enlightenment.edje.Program;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ProgramImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ProgramImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ProgramImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.ProgramImpl#getLua_script <em>Lua script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program
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
   * The default value of the '{@link #getSignal() <em>Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected static final String SIGNAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSignal() <em>Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected String signal = SIGNAL_EDEFAULT;

  /**
   * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected String source = SOURCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

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
  protected ProgramImpl()
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
    return EdjePackage.Literals.PROGRAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PROGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSignal()
  {
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignal(String newSignal)
  {
    String oldSignal = signal;
    signal = newSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PROGRAM__SIGNAL, oldSignal, signal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(String newSource)
  {
    String oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PROGRAM__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdjePackage.PROGRAM__ACTION, oldAction, newAction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdjePackage.PROGRAM__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdjePackage.PROGRAM__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PROGRAM__ACTION, newAction, newAction));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdjePackage.PROGRAM__LUA_SCRIPT, oldLua_script, newLua_script);
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
        msgs = ((InternalEObject)lua_script).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdjePackage.PROGRAM__LUA_SCRIPT, null, msgs);
      if (newLua_script != null)
        msgs = ((InternalEObject)newLua_script).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdjePackage.PROGRAM__LUA_SCRIPT, null, msgs);
      msgs = basicSetLua_script(newLua_script, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PROGRAM__LUA_SCRIPT, newLua_script, newLua_script));
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
      case EdjePackage.PROGRAM__ACTION:
        return basicSetAction(null, msgs);
      case EdjePackage.PROGRAM__LUA_SCRIPT:
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
      case EdjePackage.PROGRAM__NAME:
        return getName();
      case EdjePackage.PROGRAM__SIGNAL:
        return getSignal();
      case EdjePackage.PROGRAM__SOURCE:
        return getSource();
      case EdjePackage.PROGRAM__ACTION:
        return getAction();
      case EdjePackage.PROGRAM__LUA_SCRIPT:
        return getLua_script();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EdjePackage.PROGRAM__NAME:
        setName((String)newValue);
        return;
      case EdjePackage.PROGRAM__SIGNAL:
        setSignal((String)newValue);
        return;
      case EdjePackage.PROGRAM__SOURCE:
        setSource((String)newValue);
        return;
      case EdjePackage.PROGRAM__ACTION:
        setAction((Action)newValue);
        return;
      case EdjePackage.PROGRAM__LUA_SCRIPT:
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
      case EdjePackage.PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EdjePackage.PROGRAM__SIGNAL:
        setSignal(SIGNAL_EDEFAULT);
        return;
      case EdjePackage.PROGRAM__SOURCE:
        setSource(SOURCE_EDEFAULT);
        return;
      case EdjePackage.PROGRAM__ACTION:
        setAction((Action)null);
        return;
      case EdjePackage.PROGRAM__LUA_SCRIPT:
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
      case EdjePackage.PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EdjePackage.PROGRAM__SIGNAL:
        return SIGNAL_EDEFAULT == null ? signal != null : !SIGNAL_EDEFAULT.equals(signal);
      case EdjePackage.PROGRAM__SOURCE:
        return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
      case EdjePackage.PROGRAM__ACTION:
        return action != null;
      case EdjePackage.PROGRAM__LUA_SCRIPT:
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
    result.append(", signal: ");
    result.append(signal);
    result.append(", source: ");
    result.append(source);
    result.append(')');
    return result.toString();
  }

} //ProgramImpl
