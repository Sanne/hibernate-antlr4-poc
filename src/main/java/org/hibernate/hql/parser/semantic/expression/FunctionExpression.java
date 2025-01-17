/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.hql.parser.semantic.expression;

import java.util.List;

import org.hibernate.hql.parser.model.TypeDescriptor;

/**
 * @author Steve Ebersole
 */
public class FunctionExpression implements Expression {
	private final String functionName;
	private final List<Expression> arguments;
	private final TypeDescriptor resultTypeDescriptor;

	public FunctionExpression(
			String functionName,
			List<Expression> arguments,
			TypeDescriptor resultTypeDescriptor) {
		this.functionName = functionName;
		this.arguments = arguments;
		this.resultTypeDescriptor = resultTypeDescriptor;
	}

	public String getFunctionName() {
		return functionName;
	}

	public List<Expression> getArguments() {
		return arguments;
	}

	@Override
	public TypeDescriptor getTypeDescriptor() {
		return resultTypeDescriptor;
	}
}
