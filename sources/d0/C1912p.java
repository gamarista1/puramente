package d0;

import b0.C1866d;
import java.util.Iterator;
import mf.C6556i;

/* renamed from: d0.p  reason: case insensitive filesystem */
public final class C1912p extends C6556i implements C1866d {

    /* renamed from: b  reason: collision with root package name */
    private final C1900d f19423b;

    public C1912p(C1900d dVar) {
        this.f19423b = dVar;
    }

    public int a() {
        return this.f19423b.size();
    }

    public boolean contains(Object obj) {
        return this.f19423b.containsKey(obj);
    }

    public Iterator iterator() {
        return new C1913q(this.f19423b.s());
    }
}
