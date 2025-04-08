package dev.labs.s3;

// In Java 8: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
// Methods that are already overridden by other candidates are ignored. This circumstance can arise when supertypes share a common ancestor.

public class InterfaceVsDefaultMethods extends Oracle implements SQLDefault {
    // Java 22:
    @Override
    public void connectWithDefaults() {
        SQLDefault.super.connectWithDefaults();
    }
}