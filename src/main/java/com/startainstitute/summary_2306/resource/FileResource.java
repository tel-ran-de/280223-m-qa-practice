package com.startainstitute.summary_2306.resource;

public class FileResource implements Resource {

    @Override
    public void open() {
        System.out.println("File opened");
    }

    public int getFileSize() {
        return 100;
    }

    @Override
    public void close() {
        System.out.println("File closed");
    }
}
