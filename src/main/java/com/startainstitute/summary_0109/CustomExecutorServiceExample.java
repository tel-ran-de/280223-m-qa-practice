package com.startainstitute.summary_0109;

public class CustomExecutorServiceExample {

    public static void main(String[] args) {
        CustomExecutorService customExecutorService = new CustomExecutorService(16);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            customExecutorService.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " - " + finalI);
            });
        }
        customExecutorService.shutdown();
    }
}
