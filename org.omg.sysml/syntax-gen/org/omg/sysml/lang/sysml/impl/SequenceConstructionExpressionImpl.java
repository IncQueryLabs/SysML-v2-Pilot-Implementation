/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SequenceConstructionExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Sequence Construction Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl#getElement_comp <em>Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SequenceConstructionExpressionImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceConstructionExpressionImpl extends ExpressionImpl implements SequenceConstructionExpression {
	/**
	 * The cached value of the '{@link #getElement_comp() <em>Element comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> element_comp;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceConstructionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SEQUENCE_CONSTRUCTION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getElement_comp() {
		if (element_comp == null) {
			element_comp = new EObjectContainmentEList<Expression>(Expression.class, this, SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT_COMP);
		}
		return element_comp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getElement() {
		EList<Expression> elements = new EObjectEList<Expression>(Expression.class, this, SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT);
		elements.addAll(getElement_comp());
		return elements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT_COMP:
				return ((InternalEList<?>)getElement_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT_COMP:
				return getElement_comp();
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT:
				return getElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT_COMP:
				getElement_comp().clear();
				getElement_comp().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends Expression>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT_COMP:
				getElement_comp().clear();
				return;
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT:
				getElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT_COMP:
				return element_comp != null && !element_comp.isEmpty();
			case SysMLPackage.SEQUENCE_CONSTRUCTION_EXPRESSION__ELEMENT:
				return !getElement().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SequenceConstructionExpressionImpl
