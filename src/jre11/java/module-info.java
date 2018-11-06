import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.c3.C3PageConfigurator;
import com.jwebmp.plugins.c3.implementations.C3ExclusionsModule;

module com.jwebmp.plugins.c3 {
	exports com.jwebmp.plugins.c3;
	exports com.jwebmp.plugins.c3.options;
	exports com.jwebmp.plugins.c3.options.data;
	exports com.jwebmp.plugins.c3.series;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with C3PageConfigurator;
	provides IGuiceScanJarExclusions with C3ExclusionsModule;
	provides IGuiceScanModuleExclusions with C3ExclusionsModule;

	opens com.jwebmp.plugins.c3 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.c3.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.c3.series to com.fasterxml.jackson.databind, com.jwebmp.core;
}
