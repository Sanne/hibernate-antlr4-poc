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
public class LikePredicate implements Predicate {
	private final Expression matchExpression;
	private final Expression pattern;
	private final Expression escapeCharacter;

	public LikePredicate(
			Expression matchExpression,
			Expression pattern,
			Expression escapeCharacter) {
		this.matchExpression = matchExpression;
		this.pattern = pattern;
		this.escapeCharacter = escapeCharacter;
	}

	public LikePredicate(Expression matchExpression, Expression pattern) {
		this( matchExpression, pattern, null );
	}

	public Expression getMatchExpression() {
		return matchExpression;
	}

	public Expression getPattern() {
		return pattern;
	}

	public Expression getEscapeCharacter() {
		return escapeCharacter;
	}
}
