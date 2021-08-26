package org.seleniumautomation;

public final class FrameworkConstants {
    private FrameworkConstants() {
    }

    private static final String FIREFOXDRIVERPATH = "src/test/resources/executables/geckodriver";

    public static String getFirefoxdriverpath() {
        return FIREFOXDRIVERPATH;
    }
}
