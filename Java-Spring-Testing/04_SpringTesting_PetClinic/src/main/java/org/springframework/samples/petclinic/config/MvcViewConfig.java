package org.springframework.samples.petclinic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.xml.MarshallingView;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MvcViewConfig {
	
	@Bean
	public ContentNegotiatingViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
	 	ContentNegotiatingViewResolver contentNegotiatingViewResolver = new ContentNegotiatingViewResolver();
	 	List<ViewResolver> viewResolvers = new ArrayList<ViewResolver>();
	 	viewResolvers.add(internalResourceViewResolver());
	 	viewResolvers.add(beanNameViewResolver());
		contentNegotiatingViewResolver.setViewResolvers(viewResolvers );
		contentNegotiatingViewResolver.setContentNegotiationManager(manager);
		return contentNegotiatingViewResolver;
	}
	
	@Bean
	@Description("Default viewClass: JSTL view (JSP with html output)")
	public ViewResolver internalResourceViewResolver() {
		// Example: a logical view name of 'vets' is mapped to
		// '/WEB-INF/jsp/vets.jsp'
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/jsp/");
		bean.setSuffix(".jsp");
		return bean;
	}

	@Bean
	@Description("Used for 'xml' views")
	public ViewResolver beanNameViewResolver() {
		return new BeanNameViewResolver();
	}

	@Bean(name = "vets/vetList.xml")
	@Description("Renders an XML view. Used by the BeanNameViewResolver")
	public MarshallingView marshallingView() {
		return new MarshallingView(marshaller());
	}

	@Bean
	@Description("Object-XML mapping declared using annotations inside 'Vets'")
	public Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(Vets.class);
		return marshaller;
	}
}
