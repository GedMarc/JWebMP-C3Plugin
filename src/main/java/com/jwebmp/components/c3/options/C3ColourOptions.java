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
package com.jwebmp.components.c3.options;

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * @author GedMarc
 * @since 09 Mar 2016
 */
public class C3ColourOptions
		extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;
	/**
	 * List of colour patterns
	 */
	private List<String> pattern;
	/**
	 *
	 */
	private String threshold;

	/**
	 * C3 Colour options
	 */
	public C3ColourOptions()
	{
		//Nothing needed
	}

	/**
	 * Set custom color pattern.<p>
	 * Default:
	 * <p>
	 * <p>
	 * undefined<p>
	 * Format:
	 * <p>
	 * <p>
	 * color: {
	 * <p>
	 * pattern: ['#1f77b4', '#aec7e8', ...]
	 * <p>
	 * }
	 * <p>
	 *
	 * @return
	 */
	public List<String> getPattern()
	{
		return pattern;
	}

	/**
	 * Set custom color pattern.<p>
	 * Default:
	 * <p>
	 * <p>
	 * undefined<p>
	 * Format:
	 * <p>
	 * <p>
	 * color: {
	 * <p>
	 * pattern: ['#1f77b4', '#aec7e8', ...]
	 * <p>
	 * }
	 * <p>
	 *
	 * @param pattern
	 */
	public void setPattern(List<String> pattern)
	{
		this.pattern = pattern;
	}

	/**
	 * Configures the threshold
	 *
	 * @return
	 */
	public String getThreshold()
	{
		return threshold;
	}

	/**
	 * Sets the threshold
	 *
	 * @param threshold
	 */
	public void setThreshold(String threshold)
	{
		this.threshold = threshold;
	}

}
