package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.x  reason: case insensitive filesystem */
class C4885x implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private Iterator f58682a;

    public C4885x(Iterator it) {
        this.f58682a = it;
    }

    /* renamed from: a */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f58682a.next();
        entry.getValue();
        return entry;
    }

    public boolean hasNext() {
        return this.f58682a.hasNext();
    }

    public void remove() {
        this.f58682a.remove();
    }
}
