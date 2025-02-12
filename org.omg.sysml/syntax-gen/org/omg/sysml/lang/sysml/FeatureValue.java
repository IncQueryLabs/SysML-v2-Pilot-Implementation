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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Feature
 * Value</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A FeatureValue is a Membership that identifies a particular member Expression that provides the value of the Feature that owns the FeatureValue. The value is specified as either a bound value or an initial value, and as either a concrete or default value. A Feature can have at most one FeatureValue.</p>
 * 
 * <p>If <code>isInitial = false</code>, then the result of the <code>value</code> expression is bound to the <code>featureWithValue</code> using a BindingConnector. Otherwise, the <code>featureWithValue</code> is initialized using a FeatureWritePeformance.</p>
 * 
 * <p>If <code>isDefault = false</code>, then the above semantics of the FeatureValue are realized for the given <code>featureWithValue</code>. Otherwise, the semantics are realized for any individual of the <code>featuringType</code> of the <code>featureWithValue</code>, unless another value is explicitly given for the <code>featureWithValue</code> for that individual.</p>
 * 
 * value.featuringType = featureWithValue.featuringType
 * valueConnector.owningNamespace = featureWithValue and
 * valueConnector.relatedFeature->includes(featureWithValue) and
 * valueConnector.relatedFeature->includes(value.result) and
 * valueConnector.featuringType = featureWithValue.featuringType
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue <em>Feature With Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#isInitial <em>Is Initial</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.FeatureValue#isDefault <em>Is Default</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue()
 * @model
 * @generated
 */
public interface FeatureValue extends OwningMembership {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.OwningMembership#getOwnedMemberElement() <em>Owned Member Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expression that provides the value of the <code>featureWithValue</code> as its <code>result</code>.</p>
	 * 
	 * <p>The Expression that provides the value as a result.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_Value()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='expressedValuation'"
	 *        annotation="redefines"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this FeatureValue specifies a bound value or an initial value for the <code>featureWithValue</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_IsInitial()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#isInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Whether this FeatureValue is a concrete specification of the bound of initial value of the <code>featureWithValue</code>, or just a default value that may be overridden.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_IsDefault()
	 * @model default="false" dataType="org.omg.sysml.lang.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#isDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature With Value</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Membership#getMembershipOwningNamespace() <em>Membership Owning Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature With Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Feature to be provided a value.</p>
	 * 
	 * <p>The Feature to be provided a value.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature With Value</em>' reference.
	 * @see #setFeatureWithValue(Feature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getFeatureValue_FeatureWithValue()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='valuation'"
	 *        annotation="subsets"
	 * @generated
	 */
	Feature getFeatureWithValue();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.FeatureValue#getFeatureWithValue <em>Feature With Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature With Value</em>' reference.
	 * @see #getFeatureWithValue()
	 * @generated
	 */
	void setFeatureWithValue(Feature value);

} // FeatureValue
