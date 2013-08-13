package jbehave.webdriver.spring;

import jbehave.webdriver.pages.google.GooglePages;
import jbehave.webdriver.steps.GoogleSearchSteps;
import org.jbehave.core.configuration.spring.SpringStoryControls;
import org.jbehave.core.configuration.spring.SpringStoryReporterBuilder;
import org.jbehave.core.embedder.EmbedderClassLoader;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import static org.jbehave.core.reporters.Format.*;

/**
 * Contains all configurable beans
 */
@Configuration
public class SpringRunnerConfiguration {

    private GooglePages googlePages;

    private GoogleSearchSteps googleSearchSteps;

    @Bean
    public GooglePages googlePages(){
        googlePages = new GooglePages();
        return googlePages;
    }

    @Bean
    public GoogleSearchSteps googleSearchSteps(){
        googleSearchSteps = new GoogleSearchSteps(googlePages);
        return googleSearchSteps;
    }

    @Bean
    public StoryReporterBuilder springStoryReporterBuilder(){
        return new SpringStoryReporterBuilder()
                .withDefaultFormats()
                .withFormats(new Format[]{CONSOLE, TXT, HTML, XML});
    }

    @Bean
    public SpringStoryControls springStoryControls(){
        return new SpringStoryControls();
    }

    @Bean
    public RegexPrefixCapturingPatternParser regexPrefixCapturingPatternParser(){
        return new RegexPrefixCapturingPatternParser();
    }

    @Bean
    public LoadFromClasspath loadFromClasspath(){
        return new LoadFromClasspath(new EmbedderClassLoader(Arrays.asList(new String[]{"target/classes"})));
    }

}
