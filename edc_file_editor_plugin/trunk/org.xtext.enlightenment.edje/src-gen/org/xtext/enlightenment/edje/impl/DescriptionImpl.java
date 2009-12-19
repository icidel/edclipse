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

import org.xtext.enlightenment.edje.Coordinates;
import org.xtext.enlightenment.edje.Description;
import org.xtext.enlightenment.edje.EdjePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.enlightenment.edje.impl.DescriptionImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.DescriptionImpl#getRed <em>Red</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.DescriptionImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.DescriptionImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.xtext.enlightenment.edje.impl.DescriptionImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description
{
  /**
   * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoordinates()
   * @generated
   * @ordered
   */
  protected Coordinates coordinates;

  /**
   * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRed()
   * @generated
   * @ordered
   */
  protected static final int RED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRed()
   * @generated
   * @ordered
   */
  protected int red = RED_EDEFAULT;

  /**
   * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreen()
   * @generated
   * @ordered
   */
  protected static final int GREEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreen()
   * @generated
   * @ordered
   */
  protected int green = GREEN_EDEFAULT;

  /**
   * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlue()
   * @generated
   * @ordered
   */
  protected static final int BLUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlue()
   * @generated
   * @ordered
   */
  protected int blue = BLUE_EDEFAULT;

  /**
   * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected static final int ALPHA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected int alpha = ALPHA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionImpl()
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
    return EdjePackage.Literals.DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coordinates getCoordinates()
  {
    return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoordinates(Coordinates newCoordinates, NotificationChain msgs)
  {
    Coordinates oldCoordinates = coordinates;
    coordinates = newCoordinates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdjePackage.DESCRIPTION__COORDINATES, oldCoordinates, newCoordinates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoordinates(Coordinates newCoordinates)
  {
    if (newCoordinates != coordinates)
    {
      NotificationChain msgs = null;
      if (coordinates != null)
        msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdjePackage.DESCRIPTION__COORDINATES, null, msgs);
      if (newCoordinates != null)
        msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdjePackage.DESCRIPTION__COORDINATES, null, msgs);
      msgs = basicSetCoordinates(newCoordinates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.DESCRIPTION__COORDINATES, newCoordinates, newCoordinates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRed()
  {
    return red;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRed(int newRed)
  {
    int oldRed = red;
    red = newRed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.DESCRIPTION__RED, oldRed, red));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGreen()
  {
    return green;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreen(int newGreen)
  {
    int oldGreen = green;
    green = newGreen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.DESCRIPTION__GREEN, oldGreen, green));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBlue()
  {
    return blue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlue(int newBlue)
  {
    int oldBlue = blue;
    blue = newBlue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.DESCRIPTION__BLUE, oldBlue, blue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlpha(int newAlpha)
  {
    int oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EdjePackage.DESCRIPTION__ALPHA, oldAlpha, alpha));
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
      case EdjePackage.DESCRIPTION__COORDINATES:
        return basicSetCoordinates(null, msgs);
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
      case EdjePackage.DESCRIPTION__COORDINATES:
        return getCoordinates();
      case EdjePackage.DESCRIPTION__RED:
        return getRed();
      case EdjePackage.DESCRIPTION__GREEN:
        return getGreen();
      case EdjePackage.DESCRIPTION__BLUE:
        return getBlue();
      case EdjePackage.DESCRIPTION__ALPHA:
        return getAlpha();
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
      case EdjePackage.DESCRIPTION__COORDINATES:
        setCoordinates((Coordinates)newValue);
        return;
      case EdjePackage.DESCRIPTION__RED:
        setRed((Integer)newValue);
        return;
      case EdjePackage.DESCRIPTION__GREEN:
        setGreen((Integer)newValue);
        return;
      case EdjePackage.DESCRIPTION__BLUE:
        setBlue((Integer)newValue);
        return;
      case EdjePackage.DESCRIPTION__ALPHA:
        setAlpha((Integer)newValue);
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
      case EdjePackage.DESCRIPTION__COORDINATES:
        setCoordinates((Coordinates)null);
        return;
      case EdjePackage.DESCRIPTION__RED:
        setRed(RED_EDEFAULT);
        return;
      case EdjePackage.DESCRIPTION__GREEN:
        setGreen(GREEN_EDEFAULT);
        return;
      case EdjePackage.DESCRIPTION__BLUE:
        setBlue(BLUE_EDEFAULT);
        return;
      case EdjePackage.DESCRIPTION__ALPHA:
        setAlpha(ALPHA_EDEFAULT);
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
      case EdjePackage.DESCRIPTION__COORDINATES:
        return coordinates != null;
      case EdjePackage.DESCRIPTION__RED:
        return red != RED_EDEFAULT;
      case EdjePackage.DESCRIPTION__GREEN:
        return green != GREEN_EDEFAULT;
      case EdjePackage.DESCRIPTION__BLUE:
        return blue != BLUE_EDEFAULT;
      case EdjePackage.DESCRIPTION__ALPHA:
        return alpha != ALPHA_EDEFAULT;
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
    result.append(" (red: ");
    result.append(red);
    result.append(", green: ");
    result.append(green);
    result.append(", blue: ");
    result.append(blue);
    result.append(", alpha: ");
    result.append(alpha);
    result.append(')');
    return result.toString();
  }

} //DescriptionImpl
