package Mg;

import Ff.d;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f64247a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f64248b = new AtomicInteger(0);

    /* access modifiers changed from: private */
    public static final int f(z zVar, String str) {
        C6496s.h(str, "it");
        return zVar.f64248b.getAndIncrement();
    }

    public abstract int b(ConcurrentHashMap concurrentHashMap, String str, C6798l lVar);

    public final n c(d dVar) {
        C6496s.h(dVar, "kClass");
        return new n(d(dVar));
    }

    public final int d(d dVar) {
        C6496s.h(dVar, "kClass");
        String v10 = dVar.v();
        C6496s.e(v10);
        return e(v10);
    }

    public final int e(String str) {
        C6496s.h(str, "keyQualifiedName");
        return b(this.f64247a, str, new y(this));
    }

    /* access modifiers changed from: protected */
    public final Collection g() {
        Collection values = this.f64247a.values();
        C6496s.g(values, "<get-values>(...)");
        return values;
    }
}
