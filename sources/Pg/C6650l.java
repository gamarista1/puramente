package pg;

import java.util.Iterator;
import java.util.Map;

/* renamed from: pg.l  reason: case insensitive filesystem */
class C6650l implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private Iterator f72550a;

    public C6650l(Iterator it) {
        this.f72550a = it;
    }

    /* renamed from: a */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f72550a.next();
        entry.getValue();
        return entry;
    }

    public boolean hasNext() {
        return this.f72550a.hasNext();
    }

    public void remove() {
        this.f72550a.remove();
    }
}
