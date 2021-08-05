package org.springframework.samples.petclinic.config;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Indicates that a component is eligible for registration when none of the {@linkplain
 * #value specified profiles} is active.
*/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(NotProfileCondition.class)
public @interface NotProfile {
	
	/**
	 * The set of profiles for which the annotated component should not be registered.
	 */
	String[] value();
}
