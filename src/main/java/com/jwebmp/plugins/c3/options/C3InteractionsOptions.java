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
package com.jwebmp.plugins.c3.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3InteractionsOptions
		extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;

	private Boolean enabled;

	public C3InteractionsOptions()
	{
		//Nothing Needed
	}

	/**
	 * Indicate if the chart should have interactions.
	 * <p>
	 * If false is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
	 *
	 * @return
	 */
	public Boolean getEnabled()
	{
		return enabled;
	}

	/**
	 * Indicate if the chart should have interactions.
	 * <p>
	 * If false is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
	 *
	 * @param enabled
	 */
	public void setEnabled(Boolean enabled)
	{
		this.enabled = enabled;
	}

}
