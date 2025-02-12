/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Definition is a Classifier of Usages. The actual kinds of Definitions that may appear in a model are given by the subclasses of Definition (possibly as extended with user-defined <em><code>SemanticMetadata</code></em>).</p>
 * 
 * <p>Normally, a Definition has owned Usages that model <code>features</code> of the thing being defined. A Definition may also have other Definitions nested in it, but this has no semantic significance, other than the nested scoping resulting from the Definition being considered as a Namespace for any nested Definitions.</p>
 * 
 * <p>However, if a Definition has <code>isVariation</code> = <code>true</code>, then it represents a <em>variation point</em> Definition. In this case, all of its <code>members</code> must be <code>variant</code> Usages, related to the Definition by VariantMembership Relationships. Rather than being <code>features</code> of the Definition, <code>variant</code> Usages model different concrete alternatives that can be chosen to fill in for an abstract Usage of the variation point Definition.</p>
 * 
 * isVariation implies variantMembership = ownedMembership
 * variant = variantMembership.ownedVariantUsage
 * variantMembership = ownedMembership->selectByKind(VariantMembership)
 * not isVariation implies variantMembership->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getDirectedUsage <em>Directed Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement <em>Owned Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedCalculation <em>Owned Calculation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#isVariation <em>Is Variation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getVariantMembership <em>Variant Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAnalysisCase <em>Owned Analysis Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getVariant <em>Variant</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase <em>Owned Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedReference <em>Owned Reference</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection <em>Owned Connection</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedItem <em>Owned Item</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart <em>Owned Part</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedInterface <em>Owned Interface</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedView <em>Owned View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedViewpoint <em>Owned Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedRendering <em>Owned Rendering</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedVerificationCase <em>Owned Verification Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedEnumeration <em>Owned Enumeration</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedAllocation <em>Owned Allocation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedConcern <em>Owned Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence <em>Owned Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedFlow <em>Owned Flow</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage <em>Owned Usage</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PortUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The PortUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedPort()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='portOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PortUsage> getOwnedPort();

	/**
	 * Returns the value of the '<em><b>Directed Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getDirectedFeature() <em>Directed Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this Definition that are <code>directedFeatures</code>.</p>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_DirectedUsage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definitionWithDirectedUsage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getDirectedUsage();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages that are <code>features</code> of this Definition (not necessarily owned).</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_Usage()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getUsage();

	/**
	 * Returns the value of the '<em><b>Owned Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence() <em>Owned Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsages that are <code>ownedUsages</code> of this Definition.</code>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAction()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='actionOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ActionUsage> getOwnedAction();

	/**
	 * Returns the value of the '<em><b>Owned Connection</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConnectorAsUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart() <em>Owned Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConnectorAsUsages that are <code>ownedUsages</code> of this Definition. Note that this list includes BindingConnectorAsUsages and SuccessionAsUsages, even though these are ConnectorAsUsages but not ConnectionUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Connection</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedConnection()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='connectionOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConnectorAsUsage> getOwnedConnection();

	/**
	 * Returns the value of the '<em><b>Owned Item</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ItemUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence() <em>Owned Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ItemUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Item</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedItem()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='itemOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ItemUsage> getOwnedItem();

	/**
	 * Returns the value of the '<em><b>Owned Part</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedItem() <em>Owned Item</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The PartUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Part</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedPart()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='partOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<PartUsage> getOwnedPart();

	/**
	 * Returns the value of the '<em><b>Owned Interface</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.InterfaceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection() <em>Owned Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The InterfaceUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Interface</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedInterface()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='interfaceOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<InterfaceUsage> getOwnedInterface();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AttributeUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AttributeUsages that are <code>ownedUsages</code> of this Definition.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAttribute()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='attributeOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AttributeUsage> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Owned View</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart() <em>Owned Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The <code>ownedUsages</code> of this Definition that are ViewUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned View</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedView()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ViewUsage> getOwnedView();

	/**
	 * Returns the value of the '<em><b>Owned Viewpoint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewpointUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement() <em>Owned Requirement</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedUsages</code> of this Definition that are ViewpointUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedViewpoint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ViewpointUsage> getOwnedViewpoint();

	/**
	 * Returns the value of the '<em><b>Owned Rendering</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RenderingUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedPart() <em>Owned Part</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this Definition that are RenderingUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Rendering</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedRendering()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='redenderingOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<RenderingUsage> getOwnedRendering();

	/**
	 * Returns the value of the '<em><b>Owned Verification Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.VerificationCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase() <em>Owned Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedUsages</code> of this Definition that are VerificationCaseUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Verification Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedVerificationCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='verificationCaseOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VerificationCaseUsage> getOwnedVerificationCase();

	/**
	 * Returns the value of the '<em><b>Owned Enumeration</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.EnumerationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedAttribute() <em>Owned Attribute</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The EnumerationUsages that are <code>ownedUsages</code> of this Definition.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Enumeration</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedEnumeration()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='enumerationOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<EnumerationUsage> getOwnedEnumeration();

	/**
	 * Returns the value of the '<em><b>Owned Allocation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AllocationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection() <em>Owned Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AllocationUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Allocation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAllocation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='allocationOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AllocationUsage> getOwnedAllocation();

	/**
	 * Returns the value of the '<em><b>Owned Concern</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConcernUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedRequirement() <em>Owned Requirement</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConcernUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Concern</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedConcern()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='concernOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConcernUsage> getOwnedConcern();

	/**
	 * Returns the value of the '<em><b>Owned Occurrence</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.OccurrenceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The OccurrenceUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Occurrence</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedOccurrence()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='occurrenceOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<OccurrenceUsage> getOwnedOccurrence();

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.UseCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase() <em>Owned Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The UseCaseUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedUseCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='useCaseOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UseCaseUsage> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Owned Flow</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.FlowConnectionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConnection() <em>Owned Connection</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The FlowConnectionUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Flow</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedFlow()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='flowOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<FlowConnectionUsage> getOwnedFlow();

	/**
	 * Returns the value of the '<em><b>Variant Membership</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.VariantMembership}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMembership() <em>Owned Membership</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant Membership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedMemberships</code> of this Definition that are VariantMemberships. If <code>isVariation</code> = true, then this must be all <code>ownedMemberships</code> of the Definition. If <code>isVariation</code> = false, then <code>variantMembership</code>must be empty.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Membership</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_VariantMembership()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<VariantMembership> getVariantMembership();

	/**
	 * Returns the value of the '<em><b>Owned State</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.StateUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction() <em>Owned Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The StateUsages that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned State</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedState()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='stateOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<StateUsage> getOwnedState();

	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ConstraintUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedOccurrence() <em>Owned Occurrence</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ConstraintUsages that are <code>ownedUsages</code> of this Definition.</p> 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedConstraint()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='constraintOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ConstraintUsage> getOwnedConstraint();

	/**
	 * Returns the value of the '<em><b>Owned Transition</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.TransitionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The TransitionUsages that are <tt>ownedUsages</tt> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Transition</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedTransition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='transitionOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<TransitionUsage> getOwnedTransition();

	/**
	 * Returns the value of the '<em><b>Owned Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.RequirementUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedConstraint() <em>Owned Constraint</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RequirementUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Requirement</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedRequirement()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='requirementOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<RequirementUsage> getOwnedRequirement();

	/**
	 * Returns the value of the '<em><b>Owned Calculation</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CalculationUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedAction() <em>Owned Action</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The CalculationUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Calculation</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedCalculation()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='calculationOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<CalculationUsage> getOwnedCalculation();

	/**
	 * Returns the value of the '<em><b>Is Variation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this Definition is for a variation point or not. If true, then all the <code>memberships</code> of the Definition must be VariantMemberships.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Variation</em>' attribute.
	 * @see #setIsVariation(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_IsVariation()
	 * @model dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVariation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.Definition#isVariation <em>Is Variation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variation</em>' attribute.
	 * @see #isVariation()
	 * @generated
	 */
	void setIsVariation(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Analysis Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AnalysisCaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCase() <em>Owned Case</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AnalysisCaseUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Analysis Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedAnalysisCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='analysisCaseOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AnalysisCaseUsage> getOwnedAnalysisCase();

	/**
	 * Returns the value of the '<em><b>Owned Case</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.CaseUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedCalculation() <em>Owned Calculation</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The CaseUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Case</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedCase()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='caseOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<CaseUsage> getOwnedCase();

	/**
	 * Returns the value of the '<em><b>Owned Reference</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ReferenceUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ReferenceUsages that are <code>ownedUsages</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Reference</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedReference()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referenceOwningDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ReferenceUsage> getOwnedReference();

	/**
	 * Returns the value of the '<em><b>Owned Usage</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getOwningDefinition <em>Owning Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages that are <code>ownedFeatures</code> of this Definition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Usage</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_OwnedUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getOwningDefinition
	 * @model opposite="owningDefinition" transient="true" volatile="true" derived="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getOwnedUsage();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Usage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usages which represent the variants of this Definition as a variation point Definition, if <code>isVariation</code> = true. If <code>isVariation</code> = false, the there must be no <code>variants</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getDefinition_Variant()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningVariationDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Usage> getVariant();

} // Definition
