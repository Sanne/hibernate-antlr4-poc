/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2008, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.hql.parser.process;

/**
 * Handles generating implicit (or synthetic) aliases.
 *
 * @author Steve Ebersole
 */
public class ImplicitAliasGenerator {
	private int unaliasedCount = 0;

	/**
	 * Builds a unique implicit alias.
	 *
	 * @return The generated alias.
	 */
	public synchronized String buildUniqueImplicitAlias() {
		return "<gen:" + unaliasedCount++ + ">";
	}

	/**
	 * Determine if the given alias is implicit.
	 *
	 * @param alias The alias to check
	 * @return True/false.
	 */
	public static boolean isImplicitAlias(String alias) {
		return alias == null || ( alias.startsWith( "<gen:" ) && alias.endsWith( ">" ) );
	}
}
