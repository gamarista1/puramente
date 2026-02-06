package W;

import W.q;
import c1.p;
import c1.t;
import k0.c;
import kotlin.jvm.internal.C6496s;

/* renamed from: W.c  reason: case insensitive filesystem */
public final class C1428c implements q.a {

    /* renamed from: a  reason: collision with root package name */
    private final c.b f8286a;

    /* renamed from: b  reason: collision with root package name */
    private final c.b f8287b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8288c;

    public C1428c(c.b bVar, c.b bVar2, int i10) {
        this.f8286a = bVar;
        this.f8287b = bVar2;
        this.f8288c = i10;
    }

    public int a(p pVar, long j10, int i10, t tVar) {
        int i11;
        int a10 = this.f8287b.a(0, pVar.k(), tVar);
        int i12 = -this.f8286a.a(0, i10, tVar);
        if (tVar == t.Ltr) {
            i11 = this.f8288c;
        } else {
            i11 = -this.f8288c;
        }
        return pVar.g() + a10 + i12 + i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1428c)) {
            return false;
        }
        C1428c cVar = (C1428c) obj;
        if (C6496s.c(this.f8286a, cVar.f8286a) && C6496s.c(this.f8287b, cVar.f8287b) && this.f8288c == cVar.f8288c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f8286a.hashCode() * 31) + this.f8287b.hashCode()) * 31) + Integer.hashCode(this.f8288c);
    }

    public String toString() {
        return "Horizontal(menuAlignment=" + this.f8286a + ", anchorAlignment=" + this.f8287b + ", offset=" + this.f8288c + ')';
    }
}
