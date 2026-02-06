package com.google.common.collect;

import java.io.Serializable;
import nb.C5112g;
import nb.k;
import nb.o;

/* renamed from: com.google.common.collect.h  reason: case insensitive filesystem */
final class C4757h extends O implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    final C5112g f56706a;

    /* renamed from: b  reason: collision with root package name */
    final O f56707b;

    C4757h(C5112g gVar, O o10) {
        this.f56706a = (C5112g) o.j(gVar);
        this.f56707b = (O) o.j(o10);
    }

    public int compare(Object obj, Object obj2) {
        return this.f56707b.compare(this.f56706a.apply(obj), this.f56706a.apply(obj2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4757h)) {
            return false;
        }
        C4757h hVar = (C4757h) obj;
        if (!this.f56706a.equals(hVar.f56706a) || !this.f56707b.equals(hVar.f56707b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return k.b(this.f56706a, this.f56707b);
    }

    public String toString() {
        return this.f56707b + ".onResultOf(" + this.f56706a + ")";
    }
}
