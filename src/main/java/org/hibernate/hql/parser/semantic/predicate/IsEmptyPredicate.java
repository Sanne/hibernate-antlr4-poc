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
public class IsEmptyPredicate implements Predicate {
	private final Expression expression;
	private boolean negated;

	public IsEmptyPredicate(Expression expression, boolean negated) {
		this.expression = expression;
		this.negated = negated;
	}

	public IsEmptyPredicate(Expression expression) {
		this( expression, false );
	}

	public Expression getExpression() {
		return expression;
	}

	public boolean isNegated() {
		return negated;
	}
}
