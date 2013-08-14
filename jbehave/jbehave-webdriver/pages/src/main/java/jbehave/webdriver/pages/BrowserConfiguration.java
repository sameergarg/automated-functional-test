package jbehave.webdriver.pages;

/**
 * Created with IntelliJ IDEA.
 * User: sameer
 * Date: 13/08/13
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 */
public class BrowserConfiguration {

    private boolean jsEnabled;

    public BrowserConfiguration(boolean jsEnabled) {
        this.jsEnabled = jsEnabled;
    }

    public boolean isJsEnabled() {
        return jsEnabled;
    }
}
