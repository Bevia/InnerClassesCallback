package com.corebaseit.bevia;

/**
 * Created by vbevia on 28/08/16.
 */
public class MyIncrement {

    public void increment(){
        System.out.println("Other Operation");
    }

    static void f(MyIncrement mi){
        mi.increment();
    }
}
