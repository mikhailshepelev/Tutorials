package org.springframework.samples.petclinic;

import org.springframework.samples.petclinic.config.MvcCoreConfig;
import org.springframework.samples.petclinic.config.RootApplicationContextConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

public class PetclinicInitializer extends AbstractDispatcherServletInitializer {

    /**
     * Spring profile used to choose the persistence layer implementation.
     * <p>
     * When using Spring jpa, use: jpa
     * When using Spring JDBC, use: jdbc
     * When using Spring Data JPA, use: spring-data-jpa
     * <p/>
     * <p>
     * You also may use the -Dspring.profiles.active=jdbc VM options to change
     * default jpa Spring profile.
     */
    private static final String SPRING_PROFILE = "jpa";

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
        rootAppContext.register(RootApplicationContextConfig.class);
        rootAppContext.getEnvironment().setDefaultProfiles(SPRING_PROFILE);
        return rootAppContext;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
        webAppContext.register(MvcCoreConfig.class);
        return webAppContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        // Used to provide the ability to enter Chinese characters inside the Owner Form
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8", true);
        return new Filter[]{characterEncodingFilter};
    }
}
