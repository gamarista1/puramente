package Fg;

import Hg.l;
import Of.C5490h;
import Of.C5495m;
import Of.H;
import Of.N;
import kotlin.jvm.internal.C6496s;
import rg.C6691i;

/* renamed from: Fg.v  reason: case insensitive filesystem */
public abstract class C5394v implements v0 {

    /* renamed from: a  reason: collision with root package name */
    private int f63073a;

    private final boolean c(C5490h hVar) {
        if (l.m(hVar) || C6691i.E(hVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b(C5490h hVar, C5490h hVar2) {
        C6496s.h(hVar, "first");
        C6496s.h(hVar2, "second");
        if (!C6496s.c(hVar.getName(), hVar2.getName())) {
            return false;
        }
        C5495m b10 = hVar.b();
        C5495m b11 = hVar2.b();
        while (b10 != null && b11 != null) {
            if (b10 instanceof H) {
                return b11 instanceof H;
            }
            if (b11 instanceof H) {
                return false;
            }
            if (b10 instanceof N) {
                if (!(b11 instanceof N) || !C6496s.c(((N) b10).f(), ((N) b11).f())) {
                    return false;
                }
                return true;
            } else if ((b11 instanceof N) || !C6496s.c(b10.getName(), b11.getName())) {
                return false;
            } else {
                b10 = b10.b();
                b11 = b11.b();
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(C5490h hVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0) || obj.hashCode() != hashCode()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        C5490h o10 = o();
        C5490h o11 = v0Var.o();
        if (o11 != null && c(o10) && c(o11)) {
            return d(o11);
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = this.f63073a;
        if (i11 != 0) {
            return i11;
        }
        C5490h o10 = o();
        if (c(o10)) {
            i10 = C6691i.m(o10).hashCode();
        } else {
            i10 = System.identityHashCode(this);
        }
        this.f63073a = i10;
        return i10;
    }

    public abstract C5490h o();
}
