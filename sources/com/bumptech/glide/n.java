package com.bumptech.glide;

import m5.C3774a;
import m5.C3776c;
import o5.l;

public abstract class n implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private C3776c f39153a = C3774a.b();

    /* renamed from: a */
    public final n clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final C3776c c() {
        return this.f39153a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return l.e(this.f39153a, ((n) obj).f39153a);
        }
        return false;
    }

    public int hashCode() {
        C3776c cVar = this.f39153a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }
}
