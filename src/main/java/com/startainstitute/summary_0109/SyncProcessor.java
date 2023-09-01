package com.startainstitute.summary_0109;

public class SyncProcessor {

    public void process(Object monitor) {
        synchronized (monitor) {
            operation();
        }
    }

    private void operation() {
        System.out.println("Operation here");
    }
}
