/*
 * generated by Xtext 2.12.0
 */
package org.omg.kerml.xtext.ui.outline

import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.omg.sysml.lang.sysml.Annotation
import org.omg.sysml.lang.sysml.Conjugation
import org.omg.sysml.lang.sysml.Element
import org.omg.sysml.lang.sysml.FeatureMembership
import org.omg.sysml.lang.sysml.Generalization
import org.omg.sysml.lang.sysml.Import
import org.omg.sysml.lang.sysml.LiteralBoolean
import org.omg.sysml.lang.sysml.LiteralInteger
import org.omg.sysml.lang.sysml.LiteralReal
import org.omg.sysml.lang.sysml.LiteralString
import org.omg.sysml.lang.sysml.LiteralUnbounded
import org.omg.sysml.lang.sysml.Membership
import org.omg.sysml.lang.sysml.NullExpression
import org.omg.sysml.lang.sysml.OperatorExpression
import org.omg.sysml.lang.sysml.Package
import org.omg.sysml.lang.sysml.Redefinition
import org.omg.sysml.lang.sysml.Relationship
import org.omg.sysml.lang.sysml.Subsetting
import org.omg.sysml.lang.sysml.Type
import org.omg.sysml.lang.sysml.VisibilityKind
import org.omg.sysml.lang.sysml.impl.TypeImpl
import org.omg.sysml.lang.sysml.impl.ElementImpl
import org.omg.sysml.lang.sysml.Comment
import org.omg.sysml.lang.sysml.SysMLPackage
import org.omg.sysml.lang.sysml.TextualRepresentation
import org.omg.sysml.lang.sysml.Association
import org.omg.sysml.lang.sysml.Connector

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class KerMLOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def String _text(Element element) {
		var text = element.eClass.name;
		if (element.humanId !== null) {
			text += ' id ' + element.humanId
		}
		val name = (element as ElementImpl).effectiveName;
		if (name !== null) {
			text += ' ' + name;
		}
		text 
	}
	
	def String _text(VisibilityKind visibility) {
		if (visibility == VisibilityKind.PACKAGE) "packaged"
		else visibility.toString
	}
	
	def String prefixText(Membership membership) {
		var text = membership.eClass.name;
		if (membership.ownedMemberElement !== null) {
			text += ' owns'
		}
		if (membership.visibility !== null) {
			text += ' ' + membership.visibility._text;
		}
		text
	}
	
	def String nameText(Membership membership) {
		if (membership.memberName !== null)
			membership.memberName
		else {
			val name = (membership.memberElement as ElementImpl)?.effectiveName;
			if (name !== null) name else ""
		}
	}
	
	def String _text(Membership membership) {
		membership.prefixText + ' ' + membership.nameText
	}
	
	def String featurePrefixText(FeatureMembership membership) {
		var text = membership.prefixText
		if (membership.isComposite) {
			text += ' composite'
		}
		if (membership.isPortion) {
			text += ' portion'
		}
		if (membership.isPort) {
			text += ' port'
		}
		if (membership.direction !== null) {
			text += ' ' + membership.direction
		}
		text
	}
	
	def String _text(FeatureMembership membership) {
		membership.featurePrefixText + ' ' + membership.nameText
	}
	
	def String _text(Import import_) {
		var text = import_.eClass.name;
		if (import_.visibility !== null) {
			text += ' ' + import_.visibility._text
		}
		if (import_.importedPackage?.name !== null) {
			text += ' ' + import_.importedPackage.name
		}
		text
	}
	
	def String _text(Type type) {
		(type as TypeImpl).transform()
		(type as TypeImpl).addImplicitGeneralizations()
		var text = type.eClass.name;
		if (type.isAbstract) {
			text += ' abstract'
		}
		if (type.humanId !== null) {
			text += ' id ' + type.humanId
		}
		val name = (type as TypeImpl).effectiveName
		if (name !== null) {
			text += ' ' + name;
		}
		text
	}
	
	def String _text(LiteralString literal) {
		"LiteralString " + literal.value
	}
	
	def String _text(LiteralBoolean literal) {
		"LiteralBoolean " + literal.value
	}
	
	def String _text(LiteralInteger literal) {
		"LiteralInteger " + literal.value
	}
	
	def String _text(LiteralReal literal) {
		"LiteralReal " + literal.value
	}
	
	def String _text(LiteralUnbounded literal) {
		"LiteralUnbounded *"
	}
	
	def String _text(NullExpression expression) {
		"NullExpression null"
	}
	
	def boolean _isLeaf(Relationship relationship) {
		false
	}
	
	def void _createChildren(IOutlineNode parentNode, Relationship relationship) {
		createRelatedElements(parentNode, relationship)
		super._createChildren(parentNode, relationship)
	}
	
	def createRelatedElements(IOutlineNode parentNode, Relationship relationship) {
		for (source: relationship.source) {
			createEObjectNode(parentNode, source, 
				_image(source), 'from ' + source._text, 
				true
			)
		}
		for (target: relationship.target) {
			createEObjectNode(parentNode, target, 
				_image(target), 'to ' + target._text, 
				true
			)
		}
	}
	
	def boolean _isLeaf(Annotation annotation) {
		false
	}
	
	def void _createChildren(IOutlineNode parentNode, Annotation annotation) {
		super._createChildren(parentNode, annotation)
		if (annotation.annotatedElement !== null) {
			createEObjectNode(parentNode, annotation.annotatedElement, 
				_image(annotation.annotatedElement), annotation.annotatedElement._text, 
				true
			)
		}
	}
	
	def boolean _isLeaf(Comment comment) {
		comment.body === null && super._isLeaf(comment)
	}
	
	def void _createChildren(IOutlineNode parentNode, Comment comment) {
		if (comment.body !== null) {
			createEStructuralFeatureNode(parentNode, comment, 
				SysMLPackage.eINSTANCE.comment_Body, 
				_image(comment.body), comment.body, true
			)
		}
		super._createChildren(parentNode, comment)
	}
	

	def boolean _isLeaf(TextualRepresentation rep) {
		rep.language === null && rep.body === null && super._isLeaf(rep)
	}
	
	def void _createChildren(IOutlineNode parentNode, TextualRepresentation rep) {
		if (rep.language !== null) {
			createEStructuralFeatureNode(parentNode, rep, 
				SysMLPackage.eINSTANCE.textualRepresentation_Language, 
				_image(rep.language), "language " + rep.language, true
			)
		}
		if (rep.body !== null) {
			createEStructuralFeatureNode(parentNode, rep, 
				SysMLPackage.eINSTANCE.textualRepresentation_Body, 
				_image(rep.body), rep.body, true
			)
		}
		super._createChildren(parentNode, rep)
	}
	

	def boolean _isLeaf(Membership membership) {
		false
	}
	
	def void _createChildren(IOutlineNode parentNode, Membership membership) {
		super._createChildren(parentNode, membership)
		var memberElement = membership.memberElement;
		if (membership.ownedMemberElement === null && 
				memberElement !== null) {
			createEObjectNode(parentNode, memberElement, 
				memberElement._image, memberElement._text, 
				true
			)
		}
	}
	
	def boolean _isLeaf(Import _import) {
		_import.importedPackage === null && _import.ownedElement.isEmpty
	}
	
	def void _createChildren(IOutlineNode parentNode, Import _import) {
		super._createChildren(parentNode, _import)
		var importedPackage = _import.importedPackage;
		if (importedPackage !== null) {
			createEObjectNode(parentNode, importedPackage, 
				importedPackage._image, importedPackage._text, 
				_import.importOwningPackage == importedPackage || importedPackage._isLeaf
			)
		}
	}
	
	def void _createChildren(IOutlineNode parentNode, Package _package) {
		for (childElement : _package.eContents()) {
			if (!(childElement instanceof Import || childElement instanceof Membership)) {
				createNode(parentNode, childElement)
			}
		}
		for (_import: _package.ownedImport) {
			createNode(parentNode, _import)
		}
		for (membership: _package.ownedMembership) {
			createNode(parentNode, membership)
		}
	}
	
	def boolean _isLeaf(Generalization generalization) {
		generalization.general === null
	}
	
	def void _createChildren(IOutlineNode parentNode, Generalization generalization) {
		if (generalization.specific !== null && generalization.specific !== generalization.eContainer) {
			createEObjectNode(parentNode, generalization.specific, 
				generalization.general._image, generalization.specific._text, 
				true
			)			
		}
		if (generalization.general !== null) {
			createEObjectNode(parentNode, generalization.general, 
				generalization.general._image, generalization.general._text, 
				true
			)
		}
	}
	
	def boolean _isLeaf(Redefinition redefinition) {
		redefinition.redefinedFeature === null
	}

	def void _createChildren(IOutlineNode parentNode, Redefinition redefinition) {
		if (redefinition.redefiningFeature !== null && redefinition.redefiningFeature !== redefinition.eContainer) {
			createEObjectNode(parentNode, redefinition.redefiningFeature, 
				redefinition.redefiningFeature._image, redefinition.redefiningFeature._text, 
				true
			)			
		}
		if (redefinition.redefinedFeature !== null) {
			createEObjectNode(parentNode, redefinition.redefinedFeature, 
				redefinition.redefinedFeature._image, redefinition.redefinedFeature._text, 
				true
			)
		}
	}

	def boolean _isLeaf(Subsetting subset) {
		subset.subsettedFeature === null
	}

	def void _createChildren(IOutlineNode parentNode, Subsetting subsetting) {
		if (subsetting.subsettingFeature !== null && subsetting.subsettingFeature !== subsetting.eContainer) {
			createEObjectNode(parentNode, subsetting.subsettingFeature, 
				subsetting.subsettingFeature._image, subsetting.subsettingFeature._text, 
				true
			)			
		}
		if (subsetting.subsettedFeature !== null) {
			createEObjectNode(parentNode, subsetting.subsettedFeature, 
				_image(subsetting.subsettedFeature), subsetting.subsettedFeature._text, 
				true
			)
		}
	}
	
	def boolean _isLeaf(Conjugation conjugation) {
		conjugation.originalType === null
	}
	
	def void _createChildren(IOutlineNode parentNode, Conjugation conjugation) {
		if (conjugation.conjugatedType !== null && conjugation.conjugatedType !== conjugation.eContainer) {
			createEObjectNode(parentNode, conjugation.conjugatedType, 
				conjugation.conjugatedType._image, conjugation.conjugatedType._text, 
				true
			)			
		}
		if (conjugation.originalType !== null) {
			createEObjectNode(parentNode, conjugation.originalType, 
				_image(conjugation.originalType), conjugation.originalType._text, 
				true
			)
		}
	}
	
	def void _createChildren(IOutlineNode parentNode, OperatorExpression expression) {
		for (Relationship relationship : expression.ownedRelationship) {
			createEObjectNode(parentNode, relationship, 
				_image(relationship), 
				if (relationship instanceof Membership) (relationship as Membership)._text 
				else relationship._text, 
				false
			);
		}
	}
	
	def _createChildren(IOutlineNode parentNode, Association association) {
		createRelatedElements(parentNode, association)
		_createChildren(parentNode, association as Package)
	}

	def _createChildren(IOutlineNode parentNode, Connector connector) {
		createRelatedElements(parentNode, connector)
		_createChildren(parentNode, connector as Package)
	}

}
