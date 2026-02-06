package androidx.work.impl;

import P3.m;
import P3.u;
import P3.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    private final Object f18748a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map f18749b = new LinkedHashMap();

    public final boolean a(m mVar) {
        boolean containsKey;
        C6496s.h(mVar, "id");
        synchronized (this.f18748a) {
            containsKey = this.f18749b.containsKey(mVar);
        }
        return containsKey;
    }

    public final A b(m mVar) {
        A a10;
        C6496s.h(mVar, "id");
        synchronized (this.f18748a) {
            a10 = (A) this.f18749b.remove(mVar);
        }
        return a10;
    }

    public final List c(String str) {
        List e12;
        C6496s.h(str, "workSpecId");
        synchronized (this.f18748a) {
            try {
                Map map = this.f18749b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (C6496s.c(((m) entry.getKey()).b(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (m remove : linkedHashMap.keySet()) {
                    this.f18749b.remove(remove);
                }
                e12 = C6565s.e1(linkedHashMap.values());
            } finally {
            }
        }
        return e12;
    }

    public final A d(m mVar) {
        A a10;
        C6496s.h(mVar, "id");
        synchronized (this.f18748a) {
            try {
                Map map = this.f18749b;
                Object obj = map.get(mVar);
                if (obj == null) {
                    obj = new A(mVar);
                    map.put(mVar, obj);
                }
                a10 = (A) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a10;
    }

    public final A e(u uVar) {
        C6496s.h(uVar, "spec");
        return d(x.a(uVar));
    }
}
