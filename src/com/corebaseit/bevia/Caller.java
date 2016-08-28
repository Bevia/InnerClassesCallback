package com.corebaseit.bevia;

/**
 * Created by vbevia on 28/08/16.
 */
public class Caller {

    private Incremetable callBackReference;

    public Caller(Incremetable callBackReference) {
        this.callBackReference = callBackReference;
    }
    void go() {
        callBackReference.increment();
    }
}
