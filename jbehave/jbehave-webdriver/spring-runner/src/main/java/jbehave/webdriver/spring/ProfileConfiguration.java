package jbehave.webdriver.spring;

import jbehave.webdriver.pages.BrowserConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 14/08/13
 * Time: 09:35
 * To change this template use File | Settings | File Templates.
 */
public interface ProfileConfiguration {
    @Bean
    BrowserConfiguration browserConfiguration();
}
