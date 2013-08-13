package jbehave.webdriver.spring;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;



//configure JUnit runner
@RunWith(SpringAnnotatedEmbedderRunner.class)
//configure parameter converters
@Configure()
//an entry point to all of JBehave's functionality that is embeddable into other launchers
@UsingEmbedder(embedder = Embedder.class, generateViewAfterStories = true, ignoreFailureInStories = true,
        ignoreFailureInView = true, verboseFailures = true,
        storyTimeoutInSecs = 100, threads = 2, metaFilters = "-skip")
//spring classes
@UsingSpring(resources = {"spring/spring-runner-app-context.xml"})
public class AnnotatedSpringWebEmbedder extends InjectableEmbedder {

    @Test
    public void run() {
        injectedEmbedder().runStoriesAsPaths(storyPaths());
    }

    private List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "");
    }


}
