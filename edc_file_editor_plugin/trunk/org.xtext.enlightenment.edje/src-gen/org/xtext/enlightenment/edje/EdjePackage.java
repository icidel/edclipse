/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.enlightenment.edje;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.enlightenment.edje.EdjeFactory
 * @model kind="package"
 * @generated
 */
public interface EdjePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "edje";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/enlightenment/Edje";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "edje";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EdjePackage eINSTANCE = org.xtext.enlightenment.edje.impl.EdjePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.ModelImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INCLUDES = 0;

  /**
   * The feature id for the '<em><b>Collections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COLLECTIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.LUA_ScriptImpl <em>LUA Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.LUA_ScriptImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getLUA_Script()
   * @generated
   */
  int LUA_SCRIPT = 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LUA_SCRIPT__CONTENT = 0;

  /**
   * The number of structural features of the '<em>LUA Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LUA_SCRIPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.CollectionsImpl <em>Collections</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.CollectionsImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getCollections()
   * @generated
   */
  int COLLECTIONS = 2;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIONS__GROUPS = 0;

  /**
   * The number of structural features of the '<em>Collections</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.GroupImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getGroup()
   * @generated
   */
  int GROUP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Minx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__MINX = 1;

  /**
   * The feature id for the '<em><b>Miny</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__MINY = 2;

  /**
   * The feature id for the '<em><b>Part</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__PART = 3;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__PROGRAM = 4;

  /**
   * The feature id for the '<em><b>Lua script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__LUA_SCRIPT = 5;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.PartImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getPart()
   * @generated
   */
  int PART = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAME = 0;

  /**
   * The feature id for the '<em><b>Minx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__MINX = 1;

  /**
   * The feature id for the '<em><b>Miny</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__MINY = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__TYPE = 3;

  /**
   * The feature id for the '<em><b>Descriptions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__DESCRIPTIONS = 4;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.DescriptionImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 5;

  /**
   * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__COORDINATES = 0;

  /**
   * The feature id for the '<em><b>Red</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__RED = 1;

  /**
   * The feature id for the '<em><b>Green</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__GREEN = 2;

  /**
   * The feature id for the '<em><b>Blue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__BLUE = 3;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__ALPHA = 4;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.CoordinatesImpl <em>Coordinates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.CoordinatesImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getCoordinates()
   * @generated
   */
  int COORDINATES = 6;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES__Y = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES__WIDTH = 2;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES__HEIGHT = 3;

  /**
   * The number of structural features of the '<em>Coordinates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.ProgramsImpl <em>Programs</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.ProgramsImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getPrograms()
   * @generated
   */
  int PROGRAMS = 7;

  /**
   * The feature id for the '<em><b>Program</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMS__PROGRAM = 0;

  /**
   * The number of structural features of the '<em>Programs</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.ProgramImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Signal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SIGNAL = 1;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SOURCE = 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__ACTION = 3;

  /**
   * The feature id for the '<em><b>Lua script</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__LUA_SCRIPT = 4;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.enlightenment.edje.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.enlightenment.edje.impl.ActionImpl
   * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getAction()
   * @generated
   */
  int ACTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.enlightenment.edje.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.enlightenment.edje.Model#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Includes</em>'.
   * @see org.xtext.enlightenment.edje.Model#getIncludes()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.enlightenment.edje.Model#getCollections <em>Collections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Collections</em>'.
   * @see org.xtext.enlightenment.edje.Model#getCollections()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Collections();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.LUA_Script <em>LUA Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LUA Script</em>'.
   * @see org.xtext.enlightenment.edje.LUA_Script
   * @generated
   */
  EClass getLUA_Script();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.LUA_Script#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.enlightenment.edje.LUA_Script#getContent()
   * @see #getLUA_Script()
   * @generated
   */
  EAttribute getLUA_Script_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Collections <em>Collections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collections</em>'.
   * @see org.xtext.enlightenment.edje.Collections
   * @generated
   */
  EClass getCollections();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.enlightenment.edje.Collections#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see org.xtext.enlightenment.edje.Collections#getGroups()
   * @see #getCollections()
   * @generated
   */
  EReference getCollections_Groups();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see org.xtext.enlightenment.edje.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.enlightenment.edje.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Group#getMinx <em>Minx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minx</em>'.
   * @see org.xtext.enlightenment.edje.Group#getMinx()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Minx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Group#getMiny <em>Miny</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Miny</em>'.
   * @see org.xtext.enlightenment.edje.Group#getMiny()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Miny();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.enlightenment.edje.Group#getPart <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Part</em>'.
   * @see org.xtext.enlightenment.edje.Group#getPart()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Part();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.enlightenment.edje.Group#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Program</em>'.
   * @see org.xtext.enlightenment.edje.Group#getProgram()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Program();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.enlightenment.edje.Group#getLua_script <em>Lua script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lua script</em>'.
   * @see org.xtext.enlightenment.edje.Group#getLua_script()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Lua_script();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see org.xtext.enlightenment.edje.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Part#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.enlightenment.edje.Part#getName()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Part#getMinx <em>Minx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minx</em>'.
   * @see org.xtext.enlightenment.edje.Part#getMinx()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Minx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Part#getMiny <em>Miny</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Miny</em>'.
   * @see org.xtext.enlightenment.edje.Part#getMiny()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Miny();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Part#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.enlightenment.edje.Part#getType()
   * @see #getPart()
   * @generated
   */
  EAttribute getPart_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.enlightenment.edje.Part#getDescriptions <em>Descriptions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Descriptions</em>'.
   * @see org.xtext.enlightenment.edje.Part#getDescriptions()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Descriptions();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see org.xtext.enlightenment.edje.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.enlightenment.edje.Description#getCoordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coordinates</em>'.
   * @see org.xtext.enlightenment.edje.Description#getCoordinates()
   * @see #getDescription()
   * @generated
   */
  EReference getDescription_Coordinates();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Description#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Red</em>'.
   * @see org.xtext.enlightenment.edje.Description#getRed()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Red();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Description#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Green</em>'.
   * @see org.xtext.enlightenment.edje.Description#getGreen()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Green();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Description#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blue</em>'.
   * @see org.xtext.enlightenment.edje.Description#getBlue()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Blue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Description#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alpha</em>'.
   * @see org.xtext.enlightenment.edje.Description#getAlpha()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Alpha();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Coordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coordinates</em>'.
   * @see org.xtext.enlightenment.edje.Coordinates
   * @generated
   */
  EClass getCoordinates();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Coordinates#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.xtext.enlightenment.edje.Coordinates#getX()
   * @see #getCoordinates()
   * @generated
   */
  EAttribute getCoordinates_X();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Coordinates#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.xtext.enlightenment.edje.Coordinates#getY()
   * @see #getCoordinates()
   * @generated
   */
  EAttribute getCoordinates_Y();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Coordinates#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.xtext.enlightenment.edje.Coordinates#getWidth()
   * @see #getCoordinates()
   * @generated
   */
  EAttribute getCoordinates_Width();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Coordinates#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.xtext.enlightenment.edje.Coordinates#getHeight()
   * @see #getCoordinates()
   * @generated
   */
  EAttribute getCoordinates_Height();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Programs <em>Programs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Programs</em>'.
   * @see org.xtext.enlightenment.edje.Programs
   * @generated
   */
  EClass getPrograms();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.enlightenment.edje.Programs#getProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Program</em>'.
   * @see org.xtext.enlightenment.edje.Programs#getProgram()
   * @see #getPrograms()
   * @generated
   */
  EReference getPrograms_Program();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.xtext.enlightenment.edje.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.enlightenment.edje.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Program#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signal</em>'.
   * @see org.xtext.enlightenment.edje.Program#getSignal()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Signal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Program#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.xtext.enlightenment.edje.Program#getSource()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.enlightenment.edje.Program#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.enlightenment.edje.Program#getAction()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.enlightenment.edje.Program#getLua_script <em>Lua script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lua script</em>'.
   * @see org.xtext.enlightenment.edje.Program#getLua_script()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Lua_script();

  /**
   * Returns the meta object for class '{@link org.xtext.enlightenment.edje.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.xtext.enlightenment.edje.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.enlightenment.edje.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.enlightenment.edje.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.enlightenment.edje.Action#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Params</em>'.
   * @see org.xtext.enlightenment.edje.Action#getParams()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Params();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EdjeFactory getEdjeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.ModelImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__INCLUDES = eINSTANCE.getModel_Includes();

    /**
     * The meta object literal for the '<em><b>Collections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COLLECTIONS = eINSTANCE.getModel_Collections();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.LUA_ScriptImpl <em>LUA Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.LUA_ScriptImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getLUA_Script()
     * @generated
     */
    EClass LUA_SCRIPT = eINSTANCE.getLUA_Script();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LUA_SCRIPT__CONTENT = eINSTANCE.getLUA_Script_Content();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.CollectionsImpl <em>Collections</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.CollectionsImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getCollections()
     * @generated
     */
    EClass COLLECTIONS = eINSTANCE.getCollections();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTIONS__GROUPS = eINSTANCE.getCollections_Groups();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.GroupImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Minx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__MINX = eINSTANCE.getGroup_Minx();

    /**
     * The meta object literal for the '<em><b>Miny</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__MINY = eINSTANCE.getGroup_Miny();

    /**
     * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__PART = eINSTANCE.getGroup_Part();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__PROGRAM = eINSTANCE.getGroup_Program();

    /**
     * The meta object literal for the '<em><b>Lua script</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__LUA_SCRIPT = eINSTANCE.getGroup_Lua_script();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.PartImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__NAME = eINSTANCE.getPart_Name();

    /**
     * The meta object literal for the '<em><b>Minx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__MINX = eINSTANCE.getPart_Minx();

    /**
     * The meta object literal for the '<em><b>Miny</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__MINY = eINSTANCE.getPart_Miny();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PART__TYPE = eINSTANCE.getPart_Type();

    /**
     * The meta object literal for the '<em><b>Descriptions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__DESCRIPTIONS = eINSTANCE.getPart_Descriptions();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.DescriptionImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION__COORDINATES = eINSTANCE.getDescription_Coordinates();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__RED = eINSTANCE.getDescription_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__GREEN = eINSTANCE.getDescription_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__BLUE = eINSTANCE.getDescription_Blue();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__ALPHA = eINSTANCE.getDescription_Alpha();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.CoordinatesImpl <em>Coordinates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.CoordinatesImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getCoordinates()
     * @generated
     */
    EClass COORDINATES = eINSTANCE.getCoordinates();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATES__X = eINSTANCE.getCoordinates_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATES__Y = eINSTANCE.getCoordinates_Y();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATES__WIDTH = eINSTANCE.getCoordinates_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COORDINATES__HEIGHT = eINSTANCE.getCoordinates_Height();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.ProgramsImpl <em>Programs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.ProgramsImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getPrograms()
     * @generated
     */
    EClass PROGRAMS = eINSTANCE.getPrograms();

    /**
     * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAMS__PROGRAM = eINSTANCE.getPrograms_Program();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.ProgramImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__SIGNAL = eINSTANCE.getProgram_Signal();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__SOURCE = eINSTANCE.getProgram_Source();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__ACTION = eINSTANCE.getProgram_Action();

    /**
     * The meta object literal for the '<em><b>Lua script</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__LUA_SCRIPT = eINSTANCE.getProgram_Lua_script();

    /**
     * The meta object literal for the '{@link org.xtext.enlightenment.edje.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.enlightenment.edje.impl.ActionImpl
     * @see org.xtext.enlightenment.edje.impl.EdjePackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__PARAMS = eINSTANCE.getAction_Params();

  }

} //EdjePackage
