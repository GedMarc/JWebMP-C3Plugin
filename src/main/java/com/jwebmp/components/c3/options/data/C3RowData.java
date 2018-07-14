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
package com.jwebmp.components.c3.options.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

/**
 * An ArrayList of Specific Row Data.
 * Is an ArrayList of type Object
 *
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3RowData<D>
		extends ArrayList<D>
		implements Comparable<C3RowData>, Comparator<C3RowData>
{

	private static final long serialVersionUID = 1L;
	private C3RowDataType type;

	public C3RowData()
	{
		//Nothing Needed
	}

	@Override
	public int compareTo(C3RowData o)
	{
		if (this.type == C3RowDataType.Header)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public int compare(C3RowData o1, C3RowData o2)
	{
		if (o1 != null && o2 != null)
		{
			if (o1.getType() == C3RowDataType.Header)
			{
				return -1;
			}
			else
			{
				return 0;
			}

		}

		return 0;
	}

	/**
	 * Returns the type for the C3RowData
	 *
	 * @return
	 */
	public C3RowDataType getType()
	{
		return type;
	}

	/**
	 * Sets the type for the C3Row Data
	 *
	 * @param type
	 */
	public void setType(C3RowDataType type)
	{
		this.type = type;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof C3RowData))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		C3RowData<?> c3RowData = (C3RowData<?>) o;
		return getType() == c3RowData.getType();
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getType());
	}
}
