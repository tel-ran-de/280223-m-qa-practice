package com.startainstitute.summary_3006;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionStream<T> {

    private final Collection<T> list;
    private final List<Operation<T>> ops;

    public CollectionStream(Collection<T> list) {
        this.list = list;
        this.ops = new ArrayList<>();
    }

    public CollectionStream<T> map(Operation<T> op) {
        ops.add(op);
        return this;
    }

    public CollectionStream<T> filter(Operation<T> op) {
        ops.add(op);
        return this;
    }

    public List<T> toList() { // terminal operation
        List<T> res = new ArrayList<>();
        for (T elem : list) {
            T resElem = elem;
            for (Operation<T> op : ops) {
                if (resElem != null) {
                    resElem = op.process(resElem);
                }
            }
            if (resElem != null) {
                res.add(resElem);
            }
        }
        return res;
    }
}

interface Operation<T> {

    T process(T elem);
}
