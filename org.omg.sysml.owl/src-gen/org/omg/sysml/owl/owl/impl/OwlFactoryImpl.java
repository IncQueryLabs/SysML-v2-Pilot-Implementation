/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.omg.sysml.owl.owl.Annotation;
import org.omg.sysml.owl.owl.AnnotationAssertion;
import org.omg.sysml.owl.owl.AnnotationAxiom;
import org.omg.sysml.owl.owl.AnnotationProperty;
import org.omg.sysml.owl.owl.AnnotationPropertyDomain;
import org.omg.sysml.owl.owl.AnnotationPropertyRange;
import org.omg.sysml.owl.owl.AnnotationSubject;
import org.omg.sysml.owl.owl.AnnotationValue;
import org.omg.sysml.owl.owl.AnonymousIndividual;
import org.omg.sysml.owl.owl.AnonymousIndividualReference;
import org.omg.sysml.owl.owl.Assertion;
import org.omg.sysml.owl.owl.AsymmetricObjectProperty;
import org.omg.sysml.owl.owl.Axiom;
import org.omg.sysml.owl.owl.ClassAssertion;
import org.omg.sysml.owl.owl.ClassAxiom;
import org.omg.sysml.owl.owl.ClassExpression;
import org.omg.sysml.owl.owl.ClassReference;
import org.omg.sysml.owl.owl.DataAllValuesFrom;
import org.omg.sysml.owl.owl.DataComplementOf;
import org.omg.sysml.owl.owl.DataExactCardinality;
import org.omg.sysml.owl.owl.DataHasValue;
import org.omg.sysml.owl.owl.DataIntersectionOf;
import org.omg.sysml.owl.owl.DataMaxCardinality;
import org.omg.sysml.owl.owl.DataMinCardinality;
import org.omg.sysml.owl.owl.DataOneOf;
import org.omg.sysml.owl.owl.DataProperty;
import org.omg.sysml.owl.owl.DataPropertyAssertion;
import org.omg.sysml.owl.owl.DataPropertyAxiom;
import org.omg.sysml.owl.owl.DataPropertyDomain;
import org.omg.sysml.owl.owl.DataPropertyExpression;
import org.omg.sysml.owl.owl.DataPropertyRange;
import org.omg.sysml.owl.owl.DataPropertyReference;
import org.omg.sysml.owl.owl.DataRange;
import org.omg.sysml.owl.owl.DataSomeValuesFrom;
import org.omg.sysml.owl.owl.DataUnionOf;
import org.omg.sysml.owl.owl.Datatype;
import org.omg.sysml.owl.owl.DatatypeDefinition;
import org.omg.sysml.owl.owl.DatatypeReference;
import org.omg.sysml.owl.owl.DatatypeRestriction;
import org.omg.sysml.owl.owl.Declaration;
import org.omg.sysml.owl.owl.DifferentIndividuals;
import org.omg.sysml.owl.owl.DisjointClasses;
import org.omg.sysml.owl.owl.DisjointDataProperties;
import org.omg.sysml.owl.owl.DisjointObjectProperties;
import org.omg.sysml.owl.owl.DisjointUnion;
import org.omg.sysml.owl.owl.Entity;
import org.omg.sysml.owl.owl.EquivalentClasses;
import org.omg.sysml.owl.owl.EquivalentDataProperties;
import org.omg.sysml.owl.owl.EquivalentObjectProperties;
import org.omg.sysml.owl.owl.FacetRestriction;
import org.omg.sysml.owl.owl.FunctionalDataProperty;
import org.omg.sysml.owl.owl.FunctionalObjectProperty;
import org.omg.sysml.owl.owl.HasKey;
import org.omg.sysml.owl.owl.Individual;
import org.omg.sysml.owl.owl.IndividualReference;
import org.omg.sysml.owl.owl.InverseFunctionalObjectProperty;
import org.omg.sysml.owl.owl.InverseObjectProperties;
import org.omg.sysml.owl.owl.InverseObjectProperty;
import org.omg.sysml.owl.owl.IrreflexiveObjectProperty;
import org.omg.sysml.owl.owl.Literal;
import org.omg.sysml.owl.owl.NamedIndividual;
import org.omg.sysml.owl.owl.NamedIndividualReference;
import org.omg.sysml.owl.owl.NegativeDataPropertyAssertion;
import org.omg.sysml.owl.owl.NegativeObjectPropertyAssertion;
import org.omg.sysml.owl.owl.ObjectAllValuesFrom;
import org.omg.sysml.owl.owl.ObjectComplementOf;
import org.omg.sysml.owl.owl.ObjectExactCardinality;
import org.omg.sysml.owl.owl.ObjectHasSelf;
import org.omg.sysml.owl.owl.ObjectHasValue;
import org.omg.sysml.owl.owl.ObjectIntersectionOf;
import org.omg.sysml.owl.owl.ObjectMaxCardinality;
import org.omg.sysml.owl.owl.ObjectMinCardinality;
import org.omg.sysml.owl.owl.ObjectOneOf;
import org.omg.sysml.owl.owl.ObjectProperty;
import org.omg.sysml.owl.owl.ObjectPropertyAssertion;
import org.omg.sysml.owl.owl.ObjectPropertyAxiom;
import org.omg.sysml.owl.owl.ObjectPropertyDomain;
import org.omg.sysml.owl.owl.ObjectPropertyExpression;
import org.omg.sysml.owl.owl.ObjectPropertyRange;
import org.omg.sysml.owl.owl.ObjectPropertyReference;
import org.omg.sysml.owl.owl.ObjectSomeValuesFrom;
import org.omg.sysml.owl.owl.ObjectUnionOf;
import org.omg.sysml.owl.owl.Ontology;
import org.omg.sysml.owl.owl.OntologyDocument;
import org.omg.sysml.owl.owl.OntologyFile;
import org.omg.sysml.owl.owl.OwlFactory;
import org.omg.sysml.owl.owl.OwlPackage;
import org.omg.sysml.owl.owl.PrefixDeclaration;
import org.omg.sysml.owl.owl.ReflexiveObjectProperty;
import org.omg.sysml.owl.owl.SameIndividual;
import org.omg.sysml.owl.owl.StringLiteral;
import org.omg.sysml.owl.owl.SubAnnotationPropertyOf;
import org.omg.sysml.owl.owl.SubClassOf;
import org.omg.sysml.owl.owl.SubDataPropertyOf;
import org.omg.sysml.owl.owl.SubObjectPropertyOf;
import org.omg.sysml.owl.owl.SymmetricObjectProperty;
import org.omg.sysml.owl.owl.TransitiveObjectProperty;
import org.omg.sysml.owl.owl.TypedLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwlFactoryImpl extends EFactoryImpl implements OwlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OwlFactory init()
  {
    try
    {
      OwlFactory theOwlFactory = (OwlFactory)EPackage.Registry.INSTANCE.getEFactory(OwlPackage.eNS_URI);
      if (theOwlFactory != null)
      {
        return theOwlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OwlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OwlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OwlPackage.ONTOLOGY_FILE: return createOntologyFile();
      case OwlPackage.ONTOLOGY_DOCUMENT: return createOntologyDocument();
      case OwlPackage.PREFIX_DECLARATION: return createPrefixDeclaration();
      case OwlPackage.ONTOLOGY: return createOntology();
      case OwlPackage.ENTITY: return createEntity();
      case OwlPackage.CLASS: return createClass();
      case OwlPackage.DATATYPE: return createDatatype();
      case OwlPackage.OBJECT_PROPERTY: return createObjectProperty();
      case OwlPackage.DATA_PROPERTY: return createDataProperty();
      case OwlPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
      case OwlPackage.INDIVIDUAL: return createIndividual();
      case OwlPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
      case OwlPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
      case OwlPackage.LITERAL: return createLiteral();
      case OwlPackage.TYPED_LITERAL: return createTypedLiteral();
      case OwlPackage.STRING_LITERAL: return createStringLiteral();
      case OwlPackage.DECLARATION: return createDeclaration();
      case OwlPackage.OBJECT_PROPERTY_EXPRESSION: return createObjectPropertyExpression();
      case OwlPackage.OBJECT_PROPERTY_REFERENCE: return createObjectPropertyReference();
      case OwlPackage.INVERSE_OBJECT_PROPERTY: return createInverseObjectProperty();
      case OwlPackage.DATA_PROPERTY_EXPRESSION: return createDataPropertyExpression();
      case OwlPackage.DATA_PROPERTY_REFERENCE: return createDataPropertyReference();
      case OwlPackage.DATA_RANGE: return createDataRange();
      case OwlPackage.DATATYPE_REFERENCE: return createDatatypeReference();
      case OwlPackage.DATA_INTERSECTION_OF: return createDataIntersectionOf();
      case OwlPackage.DATA_UNION_OF: return createDataUnionOf();
      case OwlPackage.DATA_COMPLEMENT_OF: return createDataComplementOf();
      case OwlPackage.DATA_ONE_OF: return createDataOneOf();
      case OwlPackage.DATATYPE_RESTRICTION: return createDatatypeRestriction();
      case OwlPackage.FACET_RESTRICTION: return createFacetRestriction();
      case OwlPackage.CLASS_EXPRESSION: return createClassExpression();
      case OwlPackage.CLASS_REFERENCE: return createClassReference();
      case OwlPackage.OBJECT_INTERSECTION_OF: return createObjectIntersectionOf();
      case OwlPackage.OBJECT_UNION_OF: return createObjectUnionOf();
      case OwlPackage.OBJECT_COMPLEMENT_OF: return createObjectComplementOf();
      case OwlPackage.OBJECT_ONE_OF: return createObjectOneOf();
      case OwlPackage.INDIVIDUAL_REFERENCE: return createIndividualReference();
      case OwlPackage.NAMED_INDIVIDUAL_REFERENCE: return createNamedIndividualReference();
      case OwlPackage.ANONYMOUS_INDIVIDUAL_REFERENCE: return createAnonymousIndividualReference();
      case OwlPackage.OBJECT_SOME_VALUES_FROM: return createObjectSomeValuesFrom();
      case OwlPackage.OBJECT_ALL_VALUES_FROM: return createObjectAllValuesFrom();
      case OwlPackage.OBJECT_HAS_VALUE: return createObjectHasValue();
      case OwlPackage.OBJECT_HAS_SELF: return createObjectHasSelf();
      case OwlPackage.OBJECT_MIN_CARDINALITY: return createObjectMinCardinality();
      case OwlPackage.OBJECT_MAX_CARDINALITY: return createObjectMaxCardinality();
      case OwlPackage.OBJECT_EXACT_CARDINALITY: return createObjectExactCardinality();
      case OwlPackage.DATA_SOME_VALUES_FROM: return createDataSomeValuesFrom();
      case OwlPackage.DATA_ALL_VALUES_FROM: return createDataAllValuesFrom();
      case OwlPackage.DATA_HAS_VALUE: return createDataHasValue();
      case OwlPackage.DATA_MIN_CARDINALITY: return createDataMinCardinality();
      case OwlPackage.DATA_MAX_CARDINALITY: return createDataMaxCardinality();
      case OwlPackage.DATA_EXACT_CARDINALITY: return createDataExactCardinality();
      case OwlPackage.AXIOM: return createAxiom();
      case OwlPackage.CLASS_AXIOM: return createClassAxiom();
      case OwlPackage.SUB_CLASS_OF: return createSubClassOf();
      case OwlPackage.EQUIVALENT_CLASSES: return createEquivalentClasses();
      case OwlPackage.DISJOINT_CLASSES: return createDisjointClasses();
      case OwlPackage.DISJOINT_UNION: return createDisjointUnion();
      case OwlPackage.OBJECT_PROPERTY_AXIOM: return createObjectPropertyAxiom();
      case OwlPackage.SUB_OBJECT_PROPERTY_OF: return createSubObjectPropertyOf();
      case OwlPackage.EQUIVALENT_OBJECT_PROPERTIES: return createEquivalentObjectProperties();
      case OwlPackage.DISJOINT_OBJECT_PROPERTIES: return createDisjointObjectProperties();
      case OwlPackage.INVERSE_OBJECT_PROPERTIES: return createInverseObjectProperties();
      case OwlPackage.OBJECT_PROPERTY_DOMAIN: return createObjectPropertyDomain();
      case OwlPackage.OBJECT_PROPERTY_RANGE: return createObjectPropertyRange();
      case OwlPackage.FUNCTIONAL_OBJECT_PROPERTY: return createFunctionalObjectProperty();
      case OwlPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY: return createInverseFunctionalObjectProperty();
      case OwlPackage.REFLEXIVE_OBJECT_PROPERTY: return createReflexiveObjectProperty();
      case OwlPackage.IRREFLEXIVE_OBJECT_PROPERTY: return createIrreflexiveObjectProperty();
      case OwlPackage.SYMMETRIC_OBJECT_PROPERTY: return createSymmetricObjectProperty();
      case OwlPackage.ASYMMETRIC_OBJECT_PROPERTY: return createAsymmetricObjectProperty();
      case OwlPackage.TRANSITIVE_OBJECT_PROPERTY: return createTransitiveObjectProperty();
      case OwlPackage.DATA_PROPERTY_AXIOM: return createDataPropertyAxiom();
      case OwlPackage.SUB_DATA_PROPERTY_OF: return createSubDataPropertyOf();
      case OwlPackage.EQUIVALENT_DATA_PROPERTIES: return createEquivalentDataProperties();
      case OwlPackage.DISJOINT_DATA_PROPERTIES: return createDisjointDataProperties();
      case OwlPackage.DATA_PROPERTY_DOMAIN: return createDataPropertyDomain();
      case OwlPackage.DATA_PROPERTY_RANGE: return createDataPropertyRange();
      case OwlPackage.FUNCTIONAL_DATA_PROPERTY: return createFunctionalDataProperty();
      case OwlPackage.DATATYPE_DEFINITION: return createDatatypeDefinition();
      case OwlPackage.HAS_KEY: return createHasKey();
      case OwlPackage.ASSERTION: return createAssertion();
      case OwlPackage.SAME_INDIVIDUAL: return createSameIndividual();
      case OwlPackage.DIFFERENT_INDIVIDUALS: return createDifferentIndividuals();
      case OwlPackage.CLASS_ASSERTION: return createClassAssertion();
      case OwlPackage.OBJECT_PROPERTY_ASSERTION: return createObjectPropertyAssertion();
      case OwlPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION: return createNegativeObjectPropertyAssertion();
      case OwlPackage.DATA_PROPERTY_ASSERTION: return createDataPropertyAssertion();
      case OwlPackage.NEGATIVE_DATA_PROPERTY_ASSERTION: return createNegativeDataPropertyAssertion();
      case OwlPackage.ANNOTATION: return createAnnotation();
      case OwlPackage.ANNOTATION_VALUE: return createAnnotationValue();
      case OwlPackage.ANNOTATION_AXIOM: return createAnnotationAxiom();
      case OwlPackage.ANNOTATION_ASSERTION: return createAnnotationAssertion();
      case OwlPackage.ANNOTATION_SUBJECT: return createAnnotationSubject();
      case OwlPackage.SUB_ANNOTATION_PROPERTY_OF: return createSubAnnotationPropertyOf();
      case OwlPackage.ANNOTATION_PROPERTY_DOMAIN: return createAnnotationPropertyDomain();
      case OwlPackage.ANNOTATION_PROPERTY_RANGE: return createAnnotationPropertyRange();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OntologyFile createOntologyFile()
  {
    OntologyFileImpl ontologyFile = new OntologyFileImpl();
    return ontologyFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OntologyDocument createOntologyDocument()
  {
    OntologyDocumentImpl ontologyDocument = new OntologyDocumentImpl();
    return ontologyDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixDeclaration createPrefixDeclaration()
  {
    PrefixDeclarationImpl prefixDeclaration = new PrefixDeclarationImpl();
    return prefixDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ontology createOntology()
  {
    OntologyImpl ontology = new OntologyImpl();
    return ontology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.omg.sysml.owl.owl.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datatype createDatatype()
  {
    DatatypeImpl datatype = new DatatypeImpl();
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectProperty createObjectProperty()
  {
    ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
    return objectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataProperty createDataProperty()
  {
    DataPropertyImpl dataProperty = new DataPropertyImpl();
    return dataProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationProperty createAnnotationProperty()
  {
    AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
    return annotationProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Individual createIndividual()
  {
    IndividualImpl individual = new IndividualImpl();
    return individual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedIndividual createNamedIndividual()
  {
    NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
    return namedIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousIndividual createAnonymousIndividual()
  {
    AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
    return anonymousIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedLiteral createTypedLiteral()
  {
    TypedLiteralImpl typedLiteral = new TypedLiteralImpl();
    return typedLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyExpression createObjectPropertyExpression()
  {
    ObjectPropertyExpressionImpl objectPropertyExpression = new ObjectPropertyExpressionImpl();
    return objectPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyReference createObjectPropertyReference()
  {
    ObjectPropertyReferenceImpl objectPropertyReference = new ObjectPropertyReferenceImpl();
    return objectPropertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InverseObjectProperty createInverseObjectProperty()
  {
    InverseObjectPropertyImpl inverseObjectProperty = new InverseObjectPropertyImpl();
    return inverseObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyExpression createDataPropertyExpression()
  {
    DataPropertyExpressionImpl dataPropertyExpression = new DataPropertyExpressionImpl();
    return dataPropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyReference createDataPropertyReference()
  {
    DataPropertyReferenceImpl dataPropertyReference = new DataPropertyReferenceImpl();
    return dataPropertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataRange createDataRange()
  {
    DataRangeImpl dataRange = new DataRangeImpl();
    return dataRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeReference createDatatypeReference()
  {
    DatatypeReferenceImpl datatypeReference = new DatatypeReferenceImpl();
    return datatypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataIntersectionOf createDataIntersectionOf()
  {
    DataIntersectionOfImpl dataIntersectionOf = new DataIntersectionOfImpl();
    return dataIntersectionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataUnionOf createDataUnionOf()
  {
    DataUnionOfImpl dataUnionOf = new DataUnionOfImpl();
    return dataUnionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataComplementOf createDataComplementOf()
  {
    DataComplementOfImpl dataComplementOf = new DataComplementOfImpl();
    return dataComplementOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataOneOf createDataOneOf()
  {
    DataOneOfImpl dataOneOf = new DataOneOfImpl();
    return dataOneOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeRestriction createDatatypeRestriction()
  {
    DatatypeRestrictionImpl datatypeRestriction = new DatatypeRestrictionImpl();
    return datatypeRestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FacetRestriction createFacetRestriction()
  {
    FacetRestrictionImpl facetRestriction = new FacetRestrictionImpl();
    return facetRestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassExpression createClassExpression()
  {
    ClassExpressionImpl classExpression = new ClassExpressionImpl();
    return classExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassReference createClassReference()
  {
    ClassReferenceImpl classReference = new ClassReferenceImpl();
    return classReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectIntersectionOf createObjectIntersectionOf()
  {
    ObjectIntersectionOfImpl objectIntersectionOf = new ObjectIntersectionOfImpl();
    return objectIntersectionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectUnionOf createObjectUnionOf()
  {
    ObjectUnionOfImpl objectUnionOf = new ObjectUnionOfImpl();
    return objectUnionOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectComplementOf createObjectComplementOf()
  {
    ObjectComplementOfImpl objectComplementOf = new ObjectComplementOfImpl();
    return objectComplementOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectOneOf createObjectOneOf()
  {
    ObjectOneOfImpl objectOneOf = new ObjectOneOfImpl();
    return objectOneOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndividualReference createIndividualReference()
  {
    IndividualReferenceImpl individualReference = new IndividualReferenceImpl();
    return individualReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedIndividualReference createNamedIndividualReference()
  {
    NamedIndividualReferenceImpl namedIndividualReference = new NamedIndividualReferenceImpl();
    return namedIndividualReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousIndividualReference createAnonymousIndividualReference()
  {
    AnonymousIndividualReferenceImpl anonymousIndividualReference = new AnonymousIndividualReferenceImpl();
    return anonymousIndividualReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectSomeValuesFrom createObjectSomeValuesFrom()
  {
    ObjectSomeValuesFromImpl objectSomeValuesFrom = new ObjectSomeValuesFromImpl();
    return objectSomeValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectAllValuesFrom createObjectAllValuesFrom()
  {
    ObjectAllValuesFromImpl objectAllValuesFrom = new ObjectAllValuesFromImpl();
    return objectAllValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectHasValue createObjectHasValue()
  {
    ObjectHasValueImpl objectHasValue = new ObjectHasValueImpl();
    return objectHasValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectHasSelf createObjectHasSelf()
  {
    ObjectHasSelfImpl objectHasSelf = new ObjectHasSelfImpl();
    return objectHasSelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectMinCardinality createObjectMinCardinality()
  {
    ObjectMinCardinalityImpl objectMinCardinality = new ObjectMinCardinalityImpl();
    return objectMinCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectMaxCardinality createObjectMaxCardinality()
  {
    ObjectMaxCardinalityImpl objectMaxCardinality = new ObjectMaxCardinalityImpl();
    return objectMaxCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectExactCardinality createObjectExactCardinality()
  {
    ObjectExactCardinalityImpl objectExactCardinality = new ObjectExactCardinalityImpl();
    return objectExactCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataSomeValuesFrom createDataSomeValuesFrom()
  {
    DataSomeValuesFromImpl dataSomeValuesFrom = new DataSomeValuesFromImpl();
    return dataSomeValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAllValuesFrom createDataAllValuesFrom()
  {
    DataAllValuesFromImpl dataAllValuesFrom = new DataAllValuesFromImpl();
    return dataAllValuesFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataHasValue createDataHasValue()
  {
    DataHasValueImpl dataHasValue = new DataHasValueImpl();
    return dataHasValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataMinCardinality createDataMinCardinality()
  {
    DataMinCardinalityImpl dataMinCardinality = new DataMinCardinalityImpl();
    return dataMinCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataMaxCardinality createDataMaxCardinality()
  {
    DataMaxCardinalityImpl dataMaxCardinality = new DataMaxCardinalityImpl();
    return dataMaxCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExactCardinality createDataExactCardinality()
  {
    DataExactCardinalityImpl dataExactCardinality = new DataExactCardinalityImpl();
    return dataExactCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Axiom createAxiom()
  {
    AxiomImpl axiom = new AxiomImpl();
    return axiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAxiom createClassAxiom()
  {
    ClassAxiomImpl classAxiom = new ClassAxiomImpl();
    return classAxiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubClassOf createSubClassOf()
  {
    SubClassOfImpl subClassOf = new SubClassOfImpl();
    return subClassOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquivalentClasses createEquivalentClasses()
  {
    EquivalentClassesImpl equivalentClasses = new EquivalentClassesImpl();
    return equivalentClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointClasses createDisjointClasses()
  {
    DisjointClassesImpl disjointClasses = new DisjointClassesImpl();
    return disjointClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointUnion createDisjointUnion()
  {
    DisjointUnionImpl disjointUnion = new DisjointUnionImpl();
    return disjointUnion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyAxiom createObjectPropertyAxiom()
  {
    ObjectPropertyAxiomImpl objectPropertyAxiom = new ObjectPropertyAxiomImpl();
    return objectPropertyAxiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubObjectPropertyOf createSubObjectPropertyOf()
  {
    SubObjectPropertyOfImpl subObjectPropertyOf = new SubObjectPropertyOfImpl();
    return subObjectPropertyOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquivalentObjectProperties createEquivalentObjectProperties()
  {
    EquivalentObjectPropertiesImpl equivalentObjectProperties = new EquivalentObjectPropertiesImpl();
    return equivalentObjectProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointObjectProperties createDisjointObjectProperties()
  {
    DisjointObjectPropertiesImpl disjointObjectProperties = new DisjointObjectPropertiesImpl();
    return disjointObjectProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InverseObjectProperties createInverseObjectProperties()
  {
    InverseObjectPropertiesImpl inverseObjectProperties = new InverseObjectPropertiesImpl();
    return inverseObjectProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyDomain createObjectPropertyDomain()
  {
    ObjectPropertyDomainImpl objectPropertyDomain = new ObjectPropertyDomainImpl();
    return objectPropertyDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyRange createObjectPropertyRange()
  {
    ObjectPropertyRangeImpl objectPropertyRange = new ObjectPropertyRangeImpl();
    return objectPropertyRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalObjectProperty createFunctionalObjectProperty()
  {
    FunctionalObjectPropertyImpl functionalObjectProperty = new FunctionalObjectPropertyImpl();
    return functionalObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InverseFunctionalObjectProperty createInverseFunctionalObjectProperty()
  {
    InverseFunctionalObjectPropertyImpl inverseFunctionalObjectProperty = new InverseFunctionalObjectPropertyImpl();
    return inverseFunctionalObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflexiveObjectProperty createReflexiveObjectProperty()
  {
    ReflexiveObjectPropertyImpl reflexiveObjectProperty = new ReflexiveObjectPropertyImpl();
    return reflexiveObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IrreflexiveObjectProperty createIrreflexiveObjectProperty()
  {
    IrreflexiveObjectPropertyImpl irreflexiveObjectProperty = new IrreflexiveObjectPropertyImpl();
    return irreflexiveObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymmetricObjectProperty createSymmetricObjectProperty()
  {
    SymmetricObjectPropertyImpl symmetricObjectProperty = new SymmetricObjectPropertyImpl();
    return symmetricObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsymmetricObjectProperty createAsymmetricObjectProperty()
  {
    AsymmetricObjectPropertyImpl asymmetricObjectProperty = new AsymmetricObjectPropertyImpl();
    return asymmetricObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitiveObjectProperty createTransitiveObjectProperty()
  {
    TransitiveObjectPropertyImpl transitiveObjectProperty = new TransitiveObjectPropertyImpl();
    return transitiveObjectProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyAxiom createDataPropertyAxiom()
  {
    DataPropertyAxiomImpl dataPropertyAxiom = new DataPropertyAxiomImpl();
    return dataPropertyAxiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubDataPropertyOf createSubDataPropertyOf()
  {
    SubDataPropertyOfImpl subDataPropertyOf = new SubDataPropertyOfImpl();
    return subDataPropertyOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquivalentDataProperties createEquivalentDataProperties()
  {
    EquivalentDataPropertiesImpl equivalentDataProperties = new EquivalentDataPropertiesImpl();
    return equivalentDataProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisjointDataProperties createDisjointDataProperties()
  {
    DisjointDataPropertiesImpl disjointDataProperties = new DisjointDataPropertiesImpl();
    return disjointDataProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyDomain createDataPropertyDomain()
  {
    DataPropertyDomainImpl dataPropertyDomain = new DataPropertyDomainImpl();
    return dataPropertyDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyRange createDataPropertyRange()
  {
    DataPropertyRangeImpl dataPropertyRange = new DataPropertyRangeImpl();
    return dataPropertyRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalDataProperty createFunctionalDataProperty()
  {
    FunctionalDataPropertyImpl functionalDataProperty = new FunctionalDataPropertyImpl();
    return functionalDataProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatatypeDefinition createDatatypeDefinition()
  {
    DatatypeDefinitionImpl datatypeDefinition = new DatatypeDefinitionImpl();
    return datatypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HasKey createHasKey()
  {
    HasKeyImpl hasKey = new HasKeyImpl();
    return hasKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SameIndividual createSameIndividual()
  {
    SameIndividualImpl sameIndividual = new SameIndividualImpl();
    return sameIndividual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DifferentIndividuals createDifferentIndividuals()
  {
    DifferentIndividualsImpl differentIndividuals = new DifferentIndividualsImpl();
    return differentIndividuals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassAssertion createClassAssertion()
  {
    ClassAssertionImpl classAssertion = new ClassAssertionImpl();
    return classAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObjectPropertyAssertion createObjectPropertyAssertion()
  {
    ObjectPropertyAssertionImpl objectPropertyAssertion = new ObjectPropertyAssertionImpl();
    return objectPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeObjectPropertyAssertion createNegativeObjectPropertyAssertion()
  {
    NegativeObjectPropertyAssertionImpl negativeObjectPropertyAssertion = new NegativeObjectPropertyAssertionImpl();
    return negativeObjectPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPropertyAssertion createDataPropertyAssertion()
  {
    DataPropertyAssertionImpl dataPropertyAssertion = new DataPropertyAssertionImpl();
    return dataPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeDataPropertyAssertion createNegativeDataPropertyAssertion()
  {
    NegativeDataPropertyAssertionImpl negativeDataPropertyAssertion = new NegativeDataPropertyAssertionImpl();
    return negativeDataPropertyAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValue createAnnotationValue()
  {
    AnnotationValueImpl annotationValue = new AnnotationValueImpl();
    return annotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationAxiom createAnnotationAxiom()
  {
    AnnotationAxiomImpl annotationAxiom = new AnnotationAxiomImpl();
    return annotationAxiom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationAssertion createAnnotationAssertion()
  {
    AnnotationAssertionImpl annotationAssertion = new AnnotationAssertionImpl();
    return annotationAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationSubject createAnnotationSubject()
  {
    AnnotationSubjectImpl annotationSubject = new AnnotationSubjectImpl();
    return annotationSubject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubAnnotationPropertyOf createSubAnnotationPropertyOf()
  {
    SubAnnotationPropertyOfImpl subAnnotationPropertyOf = new SubAnnotationPropertyOfImpl();
    return subAnnotationPropertyOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationPropertyDomain createAnnotationPropertyDomain()
  {
    AnnotationPropertyDomainImpl annotationPropertyDomain = new AnnotationPropertyDomainImpl();
    return annotationPropertyDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationPropertyRange createAnnotationPropertyRange()
  {
    AnnotationPropertyRangeImpl annotationPropertyRange = new AnnotationPropertyRangeImpl();
    return annotationPropertyRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OwlPackage getOwlPackage()
  {
    return (OwlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OwlPackage getPackage()
  {
    return OwlPackage.eINSTANCE;
  }

} //OwlFactoryImpl
