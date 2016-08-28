package com.corebaseit.bevia;

/**
 * Created by vbevia on 28/08/16.
 */
public class Callee1 implements Incremetable{

    private int i = 0;

    @Override
    public void increment() {

        i++;

        System.out.println(i);
    }
}
