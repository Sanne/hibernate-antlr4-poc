/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.hql.parser.semantic.from;

import org.hibernate.hql.parser.semantic.JoinType;
import org.hibernate.hql.parser.model.TypeDescriptor;

/**
 * @author Steve Ebersole
 */
public abstract class AbstractFromElementJoinedImpl extends AbstractFromElementImpl implements JoinedFromElement {
	private final JoinType joinType;

	public AbstractFromElementJoinedImpl(
			FromElementSpace fromElementSpace,
			String alias,
			TypeDescriptor typeDescriptor,
			JoinType joinType) {
		super( fromElementSpace, alias, typeDescriptor );
		this.joinType = joinType;
	}

	@Override
	public JoinType getJoinType() {
		return joinType;
	}
}
