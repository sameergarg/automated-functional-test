package jbehave.webdriver.pages;

import org.openqa.selenium.WebDriver;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

/**
 * User: sameer
 * Date: 09/08/2013
 * Time: 11:41
 */
public abstract class PageTemplate {

    protected WebDriver webDriver;

    public PageTemplate(WebDriver webDriver) {
        this.webDriver = webDriver;
        atPage();
    }

    /**
     * Override this method with the logic to determine whether user is at right page
     */
    public abstract void atPage();

    public void found(String text) {
        found(webDriver.getPageSource(), text);
    }

    public void found(String pageSource, String text) {
        if (!pageSource.contains(escapeHtml(text))) {
            fail("Text: '" + text + "' not found in page '" + pageSource + "'");
        }
    }

    public void found(List<String> texts) {
        for (String text : texts) {
            found(text);
        }
    }

    public void notFound(String text) {
        notFound(webDriver.getPageSource(), text);
    }

    public void notFound(String pageSource, String text) {
        assertThat(pageSource.contains(escapeHtml(text)), is(false));
    }

    private String escapeHtml(String text) {
        return text.replace("<", "&lt;").replace(">", "&gt;");
    }
}
