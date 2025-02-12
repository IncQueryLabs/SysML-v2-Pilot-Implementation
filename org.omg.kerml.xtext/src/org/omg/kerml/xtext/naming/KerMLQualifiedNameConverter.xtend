/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 IncQuery Labs Ltd.
 * Copyright (c) 2019, 2021 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Kiss, IncQuery
 *  Balazs Grill, IncQuery
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.kerml.xtext.naming

import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import com.google.common.base.Preconditions
import org.omg.sysml.util.ElementUtil

class KerMLQualifiedNameConverter implements IQualifiedNameConverter {
	
	override toQualifiedName(String qualifiedNameText) {
		Preconditions.checkArgument(qualifiedNameText !== null, "Qualified name cannot be null")

		val qualifiedNameAsText =
			if (qualifiedNameText.endsWith("::")) qualifiedNameText.substring(0, qualifiedNameText.length - 2)
			else qualifiedNameText
			
		Preconditions.checkArgument(!qualifiedNameAsText.empty, "Qualified name cannot be empty")

		val segments = newArrayList		
		var i = 0
		var j = 0;
		var n = qualifiedNameAsText.length()
		var isDelimitable = true
		
		while (j < n) {
			val c = qualifiedNameAsText.charAt(j)
			val delim = "\'\\.:".indexOf(c)
			if (isDelimitable && delim > 1) {
				segments.add(ElementUtil.unescapeString(qualifiedNameAsText.substring(i, j)));
				i = j + delim - 1;
				j = i - 1;
			} else if (delim == 0) {
				isDelimitable = !isDelimitable
			} else if (delim == 1) {
				j++
			}
			j++
		}
		if (i < n && j <= n) {
			segments.add(ElementUtil.unescapeString(qualifiedNameAsText.substring(i, j)));
		}
		
		QualifiedName.create(segments)
	}

	override toString(QualifiedName name) {
		if (name === null)
			throw new IllegalArgumentException("Qualified name cannot be null")
		val segmentCount = name.getSegmentCount
		switch (segmentCount) {
			case 0: return ""
			case 1: return ElementUtil.escapeName(name.getFirstSegment)
			default: {
				val builder = new StringBuilder;
				builder.append(ElementUtil.escapeName(name.getFirstSegment))
				for (var i = 1; i < segmentCount; i++) {
					builder.append("::")
					builder.append(ElementUtil.escapeName(name.getSegment(i)))
				}
				return builder.toString()
			}
		}
	}
	
}
