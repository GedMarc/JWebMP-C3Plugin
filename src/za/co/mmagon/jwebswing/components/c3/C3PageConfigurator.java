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

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author Marc Magon
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
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-C3Plugin", pluginSourceUrl = "https://github.com/c3js/c3",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-C3Plugin/wiki",
                   pluginOriginalHomepage = "http://www.c3js.org/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/C3Plugin.jar/download")
public class C3PageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
