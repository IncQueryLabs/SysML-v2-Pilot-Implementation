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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendering Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A RenderingUsage is the usage of a RenderingDefinition to specify the rendering of a specific model view to produce a physical view artifact.</p>
 * 
 * <p>A RenderingUsage must subset, directly or indirectly, the base RenderingUsage <code>renderings</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.RenderingUsage#getRenderingDefinition <em>Rendering Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRenderingUsage()
 * @model
 * @generated
 */
public interface RenderingUsage extends PartUsage {
	/**
	 * Returns the value of the '<em><b>Rendering Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.PartUsage#getPartDefinition() <em>Part Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RenderingDefinition that defines this RenderingUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering Definition</em>' reference.
	 * @see #setRenderingDefinition(RenderingDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getRenderingUsage_RenderingDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedRendering'"
	 *        annotation="redefines"
	 * @generated
	 */
	RenderingDefinition getRenderingDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.RenderingUsage#getRenderingDefinition <em>Rendering Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering Definition</em>' reference.
	 * @see #getRenderingDefinition()
	 * @generated
	 */
	void setRenderingDefinition(RenderingDefinition value);

} // RenderingUsage
