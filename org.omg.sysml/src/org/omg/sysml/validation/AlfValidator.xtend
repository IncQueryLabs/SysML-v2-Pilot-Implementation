/*
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.Feature
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.VisibilityKind

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class AlfValidator extends AbstractAlfValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					AlfPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	protected def boolean isGlobalPublic(Element p){
		var EObject c=p
		while(c!==null){
			if(c instanceof Membership)
				if(c.visibility!==VisibilityKind.PUBLIC)
					return false
			c=c.eContainer
		}
		return true
	}

	public static val NOT_PUBLIC_MEMBERSHIP= 'notPublicImport'

	protected def EObject filePackage(Element e){
		var EObject pack=e
		while(pack.eContainer!==null){
			pack=pack.eContainer
		}
		return pack
	}

	@Check
	def checkMembershipVisibility(Membership membership) {
		val elem= membership.memberElement
		val elemPack = elem.filePackage
		val membershipPack= membership.filePackage
		if (membership.memberElement!==null && elemPack!==membershipPack && !membership.memberElement.isGlobalPublic) {
			error("Not public import from other package",membership,SysMLPackage.eINSTANCE.membership_MemberElement,NOT_PUBLIC_MEMBERSHIP)
		}
	}


	public static val NOT_PUBLIC_INHERITANCE= 'notPublicImport'

	@Check
	def checkInheritanceVisibility(Generalization gen) {
		val ownerr= gen.owner
		val ownerrPack = ownerr.filePackage
		val generalPack= gen.general.filePackage
		if (ownerrPack!==generalPack && !gen.general.isGlobalPublic) {
			error("Not public inheritance from other package",gen,SysMLPackage.eINSTANCE.generalization_General,NOT_PUBLIC_INHERITANCE)
		}
	}	
	

	public static val NOT_PUBLIC_FEATURE_TYPE= 'notPublicFeature'

	@Check
	def checkFeatureVisibility(Feature feature) {
		val refs= feature.referencedType.toSet
		val featurePack= feature.filePackage
		refs.forEach[e|
			val refPack= e.filePackage
			if (featurePack!==refPack && !e.isGlobalPublic) {
				error("Not public reference type from other package",feature,SysMLPackage.eINSTANCE.feature_ReferencedType, NOT_PUBLIC_FEATURE_TYPE)
			}
		]
		
	}	
	
	public static val NOT_PUBLIC_IMPORT= 'notPublicImport'

	@Check
	def checkImportVisibility(Import imp) {
		val imported= imp.importedPackage
		val importedPack= imported.filePackage
		val importingPack= imp.filePackage
		if (importedPack!==importingPack && !imported.isGlobalPublic) {
			error("Not public import from other package",imp,SysMLPackage.eINSTANCE.import_ImportedPackage,NOT_PUBLIC_IMPORT)
		}
		
	}	
	
}
