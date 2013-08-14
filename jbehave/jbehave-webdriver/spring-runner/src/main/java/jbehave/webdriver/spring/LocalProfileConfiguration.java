package jbehave.webdriver.spring;

import jbehave.webdriver.pages.BrowserConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 13/08/13
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class LocalProfileConfiguration implements ProfileConfiguration {

    @Bean
    public BrowserConfiguration browserConfiguration(){
        return new BrowserConfiguration(true);
    }
}
