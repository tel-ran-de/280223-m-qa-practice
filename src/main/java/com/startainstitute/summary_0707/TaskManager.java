package com.startainstitute.summary_0707;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class TaskManager {

    private int counter = 1;
    // Map<Integer, List<Task>>
    Set<CustomTaskWithPriority> storage = Collections.newSetFromMap(new TreeMap<>());

    // new Task("1"), 2
    // new Task("0"), 2
    public void add(Task task, int priority) {
        storage.add(new CustomTaskWithPriority(task, priority, counter++));
    }

    // Task("0"), Task("1")
    public Task poll() {
        if (storage.isEmpty()) {
            return null;
        }
        CustomTaskWithPriority result = storage.iterator().next();
        storage.remove(result);
        return result.getTask();
    }
}

class CustomTaskWithPriority implements Comparable<CustomTaskWithPriority> {
    private final Task task;
    private final int priority;
    private final int counter;

    public CustomTaskWithPriority(Task task, int priority, int counter) {
        this.task = task;
        this.priority = priority;
        this.counter = counter;
    }

    public Task getTask() {
        return task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomTaskWithPriority that = (CustomTaskWithPriority) o;
        return priority == that.priority && counter == that.counter
                && Objects.equals(getTask(), that.getTask());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTask(), priority, counter);
    }

    @Override
    public int compareTo(CustomTaskWithPriority o) {
        return 0;
    }
}

class Task {

    private final String name;

    public Task(String name) {
        this.name = name;
    }
}
