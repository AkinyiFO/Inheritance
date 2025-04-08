package dev.labs.s3;

public class SQL1 implements SQLDefault, SQLDefault1{
    // 1. Plain override OR
    @Override
    public void connectWithDefaults() {
        SQLDefault.super.connectWithDefaults(); // 2a. explicit call to SQLDefault
        SQLDefault1.super.connectWithDefaults(); // b. explicit call to SQLDefault1
    }
}
