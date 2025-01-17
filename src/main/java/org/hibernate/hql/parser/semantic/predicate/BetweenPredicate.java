/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.hql.parser.semantic.predicate;

import org.hibernate.hql.parser.semantic.expression.Expression;

/**
 * @author Steve Ebersole
 */
public class BetweenPredicate implements Predicate {
	private final Expression expression;
	private final Expression lowerBound;
	private final Expression upperBound;

	public BetweenPredicate(
			Expression expression,
			Expression lowerBound,
			Expression upperBound) {
		this.expression = expression;
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	public Expression getExpression() {
		return expression;
	}

	public Expression getLowerBound() {
		return lowerBound;
	}

	public Expression getUpperBound() {
		return upperBound;
	}
}
