package W;

import W.q;
import c1.p;
import k0.c;
import kotlin.jvm.internal.C6496s;

/* renamed from: W.d  reason: case insensitive filesystem */
public final class C1429d implements q.b {

    /* renamed from: a  reason: collision with root package name */
    private final c.C0368c f8289a;

    /* renamed from: b  reason: collision with root package name */
    private final c.C0368c f8290b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8291c;

    public C1429d(c.C0368c cVar, c.C0368c cVar2, int i10) {
        this.f8289a = cVar;
        this.f8290b = cVar2;
        this.f8291c = i10;
    }

    public int a(p pVar, long j10, int i10) {
        return pVar.i() + this.f8290b.a(0, pVar.f()) + (-this.f8289a.a(0, i10)) + this.f8291c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1429d)) {
            return false;
        }
        C1429d dVar = (C1429d) obj;
        if (C6496s.c(this.f8289a, dVar.f8289a) && C6496s.c(this.f8290b, dVar.f8290b) && this.f8291c == dVar.f8291c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f8289a.hashCode() * 31) + this.f8290b.hashCode()) * 31) + Integer.hashCode(this.f8291c);
    }

    public String toString() {
        return "Vertical(menuAlignment=" + this.f8289a + ", anchorAlignment=" + this.f8290b + ", offset=" + this.f8291c + ')';
    }
}
