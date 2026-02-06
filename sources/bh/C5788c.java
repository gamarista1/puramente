package bh;

import Ug.G;
import Zg.C5726o;

/* renamed from: bh.c  reason: case insensitive filesystem */
public final class C5788c extends C5791f {

    /* renamed from: i  reason: collision with root package name */
    public static final C5788c f67299i = new C5788c();

    private C5788c() {
        super(l.f67312c, l.f67313d, l.f67314e, l.f67310a);
    }

    public G C1(int i10) {
        C5726o.a(i10);
        if (i10 >= l.f67312c) {
            return this;
        }
        return super.C1(i10);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
