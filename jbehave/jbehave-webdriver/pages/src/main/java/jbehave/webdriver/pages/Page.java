package jbehave.webdriver.pages;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * When we integrate with Spring an annotation called Steps is created to mark which classes are steps.
 */
@Target(value= ElementType.TYPE)
@Retention(value= RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Page {
}
