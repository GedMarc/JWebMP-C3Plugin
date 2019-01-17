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
package com.jwebmp.plugins.c3.options.data;

import com.jwebmp.core.utilities.StaticStrings;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public enum C3GraphTypeOptions
{

	Line,
	Spline,
	Step,
	Area,
	Area_Spline,
	Area_Step,
	Bar,
	Scatter,
	Pie,
	Donut,
	Gauge,
	;

	@Override
	public String toString()
	{
		return name().replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
		             .toLowerCase();
	}
}
