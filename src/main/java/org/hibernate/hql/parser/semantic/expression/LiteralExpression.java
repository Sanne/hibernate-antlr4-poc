/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.hql.parser.semantic.expression;

/**
 * Represents a literal value in the query, e.g.<ul>
 *     <li>1</li>
 *     <li>'some string'</li>
 *     <li>some.JavaClass.CONSTANT</li>
 *     <li>some.JavaEnum.VALUE</li>
 *     <li>etc</li>
 * </ul>
 * @author Steve Ebersole
 */
public interface LiteralExpression<T> extends Expression {
	T getLiteralValue();
}
