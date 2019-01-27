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

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.c3.C3PageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.c3.implementations.C3ExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.c3.implementations.C3ExclusionsModule;

	opens com.jwebmp.plugins.c3 to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.c3.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.c3.series to com.fasterxml.jackson.databind, com.jwebmp.core;
}
