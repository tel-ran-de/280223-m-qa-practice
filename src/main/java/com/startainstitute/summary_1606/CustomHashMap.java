package com.startainstitute.summary_1606;

/**
 * Grow only implementation of Map. Resize is not supported and a length of each list is fixed.
 * <p>
 * Collision resolution is implemented.
 *
 * @param <K>
 * @param <V>
 */
public class CustomHashMap<K, V> {

    Entry[][] memory;

    public CustomHashMap(int capacity) {
        this.memory = new Entry[capacity][];
    }

    public CustomHashMap() {
        this(16);
    }

    public void put(K key, V value) { // O(1) ? O(memory.length)
        int hashCode = key.hashCode();
        Object[] bucket = memory[hashCode % memory.length];
        if (bucket == null) {
            memory[hashCode % memory.length] = new Entry[memory.length];
            bucket = memory[hashCode % memory.length];
        }
        for (int i = 0; i < bucket.length; i++) {
            Object v = bucket[i];
            if (v == null) {
                bucket[i] = new Entry(key, value);
                break;
            }
            if (v.equals(value)) {
                break;
            }
        }
    }

    public V get(K key) { // O(1)
        int hashCode = key.hashCode();
        Entry[] objects = memory[hashCode % memory.length];
        if (objects == null) {
            return null;
        }
        for (int i = 0; i < objects.length; i++) {
            Entry v = objects[i];
            if (v == null) {
                return null;
            }
            if (hashCode == v.key.hashCode() && key.equals(v.key)) {
                return (V) v.value;
            }
        }
        return null;
    }
}

class Entry {
    Object key;
    Object value;

    public Entry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
