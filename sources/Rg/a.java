package Rg;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C6496s;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f64965a;

    public a(h hVar) {
        C6496s.h(hVar, "sequence");
        this.f64965a = new AtomicReference(hVar);
    }

    public Iterator iterator() {
        h hVar = (h) this.f64965a.getAndSet((Object) null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
