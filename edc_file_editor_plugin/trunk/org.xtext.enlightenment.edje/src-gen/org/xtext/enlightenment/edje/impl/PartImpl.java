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

import org.xtext.enlightenment.edje.Description;
import org.xtext.enlightenment.edje.EdjePackage;
import org.xtext.enlightenment.edje.Part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.impl.PartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.PartImpl#getMinx <em>Minx</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.PartImpl#getMiny <em>Miny</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.PartImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.PartImpl#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends MinimalEObjectImpl.Container implements Part
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptions()
   * @generated
   * @ordered
   */
  protected EList<Description> descriptions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartImpl()
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
    return EdjePackage.Literals.PART;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PART__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PART__MINX, oldMinx, minx));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PART__MINY, oldMiny, miny));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.PART__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Description> getDescriptions()
  {
    if (descriptions == null)
    {
      descriptions = new EObjectContainmentEList<Description>(Description.class, this, EdjePackage.PART__DESCRIPTIONS);
    }
    return descriptions;
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
      case EdjePackage.PART__DESCRIPTIONS:
        return ((InternalEList<?>)getDescriptions()).basicRemove(otherEnd, msgs);
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
      case EdjePackage.PART__NAME:
        return getName();
      case EdjePackage.PART__MINX:
        return getMinx();
      case EdjePackage.PART__MINY:
        return getMiny();
      case EdjePackage.PART__TYPE:
        return getType();
      case EdjePackage.PART__DESCRIPTIONS:
        return getDescriptions();
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
      case EdjePackage.PART__NAME:
        setName((String)newValue);
        return;
      case EdjePackage.PART__MINX:
        setMinx((Integer)newValue);
        return;
      case EdjePackage.PART__MINY:
        setMiny((Integer)newValue);
        return;
      case EdjePackage.PART__TYPE:
        setType((String)newValue);
        return;
      case EdjePackage.PART__DESCRIPTIONS:
        getDescriptions().clear();
        getDescriptions().addAll((Collection<? extends Description>)newValue);
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
      case EdjePackage.PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EdjePackage.PART__MINX:
        setMinx(MINX_EDEFAULT);
        return;
      case EdjePackage.PART__MINY:
        setMiny(MINY_EDEFAULT);
        return;
      case EdjePackage.PART__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case EdjePackage.PART__DESCRIPTIONS:
        getDescriptions().clear();
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
      case EdjePackage.PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EdjePackage.PART__MINX:
        return minx != MINX_EDEFAULT;
      case EdjePackage.PART__MINY:
        return miny != MINY_EDEFAULT;
      case EdjePackage.PART__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case EdjePackage.PART__DESCRIPTIONS:
        return descriptions != null && !descriptions.isEmpty();
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
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //PartImpl
