package com.startainstitute.summary_1606;

public class CustomHashMap<K, V> {

    Value[][] memory;

    public CustomHashMap(int capacity) {
        this.memory = new Value[capacity][];
    }

    public CustomHashMap() {
        this(16);
    }

    public void put(K key, V value) { // O(1) ? O(memory.length)
        int hashCode = key.hashCode();
        Object[] bucket = memory[hashCode % memory.length];
        if (bucket == null) {
            memory[hashCode] = new Value[memory.length];
            bucket = memory[hashCode];
        }
        for (int i = 0; i < bucket.length; i++) {
            Object v = bucket[i];
            if (v == null) {
                bucket[i] = new Value(key.hashCode(), value);
                break;
            }
            if (v.equals(value)) {
                break;
            }
        }
    }

    public V get(K key) { // O(1)
        int hashCode = key.hashCode();
        Value[] objects = memory[hashCode];
        for (int i = 0; i < objects.length; i++) {
            Value v = objects[i];
            if (hashCode == v.keyHashcode) {
                return (V) v.value;
            }
        }
        return null;
    }
}

class Value {
    int keyHashcode;
    Object value;

    public Value(int keyHashcode, Object value) {
        this.keyHashcode = keyHashcode;
        this.value = value;
    }
}
