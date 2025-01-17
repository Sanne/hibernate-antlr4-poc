/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.hql.parser.semantic.predicate;

/**
 * @author Steve Ebersole
 */
public class AndPredicate implements Predicate {
	private final Predicate leftHandPredicate;
	private final Predicate rightHandPredicate;

	public AndPredicate(Predicate leftHandPredicate, Predicate rightHandPredicate) {
		this.leftHandPredicate = leftHandPredicate;
		this.rightHandPredicate = rightHandPredicate;
	}

	public Predicate getLeftHandPredicate() {
		return leftHandPredicate;
	}

	public Predicate getRightHandPredicate() {
		return rightHandPredicate;
	}
}
