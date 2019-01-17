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
package com.jwebmp.plugins.c3;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "C3.js",
		pluginUniqueName = "c3-js",
		pluginDescription = "C3 makes it easy to generate D3-based charts by wrapping the code required to construct the entire chart. We don't need to write D3 code any more.",
		pluginVersion = "0.4.11",
		pluginIconUrl = "bower_components/c3/C3.jpg",
		pluginIconImageUrl = "bower_components/c3/example.png",
		pluginDependancyUniqueIDs = "d3-js",
		pluginCategories = "d3, c3, graphing, graphics, svg, export",
		pluginSubtitle = "C3 enables deeper integration of charts into your application",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-C3Plugin",
		pluginSourceUrl = "https://github.com/c3js/c3",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-C3Plugin/wiki",
		pluginOriginalHomepage = "http://www.c3js.org/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/C3Plugin.jar/download")
public class C3PageConfigurator
		implements IPageConfigurator<C3PageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return C3PageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		C3PageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		return page;
	}

	@Override
	public boolean enabled()
	{
		return C3PageConfigurator.enabled;
	}

}
