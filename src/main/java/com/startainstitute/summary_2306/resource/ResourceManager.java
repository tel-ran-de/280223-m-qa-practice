package com.startainstitute.summary_2306.resource;

public class ResourceManager<T extends Resource> {

    private final T resource;

    public ResourceManager(T resource) {
        this.resource = resource;
    }

    public T getResource() {
        return resource;
    }

    public void close() {
        resource.close();
    }
}
