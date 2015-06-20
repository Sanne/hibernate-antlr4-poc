/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.hql.parser.semantic.expression;

import org.hibernate.hql.parser.model.TypeDescriptor;
import org.hibernate.hql.parser.util.BasicTypeDescriptorSingleton;

/**
 * @author Steve Ebersole
 */
public class LiteralCharacterExpression extends AbstractLiteralExpressionImpl<Character> {
	public LiteralCharacterExpression(Character value) {
		super( value );
	}

	@Override
	public TypeDescriptor getTypeDescriptor() {
		return BasicTypeDescriptorSingleton.INSTANCE;
	}
}