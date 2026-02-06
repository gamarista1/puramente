package Ib;

import Ib.h;

public class f extends j {

    /* renamed from: e  reason: collision with root package name */
    private int f51142e = -1;

    f(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    public j d(Object obj, Object obj2, h hVar, h hVar2) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (hVar == null) {
            hVar = b();
        }
        if (hVar2 == null) {
            hVar2 = o();
        }
        return new f(obj, obj2, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    public h.a f() {
        return h.a.BLACK;
    }

    /* access modifiers changed from: package-private */
    public void m(h hVar) {
        if (this.f51142e == -1) {
            super.m(hVar);
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }

    public boolean q() {
        return false;
    }

    public int size() {
        if (this.f51142e == -1) {
            this.f51142e = b().size() + 1 + o().size();
        }
        return this.f51142e;
    }
}
