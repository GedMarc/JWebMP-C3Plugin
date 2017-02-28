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

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 * An implementation of the C3 Graphs project.
 * <p>
 * @author Marc Magon
 * @since 29 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "C3 Graphing", description = "C3 makes it easy to generate D3-based charts by wrapping the code required to construct the entire chart. We don't need to write D3 code any more. ",
        url = "https://www.c3js.org", wikiUrl = "https://github.com/GedMarc/JWebSwing-C3Plugin/wiki")
@PluginInformation(pluginName = "C3.js", pluginUniqueName = "c3-js", pluginDescription = "C3 makes it easy to generate D3-based charts by wrapping the code required to construct the entire chart. We don't need to write D3 code any more.",
        pluginVersion = "0.4.11",
        pluginDependancyUniqueIDs = "d3-js", pluginCategories = "C3 makes it easy to generate D3-based charts by wrapping the code required to construct the entire chart. We don't need to write D3 code any more.",
        pluginSubtitle = "C3 enables deeper integration of charts into your application",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-C3Plugin", pluginSourceUrl = "",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-C3Plugin/wiki",
        pluginOriginalHomepage = "http://www.c3js.org/")
public class C3 extends Div<C3Children, C3Attributes, C3Features, C3Events, C3>
{

    private static final long serialVersionUID = 1L;
    private C3Feature feature;

    /**
     * Constructs a new C3 Graph
     */
    public C3()
    {
        addFeature(getFeature());
    }

    public final C3Feature getFeature()
    {
        if (feature == null)
        {
            feature = new C3Feature(this);
        }
        return feature;
    }

    public C3Options getOptions()
    {
        return getFeature().getOptions();
    }

}
