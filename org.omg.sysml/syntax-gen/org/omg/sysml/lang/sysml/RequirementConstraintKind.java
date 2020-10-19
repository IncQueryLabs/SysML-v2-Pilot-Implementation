/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement Constraint Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p>A RequirementConstraintKind indicates whether a ConstraintUsage is an assumption or a requirement in a RequirementDefinition or RequirementUsage.</p>
 * <!-- end-model-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRequirementConstraintKind()
 * @model
 * @generated
 */
public enum RequirementConstraintKind implements Enumerator {
	/**
	 * The '<em><b>Assumption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that a member ConstraintUsage of a RequirementDefinition or RequirementUsage represents an assumption.</p>
	 * <!-- end-model-doc -->
	 * @see #ASSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSUMPTION(0, "assumption", "assumption"),

	/**
	 * The '<em><b>Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that a member ConstraintUsage of a RequirementDefinition or RequirementUsage represents an requirement.</p>
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENT(1, "requirement", "requirement");

	/**
	 * The '<em><b>Assumption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that a member ConstraintUsage of a RequirementDefinition or RequirementUsage represents an assumption.</p>
	 * <!-- end-model-doc -->
	 * @see #ASSUMPTION
	 * @model name="assumption"
	 * @generated
	 * @ordered
	 */
	public static final int ASSUMPTION_VALUE = 0;

	/**
	 * The '<em><b>Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Indicates that a member ConstraintUsage of a RequirementDefinition or RequirementUsage represents an requirement.</p>
	 * <!-- end-model-doc -->
	 * @see #REQUIREMENT
	 * @model name="requirement"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Requirement Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequirementConstraintKind[] VALUES_ARRAY =
		new RequirementConstraintKind[] {
			ASSUMPTION,
			REQUIREMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Requirement Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequirementConstraintKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Requirement Constraint Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementConstraintKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementConstraintKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Constraint Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementConstraintKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequirementConstraintKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Requirement Constraint Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequirementConstraintKind get(int value) {
		switch (value) {
			case ASSUMPTION_VALUE: return ASSUMPTION;
			case REQUIREMENT_VALUE: return REQUIREMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RequirementConstraintKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RequirementConstraintKind
