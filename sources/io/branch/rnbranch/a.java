package io.branch.rnbranch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private long f44620a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f44621b = new HashMap();

    public a(long j10) {
        this.f44620a = j10;
    }

    private void a() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.f44621b.entrySet().iterator();
        while (it.hasNext()) {
            if (currentTimeMillis - ((b) ((Map.Entry) it.next()).getValue()).b() >= this.f44620a) {
                it.remove();
            }
        }
    }

    public Object b(Object obj) {
        b bVar = (b) this.f44621b.get(obj);
        if (bVar == null) {
            return null;
        }
        return bVar.a();
    }

    public void c(Object obj, Object obj2) {
        a();
        this.f44621b.put(obj, new b(obj2));
    }

    public void d(Object obj) {
        this.f44621b.remove(obj);
    }
}
