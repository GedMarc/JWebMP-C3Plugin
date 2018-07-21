/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.c3;

import com.jwebmp.core.base.references.JavascriptReference;

/**
 * References for all the graphing Java Scripts
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 08 Aug 2015
 */
public enum C3JavascriptReferencePool
{

	/**
	 * The basic core for the graphing system
	 */
	C3GraphCore(new JavascriptReference("C3", 0.410, "bower_components/c3/c3.js", "https://cdnjs.cloudflare.com/ajax/libs/c3/0.4.10/c3.js", 15)),
	;
	private final JavascriptReference reference;

	C3JavascriptReferencePool(JavascriptReference reference)
	{
		this.reference = reference;

	}

	public JavascriptReference getReference()
	{
		return reference;
	}

}
