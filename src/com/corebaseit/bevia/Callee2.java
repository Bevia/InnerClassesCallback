package com.corebaseit.bevia;

/**
 * Created by vbevia on 28/08/16.
 */
public class Callee2 extends MyIncrement{

    private int i = 0;
     public void increment(){
         super.increment();
         i++;

         System.out.println(i);
     }

    private class closure implements Incremetable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incremetable getCallBackReference(){
        return new closure();
    }

}