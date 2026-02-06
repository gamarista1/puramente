package d0;

import b0.C1864b;
import java.util.Iterator;
import mf.C6548a;

/* renamed from: d0.r  reason: case insensitive filesystem */
public final class C1914r extends C6548a implements C1864b {

    /* renamed from: a  reason: collision with root package name */
    private final C1900d f19424a;

    public C1914r(C1900d dVar) {
        this.f19424a = dVar;
    }

    public int a() {
        return this.f19424a.size();
    }

    public boolean contains(Object obj) {
        return this.f19424a.containsValue(obj);
    }

    public Iterator iterator() {
        return new C1915s(this.f19424a.s());
    }
}
