/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.c3.series;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Denotes a column header for C3 Data Objects
 *
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3DataColumnHeader
		extends JavaScriptPart

{

	private String name;

	/**
	 * Constructs a new column header with the given name
	 *
	 * @param name
	 */
	public C3DataColumnHeader(String name)
	{
		this.name = name;
	}

	/**
	 * Returns this column header's name
	 *
	 * @return
	 */
	@JsonValue
	@Override
	public String toString()
	{
		return getName();
	}

	/**
	 * Return the currently assigned name.
	 *
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets this columns currently assigned name
	 *
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}
