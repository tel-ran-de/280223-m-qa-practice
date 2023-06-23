package com.startainstitute.summary_2306.resource;

public class ResourcesExample {

    public static void main(String[] args) {

        // creation
        FileResource fileResource = new FileResource();
        ResourceManager<FileResource> resourceManager = new ResourceManager<>(fileResource);

        // take resource
        FileResource resource = resourceManager.getResource();

        // Work with resource
        System.out.println("File size = " + resource.getFileSize());

        // close
        resourceManager.close();
    }
}
