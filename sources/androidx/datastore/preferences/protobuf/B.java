package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

class B implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private Iterator f16261a;

    public B(Iterator it) {
        this.f16261a = it;
    }

    /* renamed from: a */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f16261a.next();
        entry.getValue();
        return entry;
    }

    public boolean hasNext() {
        return this.f16261a.hasNext();
    }

    public void remove() {
        this.f16261a.remove();
    }
}
