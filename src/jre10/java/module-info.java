import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.c3.C3PageConfigurator;

module com.jwebmp.components.c3 {
	exports com.jwebmp.plugins.c3;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;

	provides IPageConfigurator with C3PageConfigurator;
	opens com.jwebmp.plugins.c3 to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.c3.graphs to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.c3.options to com.fasterxml.jackson.databind,com.jwebmp.core;
	opens com.jwebmp.plugins.c3.series to com.fasterxml.jackson.databind,com.jwebmp.core;
}
