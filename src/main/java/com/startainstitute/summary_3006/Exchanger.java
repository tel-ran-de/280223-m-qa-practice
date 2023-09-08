package com.startainstitute.summary_3006;

public class Exchanger {

    private String otherMsg;

    public String exchange(String msg) throws InterruptedException {

        synchronized (this) {
            if (otherMsg == null) {
                otherMsg = msg;
                wait();
                return otherMsg;
            } else {
                String res = otherMsg;
                otherMsg = msg;
                notifyAll();
                return res;
            }
        }
    }
}
