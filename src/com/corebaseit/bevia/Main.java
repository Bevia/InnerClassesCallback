package com.corebaseit.bevia;

/**
 * Ref:
 * Thinking in Java 4th Edition
 * Chp: Inner Classes
 */

public class Main {

    public static void main(String[] args) {

        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);

        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallBackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}
