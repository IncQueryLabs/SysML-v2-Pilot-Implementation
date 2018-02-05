/*
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.omg.sysml.kerml.core.Container;
import org.omg.sysml.kerml.core.CorePackage;
import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.Generalization;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.services.AlfGrammarAccess;

@SuppressWarnings("all")
public class AlfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AlfGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CorePackage.CONTAINER:
				if (rule == grammarAccess.getPackageDefinitionOrStubRule()
						|| rule == grammarAccess.getPackagedElementRule()
						|| rule == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_PackageDefinitionOrStub(context, (Container) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnitDefinitionRule()
						|| rule == grammarAccess.getPackageDefinitionRule()) {
					sequence_PackageDefinition(context, (Container) semanticObject); 
					return; 
				}
				else break;
			}
		else if (epackage == StructurePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StructurePackage.CLASS:
				if (rule == grammarAccess.getClassDeclarationRule()) {
					sequence_ClassDeclaration(context, (org.omg.sysml.kerml.structure.Class) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getUnitDefinitionRule()
						|| rule == grammarAccess.getClassDefinitionRule()) {
					sequence_ClassDeclaration_ClassDefinition(context, (org.omg.sysml.kerml.structure.Class) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPackagedElementRule()
						|| rule == grammarAccess.getPackagedElementDefinitionRule()
						|| rule == grammarAccess.getClassifierDefinitionOrStubRule()
						|| rule == grammarAccess.getClassDefinitionOrStubRule()) {
					sequence_ClassDefinitionOrStub(context, (org.omg.sysml.kerml.structure.Class) semanticObject); 
					return; 
				}
				else break;
			case StructurePackage.FEATURE:
				sequence_FeatureDefinition(context, (Feature) semanticObject); 
				return; 
			case StructurePackage.GENERALIZATION:
				sequence_Generalization(context, (Generalization) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ClassDeclaration returns Class
	 *
	 * Constraint:
	 *     (isAbstract?='abstract'? name=Name (generalization+=Generalization generalization+=Generalization*)?)
	 */
	protected void sequence_ClassDeclaration(ISerializationContext context, org.omg.sysml.kerml.structure.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnitDefinition returns Class
	 *     ClassDefinition returns Class
	 *
	 * Constraint:
	 *     (isAbstract?='abstract'? name=Name (generalization+=Generalization generalization+=Generalization*)? ownedFeature+=ClassMember*)
	 */
	protected void sequence_ClassDeclaration_ClassDefinition(ISerializationContext context, org.omg.sysml.kerml.structure.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackagedElement returns Class
	 *     PackagedElementDefinition returns Class
	 *     ClassifierDefinitionOrStub returns Class
	 *     ClassDefinitionOrStub returns Class
	 *
	 * Constraint:
	 *     (
	 *         packageVisibility=VisibilityKind 
	 *         isAbstract?='abstract'? 
	 *         name=Name 
	 *         (generalization+=Generalization generalization+=Generalization*)? 
	 *         ownedFeature+=ClassMember*
	 *     )
	 */
	protected void sequence_ClassDefinitionOrStub(ISerializationContext context, org.omg.sysml.kerml.structure.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassMember returns Feature
	 *     FeatureDefinition returns Feature
	 *
	 * Constraint:
	 *     (methodVisibility=VisibilityKind? name=Name definingType=[Class|QualifiedName])
	 */
	protected void sequence_FeatureDefinition(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Generalization returns Generalization
	 *
	 * Constraint:
	 *     general=[Class|QualifiedName]
	 */
	protected void sequence_Generalization(ISerializationContext context, Generalization semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StructurePackage.Literals.GENERALIZATION__GENERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StructurePackage.Literals.GENERALIZATION__GENERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGeneralizationAccess().getGeneralClassQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(StructurePackage.Literals.GENERALIZATION__GENERAL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageDefinitionOrStub returns Container
	 *     PackagedElement returns Container
	 *     PackagedElementDefinition returns Container
	 *
	 * Constraint:
	 *     (packageVisibility=VisibilityKind name=Name ownedMember+=PackagedElement*)
	 */
	protected void sequence_PackageDefinitionOrStub(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnitDefinition returns Container
	 *     PackageDefinition returns Container
	 *
	 * Constraint:
	 *     (name=Name ownedMember+=PackagedElement*)
	 */
	protected void sequence_PackageDefinition(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
