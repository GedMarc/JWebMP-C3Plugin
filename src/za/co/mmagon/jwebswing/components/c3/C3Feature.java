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
package za.co.mmagon.jwebswing.components.c3;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.components.d3.D3JavascriptReferencePool;

import java.util.Objects;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class C3Feature extends Feature<C3Options, C3Feature> implements C3Features, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	private C3Options options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public C3Feature(Component forComponent)
	{
		super("C3JSFeature");
		setComponent(forComponent);
		getJavascriptReferences().add(D3JavascriptReferencePool.D3DrawingLibrary.getReference());
		getJavascriptReferences().add(C3JavascriptReferencePool.C3GraphCore.getReference());
		getCssReferences().add(C3CSSReferencePool.C3GraphCore.getReference());
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public C3Options getOptions()
	{
		if (options == null)
		{
			options = new C3Options(getComponent());
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = "c3.generate(" + getNewLine();
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		addQuery(requiredString);
		
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof C3Feature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}
		C3Feature c3Feature = (C3Feature) o;
		return Objects.equals(getComponent(), c3Feature.getComponent()) &&
				Objects.equals(getOptions(), c3Feature.getOptions());
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(super.hashCode(), getComponent(), getOptions());
	}
}
